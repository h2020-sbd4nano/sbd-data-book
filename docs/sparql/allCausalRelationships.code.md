# allCausalRelationships.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX sbd:     <https://www.sbd4nano.eu/rdf/#>
PREFIX sbdbel:  <https://www.sbd4nano.eu/bel/#>
PREFIX dc:      <http://purl.org/dc/elements/1.1/>
PREFIX dcterms: <http://purl.org/dc/terms/>

SELECT DISTINCT ?cause ?type ?outcome ?materialLabel ?evidence
WHERE {
  ?relation a sbdbel:CausalAssertion ;
              sbdbel:relationship ?type .
  OPTIONAL { ?relation sbdbel:cause / rdfs:label ?cause . }
  OPTIONAL { ?relation sbdbel:outcome / rdfs:label ?outcome . }
  OPTIONAL { ?relation sbdbel:NP / rdfs:label ?materialLabel . }
  OPTIONAL { ?relation sbdbel:evidence ?evidence . }
} ORDER BY DESC(?relation)
```

[run](https://query.wikidata.org/embed.html#PREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0A%0ASELECT%20DISTINCT%20%3Fcause%20%3Ftype%20%3Foutcome%20%3FmaterialLabel%20%3Fevidence%0AWHERE%20%7B%0A%20%20%3Frelation%20a%20sbdbel%3ACausalAssertion%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20sbdbel%3Arelationship%20%3Ftype%20.%0A%20%20OPTIONAL%20%7B%20%3Frelation%20sbdbel%3Acause%20%2F%20rdfs%3Alabel%20%3Fcause%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Frelation%20sbdbel%3Aoutcome%20%2F%20rdfs%3Alabel%20%3Foutcome%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Frelation%20sbdbel%3ANP%20%2F%20rdfs%3Alabel%20%3FmaterialLabel%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Frelation%20sbdbel%3Aevidence%20%3Fevidence%20.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Frelation%29%0A) or [edit](https://query.wikidata.org/#PREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0A%0ASELECT%20DISTINCT%20%3Fcause%20%3Ftype%20%3Foutcome%20%3FmaterialLabel%20%3Fevidence%0AWHERE%20%7B%0A%20%20%3Frelation%20a%20sbdbel%3ACausalAssertion%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20sbdbel%3Arelationship%20%3Ftype%20.%0A%20%20OPTIONAL%20%7B%20%3Frelation%20sbdbel%3Acause%20%2F%20rdfs%3Alabel%20%3Fcause%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Frelation%20sbdbel%3Aoutcome%20%2F%20rdfs%3Alabel%20%3Foutcome%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Frelation%20sbdbel%3ANP%20%2F%20rdfs%3Alabel%20%3FmaterialLabel%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Frelation%20sbdbel%3Aevidence%20%3Fevidence%20.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Frelation%29%0A)



### Output

<table>
  <tr>
    <td><b>cause</b></td>
    <td><b>type</b></td>
    <td><b>outcome</b></td>
    <td><b>evidence</b></td>
  </tr>
  <tr>
    <td></td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorreclates</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td>https://www.sbd4nano.eu/bel/#changes</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorrelates</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td></td>
    <td></td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allCausalRelationships.rq | sed 's+<lang/>+en+' > allCausalRelationships.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allCausalRelationships.rq
```

This SPARQL query is available under CCZero.
