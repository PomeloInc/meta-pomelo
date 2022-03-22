SUMMARY = "MQTT-Client dev"
SECTION = "pomelo dev"
DESCRIPTION = "Recipe for pomelo MQTT client"
RDEPENDS_${PN} = "python3 python3-paho-mqtt python3-json python3-socketio python3-logging"
SRC_URI = "git://github.com/PomeloInc/mqtt-client.git;protocol=https;branch=dev"
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
S = "${WORKDIR}/git"
LICENSE = "CLOSED"
BB_STRICT_CHECKSUM = "0"

# python do_display_banner() {
#     bb.plain("***********************************************");
#     bb.plain("*                                             *");
#     bb.plain("*       META-POMELO Layer for IoT Apps        *");
#     bb.plain("*                                             *");
#     bb.plain("***********************************************");
# }

# addtask display_banner before do_build

do_install () {
  install -d ${D}/${bindir}/pomelo-iot/mqtt-client-dev
  # install -m 0755 ${S}/* ${D}/${bindir}/pomelo-iot/mqtt-client
  cp -r ${S}/* ${D}/${bindir}/pomelo-iot/mqtt-client-dev
}