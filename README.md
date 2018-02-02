# Cloudgene Examples

This repository includes several examples to help you developing Cloudgene applications.

## Install Cloudgene


You will need the following things properly installed on your computer.

* [Java 8 or higher](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Docker](https://www.docker.com/) (Optional)


Download the latest version from our download page using the following commands:

* `mkdir cloudgene`
* `cd cloudgene`
* `curl -s install.cloudgene.io | bash`

Add the executable path to your PATH variable. For example:

```sh
export PATH=~/path/to/cloudgene:$PATH
```

Test the installation with the following command:

```sh
cloudgene version
```

Now you are ready!

## Download Examples

You can download the content of this repository from [here]() or use `git` to clone it:

```bash
git clone https://github.com/genepi/cloudgene-examples.git
```

## Install Examples

You can install all example at once by using the `clone` command and the provided `examples.yaml` file which contains all applications:

```bash
cd cloudgene-examples
cloudgene clone examples.yaml
```

You can use the `ls` command to see which applications were installed:

```bash
cloudgene ls
```

## Running Examples

Or you can start the Web-Application with the `server` command:

```bash
cloudgene server
```

The webservice is available on http://localhost:8082. Please use username `admin` and password `admin1978` to login.


You can run installed applications on the commandline with the `run` command followed by the *application id* and the parameters. For example:

```bash
cloudgene run print-text --message "Hello World"
```


## Examples

### Commands and Bash

```bash
cloudgene run print-text --message "Hello World"
```

```bash
cloudgene run print-text-to-file --message "Hello World"
```

### More complex tasks using Java or Groovy

```bash
cloudgene run hello-groovy
cloudgene run hello-groovy --name Lukas
```


### Docker

You need [Docker](https://www.docker.com/) installed on your computer to run this example. This workflow starts a Docker container containg vcf-tools and calculates the allele frequency of the provided VCF file:

```bash
cloudgene run vcf-tools --vcf vcf-file.vcf.gz
```
