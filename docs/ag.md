<!--- THIS FILE IS AUTOGENERATED. DO NOT EDIT IT. -->

# Silver nanoparticles

Another class of nanoforms of interest are the <a name="tp1">silver nanoparticles</a> (npo:NPO_xxx):

**SPARQL** [sparql/allAgNPs.rq](sparql/allAgNPs.code.html) ([run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20npo%3A%20%3Chttp%3A%2F%2Fpurl.bioontology.org%2Fontology%2Fnpo%23%3E%0APREFIX%20obo%3A%20%3Chttp%3A%2F%2Fpurl.obolibrary.org%2Fobo%2F%3E%0A%0ASELECT%20DISTINCT%20%3Fnm%20%28SAMPLE%28%3FnmLabel_%29%20AS%20%3FnmLabel%29%0AWHERE%20%7B%0A%20%20VALUES%20%3Fsuperclass%20%7B%20npo%3ANPO_1892%20%7D%0A%20%20%3Fnm%20rdfs%3AsubClassOf*%20%3Fsuperclass%20%3B%20rdfs%3Alabel%20%3FnmLabel_%20.%0A%7D%20GROUP%20BY%20%3Fnm%0A))
```sparql
PREFIX npo: <http://purl.bioontology.org/ontology/npo#>
PREFIX obo: <http://purl.obolibrary.org/obo/>
SELECT DISTINCT ?nm (SAMPLE(?nmLabel_) AS ?nmLabel)
WHERE {
  VALUES ?superclass { npo:NPO_1892 }
  ?nm rdfs:subClassOf* ?superclass ; rdfs:label ?nmLabel_ .
} GROUP BY ?nm
```

This gives us this list of Ag nanomaterials:

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
</table>

## Causal relationships

We can list all relationships for all carbon nanotubes:

**SPARQL** [sparql/allAgRelationships.rq](sparql/allAgRelationships.code.html) ([run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20sbd%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20npo%3A%20%3Chttp%3A%2F%2Fpurl.bioontology.org%2Fontology%2Fnpo%23%3E%0A%0ASELECT%20DISTINCT%0A%20%20%3Fsuperclass%20%28SAMPLE%28%3FsuperclassLabel_%29%20AS%20%3FsuperclassLabel%29%0A%20%20%3Fnm%20%28SAMPLE%28%3FnmLabel_%29%20AS%20%3FnmLabel%29%0A%20%20%28COUNT%28DISTINCT%20%3Frelation%29%20AS%20%3Frelations%29%0AWHERE%20%7B%0A%20%20VALUES%20%3Fca%20%7B%20sbdbel%3ACausalAssertion%20sbd%3ACausalAssertion%20%7D%0A%20%20VALUES%20%3Fsuperclass%20%7B%20npo%3ANPO_1892%20%7D%0A%20%20%3Fnm%20rdfs%3AsubClassOf*%20%3Fsuperclass%20%3B%20rdfs%3Alabel%20%3FnmLabel_%20.%0A%20%20%3Fsuperclass%20rdfs%3Alabel%20%3FsuperclassLabel_%20.%0A%20%20%3Frelation%20a%20%3Fca%20%3B%20sbdbel%3ANP%20%3Fnm%20.%0A%7D%20GROUP%20BY%20%3Fsuperclass%20%3Fnm%0A))
```sparql
PREFIX sbd:  <https://www.sbd4nano.eu/rdf/#>
PREFIX sbdbel:  <https://www.sbd4nano.eu/bel/#>
PREFIX npo: <http://purl.bioontology.org/ontology/npo#>
SELECT DISTINCT
  ?superclass (SAMPLE(?superclassLabel_) AS ?superclassLabel)
  ?nm (SAMPLE(?nmLabel_) AS ?nmLabel)
  (COUNT(DISTINCT ?relation) AS ?relations)
WHERE {
  VALUES ?ca { sbdbel:CausalAssertion sbd:CausalAssertion }
  VALUES ?superclass { npo:NPO_1892 }
  ?nm rdfs:subClassOf* ?superclass ; rdfs:label ?nmLabel_ .
  ?superclass rdfs:label ?superclassLabel_ .
  ?relation a ?ca ; sbdbel:NP ?nm .
} GROUP BY ?superclass ?nm
```

Which gives:

<table>
  <tr>
  </tr>
</table>

## AgNP datasets

All data for AgNPs can be listed with (depending on the amount of annotation):

**SPARQL** [sparql/allAgData.rq](sparql/allAgData.code.html) ([run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20npo%3A%20%3Chttp%3A%2F%2Fpurl.bioontology.org%2Fontology%2Fnpo%23%3E%0APREFIX%20obo%3A%20%3Chttp%3A%2F%2Fpurl.obolibrary.org%2Fobo%2F%3E%0APREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20foaf%3A%20%20%20%3Chttp%3A%2F%2Fxmlns.com%2Ffoaf%2F0.1%2F%3E%20%0APREFIX%20rdfs%3A%20%20%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%20%0A%0ASELECT%20%3FmaterialIRI%20%3Fmaterial%20%3Fdataset_%20%3FdatasetLabel%20WHERE%20%7B%0A%20%20VALUES%20%3Fsuperclass%20%7B%20npo%3ANPO_1892%20%7D%0A%20%20VALUES%20%3Ftype%20%7B%20sbd%3ADataset%20sbd%3ADatabase%20%7D%0A%20%20%3Fdataset_%20sbdbel%3ANP%20%3FmaterialIRI%20%3B%20a%20%3Ftype%20%3B%20rdfs%3Alabel%20%3FdatasetLabel%20.%0A%20%20%3FmaterialIRI%20rdfs%3AsubClassOf*%20%3Fsuperclass%20%3B%20rdfs%3Alabel%20%3Fmaterial%20.%0A%7D%20ORDER%20BY%20%3Fdataset%0A))
```sparql
PREFIX npo: <http://purl.bioontology.org/ontology/npo#>
PREFIX obo: <http://purl.obolibrary.org/obo/>
PREFIX sbd:     <https://www.sbd4nano.eu/rdf/#>
PREFIX sbdbel:  <https://www.sbd4nano.eu/bel/#>
PREFIX foaf:   <http://xmlns.com/foaf/0.1/> 
PREFIX rdfs:   <http://www.w3.org/2000/01/rdf-schema#> 
SELECT ?materialIRI ?material ?dataset_ ?datasetLabel WHERE {
  VALUES ?superclass { npo:NPO_1892 }
  VALUES ?type { sbd:Dataset sbd:Database }
  ?dataset_ sbdbel:NP ?materialIRI ; a ?type ; rdfs:label ?datasetLabel .
  ?materialIRI rdfs:subClassOf* ?superclass ; rdfs:label ?material .
} ORDER BY ?dataset
```

This gives:

<table>
  <tr>
    <td><b>materialIRI</b></td>
    <td><b>material</b></td>
    <td><b>dataset_</b></td>
  </tr>
  <tr>
    <td>npo:NPO_1892</td>
    <td>Ag nanoparticle</td>
    <td>https://search.data.enanomapper.net/about/nanoreg</td>
  </tr>
  <tr>
    <td>npo:NPO_1892</td>
    <td>silver nanoparticle</td>
    <td>https://search.data.enanomapper.net/about/nanoreg</td>
  </tr>
</table>

## References

