DESCRIPTION = "A small image just capable of allowing a device to boot and \
is suitable for development work."

require core-image-minimal.bb

IMAGE_INSTALL += "libpd-dev libpd-dbg adb alsa-lib alsa-utils"

IMAGE_FEATURES += "dev-pkgs"
