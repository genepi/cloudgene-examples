# Cloudgene Examples

## Install Cloudgene


You will need the following things properly installed on your computer.

* [Java 8 or higher](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Docker](https://www.docker.com/) (Optional)


Download the latest version from our download page using the following commands:

* `mkdir cloudgene`
* `cd cloudgene`
* `curl -fsSL cloudgene.uibk.ac.at/install | bash`

Test the installation with the following command:

```sh
./cloudgene version
```

Now you are ready!

## Download Examples

```bash
git clone https://github.com/lukfor/cloudgene-examples.git
```

## Run Examples

### Commands and Bash

```bash
./cloudgene run print-text.yaml --message "Hello World"
```

```bash
./cloudgene run print-text-to-file.yaml --message "Hello World"
```

### More complex tasks using Java or Groovy

```bash
./cloudgene run hello-groovy.yaml
./cloudgene run hello-groovy.yaml --name Lukas
```


### Docker

You need [Docker](https://www.docker.com/) installed on your computer to run this example:

```bash
./cloudgene run vcf-tools.yaml --vcf vcf-file.vcf.gz
```
