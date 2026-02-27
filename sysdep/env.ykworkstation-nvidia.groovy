#!groovy

SCALE_NETCDF_C        = "/home/apps/oss/spack/opt/spack/linux-a64fx/netcdf-c-4.9.2-gxiznee6h7r35ke6tivigi54gvzefl6v"
SCALE_NETCDF_F        = "/home/apps/oss/spack/opt/spack/linux-a64fx/netcdf-fortran-4.6.1-4jlnxiqcepafk4y3whu4763jzuyjvxr7"

env.PATH               = "/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/compilers/extras/qd/bin:/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/comm_libs/mpi/bin:/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/compilers/bin:/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/cuda/bin:/home/ykawai/.local/bin:/home/ykawai/.pyenv/shims:/home/ykawai/.pyenv/bin:/usr/local/bin:/usr/local/sbin:/usr/bin:/usr/sbin:/bin:/sbin:"
env.LD_LIBRARY_PATH    = "/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/comm_libs/nvshmem/lib:/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/comm_libs/nccl/lib:/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/math_libs/lib64:/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/compilers/lib:/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/compilers/extras/qd/lib:/opt/nvidia/hpc_sdk/Linux_x86_64/26.1/cuda/lib64"

env.SCALE_FE_SYS         = "Linux64-nvidia"
env.SCALE                = "/home/ykawai/workspace/scale_openacc/"
env.SCALE_ENABLE_OPENMP  = "F"
env.SCALE_ENABLE_OPENACC = "T"
//env.SCALE_DEVELOP        = "T"
env.SCALE_NETCDF_INCLUDE = "-I/home/ykawai/lib/netcdf4-nvidia-fortran/include -I/home/ykawai/lib/netcdf4-nvidia-fortran/include"
env.SCALE_NETCDF_LIBS    = "-L/home/ykawai/lib/netcdf4-nvidia-fortran/lib -lnetcdff -L/usr/lib/x86_64-linux-gnu/hdf5/serial/lib -L/home/ykawai/lib/netcdf4-nvdia/lib -lnetcdf -lnetcdf -lm"
env.SCALE_ARTIFACT_DIR   = "/home/ykawai/Qsync2/Jenkins/"
