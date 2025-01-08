#!groovy

env.PATH               = "/home/ykawai/lib/netcdf4-intel-fortran/4.5.3/bin:/home/ykawai/lib/netcdf4-intel/4.8.0/bin:/opt/intel/oneapi/vtune/2025.0/bin64:/opt/intel/oneapi/mpi/2021.14/bin:/opt/intel/oneapi/mkl/2025.0/bin:/opt/intel/oneapi/dpcpp-ct/2025.0/bin:/opt/intel/oneapi/dev-utilities/2025.0/bin:/opt/intel/oneapi/debugger/2025.0/opt/debugger/bin:/opt/intel/oneapi/compiler/2025.0/bin:/opt/intel/oneapi/advisor/2025.0/bin64:/home/ykawai/.pyenv/shims:/home/ykawai/.local/bin:/home/ykawai/.vscode-server/cli/servers/Stable-fabdb6a30b49f79a7aba0f2ad9df9b399473380f/server/bin/remote-cli:/home/ykawai/.local/bin:/home/ykawai/.pyenv/bin:/home/ykawai/.local/bin:/home/ykawai/.local/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin"
env.CPATH              = "/opt/intel/oneapi/umf/0.9/include:/opt/intel/oneapi/tbb/2022.0/env/../include:/opt/intel/oneapi/pti/0.10/include:/opt/intel/oneapi/mpi/2021.14/include:/opt/intel/oneapi/mkl/2025.0/include:/opt/intel/oneapi/ippcp/2025.0/include:/opt/intel/oneapi/ipp/2022.0/include:/opt/intel/oneapi/dpl/2022.7/include:/opt/intel/oneapi/dpcpp-ct/2025.0/include:/opt/intel/oneapi/dnnl/2025.0/include:/opt/intel/oneapi/dev-utilities/2025.0/include:/opt/intel/oneapi/dal/2025.0/include:/opt/intel/oneapi/ccl/2021.14/include"

env.INTEL_LICENSE_FILE = "/opt/intel/licenses:/home/ykawai/intel/licenses:/opt/intel/oneapi/clck/2021.7.3/licensing:/opt/intel/licenses:/home/ykawai/intel/licenses:/Users/Shared/Library/Application Support/Intel/Licenses"
env.LIBRARY_PATH       = "/opt/intel/oneapi/tcm/1.2/lib:/opt/intel/oneapi/umf/0.9/lib:/opt/intel/oneapi/tbb/2022.0/env/../lib/intel64/gcc4.8:/opt/intel/oneapi/pti/0.10/lib:/opt/intel/oneapi/mpi/2021.14/lib:/opt/intel/oneapi/mkl/2025.0/lib:/opt/intel/oneapi/ippcp/2025.0/lib/:/opt/intel/oneapi/ipp/2022.0/lib:/opt/intel/oneapi/dnnl/2025.0/lib:/opt/intel/oneapi/dal/2025.0/lib:/opt/intel/oneapi/compiler/2025.0/lib:/opt/intel/oneapi/ccl/2021.14/lib/"
env.LD_LIBRARY_PATH    = "/opt/intel/oneapi/tcm/1.2/lib:/opt/intel/oneapi/umf/0.9/lib:/opt/intel/oneapi/tbb/2022.0/env/../lib/intel64/gcc4.8:/opt/intel/oneapi/pti/0.10/lib:/opt/intel/oneapi/mpi/2021.14/opt/mpi/libfabric/lib:/opt/intel/oneapi/mpi/2021.14/lib:/opt/intel/oneapi/mkl/2025.0/lib:/opt/intel/oneapi/ippcp/2025.0/lib/:/opt/intel/oneapi/ipp/2022.0/lib:/opt/intel/oneapi/dnnl/2025.0/lib:/opt/intel/oneapi/debugger/2025.0/opt/debugger/lib:/opt/intel/oneapi/dal/2025.0/lib:/opt/intel/oneapi/compiler/2025.0/opt/compiler/lib:/opt/intel/oneapi/compiler/2025.0/lib:/opt/intel/oneapi/ccl/2021.14/lib/"
env.CLASSPATH          = "/opt/intel/oneapi/mpi/2021.14/share/java/mpi.jar"
env.PKG_CONFIG_PATH    = "/opt/intel/oneapi/vtune/2025.0/include/pkgconfig/lib64:/opt/intel/oneapi/tbb/2022.0/env/../lib/pkgconfig:/opt/intel/oneapi/mpi/2021.14/lib/pkgconfig:/opt/intel/oneapi/mkl/2025.0/lib/pkgconfig:/opt/intel/oneapi/ippcp/2025.0/lib/pkgconfig:/opt/intel/oneapi/dpl/2022.7/lib/pkgconfig:/opt/intel/oneapi/dnnl/2025.0/lib/pkgconfig:/opt/intel/oneapi/dal/2025.0/lib/pkgconfig:/opt/intel/oneapi/compiler/2025.0/lib/pkgconfig:/opt/intel/oneapi/ccl/2021.14/lib/pkgconfig/:/opt/intel/oneapi/advisor/2025.0/include/pkgconfig/lib64:"
env.FI_PROVIDER_PATH   = "/opt/intel/oneapi/mpi/2021.14/opt/mpi/libfabric/lib/prov:/usr/lib/x86_64-linux-gnu/libfabric"

env.I_MPI_ROOT         = "/opt/intel/oneapi/mpi/2021.14"
env.MKLROOT            = "/opt/intel/oneapi/mkl/2025.0"
env.IPPROOT            = "/opt/intel/oneapi/ipp/2022.0"

env.SCALE_FE_SYS        = "Linux64-llvm-intel-impi"
env.SCALE               = "/home/ykawai/workspace/scale_intel/"
env.SCALE_ENABLE_OPENMP = "T"
env.SCALE_DEVELOP       = "T"
