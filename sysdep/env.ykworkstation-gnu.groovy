#!groovy

env.PATH               = "/home/ykawai/.local/bin:/home/ykawai/.pyenv/shims:/home/ykawai/.pyenv/bin:/usr/local/bin:/usr/local/sbin:/usr/bin:/usr/sbin:/bin:/sbin:"
env.LD_LIBRARY_PATH    = ""

env.SCALE_FE_SYS        = "Linux64-gnu-ompi"
env.SCALE               = "/home/ykawai/workspace/scale/"
env.SCALE_ENABLE_OPENMP = "T"
env.SCALE_ARTIFACT_DIR  = "/home/ykawai/Qsync2/Jenkins/"
