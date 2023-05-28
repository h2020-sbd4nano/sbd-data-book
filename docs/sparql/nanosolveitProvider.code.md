# nanosolveitProvider.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX void:    <http://rdfs.org/ns/void#>
PREFIX dcterms: <http://purl.org/dc/terms/>
PREFIX dc:      <http://purl.org/dc/elements/1.1/>

SELECT ?type ?resource ?resourceLabel WHERE {
  VALUES ?provider {
    <https://nanosolveit.eu/resources/tools-services/>
  }
  ?provider a void:DatasetDescription ;
    dcterms:title|dc:title ?providerLabel .
  ?resource dc:source ?provider ; a / rdfs:label ?type ;
    rdfs:label ?resourceLabel .
} ORDER BY ASC(?type) ASC(?resource)
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20void%3A%20%20%20%20%3Chttp%3A%2F%2Frdfs.org%2Fns%2Fvoid%23%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0A%0ASELECT%20%3Ftype%20%3Fresource%20%3FresourceLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Fprovider%20%7B%0A%20%20%20%20%3Chttps%3A%2F%2Fnanosolveit.eu%2Fresources%2Ftools-services%2F%3E%0A%20%20%7D%0A%20%20%3Fprovider%20a%20void%3ADatasetDescription%20%3B%0A%20%20%20%20dcterms%3Atitle%7Cdc%3Atitle%20%3FproviderLabel%20.%0A%20%20%3Fresource%20dc%3Asource%20%3Fprovider%20%3B%20a%20%2F%20rdfs%3Alabel%20%3Ftype%20%3B%0A%20%20%20%20rdfs%3Alabel%20%3FresourceLabel%20.%0A%7D%20ORDER%20BY%20ASC%28%3Ftype%29%20ASC%28%3Fresource%29%0A)


### Output

<table>
  <tr>
    <td><b>type</b></td>
    <td><b>resource</b></td>
  </tr>
  <tr>
    <td>Model</td>
    <td><a href="http://enaloscloud.novamechanics.com/EnalosWebApps/ZetaPotential/">PhysChem: Zeta potential NanoXtract model</a></td>
  </tr>
  <tr>
    <td>Model</td>
    <td><a href="https://aerosol.cloud.nanosolveit.eu/">NanoSolveIT Tool for Assessment of Human Exposure to Nanomaterials</a></td>
  </tr>
  <tr>
    <td>Model</td>
    <td><a href="https://cellviability.cloud.nanosolveit.eu/">NanoSolveIT Cytotoxicity (Cell Viability) Prediction for Metal Oxide NPs</a></td>
  </tr>
  <tr>
    <td>Model</td>
    <td><a href="https://deepdaph.cloud.nanosolveit.eu/">DeepDaph</a></td>
  </tr>
  <tr>
    <td>Model</td>
    <td><a href="https://funmappone.cloud.nanosolveit.eu/">FunMappOne</a></td>
  </tr>
  <tr>
    <td>Model</td>
    <td><a href="https://nanofase.cloud.nanosolveit.eu/">NanoFASE Soil-water-organism model</a></td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/nanosolveitProvider.rq | sed 's+<lang/>+en+' > nanosolveitProvider.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@nanosolveitProvider.rq
```

This SPARQL query is available under CCZero.
