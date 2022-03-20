# sbd-data-book

## Setting up a SPARQL end point

This book is based on the public (open) data of the landscape cache, available
at https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/.
The output can be found at https://h2020-sbd4nano.github.io/sbd-data-book/

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
