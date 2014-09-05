DESCRIPTION = "A small image just capable of allowing a device to boot and \
is suitable for development work."

require errordeveloper-base-image.bb

IMAGE_INSTALL += " \
  pd \
  supercollider \
  alsa-lib \
  alsa-utils \
  git \
  strace \
"

IMAGE_FEATURES += "dev-pkgs"
