# sbd-data-book

## Setting up a SPARQL end point

Download blazegraph and copy the `.jar` into a new `bg/` subfolder, and then
load the Turtle data. It is recommended to use the landscape cache, currently
at https://gitlab.maastrichtuniversity.nl/bigcat-um/sbd-data-landscape-data
where you can create a complete Turtle file with:

```shell
sh fetchData.sh
make -B all.ttl
```

Then, this file can be loaded into Blazegraph via the `Update` tab.

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
