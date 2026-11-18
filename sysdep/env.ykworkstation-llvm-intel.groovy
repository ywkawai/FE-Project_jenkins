#!groovy

env.PATH               = "/home/ykawai/.local/bin:/home/ykawai/.pyenv/shims:/home/ykawai/.pyenv/bin:/home/ykawai/lib/netcdf4-intel-fortran/4.5.3/bin:/home/ykawai/lib/netcdf4-intel/4.8.0/bin:/opt/intel/oneapi/vtune/2025.0/bin64:/opt/intel/oneapi/mpi/2021.14/bin:/opt/intel/oneapi/mkl/2025.0/bin:/opt/intel/oneapi/dpcpp-ct/2025.0/bin:/opt/intel/oneapi/dev-utilities/2025.0/bin:/opt/intel/oneapi/debugger/2025.0/opt/debugger/bin:/opt/intel/oneapi/compiler/2025.0/bin:/opt/intel/oneapi/advisor/2025.0/bin64:/home/ykawai/.pyenv/shims:/home/ykawai/.local/bin:/home/ykawai/.vscode-server/cli/servers/Stable-fabdb6a30b49f79a7aba0f2ad9df9b399473380f/server/bin/remote-cli:/home/ykawai/.local/bin:/home/ykawai/.pyenv/bin:/home/ykawai/.local/bin:/home/ykawai/.local/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin"
env.CPATH              = "/opt/intel/oneapi/umf/0.9/include:/opt/intel/oneapi/tbb/2022.0/env/../include:/opt/intel/oneapi/pti/0.10/include:/opt/intel/oneapi/mpi/2021.14/include:/opt/intel/oneapi/mkl/2025.0/include:/opt/intel/oneapi/ippcp/2025.0/include:/opt/intel/oneapi/ipp/2022.0/include:/opt/intel/oneapi/dpl/2022.7/include:/opt/intel/oneapi/dpcpp-ct/2025.0/include:/opt/intel/oneapi/dnnl/2025.0/include:/opt/intel/oneapi/dev-utilities/2025.0/include:/opt/intel/oneapi/dal/2025.0/include:/opt/intel/oneapi/ccl/2021.14/include"

env.INTEL_LICENSE_FILE = "/opt/intel/licenses:/home/ykawai/intel/licenses:/opt/intel/oneapi/clck/2021.7.3/licensing:/opt/intel/licenses:/home/ykawai/intel/licenses:/Users/Shared/Library/Application Support/Intel/Licenses"
env.LIBRARY_PATH       = "/opt/intel/oneapi/tcm/1.6/lib:/opt/intel/oneapi/umf/1.2/lib:/opt/intel/oneapi/tcm/1.6/env/../lib:/opt/intel/oneapi/tbb/2023.2/env/../lib/intel64/gcc4.8:/opt/intel/oneapi/mpi/2021.19/lib:/opt/intel/oneapi/mkl/2026.2/lib:/opt/intel/oneapi/ishmem/1.6/lib:/opt/intel/oneapi/ippcp/2026.2/lib/:/opt/intel/oneapi/ipp/2026.1/lib:/opt/intel/oneapi/dnnl/2026.1/lib:/opt/intel/oneapi/dal/2026.2/lib/intel64:/opt/intel/oneapi/compiler/2026.2/lib:/opt/intel/oneapi/ccl/2022.2/lib/"
env.LD_LIBRARY_PATH    = "/home/ykawai/lib/netcdf4-intel-fortran/4.5.3/lib:/home/ykawai/lib/netcdf4-intel/4.8.0/lib:/opt/intel/oneapi/tcm/1.6/lib:/opt/intel/oneapi/umf/1.2/lib:/opt/intel/oneapi/tcm/1.6/env/../lib:/opt/intel/oneapi/tbb/2023.2/env/../lib/intel64/gcc4.8:/opt/intel/oneapi/mpi/2021.19/lib:/opt/intel/oneapi/mkl/2026.2/lib:/opt/intel/oneapi/libfabric/2.6/lib:/opt/intel/oneapi/ishmem/1.6/lib:/opt/intel/oneapi/ippcp/2026.2/lib/:/opt/intel/oneapi/ipp/2026.1/lib:/opt/intel/oneapi/dnnl/2026.1/lib:/opt/intel/oneapi/debugger/2026.2/opt/debugger/lib:/opt/intel/oneapi/dal/2026.2/lib/intel64:/opt/intel/oneapi/compiler/2026.2/opt/compiler/lib:/opt/intel/oneapi/compiler/2026.2/lib:/opt/intel/oneapi/ccl/2022.2/lib/"
env.CLASSPATH          = "/opt/intel/oneapi/mpi/2021.19/share/java/mpi.jar"
env.PKG_CONFIG_PATH    = "/opt/intel/oneapi/vtune/2026.6/include/pkgconfig/lib64:/opt/intel/oneapi/tbb/2023.2/env/../lib/pkgconfig:/opt/intel/oneapi/mpi/2021.19/lib/pkgconfig:/opt/intel/oneapi/mkl/2026.2/lib/pkgconfig:/opt/intel/oneapi/libfabric/2.6/lib/pkgconfig:/opt/intel/oneapi/ishmem/1.6/lib/pkgconfig:/opt/intel/oneapi/ippcp/2026.2/lib/pkgconfig:/opt/intel/oneapi/dpl/2022.14/lib/pkgconfig:/opt/intel/oneapi/dnnl/2026.1/lib/pkgconfig:/opt/intel/oneapi/dal/2026.2/lib/pkgconfig:/opt/intel/oneapi/compiler/2026.2/lib/pkgconfig:/opt/intel/oneapi/ccl/2022.2/lib/pkgconfig/:/opt/intel/oneapi/advisor/2026.0/include/pkgconfig/lib64:"
env.FI_PROVIDER_PATH   = "/opt/intel/oneapi/libfabric/2.6/lib/libfabric:/usr/lib/x86_64-linux-gnu/libfabric"

env.I_MPI_ROOT         = "/opt/intel/oneapi/mpi/2021.19"
env.I_MPI_FABRICS      = "shm"
env.MKLROOT            = "/opt/intel/oneapi/mkl/2026.2"
env.IPPROOT            = "/opt/intel/oneapi/ipp/2026.1"

env.SCALE_FE_SYS        = "Linux64-llvm-intel-impi"
env.SCALE               = "/home/ykawai/workspace/scale_intel/"
env.SCALE_ENABLE_OPENMP = "T"
env.SCALE_DEVELOP       = "T"
env.SCALE_ARTIFACT_DIR  = "/home/ykawai/Qsync2/Jenkins/"
