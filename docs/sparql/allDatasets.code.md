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
    <td><a href="http://dx.doi.org/10.1016/j.chemosphere.2018.11.014">Quasi-QSAR for predicting the cell viability of human lung and skin cells exposed to different metal oxide nanomaterials</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1016/j.chemosphere.2019.125489">A unified in silico model based on perturbation theory for assessing the genotoxicity of metal oxide nanoparticles</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1016/j.chemosphere.2021.131452">Ecotoxicological read-across models for predicting acute toxicity of freshly dispersed versus medium-aged NMs to Daphnia magna</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1016/j.envint.2014.08.009">Computational ecotoxicology: Simultaneous prediction of ecotoxic effects of nanoparticles under different experimental conditions</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1016/j.fct.2017.08.008">Modelling the toxicity of a large set of metal and metal oxide nanoparticles using the OCHEM platform</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1016/j.impact.2021.100298">Use of size-dependent electron configuration fingerprint to develop general prediction models for nanomaterials</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1016/j.impact.2021.100308">Computational enrichment of physicochemical data for the development of a ζ-potential read-across predictive model with Isalos Analytics Platform</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1021/acs.chemrestox.7b00303">Quasi-SMILES-Based Nano-Quantitative Structure–Activity Relationship Model to Predict the Cytotoxicity of Multiwalled Carbon Nanotubes to Human Lung Cells</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1021/acs.est.1c01603">Prediction of Plant Uptake and Translocation of Engineered Metallic Nanoparticles by Machine Learning</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1021/acs.est.8b02757">Screening Priority Factors Determining and Predicting the Reproductive Toxicity of Various Nanoparticles</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1021/acs.jpcc.0c01195">Learning from the Machine: Uncovering Sustainable Nanoparticle Design Rules</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1021/acsnano.8b07562">Meta-Analysis of Nanoparticle Cytotoxicity via Data-Mining the Literature</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1021/es503861x">Computational Tool for Risk Assessment of Nanomaterials: Novel QSTR-Perturbation Model for Simultaneous Prediction of Ecotoxicity and Cytotoxicity of Uncoated and Coated Nanoparticles under Multiple Experimental Conditions</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1021/nn406018q">Protein Corona Fingerprinting Predicts the Cellular Interaction of Gold and Silver Nanoparticles</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1039/C4NR01285B">Computer-aided nanotoxicology: assessing cytotoxicity of nanoparticles under diverse experimental conditions by using a novel QSTR-perturbation approach</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1039/C9NH00060G">Classifying and predicting the electron affinity of diamond nanoparticles using machine learning</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1039/D0EN01240H">Cytotoxicity analysis of nanoparticles by association rule mining</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1073/pnas.1919755117">Machine learning predicts the functional composition of the protein corona and the cellular recognition of nanoparticles</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1080/15363830701779315">A Molecular‐Based Model for Prediction of Solubility of C<sub>60</sub>Fullerene in Various Solvents</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1080/17435390.2017.1379567">Probing the toxicity of nanoparticles: a unified <i>in silico</i> machine learning model based on perturbation theory</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1111/risa.12109">A Meta-Analysis of Carbon Nanotube Pulmonary Toxicity Studies-How Physical Dimensions and Impurities Affect the Toxicity of Carbon Nanotubes</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.1289/EHP6508">Quantitative Structure–Activity Relationship Models for Predicting Inflammatory Potential of Metal Oxide Nanoparticles</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.3390/ijms21155280">Predicting In Vitro Neurotoxicity Induced by Nanoparticles Using Machine Learning</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.3390/nano10102017">Predicting Cytotoxicity of Metal Oxide Nanoparticles Using Isalos Analytics Platform</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.3390/nano11071774">A Machine Learning Tool to Predict the Antibacterial Capacity of Nanoparticles</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.3762/bjnano.6.192">Predicting cytotoxicity of PAMAM dendrimers using molecular descriptors</a></td>
  </tr>
  <tr>
    <td><a href="http://dx.doi.org/10.4018/IJQSPR.20201001.oa2">Development of Generalized QSAR Models for Predicting Cytotoxicity and Genotoxicity of Metal Oxides Nanoparticles</a></td>
  </tr>
  <tr>
    <td><a href="http://www.nature.com/articles/s41467-020-16413-3.pdf">Construction of a web-based nanomaterial database by big data curation and modeling friendly nanostructure annotations</a></td>
  </tr>
  <tr>
    <td><a href="http://www.nature.com/articles/s41598-018-24483-z.pdf">Towards a generalized toxicity prediction model for oxide nanomaterials using integrated data from different sources</a></td>
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
    <td><a href="https://api.wiley.com/onlinelibrary/tdm/v1/articles/10.1002%2Fsmll.201900510">Bayesian Network Resource for Meta-Analysis: Cellular Toxicity of Quantum Dots</a></td>
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
    <td><a href="https://link.springer.com/content/pdf/10.1007/s11224-021-01869-w.pdf">Using the Isalos platform to develop a QSAR model that predicts metal oxide toxicity utilizing facet-based electronic, image analysis-based, and periodic table derived properties as descriptors</a></td>
  </tr>
  <tr>
    <td><a href="https://tandfonline.com/doi/pdf/10.1080/17435390.2019.1595206">Application of Bayesian networks in determining nanoparticle-induced cellular outcomes using transcriptomics</a></td>
  </tr>
  <tr>
    <td><a href="https://www.tandfonline.com/doi/abs/10.1080/17435390.2021.1872113">Machine learning predictions of concentration-specific aggregate hazard scores of inorganic nanomaterials in embryonic zebrafish</a></td>
  </tr>
  <tr>
    <td><a href="https://www.tandfonline.com/doi/pdf/10.1080/17435390.2016.1278481">Application of Bayesian networks for hazard ranking of nanomaterials to support human health risk assessment</a></td>
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
  <tr>
    <td><a href="https://zenodo.org/record/7940162">Physico-chemical characterization of sterilized ZnO nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7940272">Physico-chemical characterization of sterilized Co1.5Fe1.5O4 nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7940539">Physico-chemical characterization of sterilized Co2.25Fe0.75O4 nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7940770">Physico-chemical characterization of sterilized Co0.75Fe2.25O4 nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7941002">Physico-chemical characterization of sterilized Fe2O3 nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7941248">Physico-chemical characterization of sterilized Co3O4 nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7941462">Physico-chemical characterization of sterilized CeO2 nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7941567">Physico-chemical characterization of sterilized TiO2 nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7961318">Physico-chemical characterization of sterilized TiO2 D540 nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7965446">Physico-chemical characterization of sterilized Ce0.5Zr0.5O2 nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7965537">Physico-chemical characterization of sterilized ZrO2 nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7965603">Physico-chemical characterization of sterilized Ce0.1Zr0.9O2 nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7966134">Physico-chemical characterization of sterilized Ce0.75Zr0.25O2 nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7966166">Physico-chemical characterization of sterilized Ce0.25Zr0.75O2 nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7966245">Physico-chemical characterization of sterilized AlOOH nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7966355">Physico-chemical characterization of sterilized TiO2 PVP nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7986673">Physico-chemical characterization of Ce0.9Zr0.1O2 nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7989699">Physico-chemical characterization of CeO2/Co3O4 nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7990086">Physico-chemical characterization of Fe3O4 nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7990214">Physico-chemical characterization of sterile ZnO nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7990251">Physico-chemical characterization of sterile citrated stabilized Au nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
  <tr>
    <td><a href="https://zenodo.org/record/7990302">Physico-chemical characterization of sterile Fe3O4 nanoparticles by XPS / HAXPES / SEM</a></td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allDatasets.rq | sed 's+<lang/>+en+' > allDatasets.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allDatasets.rq
```

This SPARQL query is available under CCZero.
