# modelsForNanomaterials.rq

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

SELECT ?material (SAMPLE(?material_) AS ?materialLabel) (COUNT(DISTINCT ?model) AS ?count)
WHERE {
  ?material rdfs:label ?material_ .
  ?model a sbd:Model .
  { ?model sbdbel:NP ?material . } UNION { ?model dct:subject / skos:narrower ?material . }
  OPTIONAL { ?model rdfs:label ?rdfsLabel }
  BIND(COALESCE(?rdfsLabel, str(?model)) AS ?modelLabel)
} GROUP BY ?material
  ORDER BY DESC(?count)
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20npo%3A%20%3Chttp%3A%2F%2Fpurl.bioontology.org%2Fontology%2Fnpo%23%3E%0APREFIX%20obo%3A%20%3Chttp%3A%2F%2Fpurl.obolibrary.org%2Fobo%2F%3E%0APREFIX%20rdfs%3A%20%20%20%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%0APREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dct%3A%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0APREFIX%20skos%3A%20%20%20%20%3Chttp%3A%2F%2Fwww.w3.org%2F2004%2F02%2Fskos%2Fcore%23%3E%0A%0ASELECT%20%3Fmaterial%20%28SAMPLE%28%3Fmaterial_%29%20AS%20%3FmaterialLabel%29%20%28COUNT%28DISTINCT%20%3Fmodel%29%20AS%20%3Fcount%29%0AWHERE%20%7B%0A%20%20%3Fmaterial%20rdfs%3Alabel%20%3Fmaterial_%20.%0A%20%20%3Fmodel%20a%20sbd%3AModel%20.%0A%20%20%7B%20%3Fmodel%20sbdbel%3ANP%20%3Fmaterial%20.%20%7D%20UNION%20%7B%20%3Fmodel%20dct%3Asubject%20%2F%20skos%3Anarrower%20%3Fmaterial%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fmodel%20rdfs%3Alabel%20%3FrdfsLabel%20%7D%0A%20%20BIND%28COALESCE%28%3FrdfsLabel%2C%20str%28%3Fmodel%29%29%20AS%20%3FmodelLabel%29%0A%7D%20GROUP%20BY%20%3Fmaterial%0A%20%20ORDER%20BY%20DESC%28%3Fcount%29%0A)


### Output

