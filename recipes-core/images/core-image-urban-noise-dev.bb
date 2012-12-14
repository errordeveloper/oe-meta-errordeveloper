DESCRIPTION = "A small image just capable of allowing a device to boot and \
is suitable for development work."

require core-image-minimal.bb

IMAGE_INSTALL += "\
  pd
  libpd-dev \
  libpd-dbg \
  alsa-lib \
  alsa-utils \
  adb \
  git \
  strace \
"

IMAGE_FEATURES += "dev-pkgs"
