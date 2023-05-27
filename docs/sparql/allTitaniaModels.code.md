# allTitaniaModels.rq

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

SELECT ?model ?modelLabel ?provider
       (group_concat(distinct ?material_;separator=", ") AS ?material)
WHERE {
  VALUES ?superclass { npo:NPO_1486 obo:CHEBI_51050 }
  ?materialIRI rdfs:subClassOf* ?superclass ; rdfs:label ?material_ .
  ?model a sbd:Model ; rdfs:label ?modelLabel ;
     dc:source/dct:title ?provider ;
     sbdbel:NP ?materialIRI .
} GROUP BY ?model ?modelLabel ?provider
  ORDER BY ?model
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20npo%3A%20%3Chttp%3A%2F%2Fpurl.bioontology.org%2Fontology%2Fnpo%23%3E%0APREFIX%20obo%3A%20%3Chttp%3A%2F%2Fpurl.obolibrary.org%2Fobo%2F%3E%0APREFIX%20rdfs%3A%20%20%20%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%0APREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dct%3A%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0A%0ASELECT%20%3Fmodel%20%3FmodelLabel%20%3Fprovider%0A%20%20%20%20%20%20%20%28group_concat%28distinct%20%3Fmaterial_%3Bseparator%3D%22%2C%20%22%29%20AS%20%3Fmaterial%29%0AWHERE%20%7B%0A%20%20VALUES%20%3Fsuperclass%20%7B%20npo%3ANPO_1486%20obo%3ACHEBI_51050%20%7D%0A%20%20%3FmaterialIRI%20rdfs%3AsubClassOf*%20%3Fsuperclass%20%3B%20rdfs%3Alabel%20%3Fmaterial_%20.%0A%20%20%3Fmodel%20a%20sbd%3AModel%20%3B%20rdfs%3Alabel%20%3FmodelLabel%20%3B%0A%20%20%20%20%20dc%3Asource%2Fdct%3Atitle%20%3Fprovider%20%3B%0A%20%20%20%20%20sbdbel%3ANP%20%3FmaterialIRI%20.%0A%7D%20GROUP%20BY%20%3Fmodel%20%3FmodelLabel%20%3Fprovider%0A%20%20ORDER%20BY%20%3Fmodel%0A)


### Output

<table>
  <tr>
    <td><b>model</b></td>
    <td><b>provider</b></td>
    <td><b>material</b></td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Papa2015-TiO2">Nanocompound: LDH(TiO2)</a></td>
    <td>SbD4nano Nanocompound</td>
    <td>titanium dioxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Papa2015-TiO2ZnO">Nanocompound: LDH(TiO2+ZnO)</a></td>
    <td>SbD4nano Nanocompound</td>
    <td>titanium dioxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Serratosa2022-TiO2">Nanocompound: LDH(TiO2): Serratosa2022</a></td>
    <td>SbD4nano Nanocompound</td>
    <td>titanium dioxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Serratosa2022-TiO2ZnO">Nanocompound: LDH(TiO2+ZnO): Serratosa2022</a></td>
    <td>SbD4nano Nanocompound</td>
    <td>titanium dioxide nanoparticle</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allTitaniaModels.rq | sed 's+<lang/>+en+' > allTitaniaModels.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allTitaniaModels.rq
```

This SPARQL query is available under CCZero.
