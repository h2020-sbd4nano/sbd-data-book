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

### Licenses

Not all resources have licenses that allow us to immediately use them, but require acquiring a license.
This query lists all license information in the current knowledge base:

<sparql>allLicenses</sparql>

This gives us:

<out>allLicenses</out>


## Statistics

Each data source can provide information about different
resource types. This table gives an overview for each metadata
source what information is provided as basic <topic>statistics</topic>:

<out>statistics</out>

If metadata sources are not listed here, then they are likely not
described by a data descriptor header file.
