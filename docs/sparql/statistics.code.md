# statistics.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX sbd:     <https://www.sbd4nano.eu/rdf/#>
PREFIX sbdbel:  <https://www.sbd4nano.eu/bel/#>
PREFIX dc:      <http://purl.org/dc/elements/1.1/>
PREFIX dcterms: <http://purl.org/dc/terms/>

SELECT DISTINCT ?source ?sourceLabel ?databases ?datasets ?models ?relationships
                ?frameworks ?guidancetools ?guidancedocs ?lcanalyses
WHERE {
  ?source   dcterms:title|dc:title ?sourceLabel .
  {
    SELECT ?source (COUNT(DISTINCT ?framework) AS ?frameworks) (COUNT(DISTINCT ?dataset) AS ?datasets)
                   (COUNT(DISTINCT ?database) AS ?databases)   (COUNT(DISTINCT ?model) AS ?models)
                   (COUNT(DISTINCT ?relationship) AS ?relationships) (COUNT(DISTINCT ?guidancetool) AS ?guidancetools)
                   (COUNT(DISTINCT ?guidancedoc) AS ?guidancedocs) (COUNT(DISTINCT ?lcanalysis) AS ?lcanalyses)
    WHERE {
      {
        ?source ^dc:source ?database . ?database a sbd:Database .
      } UNION {
        ?source ^dc:source ?relationship . ?relationship a sbdbel:CausalAssertion .
      } UNION {
        ?source ^dc:source ?model . ?model a sbd:Model .
      } UNION {
        ?source ^dc:source ?dataset . ?dataset a sbd:Dataset .
      } UNION {
        ?source ^dc:source ?framework . ?framework a sbd:Framework .
      } UNION {
        ?source ^dc:source ?guidancetool . ?guidancetool a sbd:GuidanceTool .
      } UNION {
        ?source ^dc:source ?guidancedoc . ?guidancedoc a sbd:GuidanceDocument .
      } UNION {
        ?source ^dc:source ?lcanalysis . ?lcanalysis a sbd:LifeCycleAssessment .
      }
    } GROUP BY ?source
  }  
}
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0A%0ASELECT%20DISTINCT%20%3Fsource%20%3FsourceLabel%20%3Fdatabases%20%3Fdatasets%20%3Fmodels%20%3Frelationships%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%3Fframeworks%20%3Fguidancetools%20%3Fguidancedocs%20%3Flcanalyses%0AWHERE%20%7B%0A%20%20%3Fsource%20%20%20dcterms%3Atitle%7Cdc%3Atitle%20%3FsourceLabel%20.%0A%20%20%7B%0A%20%20%20%20SELECT%20%3Fsource%20%28COUNT%28DISTINCT%20%3Fframework%29%20AS%20%3Fframeworks%29%20%28COUNT%28DISTINCT%20%3Fdataset%29%20AS%20%3Fdatasets%29%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%28COUNT%28DISTINCT%20%3Fdatabase%29%20AS%20%3Fdatabases%29%20%20%20%28COUNT%28DISTINCT%20%3Fmodel%29%20AS%20%3Fmodels%29%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%28COUNT%28DISTINCT%20%3Frelationship%29%20AS%20%3Frelationships%29%20%28COUNT%28DISTINCT%20%3Fguidancetool%29%20AS%20%3Fguidancetools%29%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%28COUNT%28DISTINCT%20%3Fguidancedoc%29%20AS%20%3Fguidancedocs%29%20%28COUNT%28DISTINCT%20%3Flcanalysis%29%20AS%20%3Flcanalyses%29%0A%20%20%20%20WHERE%20%7B%0A%20%20%20%20%20%20%7B%0A%20%20%20%20%20%20%20%20%3Fsource%20%5Edc%3Asource%20%3Fdatabase%20.%20%3Fdatabase%20a%20sbd%3ADatabase%20.%0A%20%20%20%20%20%20%7D%20UNION%20%7B%0A%20%20%20%20%20%20%20%20%3Fsource%20%5Edc%3Asource%20%3Frelationship%20.%20%3Frelationship%20a%20sbdbel%3ACausalAssertion%20.%0A%20%20%20%20%20%20%7D%20UNION%20%7B%0A%20%20%20%20%20%20%20%20%3Fsource%20%5Edc%3Asource%20%3Fmodel%20.%20%3Fmodel%20a%20sbd%3AModel%20.%0A%20%20%20%20%20%20%7D%20UNION%20%7B%0A%20%20%20%20%20%20%20%20%3Fsource%20%5Edc%3Asource%20%3Fdataset%20.%20%3Fdataset%20a%20sbd%3ADataset%20.%0A%20%20%20%20%20%20%7D%20UNION%20%7B%0A%20%20%20%20%20%20%20%20%3Fsource%20%5Edc%3Asource%20%3Fframework%20.%20%3Fframework%20a%20sbd%3AFramework%20.%0A%20%20%20%20%20%20%7D%20UNION%20%7B%0A%20%20%20%20%20%20%20%20%3Fsource%20%5Edc%3Asource%20%3Fguidancetool%20.%20%3Fguidancetool%20a%20sbd%3AGuidanceTool%20.%0A%20%20%20%20%20%20%7D%20UNION%20%7B%0A%20%20%20%20%20%20%20%20%3Fsource%20%5Edc%3Asource%20%3Fguidancedoc%20.%20%3Fguidancedoc%20a%20sbd%3AGuidanceDocument%20.%0A%20%20%20%20%20%20%7D%20UNION%20%7B%0A%20%20%20%20%20%20%20%20%3Fsource%20%5Edc%3Asource%20%3Flcanalysis%20.%20%3Flcanalysis%20a%20sbd%3ALifeCycleAssessment%20.%0A%20%20%20%20%20%20%7D%0A%20%20%20%20%7D%20GROUP%20BY%20%3Fsource%0A%20%20%7D%20%20%0A%7D%0A)


### Output

<table>
  <tr>
    <td><b>source</b></td>
    <td><b>databases</b></td>
    <td><b>datasets</b></td>
    <td><b>models</b></td>
    <td><b>relationships</b></td>
    <td><b>frameworks</b></td>
    <td><b>guidancetools</b></td>
    <td><b>guidancedocs</b></td>
    <td><b>lcanalyses</b></td>
  </tr>
  <tr>
    <td><a href="https://nanocommons.github.io/datasets/">Overview of open datasets released by NanoSafety Cluster projects</a></td>
    <td>0</td>
    <td>18</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  <tr>
    <td><a href="https://nanosolveit.eu/resources/tools-services/">NanoSolveIT Tools</a></td>
    <td>0</td>
    <td>0</td>
    <td>6</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-aopwiki/">AOP-Wiki data</a></td>
    <td>0</td>
    <td>3</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-aopwiki/models/">AOP-Wiki AOPs</a></td>
    <td>0</td>
    <td>0</td>
    <td>191</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/">AOP-Wiki Key Event Relationships</a></td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1382</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-nanowiki/">NanoWiki v6 causal relationships</a></td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>11</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  <tr>
    <td><a href="https://search.data.enanomapper.net/">Open datasets hosted at search.data.enanomapper.net</a></td>
    <td>0</td>
    <td>4</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/statistics.rq | sed 's+<lang/>+en+' > statistics.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@statistics.rq
```

This SPARQL query is available under CCZero.
