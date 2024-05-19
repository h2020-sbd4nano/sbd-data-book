# allAgNPs.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX npo: <http://purl.bioontology.org/ontology/npo#>
PREFIX obo: <http://purl.obolibrary.org/obo/>

SELECT DISTINCT ?nm (SAMPLE(?nmLabel_) AS ?nmLabel)
WHERE {
  VALUES ?superclass { npo:NPO_1892 }
  ?nm rdfs:subClassOf* ?superclass ; rdfs:label ?nmLabel_ .
} GROUP BY ?nm
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20npo%3A%20%3Chttp%3A%2F%2Fpurl.bioontology.org%2Fontology%2Fnpo%23%3E%0APREFIX%20obo%3A%20%3Chttp%3A%2F%2Fpurl.obolibrary.org%2Fobo%2F%3E%0A%0ASELECT%20DISTINCT%20%3Fnm%20%28SAMPLE%28%3FnmLabel_%29%20AS%20%3FnmLabel%29%0AWHERE%20%7B%0A%20%20VALUES%20%3Fsuperclass%20%7B%20npo%3ANPO_1892%20%7D%0A%20%20%3Fnm%20rdfs%3AsubClassOf*%20%3Fsuperclass%20%3B%20rdfs%3Alabel%20%3FnmLabel_%20.%0A%7D%20GROUP%20BY%20%3Fnm%0A)


### Output

<table>
  <tr>
    <td><b>nm</b></td>
  </tr>
  <tr>
    <td><a href="http://purl.bioontology.org/ontology/npo#NPO_1892">Ag nanoparticle</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000235">NM-300</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000236">NM-300K</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000255">JRCNM03000a</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.obolibrary.org/obo/CHEBI_82776">coated silver nanoparticle</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.obolibrary.org/obo/CHEBI_82778">citrate-coated silver nanoparticle</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.obolibrary.org/obo/CHEBI_82780">poly(vinylpyrrolidone)-coated Ag nanoparticle</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.obolibrary.org/obo/CHEBI_82781">gum arabic-coated Ag NP</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.obolibrary.org/obo/CHEBI_82783">PVP8-Ag NP</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.obolibrary.org/obo/CHEBI_82784">PVP38-Ag NP</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.obolibrary.org/obo/CHEBI_82785">GA5-Ag NP</a></td>
  </tr>
  <tr>
    <td><a href="http://purl.obolibrary.org/obo/CHEBI_82786">GA22-Ag NP</a></td>
  </tr>
  <tr>
    <td><a href="https://nanocommons.github.io/identifiers/registry#ERM00000067">ERM00000067</a></td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allAgNPs.rq | sed 's+<lang/>+en+' > allAgNPs.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allAgNPs.rq
```

This SPARQL query is available under CCZero.
