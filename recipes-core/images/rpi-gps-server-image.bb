require recipes-core/images/rpi-basic-image.bb
IMAGE_INSTALL += "gps"
IMAGE_INSTALL += "vsomeip"
IMAGE_INSTALL_append = " gpsd"
