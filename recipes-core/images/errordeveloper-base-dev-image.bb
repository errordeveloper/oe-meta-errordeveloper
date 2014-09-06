DESCRIPTION = "A small image just capable of allowing a device to boot and \
is suitable for development work."

require errordeveloper-base-image.bb

IMAGE_INSTALL += " \
  git \
  strace \
  curl \
  ssh \
  opkg \
  opkg-utils \
  opkg-config-base \
  distro-feed-configs \
"

IMAGE_FEATURES += "dev-pkgs"
