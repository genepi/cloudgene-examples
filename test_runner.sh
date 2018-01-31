#!/bin/sh

# stop when one cmd fails, print commands
set -e
set -x

# set version to test examples with specific cloudgene version
CLOUDGENE_VERSION="1.30.0"
WORKING_DIR="cloudgene-test"

# prepate working directory
if [ -d "$WORKING_DIR" ]; then rm -Rf $WORKING_DIR; fi
mkdir $WORKING_DIR
cd $WORKING_DIR

# install cloudgene
curl -s install.cloudgene.io | bash -s $CLOUDGENE_VERSION

# print version
./cloudgene version

# install all examples
./cloudgene clone ../examples.yaml

# run examples
./cloudgene run print-text --message "Hello World"
./cloudgene run print-text-to-file --message "Hello World"
./cloudgene run hello-groovy
./cloudgene run hello-groovy --name Lukas

# vcf tools (needs docker)
wget https://imputationserver.sph.umich.edu/static/downloads/hapmap300.chr1.recode.vcf.gz

./cloudgene run vcf-tools --vcf hapmap300.chr1.recode.vcf.gz