<table>
  <tr>
    <td><b>material</b></td>
    <td><b>count</b></td>
  </tr>
  <tr>
    <td><a href="npo:NPO_1542">ZnO</a></td>
    <td>50</td>
  </tr>
  <tr>
    <td><a href="npo:NPO_1486">R-TiO2</a></td>
    <td>46</td>
  </tr>
  <tr>
    <td><a href="npo:NPO_1550">Fe2O3</a></td>
    <td>39</td>
  </tr>
  <tr>
    <td><a href="npo:NPO_1373">SiO2</a></td>
    <td>34</td>
  </tr>
  <tr>
    <td><a href="obo:CHEBI_30187">Al2O3</a></td>
    <td>33</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/157925">lanthanum(3+);oxygen(2-)</a></td>
    <td>32</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14805">oxonickel</a></td>
    <td>31</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/159375">oxygen(2-);yttrium(3+)</a></td>
    <td>31</td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_0000118">Cobalt (II) oxide nanoparticle</a></td>
    <td>30</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/150906">indium(3+);oxygen(2-)</a></td>
    <td>30</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/166955">chromium(3+);oxygen(2-)</a></td>
    <td>30</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/29131">dioxotin</a></td>
    <td>30</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/62762">dioxozirconium</a></td>
    <td>30</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14794">antimony(3+);oxygen(2-)</a></td>
    <td>29</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14829">oxocopper</a></td>
    <td>25</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/518712">oxo(oxovanadiooxy)vanadium</a></td>
    <td>24</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14776">oxo(oxobismuthanyloxy)bismuthane</a></td>
    <td>23</td>
  </tr>
  <tr>
    <td><a href="npo:NPO_401">Au nanopartice</a></td>
    <td>20</td>
  </tr>
  <tr>
    <td><a href="npo:NPO_1548">Fe3O4</a></td>
    <td>17</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14811">trioxotungsten</a></td>
    <td>16</td>
  </tr>
  <tr>
    <td><a href="npo:NPO_729">(Fe2O3)n(Fe3O4)m</a></td>
    <td>16</td>
  </tr>
  <tr>
    <td><a href="npo:NPO_606">CNT: Carbon nanotubes</a></td>
    <td>14</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14824">oxo(oxomanganiooxy)manganese</a></td>
    <td>12</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/159385">oxygen(2-);ytterbium(3+)</a></td>
    <td>9</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/160959">gadolinium(3+);oxygen(2-)</a></td>
    <td>9</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/73971">dioxocerium</a></td>
    <td>9</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/159423">hafnium(4+);oxygen(2-)</a></td>
    <td>7</td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000254">Co3O4 nanoparticle</a></td>
    <td>7</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/10855842">nickel(3+);oxygen(2-)</a></td>
    <td>7</td>
  </tr>
  <tr>
    <td><a href="npo:NPO_1541">Metal Oxide</a></td>
    <td>6</td>
  </tr>
  <tr>
    <td><a href="obo:CHEBI_51050">titanium dioxide nanoparticle</a></td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="npo:NPO_1892">Ag nanoparticle</a></td>
    <td>4</td>
  </tr>
  <tr>
    <td><a href="npo:NPO_707">Nanoparticle</a></td>
    <td>3</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/23926">iron</a></td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/23980">copper</a></td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/24261">dioxosilane</a></td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/934">nickel(2+)</a></td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="npo:NPO_103">Al nanoparticle</a></td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="obo:CHEBI_33888">Cobalt molecular entity</a></td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14802">trioxomolybdenum</a></td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="npo:NPO_354">MWCNT40nm-COOH</a></td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="npo:NPO_730">Fullerene C60</a></td>
    <td>2</td>
  </tr>
  <tr>
    <td><a href="npo:NPO_1384">Metal</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="http://purl.bioontology.org/ontology/MESH/C569492">cobalt ferrite (CoFe2O4)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/23942">platinum</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/25087137">zinc;iron(3+);oxygen(2-)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/4124403">silicon(4+)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/4226345">oxido(oxo)alumane</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/6335514">germanium</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/91574">tellanylidenecadmium</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="http://purl.enanomapper.org/onto/ENM_9000248">Cobalt nanoparticle</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="obo:CHEBI_23336">Cobalt cations</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="http://purl.bioontology.org/ontology/MESH/C0053349">Beryyllium oxide</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="http://purl.bioontology.org/ontology/MESH/C0174148">Barium oxide</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="http://purl.bioontology.org/ontology/MESH/C040225">Disilver Oxide Ag2O</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="http://purl.bioontology.org/ontology/MESH/C042120">Arsenic pentoxide</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="npo:NPO_1150">FeO</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/10129883">dipotassium;oxygen(2-)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/10197609">oxygen(2-);rubidium(1+)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/10197697">manganese;oxygen(2-)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/134661">oxo(oxotitaniooxy)titanium</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/139258">oxygen(2-);scandium(3+)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14778">oxocalcium</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14782">oxocadmium</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14792">oxomagnesium</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14793">dioxolead</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14796">dioxogermane</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14801">dioxomanganese</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14813">(dioxo-lambda5-stibanyl)oxy-dioxo-lambda5-stibane</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14814">dioxovanadiooxy(dioxo)vanadium</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14827">oxolead</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14940">trioxochromium</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/14945">oxomanganese</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/159370">digallium;oxygen(2-)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/159371">dysprosium(3+);oxygen(2-)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/159373">europium(3+);oxygen(2-)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/159374">neodymium(3+);oxygen(2-)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/159410">lutetium(3+);oxygen(2-)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/159422">oxygen(2-);terbium(3+)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/159425">holmium(3+);oxygen(2-)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/159427">erbium(3+);oxygen(2-)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/166962">dilithium;oxygen(2-)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/16747781">lambda1-thallanyloxythallium</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/26042">oxovanadium</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/29936">dioxomolybdenum</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/32051">oxomercury</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/3788361">oxo(oxothallanyloxy)thallane</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/62157">oxotitanium</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/62392">oxygen(2-);tantalum(5+)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/6335517">oxogermanium</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/6850728">cerium-144(3+);oxygen(2-)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/73975">disodium;oxygen(2-)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/82838">strontium;oxygen(2-)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/82839">oxoniobium</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/82850">dioxoniobium</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/84163">dioxotungsten</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/9877337">oxido(oxo)chromium</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/9905479">dicesium;oxygen(2-)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/9989219">copper;copper(1+);oxygen(2-)</a></td>
    <td>1</td>
  </tr>
  <tr>
    <td><a href="https://pubchem.ncbi.nlm.nih.gov/compound/20597791">manganese;oxygen(2-)</a></td>
    <td>1</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/modelsForNanomaterials.rq | sed 's+<lang/>+en+' > modelsForNanomaterials.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@modelsForNanomaterials.rq
```

This SPARQL query is available under CCZero.
