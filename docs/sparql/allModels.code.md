# allModels.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX rdfs:    <http://www.w3.org/2000/01/rdf-schema#>
PREFIX sbd:     <https://www.sbd4nano.eu/rdf/#>
PREFIX dc:      <http://purl.org/dc/elements/1.1/>
PREFIX dct:     <http://purl.org/dc/terms/>

SELECT ?model ?label ?provider WHERE {
  ?model a sbd:Model ; rdfs:label ?label ;
     dc:source/dct:title ?provider
} ORDER BY ?model
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20rdfs%3A%20%20%20%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%0APREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dct%3A%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0A%0ASELECT%20%3Fmodel%20%3Flabel%20%3Fprovider%20WHERE%20%7B%0A%20%20%3Fmodel%20a%20sbd%3AModel%20%3B%20rdfs%3Alabel%20%3Flabel%20%3B%0A%20%20%20%20%20dc%3Asource%2Fdct%3Atitle%20%3Fprovider%0A%7D%20ORDER%20BY%20%3Fmodel%0A)


### Output

<table>
  <tr>
    <td><b>model</b></td>
    <td><b>label</b></td>
    <td><b>provider</b></td>
  </tr>
  <tr>
    <td>http://enaloscloud.novamechanics.com/EnalosWebApps/ZetaPotential/</td>
    <td>PhysChem: Zeta potential NanoXtract model</td>
    <td>NanoSolveIT Tools</td>
  </tr>
  <tr>
    <td>https://aerosol.cloud.nanosolveit.eu/</td>
    <td>NanoSolveIT Tool for Assessment of Human Exposure to Nanomaterials</td>
    <td>NanoSolveIT Tools</td>
  </tr>
  <tr>
    <td>https://cellviability.cloud.nanosolveit.eu/</td>
    <td>NanoSolveIT Cytotoxicity (Cell Viability) Prediction for Metal Oxide NPs</td>
    <td>NanoSolveIT Tools</td>
  </tr>
  <tr>
    <td>https://deepdaph.cloud.nanosolveit.eu/</td>
    <td>DeepDaph</td>
    <td>NanoSolveIT Tools</td>
  </tr>
  <tr>
    <td>https://funmappone.cloud.nanosolveit.eu/</td>
    <td>FunMappOne</td>
    <td>NanoSolveIT Tools</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/10</td>
    <td>Binding to the picrotoxin site of ionotropic GABA receptors leading to epileptic seizures in adult brain</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/100</td>
    <td>Cyclooxygenase inhibition leading to reproductive dysfunction via inhibition of female spawning behavior</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/101</td>
    <td>Cyclooxygenase inhibition leading to reproductive dysfunction via inhibition of pheromone release</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/102</td>
    <td>Cyclooxygenase inhibition leading to reproductive dysfunction via interference with meiotic prophase I /metaphase I transition</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/103</td>
    <td>Cyclooxygenase inhibition leading to reproductive dysfunction via interference with spindle assembly checkpoint</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/104</td>
    <td>Altered ion channel activity leading impaired heart function</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/106</td>
    <td>Chemical binding to tubulin in oocytes leading to aneuploid offspring</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/107</td>
    <td>Constitutive androstane receptor activation leading to hepatocellular adenomas and carcinomas in the mouse and the rat</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/113</td>
    <td>Glutamate-gated chloride channel activation leading to acute mortality</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/119</td>
    <td>Inhibition of thyroid peroxidase leading to follicular cell adenomas and carcinomas (in rat and mouse)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/12</td>
    <td>Chronic binding of antagonist to N-methyl-D-aspartate receptors (NMDARs) during brain development leads to neurodegeneration with impairment in learning and memory in aging</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/122</td>
    <td>Prolyl hydroxylase inhibition leading to reproductive dysfunction via increased HIF1 heterodimer formation</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/123</td>
    <td>Unknown MIE leading to reproductive dysfunction via increased HIF-1alpha transcription</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/128</td>
    <td>Kidney dysfunction by decreased thyroid hormone</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/13</td>
    <td>Chronic binding of antagonist to N-methyl-D-aspartate receptors (NMDARs) during brain development induces impairment of learning and memory abilities</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/131</td>
    <td>Aryl hydrocarbon receptor activation leading to uroporphyria</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/134</td>
    <td>Sodium Iodide Symporter (NIS) Inhibition and Subsequent Adverse Neurodevelopmental Outcomes in Mammals</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/136</td>
    <td>Intracellular Acidification Induced Olfactory Epithelial Injury Leading to Site of Contact Nasal Tumors</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/138</td>
    <td>Organic anion transporter (OAT1) inhibition leading to renal failure and mortality</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/139</td>
    <td>Alkylation of DNA leading to cancer 1</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/141</td>
    <td>Alkylation of DNA leading to cancer 2</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/144</td>
    <td>Endocytic lysosomal uptake leading to liver fibrosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/148</td>
    <td>EGFR Activation Leading to Decreased Lung Function</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/149</td>
    <td>Peptide Oxidation Leading to Hypertension</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/15</td>
    <td>Alkylation of DNA in male pre-meiotic germ cells leading to heritable mutations</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/150</td>
    <td>Aryl hydrocarbon receptor activation leading to early life stage mortality, via reduced VEGF</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/152</td>
    <td>Interference with thyroid serum binding protein transthyretin and subsequent adverse human neurodevelopmental toxicity </td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/154</td>
    <td>Inhibition of Calcineurin Activity Leading to Impaired T-Cell Dependent Antibody Response</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/155</td>
    <td>Deiodinase 2 inhibition leading to increased mortality via reduced posterior swim bladder inflation</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/156</td>
    <td>Deiodinase 2 inhibition leading to increased mortality via reduced anterior swim bladder inflation</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/157</td>
    <td>Deiodinase 1 inhibition leading to increased mortality via reduced posterior swim bladder inflation </td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/158</td>
    <td>Deiodinase 1 inhibition leading to increased mortality via reduced anterior swim bladder inflation</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/159</td>
    <td>Thyroperoxidase inhibition leading to increased mortality via reduced anterior swim bladder inflation</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/16</td>
    <td>Acetylcholinesterase inhibition leading to acute mortality</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/160</td>
    <td>Ionotropic gamma-aminobutyric acid receptor activation mediated neurotransmission inhibition leading to mortality</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/161</td>
    <td>Glutamate-gated chloride channel activation leading to neurotransmission inhibition associated mortality</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/17</td>
    <td>Binding of electrophilic chemicals to SH(thiol)-group of proteins and /or to seleno-proteins involved in protection against oxidative stress during brain development leads to impairment of learning and memory</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/173</td>
    <td>Substance interaction with the lung resident cell membrane components leading to lung fibrosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/175</td>
    <td>Thyroperoxidase inhibition leading to altered amphibian metamorphosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/176</td>
    <td>Sodium Iodide Symporter (NIS) Inhibition leading to altered amphibian metamorphosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/177</td>
    <td>Cyclooxygenase 1 (COX1) inhibition leading to renal failure and mortality</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/178</td>
    <td>Nicotinic acetylcholine receptor activation contributes to mitochondrial dysfunction and leads to colony loss/failure</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/18</td>
    <td>PPARα activation in utero leading to impaired fertility in males</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/186</td>
    <td>unknown MIE leading to renal failure and mortality</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/188</td>
    <td>Iodotyrosine deiodinase (IYD) inhibition leading to altered amphibian metamorphosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/189</td>
    <td>Type I iodothyronine deiodinase (DIO1) inhibition leading to altered amphibian metamorphosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/190</td>
    <td>Type II iodothyronine deiodinase (DIO2) inhibition leading to altered amphibian metamorphosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/191</td>
    <td>Type III iodotyrosine deiodinase (DIO3) inhibition leading to altered amphibian metamorphosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/192</td>
    <td>Pendrin inhibition leading to altered amphibian metamorphosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/193</td>
    <td>Dual oxidase (DUOX) inhibition leading to altered amphibian metamorphosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/194</td>
    <td>Hepatic nuclear receptor activation leading to altered amphibian metamorphosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/195</td>
    <td>5-hydroxytryptamine transporter (5-HTT) inhibition leading to population increase</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/196</td>
    <td>Volatile Organic Chemicals Activate TRPA1 Receptor to Induce Sensory Pulmonary Irritation</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/200</td>
    <td>Estrogen receptor activation leading to breast cancer  </td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/202</td>
    <td> Inhibitor binding to topoisomerase II leading to infant leukaemia</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/205</td>
    <td>AOP from chemical insult to cell death</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/212</td>
    <td>Histone deacetylase inhibition leading to testicular atrophy</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/213</td>
    <td>Inhibition of fatty acid beta oxidation leading to nonalcoholic steatohepatitis (NASH)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/216</td>
    <td>Excessive reactive oxygen species production leading to population decline via follicular atresia</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/218</td>
    <td>Inhibition of CYP7B activity leads to decreased reproductive success via decreased locomotor activity</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/219</td>
    <td>Inhibition of CYP7B activity leads to decreased reproductive success via decreased sexual behavior</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/220</td>
    <td>Cyp2E1 Activation Leading to Liver Cancer</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/223</td>
    <td>Serotonin transporter activation to seizure</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/23</td>
    <td>Androgen receptor agonism leading to reproductive dysfunction (in repeat-spawning fish)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/237</td>
    <td>Secretion of inflammatory cytokines after cellular sensing of the stressor leading to plaque progression</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/238</td>
    <td>Excessive reactive oxygen species production leading to population decline via lipid peroxidation</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/245</td>
    <td>Reduction in photophosphorylation leading to growth inhibition in aquatic plants</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/25</td>
    <td>Aromatase inhibition leading to reproductive dysfunction</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/258</td>
    <td>Renal protein alkylation leading to kidney toxicity</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/261</td>
    <td>L-type calcium channel blockade leading to heart failure via decrease in cardiac contractility</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/263</td>
    <td>Uncoupling of oxidative phosphorylation leading to  growth inhibition (1)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/264</td>
    <td>Uncoupling of oxidative phosphorylation leading to growth inhibition (2)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/265</td>
    <td>Uncoupling of oxidative phosphorylation leading to growth inhibition (3)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/266</td>
    <td>Uncoupling of oxidative phosphorylation leading to growth inhibition (4)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/267</td>
    <td>Uncoupling of oxidative phosphorylation leading to growth inhibition (5)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/268</td>
    <td>Uncoupling of oxidative phosphorylation leading to growth inhibition (6)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/271</td>
    <td>Inhibition of thyroid peroxidase leading to impaired fertility in fish</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/272</td>
    <td>Direct deposition of ionizing energy leading to lung cancer</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/273</td>
    <td>Mitochondrial complex inhibition leading to liver injury</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/274</td>
    <td>Histone deacetylase inhibition leads to impeded craniofacial development</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/275</td>
    <td>Histone deacetylase inhibition leads to neural tube defects</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/276</td>
    <td>Inhibition of complex I of the electron transport chain leading to chemical induced Fanconi syndrome</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/277</td>
    <td>Impaired IL-1R1 signaling leading to increased susceptibility to infection</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/28</td>
    <td>Cyclooxygenase inhibition leading reproductive failure</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/281</td>
    <td>Acetylcholinesterase Inhibition Leading to Neurodegeneration</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/282</td>
    <td>Reactive oxygen species generated from photoreactive chemicals leading to phototoxic reactions</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/284</td>
    <td>Binding of electrophilic chemicals to SH(thiol)-group of proteins and /or to seleno-proteins involved in protection against oxidative stress leads to chronic kidney disease</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/286</td>
    <td>Mitochondrial complex III antagonism leading to growth inhibition (1)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/287</td>
    <td>Mitochondrial complex III antagonism leading to growth inhibition (2)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/288</td>
    <td>Inhibition of 17α-hydrolase/C 10,20-lyase (Cyp17A1) activity leads to birth reproductive defects (cryptorchidism) in male (mammals)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/289</td>
    <td>Inhibition of 5α-reductase leading to impaired fecundity in female fish</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/29</td>
    <td>Estrogen receptor agonism leading to reproductive dysfunction</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/290</td>
    <td>Mitochondrial ATP synthase antagonism leading to growth inhibition (1)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/291</td>
    <td>Mitochondrial ATP synthase antagonism leading to growth inhibition (2)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/292</td>
    <td>Inhibition of tyrosinase leads to decreased population in fish</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/293</td>
    <td>Increased DNA damage leading to increased risk of breast cancer</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/294</td>
    <td>Increased reactive oxygen and nitrogen species (RONS) leading to increased risk of breast cancer</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/296</td>
    <td>Oxidative DNA damage leading to chromosomal aberrations and mutations</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/297</td>
    <td>Inhibition of retinaldehyde dehydrogenase leads to population decline</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/298</td>
    <td>Chronic reactive oxygen species leading to human treatment-resistant gastric cancer</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/299</td>
    <td>Excessive reactive oxygen species production leading to population decline via reduced fatty acid beta-oxidation</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/3</td>
    <td>Inhibition of the mitochondrial complex I of nigro-striatal neurons leads to parkinsonian motor deficits</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/30</td>
    <td>Estrogen receptor antagonism leading to reproductive dysfunction</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/300</td>
    <td>Thyroid Receptor Antagonism and Subsequent Adverse Neurodevelopmental Outcomes in Mammals</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/301</td>
    <td>Inhibition of Cystathionine Beta synthase leading to impaired the early development of anterior-posterior axis </td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/303</td>
    <td>Frustrated phagocytosis-induced lung cancer</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/305</td>
    <td>5α-reductase inhibition leading to short anogenital distance (AGD) in male (mammalian) offspring</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/306</td>
    <td>Androgen receptor (AR) antagonism leading to short anogenital distance (AGD) in male (mammalian) offspring</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/307</td>
    <td>Decreased testosterone synthesis leading to short anogenital distance (AGD) in male (mammalian) offspring</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/309</td>
    <td>Luteinizing hormone receptor antagonism leading to reproductive dysfunction</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/310</td>
    <td>Embryonic Activation of the AHR leading to Reproductive failure, via epigenetic down-regulation of GnRHR</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/311</td>
    <td>Excessive reactive oxygen species production leading to population decline via mitochondrial dysfunction</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/312</td>
    <td>Acetylcholinesterase Inhibition leading to Acute Mortality via Impaired Coordination & Movement​</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/313</td>
    <td>Stimulation of TLR7/8 in dendric cells leading to Psoriatic skin disease</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/314</td>
    <td>Binding to estrogen receptor (ER)-α in immune cells leading to exacerbation of systemic lupus erythematosus (SLE)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/315</td>
    <td>Inhibition of JAK3 leading to impairment of T-Cell Dependent Antibody Response</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/316</td>
    <td>Trypsin inhibition leading to pancreatic acinar cell tumors</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/318</td>
    <td>Glucocorticoid Receptor activation leading to hepatic steatosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/319</td>
    <td>Inhibition of Angiotensin-converting enzyme 2 leading to lung fibrosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/320</td>
    <td>Binding of viral S-glycoprotein to ACE2 receptor  leading to acute respiratory distress associated mortality</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/322</td>
    <td>Alkylation of DNA leading to reduced sperm count</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/324</td>
    <td>Thermal stress leading to population decline (1)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/325</td>
    <td>Thermal stress leading to population decline (2)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/326</td>
    <td>Thermal stress leading to population decline (3)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/327</td>
    <td>Excessive reactive oxygen species production leading to mortality (1)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/328</td>
    <td>Excessive reactive oxygen species production leading to mortality (2)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/329</td>
    <td>Excessive reactive oxygen species production leading to mortality (3)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/330</td>
    <td>Excessive reactive oxygen species production leading to mortality (4)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/331</td>
    <td>Formation of DNA photoproducts leading to growth inhibition (1)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/334</td>
    <td>Glucocorticoid Receptor Agonism Leading to Impaired Fin Regeneration</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/336</td>
    <td>DNA methyltransferase inhibition leading to population decline (1)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/337</td>
    <td>DNA methyltransferase inhibition leading to population decline (2)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/338</td>
    <td>DNA methyltransferase inhibition leading to population decline (3)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/339</td>
    <td>DNA methyltransferase inhibition leading to population decline (4)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/34</td>
    <td>LXR activation leading to hepatic steatosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/340</td>
    <td>DNA methyltransferase inhibition leading to transgenerational effects (1)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/341</td>
    <td>DNA methyltransferase inhibition leading to transgenerational effects (2)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/342</td>
    <td>S-adenosylmethionine depletion leading to population decline (1)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/343</td>
    <td>S-adenosylmethionine depletion leading to population decline (2)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/344</td>
    <td>Androgen receptor (AR) antagonism leading to nipple retention (NR) in male (mammalian) offspring</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/345</td>
    <td>Androgen receptor (AR) antagonism leading to decreased fertility in females</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/346</td>
    <td>Aromatase inhibition leads to male-biased sex ratio via impacts on gonad differentiation</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/348</td>
    <td>Inhibition of 11β-Hydroxysteroid Dehydrogenase leading to decreased trajectory in fish</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/349</td>
    <td>Inhibition of 11β-hydroxylase leading to decresed trajectory in  fish </td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/358</td>
    <td>Chitinase inhibition leading to mortality</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/359</td>
    <td>Chitobiase inhibition leading to mortality</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/36</td>
    <td>Peroxisomal Fatty Acid Beta-Oxidation Inhibition Leading to Steatosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/360</td>
    <td>Chitin synthase 1 inhibition leading to mortality</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/361</td>
    <td>Sulfonylureareceptor binding leading to mortality</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/363</td>
    <td>Thyroperoxidase inhibition leading to increased mortality via altered eye structure</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/366</td>
    <td>Competitive binding to thyroid hormone carrier protein transthyretin (TTR) leading to altered amphibian metamorphosis </td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/367</td>
    <td>Competitive binding to thyroid hormone carrier protein thyroid binding globulin (TBG) leading to altered amphibian metamorphosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/368</td>
    <td>Cytochrome oxidase inhibition leading to olfactory nasal lesions</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/37</td>
    <td>PPARα activation leading to hepatocellular adenomas and carcinomas in rodents</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/372</td>
    <td>Androgen receptor antagonism leading to testicular cancer </td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/374</td>
    <td>Binding of Sars-CoV-2 spike protein to ACE 2 receptors expressed on brain cells (neuronal and non-neuronal) leads to neuroinflammation resulting in encephalitis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/376</td>
    <td>Androgen receptor agonism leading to male-biased sex ratio</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/377</td>
    <td>Dysregulated prolonged Toll Like Receptor 9 (TLR9) activation leading to Acute Respiratory Distress Syndrome (ARDS) and Multiple Organ Dysfunction (MOD)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/38</td>
    <td>Protein Alkylation leading to Liver Fibrosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/381</td>
    <td>Binding of viral S-glycoprotein to ACE2 receptor leading to dysgeusia</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/383</td>
    <td>ACE2 inhibition leading to liver fibrosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/39</td>
    <td>Covalent Binding of Low Molecular Weight Organic Chemicals to Proteins leads to Sensitisation (Sensitization) of the Respiratory Tract</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/40</td>
    <td>Covalent Protein binding leading to Skin Sensitisation</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/41</td>
    <td>Sustained AhR Activation leading to Rodent Liver Tumours</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/42</td>
    <td>Inhibition of Thyroperoxidase and Subsequent Adverse Neurodevelopmental Outcomes in Mammals</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/43</td>
    <td>Disruption of VEGFR Signaling Leading to Developmental Defects</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/46</td>
    <td>AFB1: Mutagenic Mode-of-Action leading to Hepatocellular Carcinoma (HCC)</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/48</td>
    <td>Binding of agonists to ionotropic glutamate receptors in adult brain causes excitotoxicity that mediates neuronal cell death, contributing to learning and memory impairment.</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/51</td>
    <td>PPARα activation leading to impaired fertility in adult male rodents </td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/54</td>
    <td>Inhibition of Na+/I- symporter (NIS) leads to learning and memory impairment </td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/57</td>
    <td>AhR activation leading to hepatic steatosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/58</td>
    <td>NR1I3 (CAR) suppression leading to hepatic steatosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/6</td>
    <td>Antagonist binding to PPARα leading to body-weight loss</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/60</td>
    <td>NR1I2 (Pregnane X Receptor, PXR)  activation leading to hepatic steatosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/61</td>
    <td>NFE2L2/FXR activation leading to hepatic steatosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/62</td>
    <td>AKT2 activation leading to hepatic steatosis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/63</td>
    <td>Cyclooxygenase inhibition leading to reproductive dysfunction</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/64</td>
    <td>Glucocorticoid Receptor (GR) Mediated Adult Leydig Cell Dysfunction Leading to Decreased Male Fertility</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/65</td>
    <td>XX Inhibition of Sodium Iodide Symporter and Subsequent Adverse Neurodevelopmental Outcomes in Mammals</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/7</td>
    <td>Aromatase (Cyp19a1) reduction leading to impaired fertility in adult female</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/72</td>
    <td>Epigenetic modification of PPARG leading to adipogenesis</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/77</td>
    <td>Nicotinic acetylcholine receptor activation contributes to abnormal foraging and leads to colony death/failure 1</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/78</td>
    <td>Nicotinic acetylcholine receptor activation contributes to abnormal role change within the worker bee caste leading to colony death failure 1</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/79</td>
    <td>Nicotinic acetylcholine receptor activation contributes to impaired hive thermoregulation and leads to colony loss/failure</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/8</td>
    <td>Upregulation of Thyroid Hormone Catabolism via Activation of Hepatic Nuclear Receptors, and Subsequent Adverse Neurodevelopmental Outcomes in Mammals</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/80</td>
    <td>Nicotinic acetylcholine receptor activation contributes to accumulation of damaged mitochondrial DNA and leads to colony loss/failure</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/87</td>
    <td>Nicotinic acetylcholine receptor activation contributes to abnormal foraging and leads to colony loss/failure </td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/88</td>
    <td>Nicotinic acetylcholine receptor activation contributes to abnormal foraging and leads to colony loss/failure via abnormal role change within caste</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/89</td>
    <td>Nicotinic acetylcholine receptor activation followed by desensitization contributes to abnormal foraging and directly leads to colony loss/failure</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/90</td>
    <td>Nicotinic acetylcholine receptor activation contributes to abnormal roll change within the worker bee caste leading to colony loss/failure 2</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/96</td>
    <td>Axonal sodium channel modulation leading to acute mortality</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://nanofase.cloud.nanosolveit.eu/</td>
    <td>NanoFASE Soil-water-organism model</td>
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
