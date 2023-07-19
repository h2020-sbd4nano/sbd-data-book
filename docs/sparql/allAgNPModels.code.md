# allAgNPModels.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX npo: <http://purl.bioontology.org/ontology/npo#>
PREFIX obo: <http://purl.obolibrary.org/obo/>
PREFIX rdfs:    <http://www.w3.org/2000/01/rdf-schema#>
PREFIX sbd:     <https://www.sbd4nano.eu/rdf/#>
PREFIX sbdbel:  <https://www.sbd4nano.eu/bel/#>
PREFIX dc:      <http://purl.org/dc/elements/1.1/>
PREFIX dct:     <http://purl.org/dc/terms/>
PREFIX skos:    <http://www.w3.org/2004/02/skos/core#>
SELECT ?model ?modelLabel ?provider
       (group_concat(distinct ?material_;separator=", ") AS ?material)
WHERE {
  VALUES ?superclass { npo:NPO_1892 }
  ?materialIRI rdfs:subClassOf* ?superclass ; rdfs:label ?material_ .
  ?model a sbd:Model ;
     dc:source ?providerRes.
  { ?model sbdbel:NP ?materialIRI . } UNION { ?model dct:subject / skos:narrower ?materialIRI . }
  OPTIONAL { ?model rdfs:label ?rdfsLabel }
  BIND(COALESCE(?rdfsLabel, str(?model)) AS ?modelLabel)
  ?providerRes dct:title | dc:title ?provider .
} GROUP BY ?model ?modelLabel ?provider
  ORDER BY ?model
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20npo%3A%20%3Chttp%3A%2F%2Fpurl.bioontology.org%2Fontology%2Fnpo%23%3E%0APREFIX%20obo%3A%20%3Chttp%3A%2F%2Fpurl.obolibrary.org%2Fobo%2F%3E%0APREFIX%20rdfs%3A%20%20%20%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%0APREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dct%3A%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0APREFIX%20skos%3A%20%20%20%20%3Chttp%3A%2F%2Fwww.w3.org%2F2004%2F02%2Fskos%2Fcore%23%3E%0ASELECT%20%3Fmodel%20%3FmodelLabel%20%3Fprovider%0A%20%20%20%20%20%20%20%28group_concat%28distinct%20%3Fmaterial_%3Bseparator%3D%22%2C%20%22%29%20AS%20%3Fmaterial%29%0AWHERE%20%7B%0A%20%20VALUES%20%3Fsuperclass%20%7B%20npo%3ANPO_1892%20%7D%0A%20%20%3FmaterialIRI%20rdfs%3AsubClassOf*%20%3Fsuperclass%20%3B%20rdfs%3Alabel%20%3Fmaterial_%20.%0A%20%20%3Fmodel%20a%20sbd%3AModel%20%3B%0A%20%20%20%20%20dc%3Asource%20%3FproviderRes.%0A%20%20%7B%20%3Fmodel%20sbdbel%3ANP%20%3FmaterialIRI%20.%20%7D%20UNION%20%7B%20%3Fmodel%20dct%3Asubject%20%2F%20skos%3Anarrower%20%3FmaterialIRI%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fmodel%20rdfs%3Alabel%20%3FrdfsLabel%20%7D%0A%20%20BIND%28COALESCE%28%3FrdfsLabel%2C%20str%28%3Fmodel%29%29%20AS%20%3FmodelLabel%29%0A%20%20%3FproviderRes%20dct%3Atitle%20%7C%20dc%3Atitle%20%3Fprovider%20.%0A%7D%20GROUP%20BY%20%3Fmodel%20%3FmodelLabel%20%3Fprovider%0A%20%20ORDER%20BY%20%3Fmodel%0A)


### Output

<table>
  <tr>
    <td><b>model</b></td>
    <td><b>provider</b></td>
    <td><b>material</b></td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_20">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_20</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Ag nanoparticle, silver nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_21">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_21</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Ag nanoparticle, silver nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_28a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_28a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Ag nanoparticle, silver nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_28b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_28b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Ag nanoparticle, silver nanoparticle</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allAgNPModels.rq | sed 's+<lang/>+en+' > allAgNPModels.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allAgNPModels.rq
```

This SPARQL query is available under CCZero.
