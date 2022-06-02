# relationshipsByOutcome.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX sbd:     <https://www.sbd4nano.eu/rdf/#>
PREFIX sbdbel:  <https://www.sbd4nano.eu/bel/#>
PREFIX dc:      <http://purl.org/dc/elements/1.1/>
PREFIX dcterms: <http://purl.org/dc/terms/>

SELECT ?outcome (COUNT(DISTINCT ?relation) AS ?count)
WHERE {
  ?relation a sbdbel:CausalAssertion ;
    sbdbel:outcome / rdfs:label ?outcome .
} GROUP BY ?outcome
  ORDER BY DESC(?count)
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0A%0ASELECT%20%3Foutcome%20%28COUNT%28DISTINCT%20%3Frelation%29%20AS%20%3Fcount%29%0AWHERE%20%7B%0A%20%20%3Frelation%20a%20sbdbel%3ACausalAssertion%20%3B%0A%20%20%20%20sbdbel%3Aoutcome%20%2F%20rdfs%3Alabel%20%3Foutcome%20.%0A%7D%20GROUP%20BY%20%3Foutcome%0A%20%20ORDER%20BY%20DESC%28%3Fcount%29%0A)


### Output

<table>
  <tr>
    <td><b>outcome</b></td>
    <td><b>count</b></td>
  </tr>
  <tr>
    <td>Increased Mortality</td>
    <td>12</td>
  </tr>
  <tr>
    <td>Decrease, Population trajectory</td>
    <td>12</td>
  </tr>
  <tr>
    <td>Cell injury/death</td>
    <td>10</td>
  </tr>
  <tr>
    <td>Impairment, Learning and memory</td>
    <td>9</td>
  </tr>
  <tr>
    <td>Apoptosis</td>
    <td>7</td>
  </tr>
  <tr>
    <td>Increase, Mutations</td>
    <td>7</td>
  </tr>
  <tr>
    <td>Increased, Liver Steatosis</td>
    <td>7</td>
  </tr>
  <tr>
    <td>impaired, Fertility</td>
    <td>7</td>
  </tr>
  <tr>
    <td>Decrease, Adenosine triphosphate pool</td>
    <td>7</td>
  </tr>
  <tr>
    <td>Accumulation, Fatty acid</td>
    <td>7</td>
  </tr>
  <tr>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td>6</td>
  </tr>
  <tr>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Reduction, 17beta-estradiol synthesis by ovarian granulosa cells</td>
    <td>6</td>
  </tr>
  <tr>
    <td>Increased, Oxidative Stress</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Altered, Amphibian metamorphosis</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Weakened, Colony</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Altered, Gene Expression</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Thyroid hormone synthesis, Decreased</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Increase, hepatocellular adenomas and carcinomas</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Decrease, Oogenesis</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Activated, gastric ulcer formation</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Increase, Mortality</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Increase, Apoptosis</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Decrease of synaptogenesis</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Occurrence, Kidney toxicity</td>
    <td>5</td>
  </tr>
  <tr>
    <td>Increase, Cell Proliferation (Epithelial Cells)</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Accumulation, Triglyceride</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Abnormal, Foraging activity and behavior</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Death/Failure, Colony</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Increase, cell proliferation (hepatocytes)</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Increase, Mucin production</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Activate, mucosal defense</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Synthesis, De Novo FA</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Reduced, mucosal defense</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Reduced, Swimming performance</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Increased, secretion of local growth factors</td>
    <td>4</td>
  </tr>
  <tr>
    <td>decreased dopamine</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Increase, Inflammation</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Up Regulation, SCD-1</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Up Regulation, CD36</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Accumulation, Collagen</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (renal tubular cell)</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Decrease in mitochondrial oxidative phosphorylation</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Decrease, androgen receptors (AR) activation</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Cognitive Function, Decreased </td>
    <td>4</td>
  </tr>
  <tr>
    <td>Neuroinflammation</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Respiratory distress/arrest</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Decrease, Growth</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Increase, Cell death</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Increase, lung cancer</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Decrease of neuronal network function</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Increased, De Novo FA synthesis</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Increase, Cell Proliferation</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Increased, predation</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Reduced, Reproductive Success</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Induction, Microvesicular fat</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Formation, Mallory body</td>
    <td>4</td>
  </tr>
  <tr>
    <td>Increased, Reactive oxygen species</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decreased, Reproductive Success</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increased, valve movement</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Depletion, energy reserves</td>
    <td>3</td>
  </tr>
  <tr>
    <td>induced spawning</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Induced parturition</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Reduction, Vitellogenin synthesis in liver</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decline, Population</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increase, predation</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Mitochondrial impairment</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Reproductive failure</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Activation, TGF-beta pathway</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Reduced, BDNF (Brain-derived neurotrophic factor)</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increased, seizure</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Inhibit, gastric ulcer formation</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Hippocampal gene expression, Altered </td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increased Respiratory irritability and Chronic Cough, </td>
    <td>3</td>
  </tr>
  <tr>
    <td>Locomotor activity, decreased</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>3</td>
  </tr>
  <tr>
    <td>Liver Cancer</td>
    <td>3</td>
  </tr>
  <tr>
    <td>obesity</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Reduced levels of BDNF</td>
    <td>3</td>
  </tr>
  <tr>
    <td>bioassay profile</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decreased, Triiodothyronine (T3) in serum</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Reduced, Posterior swim bladder inflation</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increased, Adenomas/carcinomas (mammary)</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increased, Chloride conductance</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Induction, Epithelial Mesenchymal Transition</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Pulmonary fibrosis</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decrease, Oxidative phosphorylation</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increased, secretion of proinflammatory and profibrotic mediators</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Unfolded Protein Response</td>
    <td>3</td>
  </tr>
  <tr>
    <td>N/A, Methemoglobinemia, decreased hemoglobin, hematocrit, red blood cell number</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Activation, Stellate cells</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Activation, Dendritic Cells</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decrease, Mitochondrial ATP production</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Tissue resident cell activation</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Liver Injury</td>
    <td>3</td>
  </tr>
  <tr>
    <td>N/A, Inadequate DNA repair</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decrease, dihydrotestosterone (DHT) level</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increase, DNA strand breaks</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increase, Chromosomal aberrations</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Inhibition, Nuclear factor kappa B (NF-kB)</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Reduction, Plasma 17beta-estradiol concentrations</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decreased, HSD17B10 expression</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increased, Differentiation to Testis </td>
    <td>3</td>
  </tr>
  <tr>
    <td>Altered, Thyroid hormone-dependent gene expression</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Impaired lung function</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Altered, Transcription of genes by AR</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Cholestasis, Pathology</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decreased,  plasma 11-ketotestosterone level</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Tumorigenesis, Hepatocellular carcinoma</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Reduction, Testosterone synthesis in Leydig cells</td>
    <td>3</td>
  </tr>
  <tr>
    <td>decrease, male anogenital distance</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increase, DNA double-strand break</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Overactivation, NMDARs</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increase, Reactive oxygen species production</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Activation, SREBF1</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increased, Triglyceride formation</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Inhibition, Mitochondrial fatty acid beta-oxidation</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Accumulation, Liver lipid</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decrease, Number of worker bees</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decreased, Glomerular filtration</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decreased, Renal plasma flow</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decreased, Sodium reabsorption</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Decreased, Renal ability to dilute urine</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (hepatocyte)</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Occurrence, Ballooning degeneration (hepatocyte)</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (Bile duct cell)</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (kupffer cell)</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Degeneration of dopaminergic neurons of the nigrostriatal pathway</td>
    <td>3</td>
  </tr>
  <tr>
    <td>Increased, blood uric acid concentration</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Occurrence, renal proximal tubular necrosis</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased, Triiodothyronine (T3) in tissues</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Hepatic thyroid hormone uptake/transport</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Reproductive Success</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, ER binding to T.F. to DNA (non-classical pathway)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Non-genomic signaling</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Ductal Hyperplasia </td>
    <td>2</td>
  </tr>
  <tr>
    <td>N/A, Breast Cancer</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, DNA damage</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Angiogenesis</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Altered, Ca2+-calmodulin activated signal transduction</td>
    <td>2</td>
  </tr>
  <tr>
    <td>increased mantel display</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Biliary excretion TH glucuronide</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease of Thyroidal iodide</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, cilia movement</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, foot detachment</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, muscular waves in foot</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, oocyte maturation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Lung fibrosis</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Perturbation of cholesterol</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Hepatotoxicity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, extracellular serotonin</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, intracellular sodium (Na+)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, intracellular chloride (Cl-)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased, neuroplasticity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activation, 5-HT2A (Serotonin 2A)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased, extracellular serotonin</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activated, membrane depolarization</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activate, GABA-A receptor</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, epilepsy</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Damaging, Mitochondria</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduction, Testosterone synthesis by ovarian theca cells</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Altered, Cardiovascular development/function</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Hippocampal anatomy, Altered </td>
    <td>2</td>
  </tr>
  <tr>
    <td>Hippocampal Physiology, Altered</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activation of specific nuclear receptors, PPAR-gamma activation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, surfactant</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Sexual behavior, decreased</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Hepatocytotoxicity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduced, GABA-A receptor activation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Release of G Proteins</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Analgesia</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Anti-depressant Activity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Foam cell formation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>increased adipogenesis</td>
    <td>2</td>
  </tr>
  <tr>
    <td>hyperpolarisation, neuron</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease of GABAergic interneurons</td>
    <td>2</td>
  </tr>
  <tr>
    <td>LDH release</td>
    <td>2</td>
  </tr>
  <tr>
    <td>toxicity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduced, Anterior swim bladder inflation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Inhibition, Feeding</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Thyroid-stimulating hormone (TSH)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Hyperplasia, ovarian stromal cells</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, E2 blood concentrations at hypothalamus</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, cholestasis</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, circulating estrogen levels</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Hyperplasia, Mammary gland</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, latency period</td>
    <td>2</td>
  </tr>
  <tr>
    <td>N/A, Hepatotoxicity, Hepatopathy, including a constellation of observable effects</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Dysfunction, Mitochondria </td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased Pro-inflammatory mediators</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, recruitment of inflammatory cells</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Loss of alveolar capillary membrane integrity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Cell cycle, disrupted</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Testicular atrophy</td>
    <td>2</td>
  </tr>
  <tr>
    <td>General Apoptosis</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Spermatocyte depletion</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, Cuticular chitin content</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Premature molting</td>
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
    <td>Decreased, survival</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Disturbance, Lysosomal function</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased, Ketogenesis (production of ketone bodies)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Collagen production, reduced</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Fibroproliferative airway lesions</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Inflamatory events in light-exposed tissues</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Oxidative DNA damage</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, testosterone synthesis/level</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase in reactive oxygen and nitrogen species (RONS)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Disruption, Lysosome</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Displacement, Serum thyroxine (T4) from carrier protein</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Encephalitis</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Feminisation or incomplete development, Primary and accessory male sex organs</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Alteration, Wnt pathway</td>
    <td>2</td>
  </tr>
  <tr>
    <td>N/A, Neurodegeneration</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, Free serum thyroxine (T4)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Peptide Oxidation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduction, Plasma vitellogenin concentrations</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Damaging, Red blood cells; hemolysis</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Heritable mutations in offspring</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduction, Cholesterol transport in mitochondria</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduction, Cumulative fecundity and spawning</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Activation, JNK</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase in inflammation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Dysregulation of heart rate and vascular tone</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Impaired coordination and movement</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Caspase transcription</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, Oogenesis (F3)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Latent Transforming growth Factor beta expression</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Apoptotic cell death</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (urothelial cells)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased, cholesterol</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, Digestion of old cuticle</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, FA Influx</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Alterations, Cellular proliferation / hyperplasia</td>
    <td>2</td>
  </tr>
  <tr>
    <td>KE6 : Depletion, Nitric Oxide</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Early Life Stage Mortality</td>
    <td>2</td>
  </tr>
  <tr>
    <td>impaired, Hive thermoregulation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased, locomotion</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Impairment, Endothelial network</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased Cholinergic Signaling</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased, Thyroxine (T4) in serum</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased, Sodium conductance 1</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Altered, Chromosome number</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Preneoplastic foci (hepatocytes)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Formation, Hepatocellular and Bile duct tumors</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Occurrence, Transdifferentiation of ciliated epithelial cells</td>
    <td>2</td>
  </tr>
  <tr>
    <td>KE4 : Uncoupling, eNOS</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decreased, Mitochondrial fatty acid beta-oxidation</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Clonal Expansion/Cell Proliferation, to form Altered Hepatic Foci (AHF)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Abnormal, Roll change within caste</td>
    <td>2</td>
  </tr>
  <tr>
    <td>impaired, Larval development</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduced, survival</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Inhibition, Fin regeneration</td>
    <td>2</td>
  </tr>
  <tr>
    <td>increase, retained nipples in males</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, Lipid storage</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Release, Cytokine</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduced, Prostaglandin F2alpha concentration, plasma </td>
    <td>2</td>
  </tr>
  <tr>
    <td>Reduced, Ability to attract spawning mates</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (tubular epithelial cells)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Adenomas/carcinomas (renal tubular)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (Leydig cells)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Decrease, Serum thyroid hormone (T4/T3)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Papillomas/carcinomas (squamous cells)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, HIF-1 heterodimer</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (Renal tubule)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Occurrence, Cystic dilatation (renal tubule)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (podocyte)</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Formation, Liver fibrosis</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Site of Contact Nasal Tumors</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increase, Cancer</td>
    <td>2</td>
  </tr>
  <tr>
    <td>Increased, blood potassium concentration</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Occurrence, tophi (urate) deposition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Prostaglandin F2alpha concentration, plasma </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Occurrence, renal ischemia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Occurrence, cardiac arrhythmia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Under carboxylated clotting factors will not assemble on cell surfaces to form clot, Failure of secondary hemostasis  </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Failure in vascular repair mechanisms, Unresolved blood loss (hemorrhage)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Failure in gamma-glutamyl carboxylation of  clotting factors II, VII, IX and X, Under carboxylation of clotting factors (e.g., des-gamma-carboxy prothrombin) </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Blood loss and development of anemia, Impaired oxygen delivery and nutrient delivery to tissue, impaired carbon dioxide and waste product removal</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Hemostasis, Depletion from blood of fully functional carboxylated clotting factors</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced fitness or even mortality, Acidosis, hypovolemic shock and organ dysfunction</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Impaired recruitment , Population trajectory</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, water retention in foot</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Triiodothyronine (T3) in tissues</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Population</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Clonal Expansion of Altered Hepatic Foci</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, sodium conductance 2</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, GABA release</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Apoptosis (Epithelial Cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, ER binding to DNA (classical pathway) </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Proliferation (Endothelial cells) </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Invasion</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, Doublesex1 gene</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Male offspring</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, Male reproductive tract</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered gene expression specific to CAR activation, Hepatocytes</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Opening of calcium channel, Calcium influx</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Trigeminal nerve activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered, Protein Production</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Motility</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Second Messenger Production</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Lung function</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Chronic, Mucus hypersecretion</td>
    <td>1</td>
  </tr>
  <tr>
    <td>N/A, Reproductive failure</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, Upregulation of glucuronyltransferase activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Insufficiency, Vascular</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Vitellogenin synthesis in liver</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered, Reproductive behaviour</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Impaired development of, Reproductive organs</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Glucocorticoid Receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Infant leukaemia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Necrosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Nuclear receptor E75b gene expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Fushi tarazu factor-1 gene expression</td>
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
    <td>Increase, COX-2 expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation of TGF-β signaling</td>
    <td>1</td>
  </tr>
  <tr>
    <td>ROS formation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Oxidative Stress / Activation, PMK-1 P38 MAPK</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, HIF-1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, DNA Damage-Repair</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Up Regulation, Unsaturated fatty acid</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Glutathione synthesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, 3-hydroxy-3-methylglutaryl-CoA reductase gene</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Glutathione homeostasis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, FOXO</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Wnt pathway</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Defect of Embryogenesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, extracellular sodium (Na+) </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, extracellular chloride (Cl-)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, intracellular serotonin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, packaged serotonin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, synaptic release</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, 5-HT3 (5-hydroxytryptamine)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inactivated, 5-HTR (serotonin receptors)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduce expression, BDNF (Brain-derived neurotrophic factor)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activate, PLC (Phospholipase C)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, inositol triphosphate</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, intracellular calcium</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activate, calmodulin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, myosin light chain phosphorylation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, vascular smooth muscle contraction</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, hypertension</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, agitation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, depression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, seizure</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, glutamate</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activated, NMDA receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activated, voltage-gated sodium channel</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibit, voltage-gated sodium channel</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inactive, membrane depolarization</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, GABA</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, hippocampal hyperdepolarization</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, bicarbonate </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, mucous</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, mucosal blood flow</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, platelet aggregation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, angiogenesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, leukocyte adherence</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activate, leukocyte </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Ca and HCO3 transport to shell gland</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Circulating ecdysis triggering hormone</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Abdominal muscle contraction</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Suppression, IL-2 and IL-4 production</td>
    <td>1</td>
  </tr>
  <tr>
    <td>SP (Substance P) release, Local increase of SP</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, ammonium (NH4+)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>7α-hydroxypregnenolone synthesis in the brain, decreased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Dopamine release in the brain, decreased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, persistent proliferation/sustained proliferation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, intracellular serotonin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, packaged serotonin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, synaptic release</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, 5-HT3</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, platelet aggregation</td>
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
    <td>Decreased, bicarbonate</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, angiogenesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, leukocyte adherence</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, leukocyte activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, GABA</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, intracellular chloride</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, steatosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, FXR activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, SHP activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activated, LXR</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, PPARalpha</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, HSD17B4 activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, fatty acid beta oxidation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Opening of G protein gated inward rectifying K channels</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition of N-type Ca ion channels</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition of neurotransmitter vesicle release</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased CGRP, neuronal release of CGRP</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Irritation of nasal mucosa inducing sneeze reflex</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased neurokinin A (NKA) by neuronal cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased production of pulmonary, pro-inflammatory cytokines</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased production of pulmonary SAA</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Formation of HDL-SAA</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased systemic total cholesterol pool</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Plaque progression in arteries</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Follicular atresia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, Sustained Hepatotoxicity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Promotion, Hepatocelluar carcinoma</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Population trajectory</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, 3-hydroxyacyl-CoA dehydrogenase type-2 activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Interference, nuclear localization of NFAT</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Impairment, T-cell dependent antibody response</td>
    <td>1</td>
  </tr>
  <tr>
    <td>log 1/EC50</td>
    <td>1</td>
  </tr>
  <tr>
    <td>oxditation state</td>
    <td>1</td>
  </tr>
  <tr>
    <td>zeta potential</td>
    <td>1</td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Acetylcholine accumulation in synapses</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Developmental Defects</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Inhibitory postsynaptic potential</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, Somatic muscle paralysis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, pharyngeal muscle paralysis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, T4/T3 catabolism</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, serum T4/T3</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Hypertrophy and proliferation (follicular cell)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Hyperplasia (follicular cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased Apoptosis, Adenomas/carcinomas (follicular cell)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, adipogenesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, proliferation of mesenchymal cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, IGF-1 (mouse)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Firbrosarcoma</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, liposarcoma</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, hemagiosarcoma</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased activity, beta-2 adrenergic receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>relaxation, smooth muscle</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Proliferation/Clonal Expansion, smooth muscle</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Hypertrophy/hyperplasia, smooth muscle</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Promotion, mesovarian leiomyomas</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, secretion of GnRH from hypothalamus</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, secrection of FSH from anterior pituitary</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, secretion of LH from anterior pituitary</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Hyperplasia, ovarian epithelium</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Promotion, ovarian adenomas</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Promotion, ovarian granular cell tumors</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, bile flow</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Alteration, lipid metabolism</td>
    <td>1</td>
  </tr>
  <tr>
    <td>prolonged, elevation of serun CCK</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Cellular proliferation / hyperplasia of acinar cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Pancreatic acinar tumors</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, estrogen receptor alpha</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Promotion, SIX-1 postive basal-type progenitor cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Proliferation/Clonal Expansion, aberrant basal cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>squamous metaplasia, aberrant basal cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Hyperplasia (glandular epithelial cells of endometrium)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, adenosquamous carcinomas of endometrium</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, LH Surge from anterior pituitary</td>
    <td>1</td>
  </tr>
  <tr>
    <td>interruption, Ovulation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>prolonged, estrus</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, prolactin exposure</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, lactotroph hyperplasia and hypertrophy</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, adenomas (pituitary)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, prolactin secretion</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, hyperplasia (mammary gland)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, inflammation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Cell Proliferation (mesothelium)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, mesotheliomas</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, PPARalpha transactivation of gene expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, NFAT/AP-1 complex formation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, FAS</td>
    <td>1</td>
  </tr>
  <tr>
    <td> MLL chromosomal translocation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, cytosolic fatty acid</td>
    <td>1</td>
  </tr>
  <tr>
    <td>decreased reward</td>
    <td>1</td>
  </tr>
  <tr>
    <td>decreased DNA methylation of tyrosine hydroxylase</td>
    <td>1</td>
  </tr>
  <tr>
    <td>decreased methylation of dopamine transporter promoter</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Differentiation of fibroblasts</td>
    <td>1</td>
  </tr>
  <tr>
    <td>DNA double-strand break </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition of lysyl oxidase</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction of collagen crosslinking</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Weak collagen matrix</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Notochord distortion or malformations</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Growth, reduction</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Transforming Growth Factor beta pathway</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Inducible Nitric Oxide Synthase by Metabolite CGA 265307</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Chloroplast ATP production</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Chlorophyll synthesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Light harvest capacity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Photosynthesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Glycolysis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Leaf development</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Depletion, mtDNA </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Glutamate dyshomeostasis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>N/A, Steatohepatisis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Oncotic Necrosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, activation of T (T) helper (h) type 2 cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, fibroblast proliferation and myofibroblast differentiation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, extracellular matrix deposition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Histone acetylation, increase</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Protein Adduct Formation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Oxidative Stress in Brain</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Lipid Peroxidation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Neurodegeneration</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Opening of voltage-dependent calcium channel</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Cell membrane depolarization</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Fatty Acid Beta Oxidation, Decreased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Calcium currents</td>
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
    <td>Heart failure </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Disruption, Intracellular calcium mobilization</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Disruption, Sarcomere assembly</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased protection against oxidative stress</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, SCD-1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Allergic Respiratory Hypersensitivity Response</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, ChREBP</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Trigeminal and/or vagal nerve excitation causes Airway Hyper-responsiveness,Cough, Dyspnea</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Collagen Deposition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Leukocyte recruitment/activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Mitochondrial complex III antagonism</td>
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
    <td>Neural crest cell migration, reduced</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Facial cartilage structures are reduced in size and morphologically distorted</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered differentiation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Neural tube defects</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased Na/K ATPase activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased proximal tubular vectorial transport</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Chemical induced Fanconi syndrome</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, proinflammatory mediators (TNFalpha)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Disturbance in microtubule dynamic instability</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Impaired axonial transport</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Sensory axonal peripheral neuropathy</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Proteasomal dysfunction</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Airway epithelial injury</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Bronchiolitis obliterans</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Oxidation of membrane lipids</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Oxidation/denatuation of membrane proteins</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Muscarinic Acetylcholine Receptors</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Accumulation of misfolded proteins</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation of hepatic stellate cells</td>
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
    <td>Impaired inguinoscrotal testicular descent phase</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Malformation, cryptorchidism - maldescended testis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Occurrence, Focal Seizure</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction of L-Dopaquinone</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction in melanin level</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction of melanosome level</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction fo Pigmentation pattern </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased optical elements of the eye </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased retinoic acid (RA) synthesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased plasma RA level</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased visual impairment</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Treatment-resistant gastric cancer</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased Homocysteine level </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, SREBP-1c</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Up Regulation, CYP1A1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>N/A, Gap</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Gonadotropins, circulating concentrations</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Suppression, Inflammatory cytokines</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Liver and splenic hemosiderosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induced Toll Like Receptor (TLR) Dysregulation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation/Proliferation, T-cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Intracellular Calcium overload</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Formation, Formation of hemoglobin adducts</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Down Regulation, Gulcose-6-phosphate dehydrogenase</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Cortisol and 11β-(OH) testosterone decreased</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased plasma Cortisol level</td>
    <td>1</td>
  </tr>
  <tr>
    <td>decreased oocyte maturation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Thrombosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Coronaviral replication / RNA genome transcription</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Nitric Oxide</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered regulation, Alpha hemoglobin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Propagation, Oxidative stress</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Plasma vitellogenin concentrations</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, RBC congestion in liver</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Renal pathology due to VTG deposition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Steroidogenic acute regulatory protein (STAR)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, Sustained Cell Proliferation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation of specific nuclear receptors, Transcriptional change</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Translocator protein (TSPO)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Vitellogenin accumulation into oocytes and oocyte growth/development</td>
    <td>1</td>
  </tr>
  <tr>
    <td>N/A, Impairment of reproductive capacity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered, Larval development</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Formation, Liver tumor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Oxidative damage</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Formation, Pro-mutagenic DNA Adducts</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Suppression, Immune system</td>
    <td>1</td>
  </tr>
  <tr>
    <td>irregularities, ovarian cycle</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Luteinizing hormone (LH) </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Hyperplasia, Leydig cell</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase proliferation, Leydig cell </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, testosterone level</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Proliferation, Cell proliferation in the absence of cytotoxicity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Mitochondrial Fatty Acid Beta Oxidation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Fatty acid beta-oxidation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Reactive oxygen species</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Inflammatory cytokines, chemokines, cytoprotective gene pathways</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Epithelial-mesenchymal transition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Suppression of  T cell activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Sustained tissue damage / macrophage activation/ porcupine-induced Wnt secretion</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Long-term potentiation (LTP)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>reduction, testosterone levels </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase plasma Ang II</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, the risk of acute respiratory failure</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased AngII</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Impaired, Spermatogenesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Urothelial Tumor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Protein oxidation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Abnormal osmoregulation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Body fluid overload</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Mitochondrial membrane potential</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Oocyte apoptosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Ovarian somatic cell apoptosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Ovarian follicle breakdown</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Heritable DNA methylation (F3)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Caspase transcription (F3)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Oocyte apoptosis (F3)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Fecundity (F3)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Ovarian somatic cell apoptosis (F3)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Ovarian follicle breakdown (F3)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Male Biased Sex Ratio</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased spermatogenesis </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation of ER stress</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Mitochondrial dysfunction</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Immune cell activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>IFNγ signaling</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Cell proliferation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Fatty acid β-oxidation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Global DNA methylation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Calcium influx</td>
    <td>1</td>
  </tr>
  <tr>
    <td>stabilization, PPAR alpha co-repressor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Neuronal synaptic inhibition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Abnormal, Role change within caste</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Phenotypic enzyme activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Circulating crustacean cardioactive peptide</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Lipid peroxidation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Leaf cell mitosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased reactive oxygen species (in the mitochondria)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Necrotic Tissue</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Caspase 8 pathway</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Tissue resident cells (Kuppfer cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>KE1 : S-Glutathionylation, eNOS</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Alteration, Food-web structures</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Lung cancer</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Progesterone synthesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Plasma progesterone concentration </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, progesterone uptake, decresed maturation </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Impaired ovulation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease of egg production and cummulative fecundity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, hypermethylation of the promotor region of gonadotropin releasing hormone receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, expression of gonadotropin releasing hormone receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>N/A, Cyanosis occurs</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Repressed expression of steroidogenic enzymes </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased apoptosis, decreased number of adult Leydig Cells </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased sperm quantity or quality in the adult, Decreased fertility </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, histaminergic neuron excitation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decline, Population trajectory</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Accumulation, Highly carboxylated porphyrins</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Incomplete ecdysis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, FA Influx</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, IKB inhibitory protein</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Lymphocytes</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Downregulation, ACE2</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Granulosa cell proliferation of gonadotropin-independent follicles, Reduced</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Coagulation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Dysregulation, ACE2 of expression and activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, NMDARs</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Bile accumulation, Pathological condition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, PCK1 expression (control point for glycolysis/gluconeogenesis pathway)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Prostaglandin E2 concentration</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Angiogenesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Thyroxine (T4) in neuronal tissue, Decreased </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Aberrant, Dendritic morphology</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Presynaptic release of glutamate</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Suppression, VLDL secretion</td>
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
    <td>Inhibition, PPAR alpha</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Up Regulation, Acetyl-CoA carboxylase-1 (ACC-1)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Ca++ (intracellular)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Neuronal network function in adult brain</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, serotonin (5-HT) </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Prostaglandin F2alpha synthesis, ovary  </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Prostaglandin F2alpha synthesis, ovary  </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Generation, Amplified excitatory postsynaptic potential (EPSP)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Prostaglandins, ovary</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Prostaglandin E2 concentration, hypothalamus</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (forestomach epithelial cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Incorporation of active iodide into iodotyrosines</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Serum creatinine</td>
    <td>1</td>
  </tr>
  <tr>
    <td>sensitisation, skin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, CYP1A2/CYP1A5</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Changes/Inhibition, Cellular Homeostasis and Apoptosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, NADH-ubiquinone oxidoreductase  (complex I)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Apoptosis of ciliated epithelial cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Occurrence, Metaplasia of goblet cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Proliferation of goblet cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Sp1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>KE3 : Decrease, Tetrahydrobiopterin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>dimerization, AHR/ARNT</td>
    <td>1</td>
  </tr>
  <tr>
    <td>reduced dimerization, ARNT/HIF1-alpha</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Clearance of thyroxine from serum</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Eggshell thickness</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, LXR</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Desensitization, Nicotinic acetylcholine receptor</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Neuronal synaptic inhibition</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Disruption, Mitochondrial electron transport chain</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, PPARα</td>
    <td>1</td>
  </tr>
  <tr>
    <td>peroxisome proliferator activated receptor promoter demethylation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Malformation, Male reproductive tract</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Induced Mutations in Critical Genes</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Atrioventricular block and bradycardia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, LDL uptake</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, FoxA2</td>
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
    <td>Decreased, Ketogenesis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, NR1H4</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, SHP</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, LXR alpha</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, AKT2</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Insufficient repair or mis-repair of pro-mutagenic DNA adducts</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Food storage</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Brood care</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Accumulation, Damaged mitochondrial DNA</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Accelerated, Aging</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Appetite and hunger</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Viral susceptibility</td>
    <td>1</td>
  </tr>
  <tr>
    <td>impaired, Development</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Hydrogen peroxide production</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Antiseptic incorporated in food</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, swimming speed</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, feeding 1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>N/A, hypoxia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, amputations</td>
    <td>1</td>
  </tr>
  <tr>
    <td>prolonged, Depolarization of neuronal membrane</td>
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
    <td>Increased, Ataxia, paralysis, or hyperactivity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Occurrence, Epileptic seizure</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, locomotion</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, anxiety</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, sheltering</td>
    <td>1</td>
  </tr>
  <tr>
    <td>N/A, sedation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, Ionotropic GABA receptor chloride channel conductance</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Overwhelmed, Mitochondrial DNA repair mechanisms</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Plasma HCY level</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induced, dysfunction of microcirculation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Impaired,anterior-posterior axis development</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, DNA damage and mutation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Alveolar collapse</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced tidal volume </td>
    <td>1</td>
  </tr>
  <tr>
    <td>decrease, transcription of genes by AR </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, DNA methyltransferase expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, IL-23 from matured dendritic cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Th17 cell migration and inflammation induction</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Psoriatic skin disease</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction of GATA3 expression</td>
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
    <td>Exacerbation of systemic lupus erythematosus (SLE)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Blockade of STAT5 phosphorylation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Suppression of STAT5 binding to cytokine gene promoters</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Suppression of IL-4 production</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Impairment of T-cell dependent antibody response</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased intestinal monitor peptide level</td>
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
    <td>Acinar cell proliferation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Pancreatic acinar cell tumors</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased viral entry and gene expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased inflammatory immune responses</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Proliferation/ beta-catenin activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduce, Sperm count</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Cripto-1 expression</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, Activin signaling</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Urothelial cell injury/death</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Neutral lipids</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Global DNA methylation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Status epilepticus</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduction, 17beta-estradiol synthesis by the undifferentiated gonad </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activator protein 1 activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Pin-1 activation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Immune mediated hepatitis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Oxygen consumption</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Thyroxine (T4) in serum</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Acyl-CoA dehydrogenases</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered, Neurophysiology</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Displacement, Serum thyroxine (T4) from transthyretin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Increased susceptibility to infection</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Hyperplasia, Hyperplasia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered, Meiotic chromosome dynamics</td>
    <td>1</td>
  </tr>
  <tr>
    <td>N/A, Unknown</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Ovulation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Occurrence, A paroxysmal depolarizing shift</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Spawning behavior</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Pheromone release</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Gonadotropin releasing hormone, hypothalamus</td>
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
    <td>Reduced, Maturation inducing steroid receptor signalling, oocyte</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, cyclic adenosine monophosphate</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Reduced, Meiotic prophase I/metaphase I transition, oocyte</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Upregulated, Spindle assembly checkpoint protein Mad2-oocyte</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Chromosome misseggregation</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Altered, Action Potential</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, cardiac arrthymia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Accumulation of alpha2u microglobulin (proximal tubular epithelium)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Disruption, Microtubule dynamics</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Disorganization, Spindle</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Induction of pyruvate dehydrogenase (PDH)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Aneuploid offspring</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Necrosis (terminal bronchiolar cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (terminal bronchiolar epithelial cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (terminal bronchiolar cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Adenomas/carcinomas (bronchioloalveolar)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Hypertrophy and proliferation (follicular cell)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (follicular cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Adenomas/carcinomas (follicular cell)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Testosterone binding to androgen receptor (hypothalamus)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Leydig cell tumors</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Prolactin</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Estrogen receptor (ER) activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Progesterone from corpus luteum</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Thyroid-stimulating hormone (TSH)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Luteinizing hormone (LH) </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Kidney Failure</td>
    <td>1</td>
  </tr>
  <tr>
    <td>N/A, Ataxia, paralysis, or hyperactivity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, population 1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (renal tubular cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Oxidative metabolism</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (glandular epithelial cells of endometrium)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Endometrial adenocarcinomas</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Plasma tyrosine</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (corneal cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Inflammation (corneal cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (corneal cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (forestomach epithelial cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (tubular epithelial cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (hepatocytes)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Leutinizing hormone (LH)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Bioactivation of testosterone</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (urothelial cells)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (urothelial)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Adenomas/carcinomas (urothelial)</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Aromatase (Cyp19a1) mRNA</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, HIF-1 alpha transcription</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, mevalonate</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Testosterone</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Induction, Liver “Dysfunctional” Changes by CGA 330050</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Activation, Keratinocytes</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Occurrence, Hyperplasia of goblet cells</td>
    <td>1</td>
  </tr>
  <tr>
    <td>KE2 : Decrease, GTPCH-1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>reduced production, VEGF</td>
    <td>1</td>
  </tr>
  <tr>
    <td>KE5 : Decrease, AKT/eNOS activity</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Production, Reactive oxygen species</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decrease, Fertility</td>
    <td>1</td>
  </tr>
  <tr>
    <td>N/A, Liver fibrosis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Uroporphyria</td>
    <td>1</td>
  </tr>
  <tr>
    <td>malformed, Male reproductive tract</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Damage, Lipid bilayer</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Injury, Mitochondria</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Oxidation, Uroporphyrinogen</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, UROD</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Not Increased, Circulating Ketone Bodies</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increased, Catabolism of Muscle Protein</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Decreased, Body Weight</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Tissue Degeneration, Necrosis & Atrophy </td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Respiratory or Squamous Metaplasia</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Increase, Mutations in Critical Genes</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Inhibition, SREBP1c</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Impaired, Proteostasis</td>
    <td>1</td>
  </tr>
  <tr>
    <td>Parkinsonian motor deficits</td>
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
    <td>Hypertension</td>
    <td>1</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/relationshipsByOutcome.rq | sed 's+<lang/>+en+' > relationshipsByOutcome.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@relationshipsByOutcome.rq
```

This SPARQL query is available under CCZero.
