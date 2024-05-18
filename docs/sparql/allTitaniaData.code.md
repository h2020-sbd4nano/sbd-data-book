# allTitaniaData.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX npo: <http://purl.bioontology.org/ontology/npo#>
PREFIX obo: <http://purl.obolibrary.org/obo/>
PREFIX sbd:     <https://www.sbd4nano.eu/rdf/#>
PREFIX sbdbel:  <https://www.sbd4nano.eu/bel/#>
PREFIX foaf:   <http://xmlns.com/foaf/0.1/> 
PREFIX rdfs:   <http://www.w3.org/2000/01/rdf-schema#> 

SELECT ?materialIRI (SAMPLE(?material_) AS ?material) ?dataset ?datasetLabel
WHERE {
  VALUES ?superclass { npo:NPO_1486 obo:CHEBI_51050 }
  VALUES ?type { sbd:Dataset sbd:Database }
  ?dataset sbdbel:NP ?materialIRI ; a ?type ; rdfs:label ?datasetLabel .
  ?materialIRI rdfs:subClassOf* ?superclass ; rdfs:label ?material_ .
} GROUP BY ?materialIRI ?dataset ?datasetLabel
  ORDER BY ?dataset
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20npo%3A%20%3Chttp%3A%2F%2Fpurl.bioontology.org%2Fontology%2Fnpo%23%3E%0APREFIX%20obo%3A%20%3Chttp%3A%2F%2Fpurl.obolibrary.org%2Fobo%2F%3E%0APREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20foaf%3A%20%20%20%3Chttp%3A%2F%2Fxmlns.com%2Ffoaf%2F0.1%2F%3E%20%0APREFIX%20rdfs%3A%20%20%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%20%0A%0ASELECT%20%3FmaterialIRI%20%28SAMPLE%28%3Fmaterial_%29%20AS%20%3Fmaterial%29%20%3Fdataset%20%3FdatasetLabel%0AWHERE%20%7B%0A%20%20VALUES%20%3Fsuperclass%20%7B%20npo%3ANPO_1486%20obo%3ACHEBI_51050%20%7D%0A%20%20VALUES%20%3Ftype%20%7B%20sbd%3ADataset%20sbd%3ADatabase%20%7D%0A%20%20%3Fdataset%20sbdbel%3ANP%20%3FmaterialIRI%20%3B%20a%20%3Ftype%20%3B%20rdfs%3Alabel%20%3FdatasetLabel%20.%0A%20%20%3FmaterialIRI%20rdfs%3AsubClassOf*%20%3Fsuperclass%20%3B%20rdfs%3Alabel%20%3Fmaterial_%20.%0A%7D%20GROUP%20BY%20%3FmaterialIRI%20%3Fdataset%20%3FdatasetLabel%0A%20%20ORDER%20BY%20%3Fdataset%0A)


### Output

<table>
  <tr>
    <td><b>materialIRI</b></td>
    <td><b>material</b></td>
    <td><b>dataset</b></td>
  </tr>
  <tr>
    <td>obo:CHEBI_51050</td>
    <td>titanium dioxide nanoparticle</td>
    <td><a href="https://enanomapper.adma.ai/about/calibrate">calibrate - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>obo:CHEBI_51050</td>
    <td>titanium dioxide nanoparticle</td>
    <td><a href="https://enanomapper.adma.ai/about/harmless">harmless - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>obo:CHEBI_51050</td>
    <td>titanium dioxide nanoparticle</td>
    <td><a href="https://enanomapper.adma.ai/about/nanoinformatix">nanoinformatix - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>obo:CHEBI_51050</td>
    <td>titanium dioxide nanoparticle</td>
    <td><a href="https://enanomapper.adma.ai/about/nanoreg">nanoreg - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>obo:CHEBI_51050</td>
    <td>titanium dioxide nanoparticle</td>
    <td><a href="https://enanomapper.adma.ai/about/nanoreg2">nanoreg2 - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>obo:CHEBI_51050</td>
    <td>titanium dioxide nanoparticle</td>
    <td><a href="https://enanomapper.adma.ai/about/riskgone">riskgone - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>obo:CHEBI_51050</td>
    <td>titanium dioxide nanoparticle</td>
    <td><a href="https://enanomapper.adma.ai/about/sbd4nano">sbd4nano - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td>http://purl.enanomapper.org/onto/ENM_9000204</td>
    <td>NM-105</td>
    <td><a href="https://identifiers.org/geo:GSE156509">Transcriptomic study of NR8383 rat macrophages cells following exposure to TiO2 (NM105, p25 anatase/rutile)</a></td>
  </tr>
  <tr>
    <td>obo:CHEBI_51050</td>
    <td>titanium dioxide nanoparticle</td>
    <td><a href="https://identifiers.org/geo:GSE156564">Transcriptomic study of NR8383 rat macrophages cells following exposure to TiO2 (NRCWE001)</a></td>
  </tr>
  <tr>
    <td>obo:CHEBI_51050</td>
    <td>titanium dioxide nanoparticle</td>
    <td><a href="https://identifiers.org/geo:GSE99997">TiO2-induced gene expression profiles in rat lung: a subacute inhalation study</a></td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allTitaniaData.rq | sed 's+<lang/>+en+' > allTitaniaData.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allTitaniaData.rq
```

This SPARQL query is available under CCZero.
