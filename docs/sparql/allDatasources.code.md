# allDatasources.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX void:    <http://rdfs.org/ns/void#>
PREFIX dcterms: <http://purl.org/dc/terms/>
PREFIX dc:      <http://purl.org/dc/elements/1.1/>

SELECT ?resource ?resourceLabel ?img WHERE {
  ?void a void:DatasetDescription ;
    dcterms:title|dc:title ?resourceLabel .
  OPTIONAL { ?void dc:source ?resource }
  OPTIONAL { ?void foaf:img ?img }
}
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20void%3A%20%20%20%20%3Chttp%3A%2F%2Frdfs.org%2Fns%2Fvoid%23%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0A%0ASELECT%20%3Fresource%20%3FresourceLabel%20%3Fimg%20WHERE%20%7B%0A%20%20%3Fvoid%20a%20void%3ADatasetDescription%20%3B%0A%20%20%20%20dcterms%3Atitle%7Cdc%3Atitle%20%3FresourceLabel%20.%0A%20%20OPTIONAL%20%7B%20%3Fvoid%20dc%3Asource%20%3Fresource%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fvoid%20foaf%3Aimg%20%3Fimg%20%7D%0A%7D%0A)


### Output

<table>
  <tr>
    <td><b>resource</b></td>
    <td><b>img</b></td>
  </tr>
  <tr>
    <td><a href="https://doi.org/10.1016/j.comtox.2018.12.002">Computational models for the assessment of manufactured nanomaterials</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://docs.google.com/spreadsheets/d/18n37M72zQJgfsELIGRj6llEZ44Ao48qGoXWXyPazRD0/edit#gid=760845260">SbD4nano WP2 Causal Relationships</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://ammar257ammar.github.io/Nanosafety-data-reusability-34-datasets/">Data completeness and reusability assessment for 34 nanosafety datasets</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/">SbD4nano Nanocompound</a></td>
    <td><img width="200" src="https://www.urv.cat/media/img/logo-urv-nav.png" /></td>
  </tr>
  <tr>
    <td><a href="https://bio.tools/t?domain=toxicology">The bio.tools Toxicology Collection</a></td>
    <td><img width="200" src="https://bio.tools/img/elixir_biotools_transparent.png" /></td>
  </tr>
  <tr>
    <td><a href="https://diamonds.tno.nl/">COVID-19</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://diamonds.tno.nl/">Scientific Models</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://diamonds.tno.nl/">Exposure</a></td>
    <td></td>
  </tr>
  <tr>
    <td><a href="https://fairsharing.org/">FAIRsharing</a></td>
    <td><img width="200" src="https://api.fairsharing.org/img/fairsharing-attribution.svg" /></td>
  </tr>
  <tr>
    <td><a href="https://aopwiki.rdf.bigcat-bioinformatics.org/">AOP-Wiki data</a></td>
    <td><img width="200" src="https://aopwiki.rdf.bigcat-bioinformatics.org/assets/images/aopwiki-snorql-logo.png" /></td>
  </tr>
  <tr>
    <td><a href="https://aopwiki.rdf.bigcat-bioinformatics.org/">AOP-Wiki AOPs</a></td>
    <td><img width="200" src="https://aopwiki.rdf.bigcat-bioinformatics.org/assets/images/aopwiki-snorql-logo.png" /></td>
  </tr>
  <tr>
    <td><a href="https://aopwiki.rdf.bigcat-bioinformatics.org/">AOP-Wiki Key Event Relationships</a></td>
    <td><img width="200" src="https://aopwiki.rdf.bigcat-bioinformatics.org/assets/images/aopwiki-snorql-logo.png" /></td>
  </tr>
  <tr>
    <td><a href="https://doi.org/10.6084/m9.figshare.11897205.v1">NanoWiki v6 causal relationships</a></td>
    <td><img width="200" src="https://search.data.enanomapper.net/assets/img/logo.png" /></td>
  </tr>
  <tr>
    <td><a href="http://www.smartnanotox.eu/?page_id=131">SmartNanoTox Transcriptomics datasets</a></td>
    <td><img width="200" src="https://www.ucd.ie/sbi/t4media/SNT%20870x400.png" /></td>
  </tr>
  <tr>
    <td><a href="https://nanocommons.github.io/datasets/">Overview of open datasets released by NanoSafety Cluster projects</a></td>
    <td><img width="200" src="https://upload.wikimedia.org/wikipedia/commons/e/e1/NanoCommons-Logo-Large_-_White_Circle_01.png" /></td>
  </tr>
  <tr>
    <td><a href="https://nanoinformatix-platform.greendecision.eu/">NanoInformaTIX Tools</a></td>
    <td><img width="200" src="https://nanoinformatix-platform.greendecision.eu/Nix-logo-DEF.jpg" /></td>
  </tr>
  <tr>
    <td><a href="https://nanosolveit.eu/resources/tools-services/">NanoSolveIT Tools</a></td>
    <td><img width="200" src="https://nanosolveit.eu/wp-content/uploads/2019/06/NanoSolveIT-300x114-Transparent-Half.png" /></td>
  </tr>
  <tr>
    <td><a href="https://search.data.enanomapper.net/">Open datasets hosted at the Nanosafety Data Interface</a></td>
    <td><img width="200" src="https://search.data.enanomapper.net/assets/img/logo.png" /></td>
  </tr>
  <tr>
    <td><a href="https://search.data.enanomapper.net/">Closed datasets hosted at the Nanosafety Data Interface</a></td>
    <td><img width="200" src="https://search.data.enanomapper.net/assets/img/logo.png" /></td>
  </tr>
  <tr>
    <td><a href="https://cloud.vhp4safety.nl/">Cloud services provided by VHP4Safety</a></td>
    <td><img width="200" src="https://images.nieuwsbrieven.rivm.nl/101500/0/5763/fe1e7915ce28f7a96ca25ed234631504.png" /></td>
  </tr>
  <tr>
    <td><a href="https://www.health-ri.nl/">Health-RI tools and services</a></td>
    <td><img width="200" src="https://www.health-ri.nl/sites/healthri/files/styles/service_single_logo/public/images/HealthRI_Primary_RGB.jpg.PNG?itok=veW2kxsV" /></td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allDatasources.rq | sed 's+<lang/>+en+' > allDatasources.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allDatasources.rq
```

This SPARQL query is available under CCZero.
