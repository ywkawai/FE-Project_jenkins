#!groovy

// spack-v0.19
def SCALE_NETCDF_C = "/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/netcdf-c-4.9.0-g462kcd2ivou7ewax6wddywoyrbz2oib"
def SCALE_NETCDF_F = "/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/netcdf-fortran-4.6.0-mmdtg5243y4mwqsl3gcu3m2kh27raq5n"
def SCALE_PNETCDF  = "/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/parallel-netcdf-1.12.3-avpnzm4pwv2tuu2mv73lacb4vhcwlnds"
def SCALE_HDF      = "/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/hdf5-1.12.2-kb4msz2kuwzsmqsshhpryqebui6tqcfs"

env.PATH               = "/opt/FJSVxtclanga/tcsds-latest/bin:/opt/local/openssh/bin:/usr/share/Modules/bin:/opt/local/openssh/bin:/usr/local/bin:/bin:/usr/bin:/usr/local/sbin:/usr/sbin"
env.LD_LIBRARY_PATH    = ""

env.SCALE_FE_SYS         = "FUGAKU"
env.SCALE                = "/data/ra000005/a04028/scale-dev0/"
env.SCALE_ENABLE_OPENMP  = "T"
env.SCALE_DEVELOP        = "T"
env.SCALE_NETCDF_INCLUDE = "-I${SCALE_NETCDF_C}/include -I${SCALE_NETCDF_F}/include -I${SCALE_PNETCDF}/include"
env.SCALE_NETCDF_LIBS    = "-L${SCALE_NETCDF_C}/lib -L${SCALE_NETCDF_F}/lib -L${SCALE_HDF}/lib -L${SCALE_PNETCDF}/lib -lpnetcdf -lnetcdff -lnetcdf -lhdf5_hl -lhdf5 -lfjprofmpi -lmpi_cxx"
env.FUGAKU_GROUP         = "ra000005"
