SUMMARY = "MQTT-Client"
SECTION = "pomelo"
DESCRIPTION = "Recipe for pomelo MQTT client"
SRC_URI = "https://github.com/PomeloInc/meta-pomelo.git;protocol=http;branch=dev"
SRCREV = "${AUTOREV}"
# PV = "1.0+git${SRCPV}"
RDEPENDS_${PN} = "python3 python3-paho-mqtt"
S = "${WORKDIR}/mqtt-client-dev"
LICENSE = "CLOSED"
BB_STRICT_CHECKSUM = "0"
# LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"
# SRC_URI[md5sum] = "acb789a2ebe1b22c7082f0b06c0b1507"
# SRC_URI[sha256] = "840ccdeaabff07941ee64414a0bfc0cd268a46b0ecee91dcc46802d5297f17d6"

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*       META-POMELO Layer for IoT Apps        *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}

addtask display_banner before do_build

do_install () {
  install -d ${D}/${bindir}/pomelo-iot/mqtt-client
  install -m 0755 ${S}/* ${D}/${bindir}/pomelo-iot/mqtt-client
}