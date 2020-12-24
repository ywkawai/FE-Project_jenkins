#!groovy

dir("jenkins-scripts") {
    stage "load environment"
    load "sysdep/env.${SYSDEP}.groovy"
    echo "${env.SCALE_FE_SYS}"
}

dir("FE-Project") {
    stage "checkout FE-Project from gitlab"
    retry(3){
        checkout scm: [$class: "GitSCM",
            branches: [[name: "${BRANCH}"]],
            userRemoteConfigs: [[
                credentialsId: "GitHub",
                url: "git@github.com:ywkawai/FE-Project.git"
            ]]
        ]
    }
    sh "git --no-pager log -n 3 --name-status --pretty=format:'%h %an (%ad) : %s'"
    VERSION = sh (script: "git rev-parse --short HEAD", returnStdout: true).trim()
    STAMP   = sh (script: "date +%Y%m%d%H%M", returnStdout: true).trim()
}
