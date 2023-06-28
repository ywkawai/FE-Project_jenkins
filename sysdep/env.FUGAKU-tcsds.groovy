#!groovy

env.PATH               = "/usr/local/bin:/usr/local/sbin:/usr/bin:/usr/sbin:/bin:/sbin:"
env.LD_LIBRARY_PATH    = ""

env.SCALE_FE_SYS         = "FUGAKU"
env.SCALE                = "/data/ra000005/a04028/SCALE_comp_perf/"
env.SCALE_ENABLE_OPENMP  = "T"
env.TCSDS_ENV_VERSION    = "lang/tcsds-1.2.37"
env.SETUP_SPACK_SCALE_SH = "~/setup_spack_scale.sh"
