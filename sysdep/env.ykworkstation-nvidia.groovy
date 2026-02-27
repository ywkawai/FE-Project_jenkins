#!groovy

env.PATH               = "/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/compilers/extras/qd/bin:/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/comm_libs/mpi/bin:/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/compilers/bin:/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/cuda/bin:/home/ykawai/.local/bin:/home/ykawai/.pyenv/shims:/home/ykawai/.pyenv/bin:/usr/local/bin:/usr/local/sbin:/usr/bin:/usr/sbin:/bin:/sbin:"
env.LD_LIBRARY_PATH    = "/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/comm_libs/nvshmem/lib:/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/comm_libs/nccl/lib:/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/math_libs/lib64:/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/compilers/lib:/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/compilers/extras/qd/lib:/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/cuda/lib64"

env.SCALE_FE_SYS         = "Linux64-nvidia"
env.SCALE                = "/home/ykawai/workspace/scale_openacc/"
env.SCALE_ENABLE_OPENMP  = "F"
env.SCALE_ENABLE_OPENACC = "T"
env.SCALE_ARTIFACT_DIR  = "/home/ykawai/Qsync2/Jenkins/"
