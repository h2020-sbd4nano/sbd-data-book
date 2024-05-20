# relationshipsByCause.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX sbd:     <https://www.sbd4nano.eu/rdf/#>
PREFIX sbdbel:  <https://www.sbd4nano.eu/bel/#>
PREFIX dc:      <http://purl.org/dc/elements/1.1/>
PREFIX dcterms: <http://purl.org/dc/terms/>
PREFIX sbdbel2:  <https://h2020-sbd4nano.github.io/sbdbel/>

SELECT ?cause (COUNT(DISTINCT ?relation) AS ?count)
WHERE {
  VALUES ?ca { sbdbel:CausalAssertion sbd:CausalAssertion sbdbel2:CausalAssertion }
  ?relation a ?ca ;
    sbdbel:cause / rdfs:label ?cause .
} GROUP BY ?cause
  ORDER BY DESC(?count) ASC(?cause)
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0APREFIX%20sbdbel2%3A%20%20%3Chttps%3A%2F%2Fh2020-sbd4nano.github.io%2Fsbdbel%2F%3E%0A%0ASELECT%20%3Fcause%20%28COUNT%28DISTINCT%20%3Frelation%29%20AS%20%3Fcount%29%0AWHERE%20%7B%0A%20%20VALUES%20%3Fca%20%7B%20sbdbel%3ACausalAssertion%20sbd%3ACausalAssertion%20sbdbel2%3ACausalAssertion%20%7D%0A%20%20%3Frelation%20a%20%3Fca%20%3B%0A%20%20%20%20sbdbel%3Acause%20%2F%20rdfs%3Alabel%20%3Fcause%20.%0A%7D%20GROUP%20BY%20%3Fcause%0A%20%20ORDER%20BY%20DESC%28%3Fcount%29%20ASC%28%3Fcause%29%0A)


### Output

