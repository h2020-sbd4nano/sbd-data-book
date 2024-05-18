# allMetalOxideModels.rq

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
  VALUES ?superclass { npo:NPO_1541 }
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

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20npo%3A%20%3Chttp%3A%2F%2Fpurl.bioontology.org%2Fontology%2Fnpo%23%3E%0APREFIX%20obo%3A%20%3Chttp%3A%2F%2Fpurl.obolibrary.org%2Fobo%2F%3E%0APREFIX%20rdfs%3A%20%20%20%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%0APREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dct%3A%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0APREFIX%20skos%3A%20%20%20%20%3Chttp%3A%2F%2Fwww.w3.org%2F2004%2F02%2Fskos%2Fcore%23%3E%0A%0ASELECT%20%3Fmodel%20%3FmodelLabel%20%3Fprovider%0A%20%20%20%20%20%20%20%28group_concat%28distinct%20%3Fmaterial_%3Bseparator%3D%22%2C%20%22%29%20AS%20%3Fmaterial%29%0AWHERE%20%7B%0A%20%20VALUES%20%3Fsuperclass%20%7B%20npo%3ANPO_1541%20%7D%0A%20%20%3FmaterialIRI%20rdfs%3AsubClassOf*%20%3Fsuperclass%20%3B%20rdfs%3Alabel%20%3Fmaterial_%20.%0A%20%20%3Fmodel%20a%20sbd%3AModel%20%3B%0A%20%20%20%20%20dc%3Asource%20%3FproviderRes.%0A%20%20%7B%20%3Fmodel%20sbdbel%3ANP%20%3FmaterialIRI%20.%20%7D%20UNION%20%7B%20%3Fmodel%20dct%3Asubject%20%2F%20skos%3Anarrower%20%3FmaterialIRI%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fmodel%20rdfs%3Alabel%20%3FrdfsLabel%20%7D%0A%20%20BIND%28COALESCE%28%3FrdfsLabel%2C%20str%28%3Fmodel%29%29%20AS%20%3FmodelLabel%29%0A%20%20%3FproviderRes%20dct%3Atitle%20%7C%20dc%3Atitle%20%3Fprovider%20.%0A%7D%20GROUP%20BY%20%3Fmodel%20%3FmodelLabel%20%3Fprovider%0A%20%20ORDER%20BY%20%3Fmodel%0A)


### Output

