require gateworks-image-minimal.bb

DESCRIPTION = "Gateworks Multimedia Image capable of doing A/V"

LICENSE = "MIT"

# Gateworks test tools
IMAGE_INSTALL += "gateworks-test gst-gateworks-apps"

# Test packages
IMAGE_INSTALL += "\
    imx-test \
"

# graphics and gstreamer plugins
IMAGE_INSTALL += "\
    packagegroup-fslc-gstreamer1.0-full \
    gstreamer1.0-meta-base \
    gstreamer1.0-plugins-imx \
    gstreamer1.0-rtsp-server \
    gstreamer1.0-plugins-base-meta \
    gstreamer1.0-plugins-good-meta \
    gstreamer1.0-plugins-bad-meta \
    gstreamer1.0-plugins-ugly-meta \
"

# Audio packages
IMAGE_INSTALL += "\
    alsa-utils alsa-lib alsa-state \
"
