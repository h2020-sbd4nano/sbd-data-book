# allMetalOxideRelationships.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX sbdbel:  <https://www.sbd4nano.eu/bel/#>
PREFIX npo: <http://purl.bioontology.org/ontology/npo#>

SELECT DISTINCT ?nm
  (SAMPLE(?nmLabel_) AS ?nmLabel)
  (COUNT(DISTINCT ?relation) AS ?relations)
WHERE {
  VALUES ?superclass { npo:NPO_1541 }
  ?nm rdfs:subClassOf* ?superclass ; rdfs:label ?nmLabel_ .
  ?relation a sbdbel:CausalAssertion ; sbdbel:NP ?nm .
}
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20npo%3A%20%3Chttp%3A%2F%2Fpurl.bioontology.org%2Fontology%2Fnpo%23%3E%0A%0ASELECT%20DISTINCT%20%3Fnm%0A%20%20%28SAMPLE%28%3FnmLabel_%29%20AS%20%3FnmLabel%29%0A%20%20%28COUNT%28DISTINCT%20%3Frelation%29%20AS%20%3Frelations%29%0AWHERE%20%7B%0A%20%20VALUES%20%3Fsuperclass%20%7B%20npo%3ANPO_1541%20%7D%0A%20%20%3Fnm%20rdfs%3AsubClassOf*%20%3Fsuperclass%20%3B%20rdfs%3Alabel%20%3FnmLabel_%20.%0A%20%20%3Frelation%20a%20sbdbel%3ACausalAssertion%20%3B%20sbdbel%3ANP%20%3Fnm%20.%0A%7D%0A)


### Output


## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allMetalOxideRelationships.rq | sed 's+<lang/>+en+' > allMetalOxideRelationships.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allMetalOxideRelationships.rq
```

This SPARQL query is available under CCZero.
