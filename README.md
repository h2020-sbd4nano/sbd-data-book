# sbd-data-book

## Setting up a SPARQL end point

Download blazegraph and copy the `.jar` into a new `bg/` subfolder, and then
load the following files into Blazegraph via the `Update` tab:

* sbd-data-landscape/nanosafety_databases.ttl
* sbd-data-diamonds/diamonds-models.ttl

## Building the book

The build system depends on a locally set up Blazegraph, as described above,
and is expected to run at `http://localhost:9999/`. This is not configurable
at this moment and is hardcoded in two locations.

After that, the book can be build with (on a GNU/Linux (sub) system):

```
cd sparql/
make distclean; make
cd ..
make
```