<table>
  <tr>
    <td><b>cause</b></td>
    <td><b>count</b></td>
  </tr>
  <tr>
    <td>Mitochondrial dysfunction</td>
    <td>31</td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>26</td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>23</td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>20</td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>14</td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>13</td>
  </tr>
  <tr>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td>13</td>
  </tr>
  <tr>
    <td>Cell injury/death</td>
    <td>13</td>
  </tr>
  <tr>
    <td>Increased, Reactive oxygen species</td>
    <td>13</td>
  </tr>
  <tr>
    <td>Increase, Oxidative Stress</td>
    <td>12</td>
  </tr>
  <tr>
    <td>Activation, LXR</td>
    <td>11</td>
  </tr>
  <tr>
    <td>Acetylcholinesterase (AchE) Inhibition</td>
    <td>10</td>
  </tr>
  <tr>
    <td>Increase, DNA damage</td>
    <td>10</td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>9</td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>9</td>
  </tr>
  <tr>
    <td>size</td>
    <td>9</td>
  </tr>
  <tr>
    <td>Apoptosis</td>
    <td>9</td>
  </tr>
  <tr>
    <td>Deposition of Ionizing Energy</td>
    <td>9</td>
  </tr>
  <tr>
    <td>Increase, Reactive Oxygen Species production</td>
    <td>9</td>
  </tr>
  <tr>
    <td>Agonism, Androgen receptor</td>
    <td>8</td>
  </tr>
  <tr>
    <td>Decrease, testosterone levels </td>
    <td>8</td>
  </tr>
  <tr>
    <td>Histone deacetylase inhibition</td>
    <td>8</td>
  </tr>
  <tr>
    <td>Increase, DNA strand breaks</td>
    <td>8</td>
  </tr>
  <tr>
    <td>Activation, PPARα</td>
    <td>7</td>
  </tr>
  <tr>
    <td>Epithelial Mesenchymal Transition</td>
    <td>7</td>
  </tr>
  <tr>
    <td>Increase, Inflammation</td>
    <td>7</td>
  </tr>
  <tr>
    <td>Increased Pro-inflammatory mediators</td>
    <td>7</td>
  </tr>
  <tr>
    <td>Increased, Oxidative Stress</td>
    <td>7</td>
  </tr>
  <tr>
    <td>N/A, Neurodegeneration</td>
    <td>7</td>
  </tr>
  <tr>
    <td>Overactivation, NMDARs</td>
    <td>7</td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Altered, Transcription of genes by the androgen receptor</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Decrease, Adenosine triphosphate pool</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Decreased, serotonin transporter activity</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Increase, Apoptosis</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Increase, Cell Proliferation</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Increase, Mutations</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Increased SARS-CoV-2 production</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Increased, recruitment of inflammatory cells</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Increased, secretion of proinflammatory mediators</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Increased, serotonin (5-HT) </td>
    <td>6</td>
  </tr>
  <tr>
    <td>Inhibition, 5-hydroxytryptamine transporter (5-HTT; SERT)</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Non-coding RNA expression profile alteration</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Peptide Oxidation</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Reduced levels of BDNF</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Substance interaction with the lung resident cell membrane components</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Thyroid hormone synthesis, Decreased</td>
    <td>6</td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Activation, estrogen receptor alpha</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Decrease of neuronal network function</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Decrease, androgen receptor activation</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Decreased spermatogenesis </td>
    <td>5</td>
  </tr>
  <tr>
    <td>Decreased, Neuronal network function in adult brain</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Decreased, Triiodothyronine (T3)</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Disturbance, Lysosomal function</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Estrogen receptor alpha inactivation</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Increase, Cell death</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Increase, Oxidative damage to DNA</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Increased Cholinergic Signaling</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Increased, Intracellular Calcium overload</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Increased, glutamate</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Increased, valve movement</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Inhibition, Cyclooxygenase activity</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Neuroinflammation</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Oxidative Stress in Brain</td>
    <td>5</td>
  </tr>
  <tr>
    <td>peroxisome proliferator activated receptor promoter demethylation</td>
    <td>5</td>
  </tr>
  <tr>
    <td>ROS production</td>
    <td>4</td>
  </tr>
  <tr>
    <td>exposure route</td>
    <td>4</td>
  </tr>
  <tr>
    <td>medium</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Activation of PPAR</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Activation, Androgen receptor</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Activation, Estrogen receptor</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Activation, Glucocorticoid Receptor</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Activation, Long term AHR receptor driven direct and indirect gene expression changes</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Activation, PTGS-1 (Prostaglandin-endoperoxide synthase 1)</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Agonism, Retinoic acid receptor</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Alkylation, DNA</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Altered Signaling Pathways</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Altered, Meiotic chromosome dynamics</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Altered, Protein Production</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Antagonism, Thyroid Receptor </td>
    <td>4</td>
  </tr>
  <tr>
    <td>Binding to ACE2</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Covalent Binding, Protein</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Damage, Lipid bilayer</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Decrease, Coupling of oxidative phosphorylation</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Decrease, Mitochondrial ATP production</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Impairment, Learning and memory</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Inadequate DNA repair</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Increase in reactive oxygen and nitrogen species (RONS)</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Increase, Incomplete ecdysis</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Increase, intracellular calcium</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Increased activation, Nuclear factor kappa B (NF-kB)</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Increased, DNA damage and mutation</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Increased, Lipid peroxidation</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Inhibition, Aromatase</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Inhibition, Na+/I- symporter (NIS)</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Inhibition, Nuclear factor kappa B (NF-kB)</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Loss of alveolar capillary membrane integrity</td>
    <td>4</td>
  </tr>
  <tr>
    <td>N/A, Parent compound is converted to the reactive metabolite and forms free radicals leading to oxidation of heme iron(II) in hemoglobin to iron(III)</td>
    <td>4</td>
  </tr>
  <tr>
    <td>NFE2/Nrf2 repression</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Occurrence, Cystic dilatation (renal tubule)</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (Renal tubule)</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (podocyte)</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Reduced, PTGS1 function</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Reduced, Swimming performance</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Reduction, Plasma 17beta-estradiol concentrations</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Release, Cytokine</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Synaptic dysfunction</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Trigeminal nerve activation</td>
    <td>4</td>
  </tr>
  <tr>
    <td>dimerization, AHR/ARNT</td>
    <td>4</td>
  </tr>
  <tr>
    <td>concentration</td>
    <td>3</td>
  </tr>
  <tr>
    <td>dissolution</td>
    <td>3</td>
  </tr>
  <tr>
    <td>inflammasome activation</td>
    <td>3</td>
  </tr>
  <tr>
    <td>surface charge</td>
    <td>3</td>
  </tr>
  <tr>
    <td>7α-hydroxypregnenolone synthesis in the brain, decreased</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Abnormal, Foraging activity and behavior</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Accumulation of misfolded proteins</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Accumulation, Collagen</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Accumulation, Fatty acid</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Acetylcholine accumulation in synapses</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Activated, presynaptic neuron 1</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Activation of Cyp2E1</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Activation of specific nuclear receptors, PPAR-gamma activation</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Activation, Glutamate-gated chloride channels</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Activation, JNK</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Activation, Nicotinic acetylcholine receptor</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Activation, PXR/SXR</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Agonism, Estrogen receptor</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Alveolar collapse</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Antagonism, Androgen receptor</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Antagonism, Estrogen receptor</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Bile accumulation, Pathological condition</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Binding of (ant)agonist to peroxisome proliferator–activated receptor alpha</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Bradykinin system, hyperactivated</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Damaging, Red blood cells; hemolysis</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decrease, ATP production</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decrease, Cell proliferation</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decrease, Oxidative phosphorylation</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decrease, dihydrotestosterone (DHT) level</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decreased, Mitochondrial fatty acid beta-oxidation</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decreased, Triiodothyronine (T3) in tissues</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decreased, extracellular serotonin</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Degeneration of dopaminergic neurons of the nigrostriatal pathway</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Formation, Pro-mutagenic DNA Adducts</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Frustrated phagocytosis</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Hippocampal Physiology, Altered</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increase in inflammation</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increase, CNS Neural cell death</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increase, Cell membrane depolarization</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (epithelial cells)</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increase, DNA double-strand breaks</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increase, Oocyte apoptosis</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increase, Oxidative Stress / Activation, PMK-1 P38 MAPK</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increase, cell proliferation (hepatocytes)</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increase, slincR expression</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increased Angiotensin II </td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increased, PPAR-alpha activation</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increased, Serum creatinine</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increased, circulating estrogen levels</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increased, proliferation of mesenchymal cells</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increased, secretion of local growth factors</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Induction, Somatic muscle paralysis</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Inhibition, Deiodinase 1</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Inhibition, Deiodinase 2</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Inhibition, Mitochondrial Electron Transport Chain Complexes</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Inhibition, NADH-ubiquinone oxidoreductase  (complex I)</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Inhibition, Phospholipase A</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Leukocyte recruitment/activation</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Occurrence, renal proximal tubular necrosis</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Unfolded Protein Response</td>
    <td>3</td>
  </tr>
  <tr>
    <td>decreased reward</td>
    <td>3</td>
  </tr>
  <tr>
    <td>hyperpolarisation, neuron</td>
    <td>3</td>
  </tr>
  <tr>
    <td>increased，Vascular endothelial dysfunction</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Mn-impurity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>NF-κB activation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Surface charge</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Toll-like receptors</td>
    <td>2</td>
  </tr>
  <tr>
    <td>aspect ratio (HARN)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>cell type</td>
    <td>2</td>
  </tr>
  <tr>
    <td>cell uptake (amount)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>deformability</td>
    <td>2</td>
  </tr>
  <tr>
    <td>diameter</td>
    <td>2</td>
  </tr>
  <tr>
    <td>lysosomal damage</td>
    <td>2</td>
  </tr>
  <tr>
    <td>shape</td>
    <td>2</td>
  </tr>
  <tr>
    <td>surface area</td>
    <td>2</td>
  </tr>
  <tr>
    <td>time of exposure</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Abnormal, Roll change within caste</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Accumulation, Cytosolic toxic Tau oligomers</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Accumulation, Triglyceride</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activation of ER stress</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activation of Tumor Protein 53</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activation of inflammation pathway</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activation, ChREBP</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activation, EGFR</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activation, Hepatic nuclear receptor(s)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activation, NR1H4</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activation, PTGS-2 (Prostaglandin-endoperoxide synthase 2)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activation, Pregnane-X receptor, NR1l2</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activation, SREBF1</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activation, Stellate cells</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activation, TGF-beta pathway</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activation, Transforming Growth Factor beta pathway</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activation/Proliferation, T-cells</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Alkylation, Protein</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Alterations, Cellular proliferation / hyperplasia</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Altered gene expression, NRF2 dependent antioxidant pathway</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Altered, Gene Expression</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Altered, Visual function</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Altered, cholesterol metabolism</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Antagonism, Smoothened receptor</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Binding of (ant)agonist to liver X receptor</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Binding, Transthyretin in serum</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Binding, Tubulin</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Bulky DNA adducts, increase</td>
    <td>2</td>
  </tr>
  <tr>
    <td>CYP7B activity, inhibition</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Cell cycle, disrupted</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Coagulation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Cortisol and 11β-(OH) testosterone decreased</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease of egg production and cummulative fecundity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, Calcium currents</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, Cardiac contractility </td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, Fecundity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, GLI1/2 target gene expression</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, Global DNA methylation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, Leaf development</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, Mitochondrial membrane potential</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, Number of worker bees</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, Oogenesis</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, Photosynthesis</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, Reproduction</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, Sonic Hedgehog second messenger production</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, histaminergic neuron excitation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, knickkopf gene</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, sox9 expression</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, testosterone synthesis/level</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased Na/K ATPase activity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased proliferation of cortical neural progenitor cells</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased steroidogenesis, Decreased Activity of Steroidogenic Enzymes in Adult Leydig cells</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased,  plasma 11-ketotestosterone level</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased, Apoptosis (Epithelial Cells)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased, LH Surge from anterior pituitary</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased, PPAR-gamma activation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased, PPARalpha transactivation of gene expression</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased, Sodium conductance 1</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased, all-trans retinoic acid (atRA) concentration</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased, cholesterol</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased, neuroplasticity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Delay, Ovarian maturation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Desensitization, Nicotinic acetylcholine receptor</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Diminished protective oxidative stress response</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Disrupted Lipid Storage</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Disruption, Lysosome</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Disruption, Mitochondrial electron transport chain</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Disruption, neurotransmitter release</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Dopamine release in the brain, decreased</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Down Regulation, GSS and GSTs gene</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Dysfunctional Autophagy</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Dysregulation, ACE2 expression and activity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Fibrinolysis, decreased</td>
    <td>2</td>
  </tr>
  <tr>
    <td>General Apoptosis</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Genomic instability</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Glucocorticoid Receptor Agonist, Activation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Hepatocytotoxicity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Hippocampal gene expression, Altered </td>
    <td>2</td>
  </tr>
  <tr>
    <td>Histone acetylation, increase</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Hyperplasia, Mammary gland</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Impaired axonial transport</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Impaired coordination and movement</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Impaired, Proteostasis</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Impaired, Spermatogenesis</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Impairment, Endothelial network</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Inactivated, 5-HTR (serotonin receptors)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Inactivation of PPARγ</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Caspase transcription</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Caspase transcription (F3)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Cell Proliferation (Epithelial Cells)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Chromosomal aberrations</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Cripto-1 expression</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (renal tubular cell)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, DNA methyltransferase inhibition</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Defects in tanning of new cuticle</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (glandular epithelial cells of endometrium)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (urothelial)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Mitochondrial complex III antagonism</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Oxidative DNA damage</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Pro-Inflammatory Mediators</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Reactive oxygen species</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (tubular epithelial cells)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, angiogenesis</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, cilia movement</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased Mortality</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased fat mass</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased intracelluar Iron accumulation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Chloride conductance</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, De Novo FA synthesis</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, ER binding to DNA (classical pathway) </td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, ER binding to T.F. to DNA (non-classical pathway)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Estrogen receptor (ER) activity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, FA Influx</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Free serum thyroxine (T4)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Hepatic thyroid hormone uptake/transport</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Induced Mutations in Critical Genes</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Inhibitory postsynaptic potential</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Migration (Endothelial Cells)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Neuronal synaptic inhibition</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Non-genomic signaling</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, RDX dose</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Thyroid-stimulating hormone (TSH)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Thyroxine (T4) in serum</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Viral susceptibility</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, blood uric acid concentration</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, extracellular serotonin</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, hippocampal hyperdepolarization</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, hyperplasia (mammary gland)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, locomotion</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, muscular waves in foot</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, predation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, secrection of FSH from anterior pituitary</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, secretion of GnRH from hypothalamus</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, secretion of LH from anterior pituitary</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, serotonin transporter activity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, water retention in foot</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Induced dysregulation of ACE2 </td>
    <td>2</td>
  </tr>
  <tr>
    <td>Induced parturition</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Induction, CYP1A2/CYP1A5</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Inflamatory events in light-exposed tissues</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Inhibition of Ceramide Synthase </td>
    <td>2</td>
  </tr>
  <tr>
    <td>Inhibition of lung surfactant function</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Inhibition of neurotransmitter vesicle release</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Inhibition, Cytochrome P450 enzyme (CYP17A1) activity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Inhibition, Feeding</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Inhibition, FoxA2</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Inhibition, Iodotyrosine deiodinase (IYD)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Inhibition, Mitochondrial fatty acid beta-oxidation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Inhibition, NMDARs</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Inhibition, sodium channel</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Inositol triphosphate receptor activation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Insulin resistance, increased</td>
    <td>2</td>
  </tr>
  <tr>
    <td>KE4 : Uncoupling, eNOS</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Lipid Peroxidation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>N/A, Androgen receptor, Antagonism</td>
    <td>2</td>
  </tr>
  <tr>
    <td>N/A, Unknown</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Neural crest cell migration, reduced</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Occurrence, Ballooning degeneration (hepatocyte)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (Bile duct cell)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (hepatocyte)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (kupffer cell)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>PFOS binding PPAR isoforms resulting in disrupted nuclear signaling</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Prolonged TLR9 activation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Propagation, Oxidative stress</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Proteasomal dysfunction</td>
    <td>2</td>
  </tr>
  <tr>
    <td>ROS generation from photoactivated chemicals</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduced, Maturation inducing steroid receptor signalling, oocyte</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduced, PTGS2 function</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduced, Posterior swim bladder inflation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduced, Prostaglandin F2alpha concentration, plasma </td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduced, feeding 1</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduced, swimming speed</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduction, Cumulative fecundity and spawning</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduction, Plasma vitellogenin concentrations</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduction, Testosterone synthesis in Leydig cells</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Release of G Proteins</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Respiratory distress/arrest</td>
    <td>2</td>
  </tr>
  <tr>
    <td>SARS-CoV-2 cell entry </td>
    <td>2</td>
  </tr>
  <tr>
    <td>Sensory axonal peripheral neuropathy</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Status epilepticus</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Suppression, Constitutive androstane receptor, NR1l3</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Suppression, Estrogen receptor (ER) activity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Sustentacular cells, decrease </td>
    <td>2</td>
  </tr>
  <tr>
    <td>Thyroperoxidase, Inhibition</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Thyroxine (T4) in neuronal tissue, Decreased </td>
    <td>2</td>
  </tr>
  <tr>
    <td>Tissue resident cell activation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Up Regulation, CD36</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Up Regulation, SCD-1</td>
    <td>2</td>
  </tr>
  <tr>
    <td>activation of CCAAT/enhancer-binding protein alpha</td>
    <td>2</td>
  </tr>
  <tr>
    <td>benzoquinone imine and acylglucuronide metabolites</td>
    <td>2</td>
  </tr>
  <tr>
    <td>decreased DNA methylation of tyrosine hydroxylase</td>
    <td>2</td>
  </tr>
  <tr>
    <td>decreased methylation of dopamine transporter promoter</td>
    <td>2</td>
  </tr>
  <tr>
    <td>impaired, Fertility</td>
    <td>2</td>
  </tr>
  <tr>
    <td>impaired, Hive thermoregulation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>increase oxidation of the di-copper moiety of the hemocyanin active site </td>
    <td>2</td>
  </tr>
  <tr>
    <td>olfactory sensory neurons, decrease </td>
    <td>2</td>
  </tr>
  <tr>
    <td>persistent, cytotoxicity (pleura or peritoneum)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>prolonged, estrus</td>
    <td>2</td>
  </tr>
  <tr>
    <td>reduced production, VEGF</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Hydrophilicity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>NADPH oxidase (NOX1) activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>PEGylation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Pathogen-associated molecular patterns</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Phagocytosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Pottasium</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Zeta-potential</td>
    <td>1</td>
  </tr>
  <tr>
    <td>activation of caspase-3</td>
    <td>1</td>
  </tr>
  <tr>
    <td>amination</td>
    <td>1</td>
  </tr>
  <tr>
    <td>caspase-1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>cathepsins</td>
    <td>1</td>
  </tr>
  <tr>
    <td>cell uptake (type)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>charge</td>
    <td>1</td>
  </tr>
  <tr>
    <td>crystal structure</td>
    <td>1</td>
  </tr>
  <tr>
    <td>enzyme degredation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>interaction potential</td>
    <td>1</td>
  </tr>
  <tr>
    <td>kidney activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>layers</td>
    <td>1</td>
  </tr>
  <tr>
    <td>length</td>
    <td>1</td>
  </tr>
  <tr>
    <td>light</td>
    <td>1</td>
  </tr>
  <tr>
    <td>lipopolysaccharides</td>
    <td>1</td>
  </tr>
  <tr>
    <td>liver/spleen activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>membrane crossing</td>
    <td>1</td>
  </tr>
  <tr>
    <td>photo-reactivity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>pro-caspase-1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>pro-interleukin (IL)-1β</td>
    <td>1</td>
  </tr>
  <tr>
    <td>protein corona</td>
    <td>1</td>
  </tr>
  <tr>
    <td>stacks</td>
    <td>1</td>
  </tr>
  <tr>
    <td>temperature</td>
    <td>1</td>
  </tr>
  <tr>
    <td> MLL chromosomal translocation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>11β-hydroxylase inhibition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Aberrant, Dendritic morphology</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Aberrant, synaptic formation and plasticity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Abnormal expression of NO</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Abnormal, Glucose homeostasis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Abnormal, Role change within caste</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Accelerated, Aging</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Accumulation, Damaged mitochondrial DNA</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Accumulation, Highly carboxylated porphyrins</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Acinar cell proliferation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activate, GABA-A receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activate, PLC (Phospholipase C)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activate, calmodulin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activate, leukocyte </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activate, mucosal defense</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activate, phospholipase</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activate, presynaptic neuron 2</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activated AKT/ERK/PI3K pathway</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activated ANG/Tie2 pathway</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activated BMP/TGF-beta pathway</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activated Wnt/Frizzled pathway</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activated, LXR</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activated, NMDA receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activated, membrane depolarization</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activated, voltage-gated sodium channel</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation Sema6A</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation of Angiogenic cytokines</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation of MMP-2 MMP-9</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation of TGF-β signaling</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation of angiopoietin like protein 4</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation of calpain signalling</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation of hepatic stellate cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation of metabotropic glutamate receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation of mitogen-activated protein kinase kinase, extracellular signal-regulated kinase 1/2</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation of specific nuclear receptors, Transcriptional change</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, 3-hydroxy-3-methylglutaryl-CoA reductase gene</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, 5-HT2A (Serotonin 2A)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, 5HT2c</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, AKT2</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Caspase 8 pathway</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Constitutive androstane receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Dendritic Cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Dll4-Notch pathway</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, FAS</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, FOXO</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Glutamate-gated chloride channel</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, HIF-1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, HIF1α</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, JAK/STAT pathway</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Juvenile hormone receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Keratinocytes</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, LXR alpha</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Latent Transforming Growth Factor Beta 1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Microglia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Muscarinic Acetylcholine Receptors</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, NADPH Oxidase</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, NRF2</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, PARP1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, SCD-1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, SHP</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, SREBP-1c</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Tissue resident cells (Kuppfer cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, beta-2 adrenergic receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, caspases</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, ionotropic GABA Receptor chloride channel</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activator protein 1 activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Affected folate transporter</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Airway Surface Liquid Height, Decreased </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Airway epithelial injury</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Airway remodeling</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Alteration, Wnt pathway</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Alteration, lipid metabolism</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered Bone Cell Homeostasis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered Liver X receptor activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered brain morphology</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered differentiation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered expression of cell cycle genes</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered gene expression specific to CAR activation, Hepatocytes</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered, Action Potential</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered, Ca2+-calmodulin activated signal transduction</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered, Cardiovascular development/function</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered, Chromosome number</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered, Neuroanatomy</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered, Neurophysiology</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered, Nitric Oxide Levels</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered, Photoreceptor patterning</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered, Thyroid hormone-dependent gene expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered, retinal layer structure</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered, white brain matter</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Angiogenesis dysfunction</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Antagonism, Histamine Receptor (H2)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Antagonism,LH receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Apoptotic cell death</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding at picrotoxin site, iGABAR chloride channel</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding of agonist, Angiotensin II receptor type 1 receptor (AT1R)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding of agonist, Ionotropic glutamate receptors</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding of antagonist to glucocorticoid hormone receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding of antagonist to thyroid hormone receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding of antagonist, NMDA receptors</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding of antagonist, PPAR alpha</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding of inhibitor to mitochondrial complex III</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding of inhibitor to mitochondrial complex IV</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding of inhibitor to mitochondrial complex V</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding of inhibitor, NADH-ubiquinone oxidoreductase (complex I)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding of microtubule stabilizing agents (MSA) to microtubules</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding of substrate, endocytic receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding to (interferes with) topoisomerase II enzyme</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding to estrogen receptor (ER)-α in immune cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding to voltage-gated sodium channel</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding, Thiol/seleno-proteins involved in protection against oxidative stress</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Binding, Thyroid binding globulin in serum</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Blockade of STAT5 phosphorylation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Blockade, L-Type Calcium Channels </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Blood loss and development of anemia, Impaired oxygen delivery and nutrient delivery to tissue, impaired carbon dioxide and waste product removal</td>
    <td>1</td>
  </tr>
  <tr>
    <td>CYP2E1 Activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Changes/Inhibition, Cellular Homeostasis and Apoptosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Chronic reactive oxygen species</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Cilia Beat Frequency, Decreased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Clonal Expansion/Cell Proliferation, to form Altered Hepatic Foci (AHF)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Cognitive, sensed as hypoxic/low oxygen environment</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Collagen Deposition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Collagen production, reduced</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Conjugation, GSH</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Cystic Fibrosis Transmembrane Regulator Function, Decreased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decline, Population</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decompartmentalization</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease in mitochondrial oxidative phosphorylation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease of GABAergic interneurons</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease of Thyroidal iodide</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease of synaptogenesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, 20-hydroxyecdysone</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Abdominal muscle contraction</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Acyl-CoA dehydrogenases</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Bioactivation of testosterone</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Calcium binding to Troponin C</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Cardiac ejection fraction </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Chitin laminar organization</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Chlorophyll synthesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Circulating crustacean cardioactive peptide</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Circulating ecdysis triggering hormone</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Cuticular chitin content</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Digestion of old cuticle</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, E2 blood concentrations at hypothalamus</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Ecdysis motoneuron bursts</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Excitatory postsynaptic potential</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Fecundity (F3)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, GLI1/2 translocation to nucleus </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, GLUT4</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Glucose pool</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Glucose uptake</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Glycolysis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Growth</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Heritable DNA methylation (F3)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Intracellular pH</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Leaf cell mitosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Light harvest capacity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Neutral lipids</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, New cuticle secretion</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Oogenesis (F3)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Ovulation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Photosystem II efficiency</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Prevent chitin degradation by chitinases</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Smoothend relocation and activation </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Steroidogenic acute regulatory protein (STAR)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Translocator protein (TSPO)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Tyrosine</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, dopa decarboxylase</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, elavl3 </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, expression of gonadotropin releasing hormone receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, mbp</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, palatal shelf outgrowth</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, sox10</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, surfactant</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased SIRT1 expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased plasma Cortisol level</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased plasma RA level</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased protection against oxidative stress</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased proximal tubular vectorial transport</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased retinoic acid (RA) synthesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased sperm quantity or quality in the adult, Decreased fertility </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, 3-hydroxyacyl-CoA dehydrogenase type-2 activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, 5-HT3</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Androgen and Progestin </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Androgen receptor activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Aromatase (Cyp19a1) mRNA</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Calcium influx</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Chicken Ovalbumin Upstream Promoter Transcription Factor II (COUP-TFII)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, DHB4/HSD17B4</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Dopaminergic activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Eye size</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, GABA</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Glomerular filtration</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Glucose oxidase enzyme activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, GnRH pulsatility/release in hypothalamus</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Gonadotropins</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, HSD17B10 expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Hydrogen peroxide production</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Insulin-like peptide 3 (INSL3)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Ketogenesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Ketogenesis (production of ketone bodies)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Lymphocytes</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Maturation Inducing Steroid Surge by Granulosa cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Mitochondrial Fatty Acid Beta Oxidation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Nitric Oxide</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Ovarian E2</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, PCK1 expression (control point for glycolysis/gluconeogenesis pathway)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, PPAR-alpha activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, PPAR-beta activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Progesterone from corpus luteum</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Prolactin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Prostaglandin F2alpha concentration, plasma </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Prostaglandin F2alpha synthesis, ovary  </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Renal ability to dilute urine</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Renal plasma flow</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Reproductive Success</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Sodium reabsorption</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Testosterone binding to androgen receptor (hypothalamus)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Viable Offspring</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, angiogenesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, anxiety</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, bicarbonate</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, bile flow</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, intracellular chloride</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, intracellular serotonin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, locomotion</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, mevalonate</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, mucosal blood flow</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, mucous</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, oxygen binding capacity by hemocyanin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, packaged serotonin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, sheltering</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, sodium conductance 2</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, synaptic release</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Defect of Embryogenesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Depletion, GSH</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Depletion, energy reserves</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Depletion, mtDNA </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Direct mitochondrial inhibition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Disorganization, Meiotic Spindle</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Displacement, Serum thyroxine (T4) from carrier protein</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Displacement, Serum thyroxine (T4) from transthyretin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Disrupted meiotic initiation of fetal oogonia of the ovary</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Disruption of sodium channel gating kinetics</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Disruption, Intracellular calcium mobilization</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Disruption, Microtubule dynamics</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Disruption, Progenitor cells of second heart field</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Disruption, Sarcomere assembly</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Disturbance in microtubule dynamic instability</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Down Regulation, CPT1A</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Down Regulation, HMGCS2</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Downregulation, ACE2</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Dysregulation of heart rate and vascular tone</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Emphysema</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Endocytotic lysosomal uptake</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Endoplasmic reticulum stress</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Endothelial cell dysfunction </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Epididymal agenesis </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Epigenetic modification process</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Expression of factors ruling proliferation, modified</td>
    <td>1</td>
  </tr>
  <tr>
    <td>FOXJ1 Protein, Decreased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Facial cartilage structures are reduced in size and morphologically distorted</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Failure in gamma-glutamyl carboxylation of  clotting factors II, VII, IX and X, Under carboxylation of clotting factors (e.g., des-gamma-carboxy prothrombin) </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Failure in vascular repair mechanisms, Unresolved blood loss (hemorrhage)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Fatty Acid Beta Oxidation, Decreased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Feminisation or incomplete development, Primary and accessory male sex organs</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Fibroblast proliferation and differentiation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Fibroproliferative airway lesions</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Formation, Mallory body</td>
    <td>1</td>
  </tr>
  <tr>
    <td>GSK3beta inactivation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Generation, Amplified excitatory postsynaptic potential (EPSP)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Glutamate dyshomeostasis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Glutathione homeostasis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Glutathione synthesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Granulosa cell proliferation of gonadotropin-independent follicles, Reduced</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Helicobacter pylori infection</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Hemostasis, Depletion from blood of fully functional carboxylated clotting factors</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Hippocampal anatomy, Altered </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Hyperactivation of ACE/Ang-II/AT1R axis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Hyperplasia, Hyperplasia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Hyperplasia, Leydig cell</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Hyperplasia, ovarian epithelium</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Hyperplasia, ovarian stromal cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Hypertrophy/hyperplasia, smooth muscle</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Hypomyelination</td>
    <td>1</td>
  </tr>
  <tr>
    <td>IFNγ signaling</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Imbalanced salty and sweet taste responses</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Immune cell activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Immune mechanisms antagonized by viral proteins</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Impaired IL-1R1 signaling in T cell</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Impaired Platelet Aggregation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Impaired gustatory nerve</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Impaired inguinoscrotal testicular descent phase</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Impaired insulin signaling</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Impaired ovulation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Impaired, Oocyte maturation and ovulation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Impaired, urethral tube closure </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase Chromosomal Aberrations</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase of Th2 cells producing IL-4</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase of anti-DNA antibody from autoreactive B cell</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase plasma Ang II</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase proliferation, Leydig cell </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase,  impairment of cuticle sclerotization</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase,  pigmentation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Abnormal Neural Remodeling</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Abnormal osmoregulation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Alcohol dehydrogenase</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Androgen receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Body fluid overload</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Body volume of female adults</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Bone Remodeling</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, COX-2 expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Ca++ (intracellular)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Clonal Expansion of Altered Hepatic Foci</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Cytochrome c release</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Cytosolic calcium</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (club cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (corneal cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (hepatocytes)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (tubular epithelial cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (urothelial cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, DNA methyltransferase expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Differentiation of fibroblasts</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Dopaminergic activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Ecdysone receptor agonism</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Endothelial Dysfunction</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Energetic demands and therefore metabolic stress</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, FA Influx</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Follicular atresia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Formation of DNA photoproducts</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Fushi tarazu factor-1 gene expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, GABA</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Global DNA methylation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Glycolysis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Gonadotropins concentration in plasma</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (Leydig cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (follicular cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (forestomach epithelial cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (renal tubular cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (terminal bronchiolar cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (tubular epithelial cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Hypertrophy and proliferation (follicular cell)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, IL-23 from matured dendritic cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Inflammation (corneal cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Liver and splenic hemosiderosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Luteinizing hormone (LH) </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Mitochondrial ATP synthase antagonism</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Mitochondrial swelling</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Mucin production</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Mutations in Critical Genes</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Necrosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Necrosis (terminal bronchiolar cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Nuclear receptor E75b gene expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Oocyte apoptosis (F3)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Opening of voltage-dependent calcium channel</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Ovarian follicle breakdown</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Ovarian follicle breakdown (F3)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Ovarian somatic cell apoptosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Ovarian somatic cell apoptosis (F3)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Oxidative metabolism</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Oxygen-evolving complex damage</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Phenotypic enzyme activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Plasma vitellogenin concentrations</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Pollen abnormal</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Premature molting</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Preneoplastic foci (hepatocytes)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Programmed cell death</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Protein oxidation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, RBC congestion in liver</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (corneal cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (forestomach epithelial cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (hepatocytes)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (terminal bronchiolar epithelial cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (urothelial cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Renal pathology due to VTG deposition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Respiratory or Squamous Metaplasia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Sulfonylurea receptor binding</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, TNF</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Tissue Degeneration, Necrosis & Atrophy </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Uncoupling of photophosphorylation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Urinary bladder calculi</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Vitellogenin mRNA</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Vitellogenin synthesis in liver</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, ammonium (NH4+)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, bicarbonate </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, cortisone</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, cytosolic fatty acid</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, developmental abnormalities</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, goblet cell number</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, hypermethylation of the promotor region of gonadotropin releasing hormone receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, inositol triphosphate</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, leukocyte adherence</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, mucosal blood flow</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, mucous</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, myosin light chain phosphorylation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, platelet aggregation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, predation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, pulmonate breathing</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, seizure</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, sex ratio (F/M)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, surfactant</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, the risk of acute respiratory failure</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, vascular smooth muscle contraction</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased (ectopic) all-trans retinoic acid concentration</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased Ang II type 1 receptor (AT1R)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased CGRP, neuronal release of CGRP</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased Homocysteine level </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased LCN2/iron complex  binds to SLC22A17 receptor in neuron </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased Modified Proteins</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased Respiratory irritability and Chronic Cough, </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased Sodium-sensitive hypertension</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased activity, beta-2 adrenergic receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased adipocyte numbers</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased adipocyte size</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased apoptosis, decreased fetal/adult Leydig Cells </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased blood CCK level</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased exocrine secretion from pancreatic acinar cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased inflammatory immune responses</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased intestinal monitor peptide level</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased microRNA expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased neurokinin A (NKA) by neuronal cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased pro-inflammatory cytokine expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased reactive oxygen species (in the mitochondria)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased sphingolipid-1-phosphate</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, 5-HT3 (5-hydroxytryptamine)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Accumulation of alpha2u microglobulin (proximal tubular epithelium)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Appetite and hunger</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Ataxia, paralysis, or hyperactivity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Atrioventricular block and bradycardia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Binding of chemicals to 2u (serum)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Catabolism of Muscle Protein</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Cell Proliferation (mesothelium)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Cellular proliferation / hyperplasia of acinar cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Chromosome misseggregation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Clearance of thyroxine from serum</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, DNA Damage-Repair</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Deformed Wing Virus levels</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Differentiation to Testis </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Ductal Hyperplasia </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Energetic demands and therefore metabolic stress</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Expression of LXR activated genes</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, HIF-1 alpha transcription</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, HIF-1 heterodimer</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Hyperplasia (glandular epithelial cells of endometrium)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Induction of pyruvate dehydrogenase (PDH)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Insufficient repair or mis-repair of pro-mutagenic DNA adducts</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Invasion</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Kidney Failure</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Kisspeptin signalling</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, LDL uptake</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Leutinizing hormone (LH)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Liver Steatosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Luteinizing hormone (LH) </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Male Biased Sex Ratio</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Male offspring</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Motility</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Oncotic Necrosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Oocyte Atresia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Plasma HCY level</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Plasma tyrosine</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Proliferation (Endothelial cells) </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Reproductive Success</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Second Messenger Production</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Steroidogenic acute regulatory protein (StAR) </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Triglyceride formation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Triiodothyronine (T3) in tissues</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, activation of T (T) helper (h) type 2 cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, adipogenesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, blood potassium concentration</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, cardiac arrthymia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, cholestasis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, cyclic adenosine monophosphate</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, epilepsy</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, essential element imbalance</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, estrogens </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, extracellular matrix deposition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, fibroblast proliferation and myofibroblast differentiation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, foot detachment</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, gene expression of AR</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, glucocorticoid receptor activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, histomorphological alteration of testis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, inflammation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, intracellular chloride (Cl-)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, intracellular serotonin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, intracellular sodium (Na+)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, lactotroph hyperplasia and hypertrophy</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, latency period</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, leukocyte activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, leukocyte adherence</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, oocyte maturation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, packaged serotonin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, prolactin exposure</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, prolactin secretion</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, seizure</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, synaptic release</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, tumor growth</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increases in cellular reactive oxygen species</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induced, dysfunction of microcirculation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction of GATA3 expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, Doublesex1 gene</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, IKB inhibitory protein</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, Liver “Dysfunctional” Changes by CGA 330050</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, Male reproductive tract</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, Microvesicular fat</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, Sustained Cell Proliferation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, Sustained Hepatotoxicity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, Upregulation of glucuronyltransferase activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, persistent proliferation/sustained proliferation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, pharyngeal muscle paralysis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Influenza A Virus (IAV) binds sialic acid glycan receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Influenza A Virus (IAV) budding</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Influenza A Virus production increased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Influenza A virus (IAV) cell entry</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition GABAA receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition VEGF/VEGFR pathway</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition of 11β-HSD </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition of ALDH1A (RALDH)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition of Fyna</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition of JAK3</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition of N-linked glycosylation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition of N-type Ca ion channels</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition of Plxna2</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition of Sulfotransferase E1 (SULT1E1)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition of cystathionine beta-synthase</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition of lysyl oxidase</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition of mitochondrial DNA polymerase gamma (Pol gamma)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition of rapid delayed rectifying potassium current </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition of tyrosinase </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, 4-hydroxyphenyl-pyruvate dioxygenase (HPPD) enzyme</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, 5α-reductase</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, 5α-reductase activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Activin signaling</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Bile Salt Export Pump (ABCB11)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Ca++ ATPase</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Calcineurin Activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Chitin synthase 1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Chitinase </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Chitobiase</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Cyclooxygenase 1 activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Deiodinase 3</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Dual oxidase</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Ether-a-go-go (ERG) voltage-gated potassium channel </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Fatty Acid Beta Oxidation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Fin regeneration</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, HMG-CoA reductase</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, IKK complex</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Inducible Nitric Oxide Synthase by Metabolite CGA 265307</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, PPAR alpha</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Pendrin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Prolyl hydroxylases</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Pyruvate dehydrogenase kinase (PDK) enzyme</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, UROD</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, VegfR2</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Wnt pathway</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, organic anion transporter 1 (OAT1)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Insufficiency, Vascular</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Interaction of α-diketones with arginine residues</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Interference, nuclear localization of NFAT</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Interferon-I antiviral response, antagonized by SARS-CoV-2</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Irreversible inhibition of hepatic VKOR by binding of AR at tyrosine 139, Failure to cycle vitamin K epoxide to vitamin K to form vitamin K hydroquinone</td>
    <td>1</td>
  </tr>
  <tr>
    <td>KE1 : S-Glutathionylation, eNOS</td>
    <td>1</td>
  </tr>
  <tr>
    <td>KE2 : Decrease, GTPCH-1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>KE3 : Decrease, Tetrahydrobiopterin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>KE5 : Decrease, AKT/eNOS activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>KE6 : Depletion, Nitric Oxide</td>
    <td>1</td>
  </tr>
  <tr>
    <td>KE7 : Impaired, Vasodilation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>KE8 : Increase, Vascular Resistance</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Latent Transforming growth Factor beta expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Locomotor activity, decreased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Loss of drebrin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Malformation, Male reproductive tract</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Metabolism of AFB1, Production of Reactive Electrophiles</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Mitochondrial Complex IV inhibition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Mitochondrial Complex V inhibition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Mitochondrial Injury</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Mitochondrial dysfunction EMPTY</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Motile Cilia Number/Length, Decreased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Mu Opioid Receptor Agonism</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Mucociliary Clearance, Decreased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>N/A, Ataxia, paralysis, or hyperactivity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>N/A, Gap</td>
    <td>1</td>
  </tr>
  <tr>
    <td>N/A, Hepatotoxicity, Hepatopathy, including a constellation of observable effects</td>
    <td>1</td>
  </tr>
  <tr>
    <td>N/A, Liver Steatosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>N/A, Methemoglobinemia, decreased hemoglobin, hematocrit, red blood cell number</td>
    <td>1</td>
  </tr>
  <tr>
    <td>N/A, hypoxia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>N/A, sedation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>NLRP3 inflammasome activity, increased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Necrotic Tissue</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Neuronal dysfunction</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Neutrophil activation, Increased </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Not Increased, Circulating Ketone Bodies</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Notochord distortion or malformations</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Occurrence, A paroxysmal depolarizing shift</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Occurrence, Focal Seizure</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Occurrence, Kidney toxicity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Occurrence, cardiac arrhythmia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Occurrence, renal ischemia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Occurrence, tophi (urate) deposition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Olfactory epithelium degeneration</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Opening of G protein gated inward rectifying K channels</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Opening of calcium channel, Calcium influx</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Opening, voltage-gated calcium channels</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Overactivation, Neuronotransmitter release</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Overactivation, muscle contraction</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Overexpression of rasl11b</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Overwhelmed, Mitochondrial DNA repair mechanisms</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Oxidation of membrane lipids</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Oxidation, Glutathione (To be considered with MIE)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Oxidation, Uroporphyrinogen</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Oxidation/denatuation of membrane proteins</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Parkinsonian motor deficits</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Perturbation of cholesterol</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Pin-1 activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Platelet activation, Increased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Platelet-neutrophil interactions, Increased </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Porcupine-induced Wnt secretion and Wnt signaling activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Premature cell differentiation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Production, Critical Metabolites (CGA 330050 and CGA 265307)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Production, Reactive oxygen species</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Proliferation, Cell proliferation in the absence of cytotoxicity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Proliferation/Clonal Expansion, aberrant basal cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Proliferation/Clonal Expansion, smooth muscle</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Prolongation of Action Potential Duration</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Prolongation of QT interval</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Promotion, SIX-1 postive basal-type progenitor cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Promotion, ovarian adenomas</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Protein Adduct Formation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Pulmonary inflammation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>ROS formation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduce expression, BDNF (Brain-derived neurotrophic factor)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced complex sphingolipids</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced cortical thickness</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced fitness or even mortality, Acidosis, hypovolemic shock and organ dysfunction</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced number of oligodendrocytes</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced size of the ovarian follicle pool </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced tidal volume </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Ability to attract spawning mates</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Anterior swim bladder inflation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Antiseptic incorporated in food</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, BDNF (Brain-derived neurotrophic factor)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Brood care</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, FXR activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Food storage</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, GABA-A receptor activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Gonadotropin releasing hormone, hypothalamus</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, HSD17B4 activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Hearing</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Luteinizing hormone (LH), plasma </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Maturation inducing steroid, plasma</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Meiotic prophase I/metaphase I transition, oocyte</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, PPARalpha</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Pheromone release</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Presynaptic release of glutamate</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Prostaglandin E2 concentration, hypothalamus</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Prostaglandin F2alpha synthesis, ovary  </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Prostaglandins, ovary</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Reproductive Success</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, SHP activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Spawning behavior</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, fatty acid beta oxidation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, mucosal defense</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, platelet aggregation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, presynaptic neuron 2 activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction fo Pigmentation pattern </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction in melanin level</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction of L-Dopaquinone</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction of collagen crosslinking</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction of melanosome level</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, 17-OH-pregnenolone conversion in DHEA</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, 17-OH-progesterone conversion in androstenedione</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, 17beta-estradiol synthesis by ovarian granulosa cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, 17beta-estradiol synthesis by the undifferentiated gonad </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Angiogenesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Ca and HCO3 transport to shell gland</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Cholesterol transport in mitochondria</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Eggshell thickness</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Gonadotropins, circulating concentrations</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Ionotropic GABA receptor chloride channel conductance</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, NFAT/AP-1 complex formation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Neuronal synaptic inhibition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Plasma progesterone concentration </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Progesterone synthesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Prostaglandin E2 concentration</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Testosterone synthesis by ovarian theca cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Vitellogenin accumulation into oocytes and oocyte growth/development</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Vitellogenin synthesis in liver</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, fetal/adult testosterone </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, progesterone uptake, decresed maturation </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, the ratio of 17beta-estradiol/11-Keto Testosterone in plasma </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Repressed expression of steroidogenic enzymes </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Repression of Gbx2 expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Retinaldehyde dehydrogenase inhibition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Ryanodine receptor activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>SP (Substance P) release, Local increase of SP</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Secondary genotoxicity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Serotonin 1A Receptor Agonism</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Sexual behavior, decreased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Spermatocyte depletion</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Stimulation, TLR7/8</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Succinate dehydrogenase, inhibited</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Superoxide generation, increased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Suppression of  T cell activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Suppression of IL-4 production</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Suppression of STAT5 binding to cytokine gene promoters</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Suppression, IL-2 and IL-4 production</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Suppression, Immune system</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Suppression, Inflammatory cytokines</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Suppression, VLDL secretion</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Synthesis, De Novo Fatty Acid (FA)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Systemic acute phase response</td>
    <td>1</td>
  </tr>
  <tr>
    <td>TRPA1 activation, TRPA1 Receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Th17 cell migration and inflammation induction</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Thiol group of chemicals interact with sulfuhydryl groups of proteins to form thiol adducts</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Toll Like Receptor (TLR) Dysregulation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Toll-like receptor 4 activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Torsades de Pointes</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Transcription of genes encoding acute phase proteins, Increased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Treat, carbamazepine</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Trypsin inhibition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Under carboxylated clotting factors will not assemble on cell surfaces to form clot, Failure of secondary hemostasis  </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Unknown, MIE</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Up Regulation, Acetyl-CoA carboxylase-1 (ACC-1)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Up Regulation, CYP1A1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Up Regulation, FAS</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Up Regulation, LDLR (low density lipoprotein receptor)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Up Regulation, SREBF2</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Up Regulation, Unsaturated fatty acid</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Upregulated, Spindle assembly checkpoint protein Mad2-oocyte</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Urothelial cell injury/death</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Vascular barrier disruption</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Weak collagen matrix</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Weak, Procuticle protection</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Weakened, Colony</td>
    <td>1</td>
  </tr>
  <tr>
    <td>abnormal, placental labyrinth vasculature morphology</td>
    <td>1</td>
  </tr>
  <tr>
    <td>altered, inner ear development</td>
    <td>1</td>
  </tr>
  <tr>
    <td>beta-catenin activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>chronic high fat diet</td>
    <td>1</td>
  </tr>
  <tr>
    <td>decline, neural progenitor cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>decrease, transcription of genes by AR </td>
    <td>1</td>
  </tr>
  <tr>
    <td>decreased dopamine</td>
    <td>1</td>
  </tr>
  <tr>
    <td>decreased folate uptake</td>
    <td>1</td>
  </tr>
  <tr>
    <td>decreased oocyte maturation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>decreased, Bcl-2 expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>decreased, Intellectual Quotient</td>
    <td>1</td>
  </tr>
  <tr>
    <td>eya1 expression, inhibited</td>
    <td>1</td>
  </tr>
  <tr>
    <td>foxi1 expression, increased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>hERG channel blockade</td>
    <td>1</td>
  </tr>
  <tr>
    <td>impaired, Development</td>
    <td>1</td>
  </tr>
  <tr>
    <td>impaired, Larval development</td>
    <td>1</td>
  </tr>
  <tr>
    <td>impaired, Learning and memory</td>
    <td>1</td>
  </tr>
  <tr>
    <td>impaired, ion channels</td>
    <td>1</td>
  </tr>
  <tr>
    <td>increase, placental insufficiency</td>
    <td>1</td>
  </tr>
  <tr>
    <td>increased MyD88 activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>increased adipogenesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>increased lipid accumulation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>increased mantel display</td>
    <td>1</td>
  </tr>
  <tr>
    <td>increased, Bax expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>induced spawning</td>
    <td>1</td>
  </tr>
  <tr>
    <td>inhibition, EKR1/2 signaling pathway</td>
    <td>1</td>
  </tr>
  <tr>
    <td>interruption, Ovulation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>irregularities, ovarian cycle</td>
    <td>1</td>
  </tr>
  <tr>
    <td>malformed, Male reproductive tract</td>
    <td>1</td>
  </tr>
  <tr>
    <td>modulation, Unknown</td>
    <td>1</td>
  </tr>
  <tr>
    <td>modulation, sodium channel</td>
    <td>1</td>
  </tr>
  <tr>
    <td>narcosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>prepubertal increase, Estrogen receptor (ER) activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>prolonged, Depolarization of neuronal membrane</td>
    <td>1</td>
  </tr>
  <tr>
    <td>prolonged, elevation of serun CCK</td>
    <td>1</td>
  </tr>
  <tr>
    <td>prostatic intraepithelial neoplasia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>reduced dimerization, ARNT/HIF1-alpha</td>
    <td>1</td>
  </tr>
  <tr>
    <td>reduction in ovarian granulosa cells, Aromatase (Cyp19a1)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>relaxation, smooth muscle</td>
    <td>1</td>
  </tr>
  <tr>
    <td>six1b expression, increased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>squamous metaplasia, aberrant basal cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>stabilization, PPAR alpha co-repressor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>systemic inflammation leading to hepatic steatosis</td>
    <td>1</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/relationshipsByCause.rq | sed 's+<lang/>+en+' > relationshipsByCause.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@relationshipsByCause.rq
```

This SPARQL query is available under CCZero.