<table>
  <tr>
    <td><b>model</b></td>
    <td><b>provider</b></td>
    <td><b>material</b></td>
  </tr>
  <tr>
    <td><a href="http://enaloscloud.novamechanics.com/EnalosWebApps/ZetaPotential/">PhysChem: Zeta potential NanoXtract model</a></td>
    <td>NanoSolveIT Tools</td>
    <td>Metal Oxide, metal oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Anantha2021">Nanocompound: Toxicity Metal-Oxide: Anantha 2021</a></td>
    <td>SbD4nano Nanocompound</td>
    <td>Metal Oxide, metal oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Gajewicz2015">Nanocompound: Toxicity Metal-Oxide: Gajewicz 2015</a></td>
    <td>SbD4nano Nanocompound</td>
    <td>Metal Oxide, metal oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Papa2015-TiO2">Nanocompound: LDH(TiO2)</a></td>
    <td>SbD4nano Nanocompound</td>
    <td>titanium dioxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Papa2015-TiO2ZnO">Nanocompound: LDH(TiO2+ZnO)</a></td>
    <td>SbD4nano Nanocompound</td>
    <td>ZnO, zinc oxide nanoparticle, titanium dioxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Papa2015-ZnO">Nanocompound: LDH(TiO2+ZnO)</a></td>
    <td>SbD4nano Nanocompound</td>
    <td>ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Puzyn2011">Nanocompound: Toxicity Metal-Oxide: Puzyn 2011</a></td>
    <td>SbD4nano Nanocompound</td>
    <td>Metal Oxide, metal oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Serratosa2022">Nanocompound: Toxicity Metal-Oxide: Serratosa2022</a></td>
    <td>SbD4nano Nanocompound</td>
    <td>Metal Oxide, metal oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Serratosa2022-TiO2">Nanocompound: LDH(TiO2): Serratosa2022</a></td>
    <td>SbD4nano Nanocompound</td>
    <td>titanium dioxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Serratosa2022-TiO2ZnO">Nanocompound: LDH(TiO2+ZnO): Serratosa2022</a></td>
    <td>SbD4nano Nanocompound</td>
    <td>ZnO, zinc oxide nanoparticle, titanium dioxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Serratosa2022-ZnO">Nanocompound: LDH(ZnO): Serratosa2022</a></td>
    <td>SbD4nano Nanocompound</td>
    <td>ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://cellviability.cloud.nanosolveit.eu/">NanoSolveIT Cytotoxicity (Cell Viability) Prediction for Metal Oxide NPs</a></td>
    <td>NanoSolveIT Tools</td>
    <td>Metal Oxide, metal oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_10">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_10</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, titanium oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle, ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_11">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_11</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>iron oxide nanoparticle, (Fe2O3)n(Fe3O4)m</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_12">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_12</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Fe3O4, iron (II,III) oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, Co3O4 nanoparticle, R-TiO2, TiO2, titanium oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle, ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_14">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_14</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Fe3O4, iron (II,III) oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, Co3O4 nanoparticle, R-TiO2, TiO2, titanium oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle, ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_15">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_15</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Fe3O4, iron (II,III) oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_16">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_16</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>R-TiO2, TiO2, titanium oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_18">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_18</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>iron oxide nanoparticle, (Fe2O3)n(Fe3O4)m</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_1a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_1a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>iron oxide nanoparticle, (Fe2O3)n(Fe3O4)m</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_1b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_1b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>iron oxide nanoparticle, (Fe2O3)n(Fe3O4)m</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_20">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_20</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Fe3O4, iron (II,III) oxide nanoparticle, R-TiO2, TiO2, titanium oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle, ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_21">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_21</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Fe3O4, iron (II,III) oxide nanoparticle, R-TiO2, TiO2, titanium oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle, ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_22">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_22</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>(Fe2O3)n(Fe3O4)m, iron oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_23a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_23a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, titanium oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle, ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_23b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_23b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, titanium oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle, ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_24a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_24a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Fe3O4, iron (II,III) oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_24b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_24b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Fe3O4, iron (II,III) oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_24c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_24c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>(Fe2O3)n(Fe3O4)m, iron oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_24d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_24d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>(Fe2O3)n(Fe3O4)m, iron oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Fe3O4, iron (II,III) oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Fe3O4, iron (II,III) oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>(Fe2O3)n(Fe3O4)m, iron oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>(Fe2O3)n(Fe3O4)m, iron oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25e">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25e</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_26">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_26</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>(Fe2O3)n(Fe3O4)m, iron oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_29a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_29a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_29b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_29b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_2a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_2a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>R-TiO2, TiO2, titanium oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_2b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_2b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_31a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_31a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_31b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_31b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_34a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_34a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, Co3O4 nanoparticle, R-TiO2, TiO2, Fe3O4, iron (II,III) oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_34b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_34b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, Co3O4 nanoparticle, R-TiO2, TiO2, Fe3O4, iron (II,III) oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_37">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_37</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>ZnO, zinc oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, R-TiO2, TiO2, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>R-TiO2, TiO2, titanium oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, R-TiO2, TiO2, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38e">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38e</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>R-TiO2, TiO2, titanium oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38f">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38f</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38g">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38g</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, R-TiO2, TiO2, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38h">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38h</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>R-TiO2, TiO2, titanium oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38i">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38i</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38j">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38j</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, R-TiO2, TiO2, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38k">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38k</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>R-TiO2, TiO2, titanium oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38l">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38l</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38m">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38m</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, R-TiO2, TiO2, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38n">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38n</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>R-TiO2, TiO2, titanium oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38o">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38o</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38p">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38p</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, R-TiO2, TiO2, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_3a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_3a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Fe3O4, iron (II,III) oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_3b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_3b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>(Fe2O3)n(Fe3O4)m, iron oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_40a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_40a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_40b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_40b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_41">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_41</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_42">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_42</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, Co3O4 nanoparticle, R-TiO2, TiO2, Fe3O4, iron (II,III) oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_43">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_43</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>(Fe2O3)n(Fe3O4)m, iron oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_47">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_47</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, Co3O4 nanoparticle, R-TiO2, TiO2, Fe3O4, iron (II,III) oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>(Fe2O3)n(Fe3O4)m, iron oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>(Fe2O3)n(Fe3O4)m, iron oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_5">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_5</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe3O4, iron (II,III) oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_54a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_54a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_54b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_54b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_55a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_55a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_55b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_55b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_55c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_55c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_55d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_55d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_56">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_56</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_57">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_57</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_58">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_58</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Fe3O4, iron (II,III) oxide nanoparticle, Fe2O3, iron (III) oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_59a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_59a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>(Fe2O3)n(Fe3O4)m, iron oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_59b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_59b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>(Fe2O3)n(Fe3O4)m, iron oxide nanoparticle</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_6">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_6</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>Co3O4 nanoparticle, cobalt oxide nanoparticle, zinc oxide nanoparticle, R-TiO2, TiO2, Fe3O4, iron (II,III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_85">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_85</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_9">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_9</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
    <td>zinc oxide nanoparticle, Cobalt (II) oxide nanoparticle, cobalt oxide nanoparticle, R-TiO2, TiO2, Fe2O3, iron (III) oxide nanoparticle, titanium oxide nanoparticle, ZnO</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allMetalOxideModels.rq | sed 's+<lang/>+en+' > allMetalOxideModels.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allMetalOxideModels.rq
```

This SPARQL query is available under CCZero.
