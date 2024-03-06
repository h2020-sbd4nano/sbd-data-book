# nsdiProvider.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX void:    <http://rdfs.org/ns/void#>
PREFIX dcterms: <http://purl.org/dc/terms/>
PREFIX dc:      <http://purl.org/dc/elements/1.1/>

SELECT ?type ?resource ?resourceLabel WHERE {
  VALUES ?provider {
    <https://search.data.enanomapper.net/>
    <https://search.data.enanomapper.net/closed/>
  }
  ?provider a void:DatasetDescription ;
    dcterms:title|dc:title ?providerLabel .
  ?resource dc:source ?provider ; a / rdfs:label ?type ;
    rdfs:label ?resourceLabel .
} ORDER BY ASC(?type) ASC(?resource)
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20void%3A%20%20%20%20%3Chttp%3A%2F%2Frdfs.org%2Fns%2Fvoid%23%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0A%0ASELECT%20%3Ftype%20%3Fresource%20%3FresourceLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Fprovider%20%7B%0A%20%20%20%20%3Chttps%3A%2F%2Fsearch.data.enanomapper.net%2F%3E%0A%20%20%20%20%3Chttps%3A%2F%2Fsearch.data.enanomapper.net%2Fclosed%2F%3E%0A%20%20%7D%0A%20%20%3Fprovider%20a%20void%3ADatasetDescription%20%3B%0A%20%20%20%20dcterms%3Atitle%7Cdc%3Atitle%20%3FproviderLabel%20.%0A%20%20%3Fresource%20dc%3Asource%20%3Fprovider%20%3B%20a%20%2F%20rdfs%3Alabel%20%3Ftype%20%3B%0A%20%20%20%20rdfs%3Alabel%20%3FresourceLabel%20.%0A%7D%20ORDER%20BY%20ASC%28%3Ftype%29%20ASC%28%3Fresource%29%0A)


### Output

<table>
  <tr>
    <td><b>type</b></td>
    <td><b>resource</b></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/aurora">aurora - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/biorima">biorima - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/calibrate">calibrate - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/charisma">charisma - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/cusp">cusp - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/enanomapper">enanomapper - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/gov4nano">gov4nano - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/gracious">gracious - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/harmless">harmless - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/imptox">imptox - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/nanoinformatix">nanoinformatix - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/nanoreg">nanoreg - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/nanoreg2">nanoreg2 - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/patrols">patrols - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/plasticfate">plasticfate - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/plasticheal">plasticheal - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/polyrisk">polyrisk - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/riskgone">riskgone - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/sabydoma">sabydoma - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/sabyna">sabyna - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/sbd4nano">sbd4nano - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>Database</td>
    <td><a href="https://enanomapper.adma.ai/about/sunshine">sunshine - eNanoMapper database</a></td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/nsdiProvider.rq | sed 's+<lang/>+en+' > nsdiProvider.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@nsdiProvider.rq
```

This SPARQL query is available under CCZero.
