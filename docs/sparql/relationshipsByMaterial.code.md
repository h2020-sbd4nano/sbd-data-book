# relationshipsByMaterial.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX sbd:     <https://www.sbd4nano.eu/rdf/#>
PREFIX sbdbel:  <https://www.sbd4nano.eu/bel/#>
PREFIX dc:      <http://purl.org/dc/elements/1.1/>
PREFIX dcterms: <http://purl.org/dc/terms/>
PREFIX sio: <http://semanticscience.org/resource/SIO_>
PREFIX sbdbel2:  <https://h2020-sbd4nano.github.io/sbdbel/>

SELECT ?material (COUNT(DISTINCT ?relation) AS ?count)
WHERE {
  VALUES ?ca { sbdbel:CausalAssertion sbd:CausalAssertion sbdbel2:CausalAssertion }
  ?relation a ?ca ;
    sbdbel:NP | sio:000332 | sbdbel2:NP ?materialIRI .
  ?materialIRI rdfs:label ?material .
} GROUP BY ?material
  ORDER BY DESC(?count)
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0APREFIX%20sio%3A%20%3Chttp%3A%2F%2Fsemanticscience.org%2Fresource%2FSIO_%3E%0APREFIX%20sbdbel2%3A%20%20%3Chttps%3A%2F%2Fh2020-sbd4nano.github.io%2Fsbdbel%2F%3E%0A%0ASELECT%20%3Fmaterial%20%28COUNT%28DISTINCT%20%3Frelation%29%20AS%20%3Fcount%29%0AWHERE%20%7B%0A%20%20VALUES%20%3Fca%20%7B%20sbdbel%3ACausalAssertion%20sbd%3ACausalAssertion%20sbdbel2%3ACausalAssertion%20%7D%0A%20%20%3Frelation%20a%20%3Fca%20%3B%0A%20%20%20%20sbdbel%3ANP%20%7C%20sio%3A000332%20%7C%20sbdbel2%3ANP%20%3FmaterialIRI%20.%0A%20%20%3FmaterialIRI%20rdfs%3Alabel%20%3Fmaterial%20.%0A%7D%20GROUP%20BY%20%3Fmaterial%0A%20%20ORDER%20BY%20DESC%28%3Fcount%29%0A)


### Output

<table>
  <tr>
    <td><b>material</b></td>
    <td><b>count</b></td>
  </tr>
  <tr>
    <td>Metal Oxide</td>
    <td>6</td>
  </tr>
  <tr>
    <td>metal oxide nanoparticle</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Nanoparticle</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Nanomaterial</td>
    <td>5</td>
  </tr>
  <tr>
    <td>nanoparticle</td>
    <td>5</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/relationshipsByMaterial.rq | sed 's+<lang/>+en+' > relationshipsByMaterial.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@relationshipsByMaterial.rq
```

This SPARQL query is available under CCZero.
