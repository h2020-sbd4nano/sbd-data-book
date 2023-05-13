# allDatabases.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX sbd:     <https://www.sbd4nano.eu/rdf/#>
PREFIX foaf:   <http://xmlns.com/foaf/0.1/> 
PREFIX rdfs:   <http://www.w3.org/2000/01/rdf-schema#> 

SELECT ?title ?url WHERE {
  ?database a sbd:Database ;
            rdfs:label ?title .
  OPTIONAL { ?database foaf:page ?url }
} ORDER BY ?url
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20foaf%3A%20%20%20%3Chttp%3A%2F%2Fxmlns.com%2Ffoaf%2F0.1%2F%3E%20%0APREFIX%20rdfs%3A%20%20%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%20%0A%0ASELECT%20%3Ftitle%20%3Furl%20WHERE%20%7B%0A%20%20%3Fdatabase%20a%20sbd%3ADatabase%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20rdfs%3Alabel%20%3Ftitle%20.%0A%20%20OPTIONAL%20%7B%20%3Fdatabase%20foaf%3Apage%20%3Furl%20%7D%0A%7D%20ORDER%20BY%20%3Furl%0A)


### Output

<table>
  <tr>
    <td><b>title</b></td>
    <td><b>url</b></td>
  </tr>
  <tr>
    <td>aurora - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/aurora</td>
  </tr>
  <tr>
    <td>biorima - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/biorima</td>
  </tr>
  <tr>
    <td>calibrate - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/calibrate</td>
  </tr>
  <tr>
    <td>charisma - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/charisma</td>
  </tr>
  <tr>
    <td>cusp - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/cusp</td>
  </tr>
  <tr>
    <td>enanomapper - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/enanomapper</td>
  </tr>
  <tr>
    <td>gov4nano - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/gov4nano</td>
  </tr>
  <tr>
    <td>gracious - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/gracious</td>
  </tr>
  <tr>
    <td>harmless - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/harmless</td>
  </tr>
  <tr>
    <td>imptox - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/imptox</td>
  </tr>
  <tr>
    <td>nanoinformatix - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/nanoinformatix</td>
  </tr>
  <tr>
    <td>nanoreg - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/nanoreg</td>
  </tr>
  <tr>
    <td>nanoreg2 - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/nanoreg2</td>
  </tr>
  <tr>
    <td>patrols - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/patrols</td>
  </tr>
  <tr>
    <td>plasticfate - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/plasticfate</td>
  </tr>
  <tr>
    <td>plasticheal - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/plasticheal</td>
  </tr>
  <tr>
    <td>polyrisk - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/polyrisk</td>
  </tr>
  <tr>
    <td>riskgone - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/riskgone</td>
  </tr>
  <tr>
    <td>sabydoma - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/sabydoma</td>
  </tr>
  <tr>
    <td>sabyna - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/sabyna</td>
  </tr>
  <tr>
    <td>sbd4nano - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/sbd4nano</td>
  </tr>
  <tr>
    <td>sunshine - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/sunshine</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allDatabases.rq | sed 's+<lang/>+en+' > allDatabases.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allDatabases.rq
```

This SPARQL query is available under CCZero.
