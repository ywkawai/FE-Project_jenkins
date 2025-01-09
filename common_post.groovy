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
return this