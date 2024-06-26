# allJRCNM01005aRelationships.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX sbd:  <https://www.sbd4nano.eu/rdf/#>
PREFIX sbdbel:  <https://www.sbd4nano.eu/bel/#>
PREFIX enm:     <http://purl.enanomapper.org/onto/>
PREFIX npo: <http://purl.bioontology.org/ontology/npo#>
PREFIX sio: <http://semanticscience.org/resource/SIO_>
PREFIX sbdbel2:  <https://h2020-sbd4nano.github.io/sbdbel/>

SELECT DISTINCT
  ?nm (SAMPLE(?nmLabel_) AS ?nmLabel)
  (COUNT(DISTINCT ?relation) AS ?relations)
WHERE {
  VALUES ?ca { sbdbel:CausalAssertion sbd:CausalAssertion sbdbel2:CausalAssertion }
  VALUES ?nm { enm:ENM_9000077 }
  ?nm rdfs:label ?nmLabel_ .
  OPTIONAL { ?relation a ?ca ; sbdbel:NP | sio:000332 | sbdbel2:NP ?nm . }
} GROUP BY ?superclass ?nm
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20sbd%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20enm%3A%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.enanomapper.org%2Fonto%2F%3E%0APREFIX%20npo%3A%20%3Chttp%3A%2F%2Fpurl.bioontology.org%2Fontology%2Fnpo%23%3E%0APREFIX%20sio%3A%20%3Chttp%3A%2F%2Fsemanticscience.org%2Fresource%2FSIO_%3E%0APREFIX%20sbdbel2%3A%20%20%3Chttps%3A%2F%2Fh2020-sbd4nano.github.io%2Fsbdbel%2F%3E%0A%0ASELECT%20DISTINCT%0A%20%20%3Fnm%20%28SAMPLE%28%3FnmLabel_%29%20AS%20%3FnmLabel%29%0A%20%20%28COUNT%28DISTINCT%20%3Frelation%29%20AS%20%3Frelations%29%0AWHERE%20%7B%0A%20%20VALUES%20%3Fca%20%7B%20sbdbel%3ACausalAssertion%20sbd%3ACausalAssertion%20sbdbel2%3ACausalAssertion%20%7D%0A%20%20VALUES%20%3Fnm%20%7B%20enm%3AENM_9000077%20%7D%0A%20%20%3Fnm%20rdfs%3Alabel%20%3FnmLabel_%20.%0A%20%20OPTIONAL%20%7B%20%3Frelation%20a%20%3Fca%20%3B%20sbdbel%3ANP%20%7C%20sio%3A000332%20%7C%20sbdbel2%3ANP%20%3Fnm%20.%20%7D%0A%7D%20GROUP%20BY%20%3Fsuperclass%20%3Fnm%0A)


### Output

<table>
  <tr>
    <td><b>nm</b></td>
    <td><b>relations</b></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000077">JRCNM01005a</a></td>
    <td>0</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allJRCNM01005aRelationships.rq | sed 's+<lang/>+en+' > allJRCNM01005aRelationships.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allJRCNM01005aRelationships.rq
```

This SPARQL query is available under CCZero.
