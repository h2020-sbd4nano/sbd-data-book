# A Semantic landscape

## General requirements

General features we have to track of assets:

* <topic>copyright information</topic>
* <topic>license information</topic>

These two follow DMP and FAIR practices, see for example [this presentation](http://doi.org/10.5281/zenodo.3661425).

* supported hazards
* supported hazard drivers

Specific assets will have additional requirements or specific more detailed information about the second two
requirements.

## Information sources and plugins

Information about databases, datasets, model, and relationships
are collected but also retrieved from other <topic>data sources</topic>.

## Data sources

Currently, the following data sources are being used:

<sparql>allDatasources</sparql>

This gives us:

<out>allDatasources</out>

The following sections highlight a few EU NanoSafety Cluster projects.

### SmartNanoTox

<topic>SmartNanoTox</topic> provides a few datasets:

<out>smartnanotoxProvider</out>

### NanoSolveIT

<topic>NanoSolveIT</topic> provides several computational models [<cite>Q90746742</cite>]:

<out>nanosolveitProvider</out>

### The Nanosafety Data Interface

The <topic>Nanosafety Data Interface</topic> provides access to data from a number of 
EU NanoSafety Cluster projects [<cite>Q113605960</cite>]:

<out>nsdiProvider</out>

### Licenses

Not all resources have licenses that allow us to immediately use them, but require acquiring a license.
This query lists all license information in the current knowledge base:

<sparql>allLicenses</sparql>

This gives us:

<out limit="10">allLicenses</out>


## Statistics

Each data source can provide information about different
resource types. This table gives an overview for each metadata
source what information is provided as basic <topic>statistics</topic>:

<out>statistics</out>

If metadata sources are not listed here, then they are likely not
described by a data descriptor header file.


## References

<references/>
