[![pages-build-deployment](https://github.com/h2020-sbd4nano/sbd-data-book/actions/workflows/pages/pages-build-deployment/badge.svg)](https://github.com/h2020-sbd4nano/sbd-data-book/actions/workflows/pages/pages-build-deployment)

# sbd-data-book

This book shows a number of competencies and simple SPARQL queries to demonstrate what
data is on the SbD4Nano semantic landscape and how data, knowledge, models, tools, and more
can be found about nanomaterials.

The repository https://github.com/h2020-sbd4nano/sbd-data-book holds the source code of
this book and the output can be found at https://h2020-sbd4nano.github.io/sbd-data-book/

## Setting up a local SPARQL endpoint

Below are links to instructions to set up a local SPARQL endpoint (all open source):

* [Blazegraph](https://github.com/h2020-sbd4nano/sbd-data-landscape-blazegraph) (Java, no longer maintained)
* [Qlever](https://github.com/h2020-sbd4nano/sbd-data-landscape-qlever) (under daily development, does not support all SPARQL syntax yet)

### Get a copy of the eNanoMapper ontology

Install ROBOT:

```shell
wget https://github.com/ontodev/robot/releases/download/v1.7.0/robot.jar
curl https://raw.githubusercontent.com/ontodev/robot/master/bin/robot > robot
```

Get a copy of the eNanoMapper ontology and convert it with ROBOT to Turtle:

```shell
wget https://github.com/enanomapper/ontologies/releases/download/v9.0/enanomapper-full.owl
sh ./robot convert --input enanomapper-full.owl --output enanomapper-full.ttl
```

## Building the book

The build system depends on a locally set up Blazegraph, as described above,
and is expected to run at `https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/`.
This is not configurable at this moment and is hardcoded in two locations.

After that, the book can be build with (on a GNU/Linux (sub) system):

```
cd sparql/
make distclean; make
cd ..
make
```
