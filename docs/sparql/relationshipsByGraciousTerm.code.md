# relationshipsByGraciousTerm.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX sbd:     <https://www.sbd4nano.eu/rdf/#>
PREFIX sbdbel:  <https://www.sbd4nano.eu/bel/#>
PREFIX dc:      <http://purl.org/dc/elements/1.1/>
PREFIX dcterms: <http://purl.org/dc/terms/>

SELECT ?category ?term (COUNT(DISTINCT ?relation) AS ?count)
WHERE {
  ?relation a sbdbel:CausalAssertion ;
    sbdbel:outcome ?outcome .
  ?outcome sbdbel:term ?term ;
       sbdbel:termCat ?category .
} GROUP BY ?category ?term
  ORDER BY DESC(?count)
```

[run](https://query.wikidata.org/embed.html#PREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0A%0ASELECT%20%3Fcategory%20%3Fterm%20%28COUNT%28DISTINCT%20%3Frelation%29%20AS%20%3Fcount%29%0AWHERE%20%7B%0A%20%20%3Frelation%20a%20sbdbel%3ACausalAssertion%20%3B%0A%20%20%20%20sbdbel%3Aoutcome%20%3Foutcome%20.%0A%20%20%3Foutcome%20sbdbel%3Aterm%20%3Fterm%20%3B%0A%20%20%20%20%20%20%20sbdbel%3AtermCat%20%3Fcategory%20.%0A%7D%20GROUP%20BY%20%3Fcategory%20%3Fterm%0A%20%20ORDER%20BY%20DESC%28%3Fcount%29%0A) or [edit](https://query.wikidata.org/#PREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0A%0ASELECT%20%3Fcategory%20%3Fterm%20%28COUNT%28DISTINCT%20%3Frelation%29%20AS%20%3Fcount%29%0AWHERE%20%7B%0A%20%20%3Frelation%20a%20sbdbel%3ACausalAssertion%20%3B%0A%20%20%20%20sbdbel%3Aoutcome%20%3Foutcome%20.%0A%20%20%3Foutcome%20sbdbel%3Aterm%20%3Fterm%20%3B%0A%20%20%20%20%20%20%20sbdbel%3AtermCat%20%3Fcategory%20.%0A%7D%20GROUP%20BY%20%3Fcategory%20%3Fterm%0A%20%20ORDER%20BY%20DESC%28%3Fcount%29%0A)



### Output

<table>
  <tr>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/relationshipsByGraciousTerm.rq | sed 's+<lang/>+en+' > relationshipsByGraciousTerm.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@relationshipsByGraciousTerm.rq
```

This SPARQL query is available under CCZero.
