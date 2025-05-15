#!groovy

// spack-v0.19
// def SCALE_NETCDF_C = "/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/netcdf-c-4.9.0-g462kcd2ivou7ewax6wddywoyrbz2oib"
// def SCALE_NETCDF_F = "/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/netcdf-fortran-4.6.0-mmdtg5243y4mwqsl3gcu3m2kh27raq5n"
// def SCALE_PNETCDF  = "/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/parallel-netcdf-1.12.3-avpnzm4pwv2tuu2mv73lacb4vhcwlnds"
// def SCALE_HDF      = "/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/hdf5-1.12.2-kb4msz2kuwzsmqsshhpryqebui6tqcfs"
// spack-v0.21
def SCALE_NETCDF_C    = "/vol0004/apps/oss/spack-v0.21/opt/spack/linux-rhel8-a64fx/fj-4.10.0/parallel-netcdf-1.12.3-zs75olgkg547zcyxaoubsyevmvtkby5o"
def SCALE_NETCDF_F    = "/vol0004/apps/oss/spack-v0.21/opt/spack/linux-rhel8-a64fx/fj-4.10.0/netcdf-fortran-4.6.1-kjm7jl5naxulm7neknsgxnsbkf7iet5j"
def SCALE_PNETCDF     = "/vol0004/apps/oss/spack-v0.21/opt/spack/linux-rhel8-a64fx/fj-4.10.0/netcdf-c-4.9.2-cczsjh6lmalmjqhr72yatvxzmc3iwdl2"
def SCALE_HDF         = "/vol0004/apps/oss/spack-v0.21/opt/spack/linux-rhel8-a64fx/fj-4.10.0/hdf5-1.14.3-yhazdvld6vknkhmbcqrbl34ifsac2hao"

env.PATH               = "/opt/FJSVxtclanga/tcsds-latest/bin:/opt/local/openssh/bin:/usr/share/Modules/bin:/opt/local/openssh/bin:/usr/local/bin:/bin:/usr/bin:/usr/local/sbin:/usr/sbin"
env.LD_LIBRARY_PATH    = ""

env.PATH_ANALYSIS            = "/vol0004/ra000005/data/a04028/tmp_spack/spack/opt/spack/linux-rhel8-cascadelake/gcc-13.2.0/ffmpeg-6.0-xjdxtu24or46fimcfwm3hzavtbmzkeke/bin:/vol0004/ra000005/data/a04028/tmp_spack/spack/opt/spack/linux-rhel8-cascadelake/gcc-13.2.0/ffmpeg-6.0-xjdxtu24or46fimcfwm3hzavtbmzkeke/bin:/vol0004/ra000005/data/a04028/tmp_spack/spack/opt/spack/linux-rhel8-cascadelake/gcc-13.2.0/yasm-1.3.0-kg7p5tyawy7i5qtp7jjmt5dopzmgcc25/bin:/vol0004/ra000005/data/a04028/tmp_spack/spack/opt/spack/linux-rhel8-cascadelake/gcc-13.2.0/x264-20210613-qvwwapmmu4dphpt443kul7eku2tpfkkv/bin:/vol0004/apps/oss/spack-v0.21/opt/spack/linux-rhel8-cascadelake/gcc-13.2.0/nasm-2.15.05-5oab5tdwbdzas6mt3voy7xmrqdhz2uws/bin:/vol0004/apps/oss/spack-v0.21/opt/spack/linux-rhel8-cascadelake/gcc-13.2.0/libiconv-1.17-dq5vbneog5fkc7mdgniowrk6y3cnmbuz/bin:/vol0004/ra000005/data/a04028/tmp_spack/spack/opt/spack/linux-rhel8-cascadelake/gcc-13.2.0/alsa-lib-1.2.3.2-a7xip5hgejdn7uqymmlgtdpjtywaxh6l/bin:/vol0402/data/ra000005/a04028/tmp_spack/spack/bin:/home/ra000005/a04028/library/bin:/share/ra000005/bin:/opt/local/openssh/bin:/opt/slurm/bin:/home/apps/oss/mscp/bin:/vol0402/data/ra000005/a04028/.pyenv/shims:/vol0402/data/ra000005/a04028/.pyenv/bin:/home/ra000005/a04028/library/bin:/share/ra000005/bin:/opt/local/openssh/bin:/opt/slurm/bin:/home/apps/oss/mscp/bin:/share/ra000005/bin:/opt/FJSVxtclanga/tcsds-1.2.40/bin:/opt/local/openssh/bin:/opt/slurm/bin:/home/apps/oss/mscp/bin:/usr/share/Modules/bin:/opt/local/openssh/bin:/usr/local/bin:/bin:/usr/bin:/usr/local/sbin:/usr/sbin:/opt/local/hpcissh-clients/bin/:/opt/local/jwt/bin:/data/ra000005/a04028/.gem/bin/:data/ra000005/a04028/.gem/bin/:"
env.LD_LIBRARY_PATH_ANALYSIS = "/vol0004/ra000005/data/a04028/tmp_spack/spack/opt/spack/linux-rhel8-cascadelake/gcc-13.2.0/ffmpeg-6.0-xjdxtu24or46fimcfwm3hzavtbmzkeke/lib:/vol0004/apps/oss/spack-v0.21/opt/spack/linux-rhel8-cascadelake/gcc-13.2.0/zlib-ng-2.1.4-l2nvhc5mtw3vzwxgqbdk7fuzh5kdn2bt/lib:/vol0004/ra000005/data/a04028/tmp_spack/spack/opt/spack/linux-rhel8-cascadelake/gcc-13.2.0/yasm-1.3.0-kg7p5tyawy7i5qtp7jjmt5dopzmgcc25/lib:/vol0004/ra000005/data/a04028/tmp_spack/spack/opt/spack/linux-rhel8-cascadelake/gcc-13.2.0/x264-20210613-qvwwapmmu4dphpt443kul7eku2tpfkkv/lib:/vol0004/apps/oss/spack-v0.21/opt/spack/linux-rhel8-cascadelake/gcc-13.2.0/libiconv-1.17-dq5vbneog5fkc7mdgniowrk6y3cnmbuz/lib:/vol0004/ra000005/data/a04028/tmp_spack/spack/opt/spack/linux-rhel8-cascadelake/gcc-13.2.0/alsa-lib-1.2.3.2-a7xip5hgejdn7uqymmlgtdpjtywaxh6l/lib:/home/apps/oss/mscp/lib64:/home/apps/oss/mscp/lib64:/opt/FJSVxtclanga/tcsds-1.2.40/lib64:/home/apps/oss/mscp/lib64"

env.SCALE_FE_SYS         = "FUGAKU"
env.SCALE                = "/vol0500/data/ra000005/a04028/scale-dev0/"
env.SCALE_ENABLE_OPENMP  = "T"
env.SCALE_DEVELOP        = "T"
env.SCALE_NETCDF_INCLUDE = "-I${SCALE_NETCDF_C}/include -I${SCALE_NETCDF_F}/include -I${SCALE_PNETCDF}/include"
env.SCALE_NETCDF_LIBS    = "-L${SCALE_NETCDF_C}/lib -L${SCALE_NETCDF_F}/lib -L${SCALE_HDF}/lib -L${SCALE_PNETCDF}/lib -lpnetcdf -lnetcdff -lnetcdf -lhdf5_hl -lhdf5 -lfjprofmpi -lmpi_cxx"
env.FUGAKU_GROUP         = "ra000005"
env.SCALE_ARTIFACT_DIR   = "/home/ykawai/Qsync2/Jenkins/"

