DESCRIPTION = "Load, configure, and compose WSGI applications and servers"
HOMEPAGE = "http://pythonpaste.org/deploy/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PYPI_PACKAGE = "PasteDeploy"
RPROVIDES_${PN} += "python3-pastedeploy"
SRC_URI[md5sum] = "352b7205c78c8de4987578d19431af3b"
inherit pypi setuptools3
