DESCRIPTION = "Gateworks testing files"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

SECTION = "console/utils"
RDEPENDS = "gstreamer gst-plugins-base                       \
	 gst-plugins-base-videotestsrc gst-fsl-plugin        \
	 gst-plugins-base-audiotestsrc gst-plugins-base-alsa \
	 alsa-utils alsa-lib alsa-state                      \
         fb-test"
DESTDIR = "/usr/bin"

PR = "r0"

SRC_URI = " \
        file://test_audio   \
        file://test_video   \
	file://playVideo    \
"

S = "${WORKDIR}"

do_install() {
             install -d ${D}/${DESTDIR}
             install -m 0755 test_audio ${D}${DESTDIR}
             install -m 0755 test_video ${D}${DESTDIR}
             install -m 0755 playVideo ${D}${DESTDIR}
}

FILES_${PN} = "${DESTDIR}/*"
