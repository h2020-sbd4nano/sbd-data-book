# allDatasets.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX sbd:     <https://www.sbd4nano.eu/rdf/#>
PREFIX foaf:   <http://xmlns.com/foaf/0.1/> 
PREFIX rdfs:   <http://www.w3.org/2000/01/rdf-schema#> 

SELECT ?dataset ?datasetLabel WHERE {
  ?dataset_ a sbd:Dataset ;
           rdfs:label ?datasetLabel .
  OPTIONAL { ?dataset_ foaf:page ?dataset }
} ORDER BY ?dataset
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20foaf%3A%20%20%20%3Chttp%3A%2F%2Fxmlns.com%2Ffoaf%2F0.1%2F%3E%20%0APREFIX%20rdfs%3A%20%20%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%20%0A%0ASELECT%20%3Fdataset%20%3FdatasetLabel%20WHERE%20%7B%0A%20%20%3Fdataset_%20a%20sbd%3ADataset%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20rdfs%3Alabel%20%3FdatasetLabel%20.%0A%20%20OPTIONAL%20%7B%20%3Fdataset_%20foaf%3Apage%20%3Fdataset%20%7D%0A%7D%20ORDER%20BY%20%3Fdataset%0A)


### Output

<table>
  <tr>
    <td><b>dataset</b></td>
  </tr>
  <tr>
    <td><a href="http://doi.org/10.5281/zenodo.35493">All NanoPUZZLES ISA-TAB-Nano datasets</a></td>
  </tr>
  <tr>
    <td><a href="https://aopwiki.rdf.bigcat-bioinformatics.org/sparql?default-graph-uri=&query=SELECT+%3FAOP+%3FAOPTitle+%3FAO+%3FAOTitle+WHERE+%7B%0D%0A%3FAOP+a+aopo%3AAdverseOutcomePathway+%3B%0D%0Adc%3Atitle+%3FAOPTitle+%3B%0D%0Aaopo%3Ahas_adverse_outcome+%3FAO.%0D%0A%3FAO+dc%3Atitle+%3FAOTitle+.%7D&should-sponge=&format=text%2Fhtml&timeout=0&debug=on&run=+Run+Query+">AOP-Wiki AOP-AO dataset</a></td>
  </tr>
  <tr>
    <td><a href="https://aopwiki.rdf.bigcat-bioinformatics.org/sparql?default-graph-uri=&query=SELECT+%3FAOP+%3FAOPTitle+%3FKE+%3FKETitle+WHERE+%7B%0D%0A%3FAOP+a+aopo%3AAdverseOutcomePathway+%3B%0D%0Adc%3Atitle+%3FAOPTitle+%3B%0D%0Aaopo%3Ahas_key_event+%3FKE.%0D%0A%3FKE+dc%3Atitle+%3FKETitle+.%7D&should-sponge=&format=text%2Fhtml&timeout=0&debug=on&run=+Run+Query+">AOP-Wiki AOP-KE dataset</a></td>
  </tr>
  <tr>
    <td><a href="https://aopwiki.rdf.bigcat-bioinformatics.org/sparql?default-graph-uri=&query=SELECT+%3FMIE+%3FMolecularInitiatingEventName+%3FKE+%3FKeyEventName+WHERE+%7B%0D%0A%3FMIE+dc%3Atitle+%3FMolecularInitiatingEventName+.%0D%0A%3FAOP+a+aopo%3AAdverseOutcomePathway+%3B%0D%0Aaopo%3Ahas_molecular_initiating_event+%3FMIE%3B%0D%0Aaopo%3Ahas_key_event+%3FKE.%0D%0A%3FKE+dc%3Atitle+%3FKeyEventName+.%0D%0AFILTER+%28%3FMIE+%21%3D+%3FKE%29%7D&should-sponge=&format=text%2Fhtml&timeout=0&debug=on&run=+Run+Query+">AOP-Wiki MIE-KE dataset</a></td>
  </tr>
  <tr>
    <td><a href="https://doi.org/10.5281/zenodo.3467015">NANoREG - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td><a href="https://doi.org/10.5281/zenodo.4146981">Toxicogenomic assessment of engineered nanomaterials</a></td>
  </tr>
  <tr>
    <td><a href="https://doi.org/10.5281/zenodo.4421969">Status quo in data availability and predictive models of nano-mixture toxicity</a></td>
  </tr>
  <tr>
    <td><a href="https://doi.org/10.5281/zenodo.4609840">Raw data and metadata of SiO2 NP physicochemical characterisation, in vitro investigations and in silico predictions on protein corona formation</a></td>
  </tr>
  <tr>
    <td><a href="https://doi.org/10.5281/zenodo.4713745">NanoReg2 - eNanoMapper database</a></td>
  </tr>
  <tr>
    <td><a href="https://doi.org/10.5281/zenodo.4986068">BAM reference data: XPS raw data of Al-coated titania nanoparticles (JRCNM62001a and JRCNM62002a)</a></td>
  </tr>
  <tr>
    <td><a href="https://doi.org/10.5281/zenodo.5744082">RDF version of the data from Anastasios G. et al. Computational enrichment of physicochemical data for the development of a zeta-potential read-across predictive model with Isalos Analytics Platform. NanoImpact (2021)</a></td>
  </tr>
  <tr>
    <td><a href="https://doi.org/10.5281/zenodo.5744302">RDF version of the data from Hagar I. Labouta et al. Meta-Analysis of Nanoparticle Cytotoxicity via Data-Mining the Literature. NanoImpact (2019)</a></td>
  </tr>
  <tr>
    <td><a href="https://doi.org/10.6084/m9.figshare.10071023.v1">MOESM1 of Role of chemical composition and redox modification of poorly soluble nanomaterials on their ability to enhance allergic airway sensitisation in mice</a></td>
  </tr>
  <tr>
    <td><a href="https://doi.org/10.6084/m9.figshare.10071032.v1">MOESM2 of Role of chemical composition and redox modification of poorly soluble nanomaterials on their ability to enhance allergic airway sensitisation in mice</a></td>
  </tr>
  <tr>
    <td><a href="https://doi.org/10.6084/m9.figshare.11897205.v1">NanoWiki 6</a></td>
  </tr>
  <tr>
    <td><a href="https://doi.org/10.6084/m9.figshare.2056095.v1">NanoPUZZLES ISA-TAB-Nano dataset: Data extracted from NanoCare project final scientific report</a></td>
  </tr>
  <tr>
    <td><a href="https://doi.org/10.6084/m9.figshare.7844594.v1">Heatmap of the overall HTS database</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE117487">Effect of cell passage number on gene expression in NR8383 macrophages</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE156457">Transcriptomic study of NR8383 rat macrophages cells following exposure to Printex90</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE156458">Transcriptomic study of NR8383 rat macrophages cells in control condition (DMEM culture medium supplemented with 10% of fetal bovine serum)</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE156489">Transcriptomic study of NR8383 rat macrophages cells in control condition (water, H2O)</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE156493">Transcriptomic study of NR8383 rat macrophages cells in submerged condition (control)</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE156509">Transcriptomic study of NR8383 rat macrophages cells following exposure to TiO2 (NM105, p25 anatase/rutile)</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE156511">Transcriptomic study of NR8383 rat macrophages cells following exposure to NM403 carbon nanotubes</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE156564">Transcriptomic study of NR8383 rat macrophages cells following exposure to TiO2 (NRCWE001)</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE156571">Transcriptomic study of NR8383 rat macrophages cells following exposure to multi-walled carbon nanotubes (NRCWE006)</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE156573">Transcriptomic study of NR8383 rat macrophages cells following exposure to NiZnFe2O4.</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE156587">Transcriptomic study of NR8383 rat macrophages cells following exposure to Fe2O3 (NRCWE018).</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE156659">Transcriptomic study of NR8383 rat macrophages cells following exposure to zinc iron oxide (ZnFe2O4, NRCWE021)</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE156660">Transcriptomic study of NR8383 rat macrophages cells following exposure to COOH-functionalized carbon nanotubes (NRCWE042)</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE156666">Transcriptomic study of NR8383 rat macrophages cells following exposure to NH2-functionalized carbon nanotubes (NRCWE049)</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE156691">Transcriptomic study of NR8383 rat macrophages cells following exposure to pristine single-walled carbon nanotubes (NRCWE055)</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE156694">Transcriptomic study of NR8383 rat macrophages cells following exposure to carbon black (Printex 90)</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE156695">Transcriptomic study of NR8383 rat macrophages cells following exposure to ZnO 4 µg/mL and ZnO 16 µg/mL</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE97852">Transcriptomic study of NR8383 cells following exposure to zinc oxide nanoparticles NM110</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE99435">Transcriptomic study of PMA-differentiated THP-1 cells following exposure to zinc oxide nanoparticles NM110</a></td>
  </tr>
  <tr>
    <td><a href="https://identifiers.org/geo:GSE99997">TiO2-induced gene expression profiles in rat lung: a subacute inhalation study</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/5743204">RDF version of the data from Choi, JS. et al. Towards a generalized toxicity prediction model for oxide nanomaterials using integrated data from different sources (2018)</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/5743788">RDF version of the data from Anastasios G. Papadiamantis et al. Predicting Cytotoxicity of Metal Oxide Nanoparticles Using Isalos Analytics Platform (2020)</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/5744003">RDF version of the data from Saarimaki et al. Manually curated transcriptomics data collection for toxicogenomic assessment of engineered nanomaterials (Version 1.0.0) [Zenodo Dataset] (2020)</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/6473305">Raw data of in vitro investigations on immune activation by bare and surface-functionalized SiO2 NP-allergen conjugates using human monocyte-derived dendritic cells as model antigen-presenting cells. Data repository for Punz B. et al., 2022</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7335039">Extracting interpretable rules with Bayesian Networks. A case study of intrinsic human hazardous properties of silver nanoforms for the Safety Dimension of Safe and Sustainable by design paradigm</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7602354">RDF version of the supplementary data from Shin, Hyun Kil and Seo et al. Meta-analysis of Daphnia magna nanotoxicity experiments in accordance with test guidelines (2018)</a></td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allDatasets.rq | sed 's+<lang/>+en+' > allDatasets.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allDatasets.rq
```

This SPARQL query is available under CCZero.
