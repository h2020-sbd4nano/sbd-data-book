# allTitanias.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX npo: <http://purl.bioontology.org/ontology/npo#>

SELECT DISTINCT ?nm (SAMPLE(?nmLabel_) AS ?nmLabel)
WHERE {
  VALUES ?superclass { npo:NPO_1486 }
  ?nm rdfs:subClassOf* ?superclass ; rdfs:label ?nmLabel_ .
}
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20npo%3A%20%3Chttp%3A%2F%2Fpurl.bioontology.org%2Fontology%2Fnpo%23%3E%0A%0ASELECT%20DISTINCT%20%3Fnm%20%28SAMPLE%28%3FnmLabel_%29%20AS%20%3FnmLabel%29%0AWHERE%20%7B%0A%20%20VALUES%20%3Fsuperclass%20%7B%20npo%3ANPO_1486%20%7D%0A%20%20%3Fnm%20rdfs%3AsubClassOf*%20%3Fsuperclass%20%3B%20rdfs%3Alabel%20%3FnmLabel_%20.%0A%7D%0A)


### Output

<table>
  <tr>
    <td><b>nm</b></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000209">NM-104</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000095">JRCNM62001a</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000096">JRCNM62002a</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000208">NM-103</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000099">coated titanium dioxide nanoparticle</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000084">JRCNM01004a</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000076">JRCNM01002a</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000074">JRCNM01000a</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000075">JRCNM01001a</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000231">JRCNM10200a</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000077">JRCNM01005a</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000204">NM-105</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000201">NM-100</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.bioontology.org/ontology/npo#NPO_1486">titanium oxide nanoparticle</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000202">NM-101</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000203">NM-102</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000232">JRCNM10202a</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000094">JRCNM10201a</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000083">JRCNM01003a</a></td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allTitanias.rq | sed 's+<lang/>+en+' > allTitanias.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allTitanias.rq
```

This SPARQL query is available under CCZero.
