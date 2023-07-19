# allDatabases.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX sbd:     <https://www.sbd4nano.eu/rdf/#>
PREFIX foaf:   <http://xmlns.com/foaf/0.1/> 
PREFIX rdfs:   <http://www.w3.org/2000/01/rdf-schema#> 

SELECT ?title ?url WHERE {
  ?database a sbd:Database ;
            rdfs:label ?title .
  OPTIONAL { ?database foaf:page ?url }
} ORDER BY ?url
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20foaf%3A%20%20%20%3Chttp%3A%2F%2Fxmlns.com%2Ffoaf%2F0.1%2F%3E%20%0APREFIX%20rdfs%3A%20%20%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%20%0A%0ASELECT%20%3Ftitle%20%3Furl%20WHERE%20%7B%0A%20%20%3Fdatabase%20a%20sbd%3ADatabase%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20rdfs%3Alabel%20%3Ftitle%20.%0A%20%20OPTIONAL%20%7B%20%3Fdatabase%20foaf%3Apage%20%3Furl%20%7D%0A%7D%20ORDER%20BY%20%3Furl%0A)


### Output

<table>
  <tr>
    <td><b>title</b></td>
    <td><b>url</b></td>
  </tr>
  <tr>
    <td>aurora - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/aurora</td>
  </tr>
  <tr>
    <td>biorima - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/biorima</td>
  </tr>
  <tr>
    <td>calibrate - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/calibrate</td>
  </tr>
  <tr>
    <td>charisma - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/charisma</td>
  </tr>
  <tr>
    <td>cusp - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/cusp</td>
  </tr>
  <tr>
    <td>enanomapper - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/enanomapper</td>
  </tr>
  <tr>
    <td>gov4nano - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/gov4nano</td>
  </tr>
  <tr>
    <td>gracious - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/gracious</td>
  </tr>
  <tr>
    <td>harmless - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/harmless</td>
  </tr>
  <tr>
    <td>imptox - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/imptox</td>
  </tr>
  <tr>
    <td>nanoinformatix - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/nanoinformatix</td>
  </tr>
  <tr>
    <td>nanoreg - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/nanoreg</td>
  </tr>
  <tr>
    <td>nanoreg2 - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/nanoreg2</td>
  </tr>
  <tr>
    <td>patrols - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/patrols</td>
  </tr>
  <tr>
    <td>plasticfate - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/plasticfate</td>
  </tr>
  <tr>
    <td>plasticheal - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/plasticheal</td>
  </tr>
  <tr>
    <td>polyrisk - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/polyrisk</td>
  </tr>
  <tr>
    <td>riskgone - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/riskgone</td>
  </tr>
  <tr>
    <td>sabydoma - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/sabydoma</td>
  </tr>
  <tr>
    <td>sabyna - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/sabyna</td>
  </tr>
  <tr>
    <td>sbd4nano - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/sbd4nano</td>
  </tr>
  <tr>
    <td>sunshine - eNanoMapper database</td>
    <td>https://search.data.enanomapper.net/projects/sunshine</td>
  </tr>
  <tr>
    <td>Exposure Ontology</td>
    <td>http://bioportal.bioontology.org/ontologies/1575</td>
  </tr>
  <tr>
    <td>The Blood Exposome Database</td>
    <td>http://bloodexposome.org/</td>
  </tr>
  <tr>
    <td>Comparative Toxicogenomics Database</td>
    <td>http://ctdbase.org/</td>
  </tr>
  <tr>
    <td>Chromium Epigenomics Toxicology</td>
    <td>http://epichromium.org</td>
  </tr>
  <tr>
    <td>Exposome Explorer</td>
    <td>http://exposome-explorer.iarc.fr/</td>
  </tr>
  <tr>
    <td>Tox Biology Checklist</td>
    <td>http://mibbi.sf.net/projects/TBC.shtml</td>
  </tr>
  <tr>
    <td>Minimum Information about an array-based toxicogenomics experiment</td>
    <td>http://mibbi.sourceforge.net/projects/MIAME-Tox.shtml</td>
  </tr>
  <tr>
    <td>Danish (Q)SAR Database</td>
    <td>http://qsar.food.dtu.dk/</td>
  </tr>
  <tr>
    <td>Open Toxicogenomics Project-Genomics Assisted Toxicity Evaluation system</td>
    <td>http://toxico.nibiohn.go.jp/english/</td>
  </tr>
  <tr>
    <td>Toxicology Data Markup Language</td>
    <td>http://toxml.org</td>
  </tr>
  <tr>
    <td>International Harmonization of Nomenclature and Diagnostic criteria</td>
    <td>http://www.goreni.org/</td>
  </tr>
  <tr>
    <td>Minimum Information About a Bioactive Entity</td>
    <td>http://www.psidev.info/miabe</td>
  </tr>
  <tr>
    <td>ECOTOXicology Knowledgebase</td>
    <td>https://cfpub.epa.gov/ecotox/</td>
  </tr>
  <tr>
    <td>EPA Comptox Chemicals Dashboard</td>
    <td>https://comptox.epa.gov/dashboard</td>
  </tr>
  <tr>
    <td>data.eNanoMapper.net</td>
    <td>https://data.enanomapper.net/</td>
  </tr>
  <tr>
    <td>Translational Data Catalog</td>
    <td>https://datacatalog.elixir-luxembourg.org/</td>
  </tr>
  <tr>
    <td>Chemical Effects in Biological Systems</td>
    <td>https://doi.org/10.22427/NTP-DATA-1</td>
  </tr>
  <tr>
    <td>Toxicology</td>
    <td>https://github.com/elixir-europe/toxicology-community</td>
  </tr>
  <tr>
    <td>Minimum Information about Animal Toxicology Experiments In Vivo</td>
    <td>https://github.com/zacharewskilab/MIATE</td>
  </tr>
  <tr>
    <td>National Center for Advancing Translational Sciences COVID-19 OpenData Portal</td>
    <td>https://opendata.ncats.nih.gov/covid19/</td>
  </tr>
  <tr>
    <td>Ecotoxicology thesaurus</td>
    <td>https://skosmos.loterre.fr/3WV/en/</td>
  </tr>
  <tr>
    <td>OECD eChemPortal</td>
    <td>https://www.echemportal.org/echemportal/</td>
  </tr>
  <tr>
    <td>EFSA OpenFoodTox</td>
    <td>https://www.efsa.europa.eu/en/microstrategy/openfoodtox</td>
  </tr>
  <tr>
    <td>NanoCommons Knowledge Base</td>
    <td>https://www.nanocommons.eu/nanocommons-knowledge-base/</td>
  </tr>
  <tr>
    <td>National Coronial Information System</td>
    <td>https://www.ncis.org.au/</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allDatabases.rq | sed 's+<lang/>+en+' > allDatabases.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allDatabases.rq
```

This SPARQL query is available under CCZero.
