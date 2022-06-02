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
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allDatabases.rq | sed 's+<lang/>+en+' > allDatabases.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allDatabases.rq
```

This SPARQL query is available under CCZero.
