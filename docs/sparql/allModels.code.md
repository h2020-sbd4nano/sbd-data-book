# allModels.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX rdfs:    <http://www.w3.org/2000/01/rdf-schema#>
PREFIX sbd:     <https://www.sbd4nano.eu/rdf/#>
PREFIX dc:      <http://purl.org/dc/elements/1.1/>
PREFIX dct:     <http://purl.org/dc/terms/>
SELECT ?model ?modelLabel ?provider WHERE {
  ?model a sbd:Model ;
     dc:source ?providerRes.
  OPTIONAL { ?model rdfs:label ?rdfsLabel }
  BIND(COALESCE(?rdfsLabel, str(?model)) AS ?modelLabel)
  ?providerRes dct:title | dc:title ?provider .
} ORDER BY ?model
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20rdfs%3A%20%20%20%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%0APREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dct%3A%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0ASELECT%20%3Fmodel%20%3FmodelLabel%20%3Fprovider%20WHERE%20%7B%0A%20%20%3Fmodel%20a%20sbd%3AModel%20%3B%0A%20%20%20%20%20dc%3Asource%20%3FproviderRes.%0A%20%20OPTIONAL%20%7B%20%3Fmodel%20rdfs%3Alabel%20%3FrdfsLabel%20%7D%0A%20%20BIND%28COALESCE%28%3FrdfsLabel%2C%20str%28%3Fmodel%29%29%20AS%20%3FmodelLabel%29%0A%20%20%3FproviderRes%20dct%3Atitle%20%7C%20dc%3Atitle%20%3Fprovider%20.%0A%7D%20ORDER%20BY%20%3Fmodel%0A)


### Output

