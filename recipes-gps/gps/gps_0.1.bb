DESCRIPTION = ""
LICENSE = "CLOSED"

PR ="n01"


SRC_URI += "git://git@gitlab.abinsula.com/abinsula-rd/some-ip/gps.git;protocol=ssh;user=git;branch=serial"
SRCREV = "83a91b3d19b98441455cb660dfa8e945d14002d0"

#SRC_URI +="git://github.com/Hernado998/GPS.SomeIP.git;protocol=https;branch=master"
#SRCREV = "f2be8b7a12e2cb6706ae7eded7bcc9d7071473f3"

S = "${WORKDIR}/git"


DEPENDS+=" openssl vsomeip gpsd"
     

inherit pkgconfig cmake 



 
do_install(){
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/build/service-gps ${D}${bindir}
    install -m 0755 ${WORKDIR}/build/client-gps ${D}${bindir}
     
}

 

FILES_${PN} = "/usr/bin/*"
