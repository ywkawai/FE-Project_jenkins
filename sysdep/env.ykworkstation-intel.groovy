#!groovy

env.PATH               = "/opt/intel/oneapi/vtune/2021.8.0/bin64:/opt/intel/oneapi/vpl/2021.6.0/bin:/opt/intel/oneapi/mpi/2021.4.0//libfabric/bin:/opt/intel/oneapi/mpi/2021.4.0//bin:/opt/intel/oneapi/mkl/2021.4.0/bin/intel64:/opt/intel/oneapi/itac/2021.4.0/bin:/opt/intel/oneapi/intelpython/latest/bin:/opt/intel/oneapi/intelpython/latest/condabin:/opt/intel/oneapi/inspector/2021.4.0/bin64:/opt/intel/oneapi/dpcpp-ct/2021.4.0/bin:/opt/intel/oneapi/dev-utilities/2021.4.0/bin:/opt/intel/oneapi/debugger/10.2.4/gdb/intel64/bin:/opt/intel/oneapi/compiler/2021.4.0/linux/lib/oclfpga/llvm/aocl-bin:/opt/intel/oneapi/compiler/2021.4.0/linux/lib/oclfpga/bin:/opt/intel/oneapi/compiler/2021.4.0/linux/bin/intel64:/opt/intel/oneapi/compiler/2021.4.0/linux/bin:/opt/intel/oneapi/clck/2021.4.0/bin/intel64:/opt/intel/oneapi/advisor/2021.4.0/bin64:/home/ykawai/.local/bin:/home/ykawai/.local/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin:"
env.LD_LIBRARY_PATH    = "/opt/intel/oneapi/vpl/2021.6.0/lib:/opt/intel/oneapi/tbb/2021.4.0/env/../lib/intel64/gcc4.8:/opt/intel/oneapi/mpi/2021.4.0//libfabric/lib:/opt/intel/oneapi/mpi/2021.4.0//lib/release:/opt/intel/oneapi/mpi/2021.4.0//lib:/opt/intel/oneapi/mkl/2021.4.0/lib/intel64:/opt/intel/oneapi/itac/2021.4.0/slib:/opt/intel/oneapi/ippcp/2021.4.0/lib/intel64:/opt/intel/oneapi/ipp/2021.4.0/lib/intel64:/opt/intel/oneapi/dnnl/2021.4.0/cpu_dpcpp_gpu_dpcpp/lib:/opt/intel/oneapi/debugger/10.2.4/gdb/intel64/lib:/opt/intel/oneapi/debugger/10.2.4/libipt/intel64/lib:/opt/intel/oneapi/debugger/10.2.4/dep/lib:/opt/intel/oneapi/dal/2021.4.0/lib/intel64:/opt/intel/oneapi/compiler/2021.4.0/linux/lib:/opt/intel/oneapi/compiler/2021.4.0/linux/lib/x64:/opt/intel/oneapi/compiler/2021.4.0/linux/lib/emu:/opt/intel/oneapi/compiler/2021.4.0/linux/lib/oclfpga/host/linux64/lib:/opt/intel/oneapi/compiler/2021.4.0/linux/lib/oclfpga/linux64/lib:/opt/intel/oneapi/compiler/2021.4.0/linux/compiler/lib/intel64_lin:/opt/intel/oneapi/ccl/2021.4.0/lib/cpu_gpu_dpcpp:"

env.INTEL_LICENSE_FILE = "/opt/intel/licenses:/home/ykawai/intel/licenses:/opt/intel/oneapi/clck/2021.4.0/licensing:/opt/intel/licenses:/home/ykawai/intel/licenses:/Users/Shared/Library/Application Support/Intel/Licenses"
env.CLASSPATH          = "/opt/intel/oneapi/mpi/2021.4.0//lib/mpi.jar:/opt/intel/oneapi/dal/2021.4.0/lib/onedal.jar"

env.I_MPI_ROOT         = "/opt/intel/oneapi/mpi/2021.4.0"
env.MKLROOT            = "/opt/intel/oneapi/mkl/2021.4.0"
env.IPPROOT            = "/opt/intel/oneapi/ipp/2021.4.0"
env.DAALROOT           = "/opt/intel/oneapi/deal/2021.4.0"

env.SCALE_FE_SYS        = "Linux64-intel-impi"
env.SCALE               = "/home/ykawai/workspace/scale_intel/"
env.SCALE_ENABLE_OPENMP = "T"
env.SCALE_DEVELOP       = "T"