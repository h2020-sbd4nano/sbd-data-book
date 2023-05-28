# smartnanotoxProvider.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX void:    <http://rdfs.org/ns/void#>
PREFIX dcterms: <http://purl.org/dc/terms/>
PREFIX dc:      <http://purl.org/dc/elements/1.1/>

SELECT ?type ?resource ?resourceLabel WHERE {
  VALUES ?provider {
    <https://h2020-sbd4nano.github.io/sbd-data-smartnanotox/>
  }
  ?provider a void:DatasetDescription ;
    dcterms:title|dc:title ?providerLabel .
  ?resource dc:source ?provider ; a / rdfs:label ?type ;
    rdfs:label ?resourceLabel .
} ORDER BY ASC(?type) ASC(?resource)
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20void%3A%20%20%20%20%3Chttp%3A%2F%2Frdfs.org%2Fns%2Fvoid%23%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0A%0ASELECT%20%3Ftype%20%3Fresource%20%3FresourceLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Fprovider%20%7B%0A%20%20%20%20%3Chttps%3A%2F%2Fh2020-sbd4nano.github.io%2Fsbd-data-smartnanotox%2F%3E%0A%20%20%7D%0A%20%20%3Fprovider%20a%20void%3ADatasetDescription%20%3B%0A%20%20%20%20dcterms%3Atitle%7Cdc%3Atitle%20%3FproviderLabel%20.%0A%20%20%3Fresource%20dc%3Asource%20%3Fprovider%20%3B%20a%20%2F%20rdfs%3Alabel%20%3Ftype%20%3B%0A%20%20%20%20rdfs%3Alabel%20%3FresourceLabel%20.%0A%7D%20ORDER%20BY%20ASC%28%3Ftype%29%20ASC%28%3Fresource%29%0A)


### Output

<table>
  <tr>
    <td><b>type</b></td>
    <td><b>resource</b></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE117487">Effect of cell passage number on gene expression in NR8383 macrophages</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE156457">Transcriptomic study of NR8383 rat macrophages cells following exposure to Printex90</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE156458">Transcriptomic study of NR8383 rat macrophages cells in control condition (DMEM culture medium supplemented with 10% of fetal bovine serum)</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE156489">Transcriptomic study of NR8383 rat macrophages cells in control condition (water, H2O)</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE156493">Transcriptomic study of NR8383 rat macrophages cells in submerged condition (control)</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE156509">Transcriptomic study of NR8383 rat macrophages cells following exposure to TiO2 (NM105, p25 anatase/rutile)</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE156511">Transcriptomic study of NR8383 rat macrophages cells following exposure to NM403 carbon nanotubes</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE156564">Transcriptomic study of NR8383 rat macrophages cells following exposure to TiO2 (NRCWE001)</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE156571">Transcriptomic study of NR8383 rat macrophages cells following exposure to multi-walled carbon nanotubes (NRCWE006)</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE156573">Transcriptomic study of NR8383 rat macrophages cells following exposure to NiZnFe2O4.</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE156587">Transcriptomic study of NR8383 rat macrophages cells following exposure to Fe2O3 (NRCWE018).</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE156659">Transcriptomic study of NR8383 rat macrophages cells following exposure to zinc iron oxide (ZnFe2O4, NRCWE021)</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE156660">Transcriptomic study of NR8383 rat macrophages cells following exposure to COOH-functionalized carbon nanotubes (NRCWE042)</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE156666">Transcriptomic study of NR8383 rat macrophages cells following exposure to NH2-functionalized carbon nanotubes (NRCWE049)</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE156691">Transcriptomic study of NR8383 rat macrophages cells following exposure to pristine single-walled carbon nanotubes (NRCWE055)</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE156694">Transcriptomic study of NR8383 rat macrophages cells following exposure to carbon black (Printex 90)</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE156695">Transcriptomic study of NR8383 rat macrophages cells following exposure to ZnO 4 µg/mL and ZnO 16 µg/mL</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE97852">Transcriptomic study of NR8383 cells following exposure to zinc oxide nanoparticles NM110</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE99435">Transcriptomic study of PMA-differentiated THP-1 cells following exposure to zinc oxide nanoparticles NM110</a></td>
  </tr>
  <tr>
    <td>Dataset</td>
    <td><a href="https://identifiers.org/geo:GSE99997">TiO2-induced gene expression profiles in rat lung: a subacute inhalation study</a></td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/smartnanotoxProvider.rq | sed 's+<lang/>+en+' > smartnanotoxProvider.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@smartnanotoxProvider.rq
```

This SPARQL query is available under CCZero.
