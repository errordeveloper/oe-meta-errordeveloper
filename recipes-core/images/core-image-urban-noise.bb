DESCRIPTION = "A small image just capable of allowing a device to boot"
require core-image-minimal.bb

IMAGE_INSTALL += "libpd adb alsa-lib alsa-utils"
