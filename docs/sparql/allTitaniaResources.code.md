# allTitaniaResources.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX sbd:  <https://www.sbd4nano.eu/rdf/#>
PREFIX sbdbel:  <https://www.sbd4nano.eu/bel/#>
PREFIX dcterms: <http://purl.org/dc/terms/>
PREFIX npo: <http://purl.bioontology.org/ontology/npo#>
PREFIX obo: <http://purl.obolibrary.org/obo/>
PREFIX enm: <http://purl.enanomapper.org/onto/>
PREFIX sio: <http://semanticscience.org/resource/SIO_>
PREFIX sbdbel2:  <https://h2020-sbd4nano.github.io/sbdbel/>

SELECT DISTINCT ?superclasses (SAMPLE(?superclassesLabel_) AS ?superclassesLabel) ?type (COUNT(DISTINCT ?resource) AS ?count)
WHERE {
  VALUES ?superclasses { npo:NPO_1541 npo:NPO_1486 enm:ENM_9000077 } # metal oxide, TiO2, JRCNM01005a
  ?nm rdfs:subClassOf* ?superclasses .
  ?superclasses rdfs:label ?superclassesLabel_ .
  OPTIONAL {
    ?resource a ?type ;
              sbdbel:NP | sio:000332 | sbdbel2:NP ?nm .
    ?type rdfs:label ?typeLabel .
  }
} GROUP BY ?superclasses ?superclassesLabel ?type
  ORDER BY DESC(?count)
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20sbd%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0APREFIX%20npo%3A%20%3Chttp%3A%2F%2Fpurl.bioontology.org%2Fontology%2Fnpo%23%3E%0APREFIX%20obo%3A%20%3Chttp%3A%2F%2Fpurl.obolibrary.org%2Fobo%2F%3E%0APREFIX%20enm%3A%20%3Chttp%3A%2F%2Fpurl.enanomapper.org%2Fonto%2F%3E%0APREFIX%20sio%3A%20%3Chttp%3A%2F%2Fsemanticscience.org%2Fresource%2FSIO_%3E%0APREFIX%20sbdbel2%3A%20%20%3Chttps%3A%2F%2Fh2020-sbd4nano.github.io%2Fsbdbel%2F%3E%0A%0ASELECT%20DISTINCT%20%3Fsuperclasses%20%28SAMPLE%28%3FsuperclassesLabel_%29%20AS%20%3FsuperclassesLabel%29%20%3Ftype%20%28COUNT%28DISTINCT%20%3Fresource%29%20AS%20%3Fcount%29%0AWHERE%20%7B%0A%20%20VALUES%20%3Fsuperclasses%20%7B%20npo%3ANPO_1541%20npo%3ANPO_1486%20enm%3AENM_9000077%20%7D%20%23%20metal%20oxide%2C%20TiO2%2C%20JRCNM01005a%0A%20%20%3Fnm%20rdfs%3AsubClassOf*%20%3Fsuperclasses%20.%0A%20%20%3Fsuperclasses%20rdfs%3Alabel%20%3FsuperclassesLabel_%20.%0A%20%20OPTIONAL%20%7B%0A%20%20%20%20%3Fresource%20a%20%3Ftype%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20sbdbel%3ANP%20%7C%20sio%3A000332%20%7C%20sbdbel2%3ANP%20%3Fnm%20.%0A%20%20%20%20%3Ftype%20rdfs%3Alabel%20%3FtypeLabel%20.%0A%20%20%7D%0A%7D%20GROUP%20BY%20%3Fsuperclasses%20%3FsuperclassesLabel%20%3Ftype%0A%20%20ORDER%20BY%20DESC%28%3Fcount%29%0A)


### Output

<table>
  <tr>
    <td><b>superclasses</b></td>
    <td><b>type</b></td>
    <td><b>count</b></td>
  </tr>
  <tr>
    <td><a href="http://purl.bioontology.org/ontology/npo#NPO_1541">Metal Oxide</a></td>
    <td>https://www.sbd4nano.eu/rdf/#Model</td>
    <td>12</td>
  </tr>
  <tr>
    <td><a href="http://purl.bioontology.org/ontology/npo#NPO_1541">Metal Oxide</a></td>
    <td>https://www.sbd4nano.eu/rdf/#Database</td>
    <td>7</td>
  </tr>
  <tr>
    <td><a href="http://purl.bioontology.org/ontology/npo#NPO_1541">Metal Oxide</a></td>
    <td>https://www.sbd4nano.eu/rdf/#Dataset</td>
    <td>7</td>
  </tr>
  <tr>
    <td><a href="http://purl.bioontology.org/ontology/npo#NPO_1541">Metal Oxide</a></td>
    <td>https://h2020-sbd4nano.github.io/sbdbel/CausalAssertion</td>
    <td>6</td>
  </tr>
  <tr>
    <td><a href="http://purl.bioontology.org/ontology/npo#NPO_1486">R-TiO2</a></td>
    <td>https://www.sbd4nano.eu/rdf/#Dataset</td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="http://purl.bioontology.org/ontology/npo#NPO_1486">R-TiO2</a></td>
    <td></td>
    <td>0</td>
  </tr>
  <tr>
    <td><a href="http://purl.bioontology.org/ontology/npo#NPO_1541">Metal Oxide</a></td>
    <td></td>
    <td>0</td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000077">JRCNM01005a</a></td>
    <td></td>
    <td>0</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allTitaniaResources.rq | sed 's+<lang/>+en+' > allTitaniaResources.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allTitaniaResources.rq
```

This SPARQL query is available under CCZero.
