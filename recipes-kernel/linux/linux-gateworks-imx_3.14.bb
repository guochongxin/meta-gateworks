# Copyright (C) 2015 Gateworks Corporation
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

PR = "r21"

DEPENDS += "lzop-native bc-native"

# override URI of source and PR for Gateworks linux-imx kernel
SRCREV = "1032ddf66a1488b47f3ff72f944b4ceadcdd2e4e"
SRC_BRANCH = "gateworks_fslc_3.14_1.0.x_ga"
LOCALVERSION = "-1.0.x_ga+yocto"
SRC_URI = "git://github.com/Gateworks/linux-imx6.git;protocol=http;branch=${SRC_BRANCH}"

# use defconfig from arch/arm/configs
do_configure_prepend() {
    cp "${S}/arch/arm/configs/gwventana_defconfig" "${WORKDIR}/defconfig"
}

COMPATIBLE_MACHINE = "(ventana)"
