SUMMARY = "Stargazer development image"

inherit core-image
require pomelo-minimal-image.bb

IMAGE_FEATURES += "ssh-server-dropbear tools-debug debug-tweaks"

CORE_IMAGE_EXTRA_INSTALL += "ethtool evtest fbset i2c-tools memtester"