<table>
  <tr>
    <td><b>model</b></td>
    <td><b>provider</b></td>
  </tr>
  <tr>
    <td><a href="http://enaloscloud.novamechanics.com/EnalosWebApps/ZetaPotential/">PhysChem: Zeta potential NanoXtract model</a></td>
    <td>NanoSolveIT Tools</td>
  </tr>
  <tr>
    <td><a href="https://aerosol.cloud.nanosolveit.eu/">NanoSolveIT Tool for Assessment of Human Exposure to Nanomaterials</a></td>
    <td>NanoSolveIT Tools</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Anantha2021">Nanocompound: Toxicity Metal-Oxide: Anantha 2021</a></td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Gajewicz2015">Nanocompound: Toxicity Metal-Oxide: Gajewicz 2015</a></td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Papa2015-TiO2">Nanocompound: LDH(TiO2)</a></td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Papa2015-TiO2ZnO">Nanocompound: LDH(TiO2+ZnO)</a></td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Papa2015-ZnO">Nanocompound: LDH(TiO2+ZnO)</a></td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Puzyn2011">Nanocompound: Toxicity Metal-Oxide: Puzyn 2011</a></td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Serratosa2022">Nanocompound: Toxicity Metal-Oxide: Serratosa2022</a></td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Serratosa2022-TiO2">Nanocompound: LDH(TiO2): Serratosa2022</a></td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Serratosa2022-TiO2ZnO">Nanocompound: LDH(TiO2+ZnO): Serratosa2022</a></td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td><a href="https://atena.urv.cat/model/#Serratosa2022-ZnO">Nanocompound: LDH(ZnO): Serratosa2022</a></td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td><a href="https://cellviability.cloud.nanosolveit.eu/">NanoSolveIT Cytotoxicity (Cell Viability) Prediction for Metal Oxide NPs</a></td>
    <td>NanoSolveIT Tools</td>
  </tr>
  <tr>
    <td><a href="https://deepdaph.cloud.nanosolveit.eu/">DeepDaph</a></td>
    <td>NanoSolveIT Tools</td>
  </tr>
  <tr>
    <td><a href="https://example.org/nanoinformatix-platform.greendecision.eu/SimpleBMD">SimpleBMD</a></td>
    <td>NanoInformaTIX Tools</td>
  </tr>
  <tr>
    <td><a href="https://funmappone.cloud.nanosolveit.eu/">FunMappOne</a></td>
    <td>NanoSolveIT Tools</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_10">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_10</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_11">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_11</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_12">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_12</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_13">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_13</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_14">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_14</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_15">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_15</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_16">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_16</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_17a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_17a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_17b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_17b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_18">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_18</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_19a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_19a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_19b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_19b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_19c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_19c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_19d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_19d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_19e">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_19e</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_19f">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_19f</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_19g">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_19g</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_19h">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_19h</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_1a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_1a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_1b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_1b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_20">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_20</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_21">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_21</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_22">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_22</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_23a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_23a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_23b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_23b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_24a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_24a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_24b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_24b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_24c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_24c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_24d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_24d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25e">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25e</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25f">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_25f</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_26">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_26</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_27">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_27</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_28a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_28a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_28b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_28b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_29a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_29a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_29b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_29b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_2a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_2a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_2b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_2b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_30">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_30</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_31a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_31a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_31b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_31b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_32a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_32a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_32b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_32b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_33a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_33a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_33b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_33b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_33c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_33c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_33d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_33d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_33e">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_33e</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_34a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_34a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_34b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_34b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_35">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_35</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_36">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_36</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_37">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_37</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38e">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38e</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38f">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38f</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38g">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38g</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38h">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38h</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38i">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38i</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38j">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38j</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38k">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38k</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38l">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38l</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38m">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38m</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38n">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38n</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38o">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38o</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38p">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_38p</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_39">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_39</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_3a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_3a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_3b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_3b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_40a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_40a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_40b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_40b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_41">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_41</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_42">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_42</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_43">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_43</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_44a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_44a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_44b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_44b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_45">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_45</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_46">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_46</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_47">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_47</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_48">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_48</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49e">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_49e</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_4a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_4a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_4b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_4b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_5">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_5</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_50a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_50a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_50b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_50b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_50c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_50c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_50d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_50d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_50e">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_50e</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_50f">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_50f</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_51a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_51a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_51b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_51b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_52a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_52a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_52b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_52b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_52c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_52c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53e">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53e</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53f">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53f</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53g">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53g</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53h">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53h</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53i">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53i</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53j">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53j</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53k">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53k</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53l">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53l</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53m">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53m</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53n">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53n</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53o">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53o</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53p">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53p</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53q">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53q</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53r">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53r</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53s">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_53s</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_54a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_54a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_54b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_54b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_55a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_55a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_55b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_55b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_55c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_55c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_55d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_55d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_56">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_56</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_57">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_57</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_58">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_58</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_59a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_59a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_59b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_59b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_6">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_6</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_60">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_60</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_61a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_61a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_61b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_61b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_61c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_61c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62e">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62e</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62f">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62f</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62g">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62g</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62h">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62h</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62i">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62i</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62j">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_62j</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_63a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_63a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_63b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_63b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_63c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_63c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_64a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_64a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_64b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_64b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_65">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_65</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_66">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_66</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_67">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_67</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_68a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_68a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_68b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_68b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_69">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_69</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_7">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_7</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_70a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_70a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_70b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_70b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_71">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_71</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_72">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_72</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_73">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_73</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_74">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_74</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_75a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_75a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_75b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_75b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_75c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_75c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_75d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_75d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_76">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_76</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_77a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_77a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_77b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_77b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_77c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_77c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_77d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_77d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_78a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_78a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_78b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_78b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_79">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_79</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_8">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_8</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_80a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_80a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_80b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_80b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_81">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_81</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_82">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_82</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_83">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_83</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_84">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_84</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_85">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_85</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_86">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_86</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87a">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87a</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87b">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87b</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87c">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87c</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87d">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87d</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87e">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87e</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87f">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87f</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87g">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87g</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87h">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87h</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87i">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87i</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87j">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87j</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87k">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87k</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87l">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_87l</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_9">https://h2020-sbd4nano.github.io/sbd-data-landscape/Model_9</a></td>
    <td>Computational models for the assessment of manufactured nanomaterials</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/10">Binding to the picrotoxin site of ionotropic GABA receptors leading to epileptic seizures in adult brain</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/100">Cyclooxygenase inhibition leading to reproductive dysfunction via inhibition of female spawning behavior</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/101">Cyclooxygenase inhibition leading to reproductive dysfunction via inhibition of pheromone release</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/102">Cyclooxygenase inhibition leading to reproductive dysfunction via interference with meiotic prophase I /metaphase I transition</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/103">Cyclooxygenase inhibition leading to reproductive dysfunction via interference with spindle assembly checkpoint</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/104">Altered ion channel activity leading impaired heart function</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/106">Chemical binding to tubulin in oocytes leading to aneuploid offspring</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/107">Constitutive androstane receptor activation leading to hepatocellular adenomas and carcinomas in the mouse and the rat</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/110">Inhibition of iodide pump activity leading to follicular cell adenomas and carcinomas (in rat and mouse)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/113">Glutamate-gated chloride channel activation leading to acute mortality</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/119">Inhibition of thyroid peroxidase leading to follicular cell adenomas and carcinomas (in rat and mouse)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/12">Chronic binding of antagonist to N-methyl-D-aspartate receptors (NMDARs) during brain development leads to neurodegeneration with impairment in learning and memory in aging</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/122">Prolyl hydroxylase inhibition leading to reproductive dysfunction via increased HIF1 heterodimer formation</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/123">Unknown MIE leading to reproductive dysfunction via increased HIF-1alpha transcription</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/13">Chronic binding of antagonist to N-methyl-D-aspartate receptors (NMDARs) during brain development induces impairment of learning and memory abilities</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/131">Aryl hydrocarbon receptor activation leading to uroporphyria</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/134">Sodium Iodide Symporter (NIS) Inhibition and Subsequent Adverse Neurodevelopmental Outcomes in Mammals</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/136">Intracellular Acidification Induced Olfactory Epithelial Injury Leading to Site of Contact Nasal Tumors</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/138">Organic anion transporter (OAT1) inhibition leading to renal failure and mortality</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/139">Alkylation of DNA leading to cancer 1</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/141">Alkylation of DNA leading to cancer 2</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/144">Endocytic lysosomal uptake leading to liver fibrosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/148">EGFR Activation Leading to Decreased Lung Function</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/149">Peptide Oxidation Leading to Hypertension</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/15">Alkylation of DNA in male pre-meiotic germ cells leading to heritable mutations</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/150">Aryl hydrocarbon receptor activation leading to early life stage mortality, via reduced VEGF</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/151">AhR activation leading to preeclampsia</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/152">Interference with thyroid serum binding protein transthyretin and subsequent adverse human neurodevelopmental toxicity </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/154">Inhibition of Calcineurin Activity Leading to Impaired T-Cell Dependent Antibody Response</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/155">Deiodinase 2 inhibition leading to increased mortality via reduced posterior swim bladder inflation</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/156">Deiodinase 2 inhibition leading to increased mortality via reduced anterior swim bladder inflation</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/157">Deiodinase 1 inhibition leading to increased mortality via reduced posterior swim bladder inflation </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/158">Deiodinase 1 inhibition leading to increased mortality via reduced anterior swim bladder inflation</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/159">Thyroperoxidase inhibition leading to increased mortality via reduced anterior swim bladder inflation</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/16">Acetylcholinesterase inhibition leading to acute mortality</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/160">Ionotropic gamma-aminobutyric acid receptor activation mediated neurotransmission inhibition leading to mortality</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/161">Glutamate-gated chloride channel activation leading to neurotransmission inhibition associated mortality</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/17">Binding of electrophilic chemicals to SH(thiol)-group of proteins and /or to seleno-proteins involved in protection against oxidative stress during brain development leads to impairment of learning and memory</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/173">Substance interaction with the pulmonary resident cell membrane components leading to pulmonary fibrosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/175">Thyroperoxidase inhibition leading to altered amphibian metamorphosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/176">Sodium Iodide Symporter (NIS) Inhibition leading to altered amphibian metamorphosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/177">Cyclooxygenase 1 (COX1) inhibition leading to renal failure and mortality</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/178">Nicotinic acetylcholine receptor activation contributes to mitochondrial dysfunction and leads to colony loss/failure</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/18">PPARα activation in utero leading to impaired fertility in males</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/186">unknown MIE leading to renal failure and mortality</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/188">Iodotyrosine deiodinase (IYD) inhibition leading to altered amphibian metamorphosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/189">Type I iodothyronine deiodinase (DIO1) inhibition leading to altered amphibian metamorphosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/190">Type II iodothyronine deiodinase (DIO2) inhibition leading to altered amphibian metamorphosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/191">Type III iodotyrosine deiodinase (DIO3) inhibition leading to altered amphibian metamorphosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/192">Pendrin inhibition leading to altered amphibian metamorphosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/193">Dual oxidase (DUOX) inhibition leading to altered amphibian metamorphosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/194">Hepatic nuclear receptor activation leading to altered amphibian metamorphosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/195">5-hydroxytryptamine transporter (5-HTT) inhibition leading to population increase</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/196">Volatile Organic Chemicals Activate TRPA1 Receptor to Induce Sensory Pulmonary Irritation</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/200">Estrogen receptor activation leading to breast cancer  </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/202"> Inhibitor binding to topoisomerase II leading to infant leukaemia</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/203">5-hydroxytryptamine transporter inhibition leading to decreased reproductive success and population decline</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/205">AOP from chemical insult to cell death</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/212">Histone deacetylase inhibition leading to testicular atrophy</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/213">Inhibition of fatty acid beta oxidation leading to nonalcoholic steatohepatitis (NASH)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/216">Deposition of energy leading to population decline via DNA strand breaks and follicular atresia</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/218">Inhibition of CYP7B activity leads to decreased reproductive success via decreased locomotor activity</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/219">Inhibition of CYP7B activity leads to decreased reproductive success via decreased sexual behavior</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/220">Cyp2E1 Activation Leading to Liver Cancer</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/223">Serotonin transporter activation to seizure</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/23">Androgen receptor agonism leading to reproductive dysfunction (in repeat-spawning fish)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/232">NFE2/Nrf2 repression to steatosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/237">Substance interaction with lung resident cell membrane components leading to atherosclerosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/238">Deposition of energy leading to population decline via DNA strand breaks and oocyte apoptosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/245">Reduction in photophosphorylation leading to growth inhibition in aquatic plants</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/25">Aromatase inhibition leading to reproductive dysfunction</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/258">Renal protein alkylation leading to kidney toxicity</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/261">L-type calcium channel blockade leading to heart failure via decrease in cardiac contractility</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/263">Uncoupling of oxidative phosphorylation leading to  growth inhibition via decreased cell proliferation</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/264">Uncoupling of oxidative phosphorylation leading to growth inhibition via ATP depletion associated cell death</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/265">Uncoupling of oxidative phosphorylation leading to growth inhibition via increased cytosolic calcium</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/266">Uncoupling of oxidative phosphorylation leading to growth inhibition via decreased Na-K ATPase activity</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/267">Uncoupling of oxidative phosphorylation leading to growth inhibition via glucose depletion</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/268">Uncoupling of oxidative phosphorylation leading to growth inhibition via mitochondrial swelling</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/271">Inhibition of thyroid peroxidase leading to impaired fertility in fish</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/272">Deposition of energy leading to lung cancer</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/273">Mitochondrial complex inhibition leading to liver injury</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/274">Histone deacetylase inhibition leads to impeded craniofacial development</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/275">Histone deacetylase inhibition leads to neural tube defects</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/276">Inhibition of complex I of the electron transport chain leading to chemical induced Fanconi syndrome</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/277">Impaired IL-1R1 signaling leading to Impaired T-Cell Dependent Antibody Response</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/28">Cyclooxygenase inhibition leading reproductive failure</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/281">Acetylcholinesterase Inhibition Leading to Neurodegeneration</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/282">Adverse outcome pathway on photochemical toxicity initiated by light exposure</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/284">Binding of electrophilic chemicals to SH(thiol)-group of proteins and /or to seleno-proteins involved in protection against oxidative stress leads to chronic kidney disease</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/286">Mitochondrial complex III antagonism leading to growth inhibition (1)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/287">Mitochondrial complex III antagonism leading to growth inhibition (2)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/288">Inhibition of 17α-hydrolase/C 10,20-lyase (Cyp17A1) activity leads to birth reproductive defects (cryptorchidism) in male (mammals)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/289">Inhibition of 5α-reductase leading to impaired fecundity in female fish</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/29">Estrogen receptor agonism leading to reproductive dysfunction</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/290">Mitochondrial ATP synthase antagonism leading to growth inhibition (1)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/291">Mitochondrial ATP synthase antagonism leading to growth inhibition (2)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/292">Inhibition of tyrosinase leads to decreased population in fish</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/293">Increased DNA damage leading to increased risk of breast cancer</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/294">Increased reactive oxygen and nitrogen species (RONS) leading to increased risk of breast cancer</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/296">Oxidative DNA damage leading to chromosomal aberrations and mutations</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/297">Inhibition of retinaldehyde dehydrogenase leads to population decline</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/298">Increases in cellular reactive oxygen species and chronic reactive oxygen species leading to human treatment-resistant gastric cancer</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/299">Deposition of energy leading to population decline via DNA oxidation and follicular atresia</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/3">Inhibition of the mitochondrial complex I of nigro-striatal neurons leads to parkinsonian motor deficits</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/30">Estrogen receptor antagonism leading to reproductive dysfunction</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/300">Thyroid Receptor Antagonism and Subsequent Adverse Neurodevelopmental Outcomes in Mammals</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/301">Inhibition of Cystathionine Beta synthase leading to impaired the early development of anterior-posterior axis </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/302">Lung surfactant function inhibition leading to decreased lung function</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/303">Frustrated phagocytosis-induced lung cancer</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/305">5α-reductase inhibition leading to short anogenital distance (AGD) in male (mammalian) offspring</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/306">Androgen receptor (AR) antagonism leading to short anogenital distance (AGD) in male (mammalian) offspring</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/307">Decreased testosterone synthesis leading to short anogenital distance (AGD) in male (mammalian) offspring</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/309">Luteinizing hormone receptor antagonism leading to reproductive dysfunction</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/310">Embryonic Activation of the AHR leading to Reproductive failure, via epigenetic down-regulation of GnRHR</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/311">Deposition of energy leading to population decline via DNA oxidation and oocyte apoptosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/312">Acetylcholinesterase Inhibition leading to Acute Mortality via Impaired Coordination & Movement​</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/313">Stimulation of TLR7/8 in dendric cells leading to Psoriatic skin disease</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/314">Binding to estrogen receptor (ER)-α in immune cells leading to exacerbation of systemic lupus erythematosus (SLE)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/315">Inhibition of JAK3 leading to impairment of T-Cell Dependent Antibody Response</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/316">Trypsin inhibition leading to pancreatic acinar cell tumors</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/318">Glucocorticoid Receptor activation leading to hepatic steatosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/319">Binding to ACE2 leading to lung fibrosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/320">Binding of SARS-CoV-2 to ACE2 receptor leading to acute respiratory distress associated mortality</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/322">Alkylation of DNA leading to reduced sperm count</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/323">PPARalpha Agonism Leading to Decreased Viable Offspring via Decreased 11-Ketotestosterone</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/324">Thermal stress leading to population decline (1)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/325">Thermal stress leading to population decline (2)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/326">Thermal stress leading to population decline (3)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/327">Excessive reactive oxygen species production leading to mortality (1)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/328">Excessive reactive oxygen species production leading to mortality (2)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/329">Excessive reactive oxygen species production leading to mortality (3)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/330">Excessive reactive oxygen species production leading to mortality (4)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/331">Formation of DNA photoproducts leading to growth inhibition (1)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/334">Glucocorticoid Receptor Agonism Leading to Impaired Fin Regeneration</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/336">DNA methyltransferase inhibition leading to population decline (1)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/337">DNA methyltransferase inhibition leading to population decline (2)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/338">DNA methyltransferase inhibition leading to population decline (3)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/339">DNA methyltransferase inhibition leading to population decline (4)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/34">LXR activation leading to hepatic steatosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/340">DNA methyltransferase inhibition leading to transgenerational effects (1)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/341">DNA methyltransferase inhibition leading to transgenerational effects (2)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/342">S-adenosylmethionine depletion leading to population decline (1)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/343">S-adenosylmethionine depletion leading to population decline (2)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/344">Androgen receptor (AR) antagonism leading to nipple retention (NR) in male (mammalian) offspring</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/345">Androgen receptor (AR) antagonism leading to decreased fertility in females</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/346">Aromatase inhibition leads to male-biased sex ratio via impacts on gonad differentiation</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/348">Inhibition of 11β-Hydroxysteroid Dehydrogenase leading to decreased population trajectory </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/349">Inhibition of 11β-hydroxylase leading to decresed population trajectory </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/358">Chitinase inhibition leading to mortality</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/359">Chitobiase inhibition leading to mortality</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/36">Peroxisomal Fatty Acid Beta-Oxidation Inhibition Leading to Steatosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/360">Chitin synthase 1 inhibition leading to mortality</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/361">Sulfonylureareceptor binding leading to mortality</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/363">Thyroperoxidase inhibition leading to altered visual function via altered retinal layer structure</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/364">Thyroperoxidase inhibition leading to altered visual function via decreased eye size</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/365">Thyroperoxidase inhibition leading to altered visual function via altered photoreceptor patterning</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/366">Competitive binding to thyroid hormone carrier protein transthyretin (TTR) leading to altered amphibian metamorphosis </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/367">Competitive binding to thyroid hormone carrier protein thyroid binding globulin (TBG) leading to altered amphibian metamorphosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/368">Cytochrome oxidase inhibition leading to olfactory nasal lesions</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/37">PPARα activation leading to hepatocellular adenomas and carcinomas in rodents</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/372">Androgen receptor antagonism leading to testicular cancer </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/374">Binding of Sars-CoV-2 spike protein to ACE 2 receptors expressed on brain cells (neuronal and non-neuronal) leads to neuroinflammation resulting in encephalitis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/376">Androgen receptor agonism leading to male-biased sex ratio</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/377">Dysregulated prolonged Toll Like Receptor 9 (TLR9) activation leading to Multi Organ Failure involving Acute Respiratory Distress Syndrome (ARDS)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/379">Binding to ACE2 leading to thrombosis and disseminated intravascular coagulation</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/38">Protein Alkylation leading to Liver Fibrosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/381">Binding of viral S-glycoprotein to ACE2 receptor leading to dysgeusia</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/383">Inhibition of Angiotensin-converting enzyme 2 leading to liver fibrosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/386">Deposition of ionizing energy leading to population decline via inhibition of photosynthesis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/387">Deposition of ionising energy leading to population decline via mitochondrial dysfunction</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/388">Deposition of ionising energy  leading to population decline via programmed cell death</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/389"> Oxygen-evolving complex damage leading to population decline via inhibition of photosynthesis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/39">Covalent Binding, Protein, leading to Increase, Allergic Respiratory Hypersensitivity Response</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/392">Decreased fibrinolysis and activated bradykinin system leading to hyperinflammation</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/394">SARS-CoV-2 infection of olfactory epithelium leading to impaired olfactory function (short-term anosmia)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/395">Binding of Sars-CoV-2 spike protein to ACE 2 receptors expressed on pericytes leads to disseminated intravascular coagulation resulting in cerebrovascular disease (stroke)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/397">Bulky DNA adducts leading to mutations</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/398">Inhibition of ALDH1A (RALDH) leading to impaired fertility via disrupted meiotic initiation of fetal oogonia of the ovary</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/399">Inhibition of Fyna leading to increased mortality via decreased eye size (Microphthalmos)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/4">Ecdysone receptor agonism leading to incomplete ecdysis associated mortality</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/40">Covalent Protein binding leading to Skin Sensitisation</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/401">G protein-coupled estrogen receptor 1 (GPER) signal pathway in the lipid metabolism disrupting effects</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/402">Thyroid peroxidase (TPO) inhibition leads to periventricular heterotopia formation in the developing rat brain</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/405">Organo-Phosphate Chemicals induced inhibition of AChE  leading to impaired cognitive function</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/406">SARS-CoV-2 infection leading to hyperinflammation</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/407">SARS-CoV-2 infection leading to pyroptosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/409">Frustrated phagocytosis leads to malignant mesothelioma</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/41">Sustained AhR Activation leading to Rodent Liver Tumours</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/410">GSK3beta inactivation leading to increased mortality via defects in developing inner ear</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/411">Oxidative stress Leading to Decreased Lung Function </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/413">Oxidation and antagonism of reduced glutathione leading to mortality via acute renal failure</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/415">Aryl hydrocarbon receptor activation leading to lung fibrosis through IL-6 toxicity pathway</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/416">Aryl hydrocarbon receptor activation leading to lung cancer through IL-6 toxicity pathway</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/417">Aryl hydrocarbon receptor activation leading to lung cancer through AHR-ARNT toxicity pathway</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/419">Aryl hydrocarbon receptor activation leading to impaired lung function through P53 toxicity pathway</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/42">Inhibition of Thyroperoxidase and Subsequent Adverse Neurodevelopmental Outcomes in Mammals</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/423"> Toxicological mechanisms of hepatocyte apoptosis through the PARP1 dependent cell death pathway </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/424">Oxidative stress Leading to Decreased Lung Function via CFTR dysfunction</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/425">Oxidative Stress Leading to Decreased Lung Function via Decreased FOXJ1</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/426">SARS-CoV-2 spike protein binding to ACE2 receptors expressed on pericytes leads to endothelial cell dysfunction, microvascular injury and myocardial infarction. </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/427">ACE2 downregulation following SARS-CoV-2 infection triggers dysregulation of RAAS and can lead to heart failure.</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/43">Disruption of VEGFR Signaling Leading to Developmental Defects</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/430">Binding of SARS-CoV-2 to ACE2 leads to viral infection proliferation</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/432">Deposition of Energy by Ionizing Radiation leading to Acute Myeloid Leukemia</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/435">Deposition of ionising energy leads to population decline via pollen abnormal</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/436">Inhibition of RALDH2 causes reduced all-trans retinoic acid levels, leading to transposition of the great arteries</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/439">Activation of the AhR leading to metastatic breast cancer </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/440">Hypothalamus estrogen receptors activity suppression leading to ovarian cancer via ovarian epithelial cell hyperplasia</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/441">Ionizing radiation-induced DNA damage leads to microcephaly via apoptosis and premature cell differentiation</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/442">Binding to voltage gate sodium channels during development leads to cognitive impairment </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/443"> DNA damage and mutations leading to Metastatic Breast Cancer</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/444">Ionizing radiation leads to reduced reproduction in Eisenia fetida via reduced spermatogenesis and cocoon hatchability</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/450"> Inhibition of AChE and activation of CYP2E1 leading to sensory axonal peripheral neuropathy and mortality</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/451">Interaction with lung resident cell membrane components leads to lung cancer</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/455">Aryl hydrocarbon receptor activation leading to early life stage mortality via sox9 repression induced impeded craniofacial development</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/456">Aryl hydrocarbon receptor activation leading to early life stage mortality via sox9 repression induced cardiovascular toxicity</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/457">Succinate dehydrogenase inhibition leading to increased insulin resistance through reduction in circulating thyroxine</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/458">AhR activation in the liver leading to Subsequent Adverse Neurodevelopmental Outcomes in Mammals</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/459">AhR activation in the thyroid leading to Subsequent Adverse Neurodevelopmental Outcomes in Mammals</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/46">AFB1: Mutagenic Mode-of-Action leading to Hepatocellular Carcinoma (HCC)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/460">Antagonism of Smoothened receptor leading to orofacial clefting</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/464">Calcium overload in dopaminergic neurons of the substantia nigra leading to parkinsonian motor deficits</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/468">Binding of SARS-CoV-2 to ACE2 leads to hyperinflammation (via cell death)</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/470">Deposition of energy leads to vascular remodeling</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/471">Various neuronal effects induced by elavl3, sox10, and mbp</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/473">Energy deposition from internalized Ra-226 decay lower oxygen binding capacity of hemocyanin</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/475">Binding of chemicals to ionotropic glutamate receptors leads to impairment of learning and memory via loss of drebrin from dendritic spines of neurons</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/476">Adverse Outcome Pathways diagram related to PBDEs associated male reproductive toxicity</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/477">Androgen receptor (AR) antagonism leading to hypospadias in male offspring</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/478">Deposition of energy leading to occurrence of cataracts</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/48">Binding of agonists to ionotropic glutamate receptors in adult brain causes excitotoxicity that mediates neuronal cell death, contributing to learning and memory impairment.</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/482">Deposition of energy leading to occurrence of bone loss</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/483">Deposition of Energy Leading to Learning and Memory Impairment</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/485">Thyroid hormone antagonism leading to impaired oligodendrocyte maturation during development and subsequent decreased cognition</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/486">Binding to the extracellular protein laminin leading to decreased cognitive function</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/487">Unknown MIE altering cholesterol metabolism leading to decreased cognition</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/488">Increased reactive oxygen species production leading to decreased cognitive function</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/489">Inhibition of voltage-gated sodium channels leading to decreased cognition</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/490">Co-activation of IP3R and RyR leads to socio-economic burden through reduced IQ and non-cholinergic mechanisms</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/491">Decrease, GLI1/2 target gene expression leads to orofacial clefting </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/492">Glutathione conjugation leading to reproductive dysfunction via oxidative stress</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/494">AhR activation leading to liver fibrosis </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/496">Androgen receptor agonism leading to reproduction dysfunction （in zebrafish）</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/497">ERa inactivation alters mitochondrial functions and insulin signalling in skeletal muscle and leads to insulin resistance and metabolic syndrome</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/499">Activation of MEK-ERK1/2 leads to deficits in learning and cognition via disrupted neurotransmitter release</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/500">Activation of MEK-ERK1/2 leads to deficits in learning and cognition via ROS and apoptosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/502">Decrease, cholesterol synthesis leads to orofacial clefting</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/505">Reactive Oxygen Species (ROS) formation leads to cancer via inflammation pathway</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/506">Binding of Influenza A Virus (IAV) to Sialic Acid Glycan Receptor leads to viral infection proliferation</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/507">Nrf2 inhibition leading to vascular disrupting effects via inflammation pathway</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/508">Nrf2 inhibition leading to vascular disrupting effects through activating HIF1α, Semaphorin 6A, and Dll4-Notch pathway</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/509">Nrf2 inhibition leading to vascular disrupting effects through activating apoptosis signal pathway and mitochondrial dysfunction</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/51">PPARα activation leading to impaired fertility in adult male rodents </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/510">Demethylation of PPAR promotor leading to vascular disrupting effects</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/511">The AOP framework on ROS-mediated oxidative stress induced vascular disrupting effects </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/513">Reactive Oxygen (ROS) formation leads to cancer via Peroxisome proliferation-activated receptor (PPAR) pathway</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/517">Pregnane X Receptor (PXR) activation leads to liver steatosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/518">Liver X Receptor (LXR) activation leads to liver steatosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/520">Retinoic acid receptor agonism during neurodevelopment leading to impaired learning and memory</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/521">Essential element imbalance leads to reproductive failure via oxidative stress</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/525">Reduced oligodendrocyte differentiation during neurodevelopment leading to impaired learning and memory</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/526">Decreased, Chicken Ovalbumin Upstream Promoter Transcription Factor II (COUP-TFII) leads to Impaired, Spermatogenesis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/527">Decreased, Chicken Ovalbumin Upstream Promoter Transcription Factor II (COUP-TFII) leads to Hypospadias, increased</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/528">Decreased Insulin-like peptide 3 (INSL3) leads to Malformation, cryptorchidism - maldescended testis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/529">Perfluorooctanesulfonic acid (PFOS) binding to peroxisome proliferator-activated receptors (PPARs) causes dysregulation of lipid metabolism and subsequent liver steatosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/530">Endocytotic lysosomal uptake leads to intestinal barrier disruption</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/54">Inhibition of Na+/I- symporter (NIS) leads to learning and memory impairment </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/57">AhR activation leading to hepatic steatosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/58">NR1I3 (CAR) suppression leading to hepatic steatosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/6">Antagonist binding to PPARα leading to body-weight loss</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/60">NR1I2 (Pregnane X Receptor, PXR)  activation leading to hepatic steatosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/61">NFE2L2/FXR activation leading to hepatic steatosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/62">AKT2 activation leading to hepatic steatosis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/63">Cyclooxygenase inhibition leading to reproductive dysfunction</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/64">Glucocorticoid Receptor (GR) Mediated Adult Leydig Cell Dysfunction Leading to Decreased Male Fertility</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/65">XX Inhibition of Sodium Iodide Symporter and Subsequent Adverse Neurodevelopmental Outcomes in Mammals</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/7">Aromatase (Cyp19a1) reduction leading to impaired fertility in adult female</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/72">Epigenetic modification of PPARG leading to adipogenesis</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/77">Nicotinic acetylcholine receptor activation contributes to abnormal foraging and leads to colony death/failure 1</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/78">Nicotinic acetylcholine receptor activation contributes to abnormal role change within the worker bee caste leading to colony death failure 1</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/79">Nicotinic acetylcholine receptor activation contributes to impaired hive thermoregulation and leads to colony loss/failure</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/8">Upregulation of Thyroid Hormone Catabolism via Activation of Hepatic Nuclear Receptors, and Subsequent Adverse Neurodevelopmental Outcomes in Mammals</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/80">Nicotinic acetylcholine receptor activation contributes to accumulation of damaged mitochondrial DNA and leads to colony loss/failure</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/87">Nicotinic acetylcholine receptor activation contributes to abnormal foraging and leads to colony loss/failure </a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/88">Nicotinic acetylcholine receptor activation contributes to abnormal foraging and leads to colony loss/failure via abnormal role change within caste</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/89">Nicotinic acetylcholine receptor activation followed by desensitization contributes to abnormal foraging and directly leads to colony loss/failure</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/90">Nicotinic acetylcholine receptor activation contributes to abnormal roll change within the worker bee caste leading to colony loss/failure 2</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/96">Axonal sodium channel modulation leading to acute mortality</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/aop/97">5-hydroxytryptamine transporter (5-HTT; SERT) inhibition leading to population decline</a></td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td><a href="https://nanofase.cloud.nanosolveit.eu/">NanoFASE Soil-water-organism model</a></td>
    <td>NanoSolveIT Tools</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allModels.rq | sed 's+<lang/>+en+' > allModels.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allModels.rq
```

This SPARQL query is available under CCZero.
