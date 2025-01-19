import hudson.util.RemotingDiagnostics

def rsync_sample_artifacts(Map params = [:]){
    def target_str = "${params.target_sample_dir}/${params.sample_name}/"
    def dist_str = "${env.SCALE_ARTIFACT_DIR}/${env.JOB_NAME}/${env.BUILD_NUMBER}/${params.sample_name}/"
    params.copy_src_list.each{ copy_src ->
        // println(['bash', '-c', "ls -lha ${target_str}/${copy_src}"])
        println("rsync.. ${target_str}/${copy_src} --> ${dist_str}")
        println(['bash', '-c', "rsync -tpgvr --mkpath ${target_str}/${copy_src} ${dist_str}"].execute().text)
    }
}

def extract_run_LOG_info(Map params = [:]){
    def target_log = "${params.target_sample_dir}/${params.sample_name}/${params.log_fname}"
    def command = """
        cat ${target_log} | sed -n '/&PARAM/,/\\//p' > ${target_log}_param_conf
        cat ${target_log} | sed -n '/Computational Time Report/,\$p' > ${target_log}_rapreport
    """
    def proc = ['bash', '-c', command].execute()
    proc.waitFor()
    println(proc.text)
}

def extract_run_LOG_info_remote(Map params = [:]){
    def target_log = "${params.target_sample_dir}/${params.sample_name}/${params.log_fname}"
    println(target_log)
    def command = """
    def p1 = ['bash', '-c', "cat ${target_log} | sed -n '/&PARAM/,/\\\\//p' > ${target_log}_param_conf"].execute()
    p1.waitFor()
    println p1.in.text
    
    def p2 = ['bash', '-c', "cat ${target_log} | sed -n '/Computational Time Report/,\\\$p' > ${target_log}_rapreport"].execute()
    p2.waitFor()
    println p2.in.text
    """
    // println(command)
    println RemotingDiagnostics.executeGroovy(command, Jenkins.instance.slaves.find { it.getLabelString() == params.node_label }.channel)    
}

return this
