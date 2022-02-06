#!groovy

env.PATH               = "/home/ykawai/lib/netcdf4-intel/4.8.0/bin:/opt/intel/oneapi/vtune/2022.1.0/bin64:/opt/intel/oneapi/vpl/2022.0.0/bin:/opt/intel/oneapi/mpi/2021.5.1//libfabric/bin:/opt/intel/oneapi/mpi/2021.5.1/bin:/opt/intel/oneapi/mkl/2022.0.2/bin/intel64:/opt/intel/oneapi/itac/2021.5.0/bin:/opt/intel/oneapi/intelpython/latest/bin:/opt/intel/oneapi/intelpython/latest/condabin:/opt/intel/oneapi/inspector/2022.0.0/bin64:/opt/intel/oneapi/dpcpp-ct/2022.0.0/bin:/opt/intel/oneapi/dev-utilities/2021.5.2/bin:/opt/intel/oneapi/debugger/2021.5.0/gdb/intel64/bin:/opt/intel/oneapi/compiler/2022.0.2/linux/lib/oclfpga/bin:/opt/intel/oneapi/compiler/2022.0.2/linux/bin/intel64:/opt/intel/oneapi/compiler/2022.0.2/linux/bin:/opt/intel/oneapi/clck/2021.5.0/bin/intel64:/opt/intel/oneapi/advisor/2022.0.0/bin64:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin"
env.CPATH              = "/opt/intel/oneapi/vpl/2022.0.0/include:/opt/intel/oneapi/tbb/2021.5.1/env/../include:/opt/intel/oneapi/mpi/2021.5.1//include:/opt/intel/oneapi/mkl/2022.0.2/include:/opt/intel/oneapi/ippcp/2021.5.1/include:/opt/intel/oneapi/ipp/2021.5.2/include:/opt/intel/oneapi/dpl/2021.6.0/linux/include:/opt/intel/oneapi/dpcpp-ct/2022.0.0/include:/opt/intel/oneapi/dnnl/2022.0.2/cpu_dpcpp_gpu_dpcpp/lib:/opt/intel/oneapi/dev-utilities/2021.5.2/include:/opt/intel/oneapi/dal/2021.5.3/include:/opt/intel/oneapi/ccl/2021.5.1/include/cpu_gpu_dpcpp"

env.INTEL_LICENSE_FILE = "/opt/intel/licenses:/home/ykawai/intel/licenses:/opt/intel/oneapi/clck/2021.5.0/licensing:/opt/intel/licenses:/home/ykawai/intel/licenses:/Users/Shared/Library/Application Support/Intel/Licenses"
env.LIBRARY_PATH       = "/opt/intel/oneapi/vpl/2022.0.0/lib:/opt/intel/oneapi/tbb/2021.5.1/env/../lib/intel64/gcc4.8:/opt/intel/oneapi/mpi/2021.5.1//libfabric/lib:/opt/intel/oneapi/mpi/2021.5.1//lib/release:/opt/intel/oneapi/mpi/2021.5.1//lib:/opt/intel/oneapi/mkl/2022.0.2/lib/intel64:/opt/intel/oneapi/ippcp/2021.5.1/lib/intel64:/opt/intel/oneapi/ipp/2021.5.2/lib/intel64:/opt/intel/oneapi/dnnl/2022.0.2/cpu_dpcpp_gpu_dpcpp/lib:/opt/intel/oneapi/dal/2021.5.3/lib/intel64:/opt/intel/oneapi/compiler/2022.0.2/linux/compiler/lib/intel64_lin:/opt/intel/oneapi/compiler/2022.0.2/linux/lib:/opt/intel/oneapi/clck/2021.5.0/lib/intel64:/opt/intel/oneapi/ccl/2021.5.1/lib/cpu_gpu_dpcpp"
env.CLASSPATH          = "/opt/intel/oneapi/mpi/2021.5.1//lib/mpi.jar:/opt/intel/oneapi/dal/2021.5.3/lib/onedal.jar"

env.I_MPI_ROOT         = "/opt/intel/oneapi/mpi/2021.5.1"
env.MKLROOT            = "/opt/intel/oneapi/mkl/2022.0.2"
env.IPPROOT            = "/opt/intel/oneapi/ipp/2021.5.2"
env.DAALROOT           = "/opt/intel/oneapi/deal/2021.5.3"

env.SCALE_FE_SYS        = "Linux64-intel-impi"
env.SCALE               = "/home/ykawai/workspace/scale_intel/"
env.SCALE_ENABLE_OPENMP = "T"
env.SCALE_DEVELOP       = "T"
