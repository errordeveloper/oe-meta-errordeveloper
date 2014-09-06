DESCRIPTION = "A small image just capable of allowing a device to boot and \
is suitable for development work."

require errordeveloper-base-dev-image.bb

IMAGE_INSTALL += " \
  pd \
  supercollider \
  alsa-lib \
  alsa-utils \
"

IMAGE_FEATURES += "dev-pkgs"
