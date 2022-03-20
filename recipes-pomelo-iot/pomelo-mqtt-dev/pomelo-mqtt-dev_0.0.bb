SUMMARY = "MQTT-Client"
SECTION = "pomelo"
DESCRIPTION = "Recipe for pomelo MQTT client"
RDEPENDS_${PN} = "python3 python3-paho-mqtt"
SRC_URI = "git://github.com/PomeloInc/mqtt-client.git;protocol=https;branch=dev"
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
S = "${WORKDIR}/git"
LICENSE = "CLOSED"
BB_STRICT_CHECKSUM = "0"

do_install () {
  install -d ${D}/${bindir}/pomelo-iot/mqtt-client
  install -m 0755 ${S}/* ${D}/${bindir}/pomelo-iot/mqtt-client
}