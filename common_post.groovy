def rsync_artifacts(Map params = [:]){
    def target_str = "${params.target_dir}"
    def dist_str = "${env.SCALE_ARTIFACT_DIR}/${env.JOB_NAME}/${env.BUILD_NUMBER}/${params.target_dir}"
    println(target_str)
    println(dist_str)
}
return this