#!groovy

env.PATH               = "/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/parallel-netcdf-1.12.3-avpnzm4pwv2tuu2mv73lacb4vhcwlnds/bin:/opt/FJSVxtclanga/tcsds-mpi-latest/bin:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/netcdf-fortran-4.6.0-mmdtg5243y4mwqsl3gcu3m2kh27raq5n/bin:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/netcdf-c-4.9.0-g462kcd2ivou7ewax6wddywoyrbz2oib/bin:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/hdf5-1.12.2-kb4msz2kuwzsmqsshhpryqebui6tqcfs/bin:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/cmake-3.24.3-7iqxomqwqyduy5exm43fyoarpzw3atj4/bin:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/rhash-1.4.2-s3mitrsnpm36uemub4vkzj22qa4ygndu/bin:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/libarchive-3.5.2-l7jdc7uw35jngg7tibqzsohz44ouwsj7/bin:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/mbedtls-2.28.0-squ3v2xuqnd3mfpxiuoimtxaookk3dyi/bin:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/libiconv-1.16-bfdxvmujixuefjz26ldcsxhzqr3rcufm/bin:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/expat-2.4.8-lztkevt2hobbf7ykiwnuegynnoxqqvwe/bin:/opt/FJSVxtclanga/tcsds-mpi-latest/bin:/vol0004/apps/oss/spack/bin:/home/ra000005/a04028/library/bin:/share/ra000005/bin:/opt/local/openssh/bin:/vol0004/ra000005/data/a04028/.vscode-server/bin/695af097c7bd098fbf017ce3ac85e09bbc5dda06/bin/remote-cli:/vol0402/data/ra000005/a04028/.pyenv/shims:/vol0402/data/ra000005/a04028/.pyenv/bin:/home/ra000005/a04028/library/bin:/share/ra000005/bin:/opt/local/openssh/bin:/vol0402/data/ra000005/a04028/.pyenv/bin:/home/ra000005/a04028/library/bin:/share/ra000005/bin:/opt/FJSVxtclanga/tcsds-1.2.37/bin:/opt/local/openssh/bin:/usr/share/Modules/bin:/opt/local/openssh/bin:/usr/local/bin:/bin:/usr/bin:/usr/local/sbin:/usr/sbin"
env.LD_LIBRARY_PATH    = "/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/parallel-netcdf-1.12.3-avpnzm4pwv2tuu2mv73lacb4vhcwlnds/lib:/opt/FJSVxtclanga/tcsds-mpi-latest/lib64:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/netcdf-fortran-4.6.0-mmdtg5243y4mwqsl3gcu3m2kh27raq5n/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/netcdf-c-4.9.0-g462kcd2ivou7ewax6wddywoyrbz2oib/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/hdf5-1.12.2-kb4msz2kuwzsmqsshhpryqebui6tqcfs/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/rhash-1.4.2-s3mitrsnpm36uemub4vkzj22qa4ygndu/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/libuv-1.44.1-riv7xhqvpur57jexesqfpw2mpnjjfhdd/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/libarchive-3.5.2-l7jdc7uw35jngg7tibqzsohz44ouwsj7/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/zstd-1.5.2-7j2edrlmibpft52s3m3q7ujechw3hujt/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/zlib-1.2.13-go4ye2sg72pcca4bgunmcseuzq6czbol/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/mbedtls-2.28.0-squ3v2xuqnd3mfpxiuoimtxaookk3dyi/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/lzo-2.10-uhskbd2ewdp4akltdmetra3oy4twv57f/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/libiconv-1.16-bfdxvmujixuefjz26ldcsxhzqr3rcufm/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/expat-2.4.8-lztkevt2hobbf7ykiwnuegynnoxqqvwe/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/libbsd-0.11.5-x462pikjmy4scmsuhucngco5efautbg2/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/libmd-1.0.4-wcmufmjxfiwxa65p4eetl2y674q2pgqa/lib:/opt/FJSVxtclanga/tcsds-mpi-latest/lib64:/opt/FJSVxtclanga/tcsds-1.2.37/lib64"

env.SCALE_FE_SYS         = "FUGAKU"
env.SCALE                = "/data/ra000005/a04028/SCALE_comp_perf/"
env.SCALE_ENABLE_OPENMP  = "T"

env.SPACK_LD_LIBRARY_PATH = "/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/netcdf-fortran-4.6.0-mmdtg5243y4mwqsl3gcu3m2kh27raq5n/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/netcdf-c-4.9.0-g462kcd2ivou7ewax6wddywoyrbz2oib/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/hdf5-1.12.2-kb4msz2kuwzsmqsshhpryqebui6tqcfs/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/rhash-1.4.2-s3mitrsnpm36uemub4vkzj22qa4ygndu/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/libuv-1.44.1-riv7xhqvpur57jexesqfpw2mpnjjfhdd/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/libarchive-3.5.2-l7jdc7uw35jngg7tibqzsohz44ouwsj7/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/zstd-1.5.2-7j2edrlmibpft52s3m3q7ujechw3hujt/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/zlib-1.2.13-go4ye2sg72pcca4bgunmcseuzq6czbol/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/mbedtls-2.28.0-squ3v2xuqnd3mfpxiuoimtxaookk3dyi/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/lzo-2.10-uhskbd2ewdp4akltdmetra3oy4twv57f/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/libiconv-1.16-bfdxvmujixuefjz26ldcsxhzqr3rcufm/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/expat-2.4.8-lztkevt2hobbf7ykiwnuegynnoxqqvwe/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/libbsd-0.11.5-x462pikjmy4scmsuhucngco5efautbg2/lib:/vol0004/apps/oss/spack-v0.19/opt/spack/linux-rhel8-a64fx/fj-4.8.1/libmd-1.0.4-wcmufmjxfiwxa65p4eetl2y674q2pgqa/lib:/opt/FJSVxtclanga/tcsds-mpi-latest/lib64:/opt/FJSVxtclanga/tcsds-1.2.37/lib64"