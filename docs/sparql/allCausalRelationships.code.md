# allCausalRelationships.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX sbd:     <https://www.sbd4nano.eu/rdf/#>
PREFIX sbdbel:  <https://www.sbd4nano.eu/bel/#>
PREFIX dc:      <http://purl.org/dc/elements/1.1/>
PREFIX dcterms: <http://purl.org/dc/terms/>

SELECT DISTINCT ?cause ?type ?outcome ?material ?evidence
WHERE {
  VALUES ?ca { sbdbel:CausalAssertion sbd:CausalAssertion }
  ?relation a ?ca ; sbdbel:relationship ?type .
  OPTIONAL { ?relation sbdbel:cause / rdfs:label ?cause . }
  OPTIONAL { ?relation sbdbel:outcome / rdfs:label ?outcome . }
  OPTIONAL { ?relation sbdbel:NP / rdfs:label ?material . }
  OPTIONAL { ?relation sbdbel:evidence ?evidence . }
} ORDER BY DESC(?relation)
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0A%0ASELECT%20DISTINCT%20%3Fcause%20%3Ftype%20%3Foutcome%20%3Fmaterial%20%3Fevidence%0AWHERE%20%7B%0A%20%20VALUES%20%3Fca%20%7B%20sbdbel%3ACausalAssertion%20sbd%3ACausalAssertion%20%7D%0A%20%20%3Frelation%20a%20%3Fca%20%3B%20sbdbel%3Arelationship%20%3Ftype%20.%0A%20%20OPTIONAL%20%7B%20%3Frelation%20sbdbel%3Acause%20%2F%20rdfs%3Alabel%20%3Fcause%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Frelation%20sbdbel%3Aoutcome%20%2F%20rdfs%3Alabel%20%3Foutcome%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Frelation%20sbdbel%3ANP%20%2F%20rdfs%3Alabel%20%3Fmaterial%20.%20%7D%0A%20%20OPTIONAL%20%7B%20%3Frelation%20sbdbel%3Aevidence%20%3Fevidence%20.%20%7D%0A%7D%20ORDER%20BY%20DESC%28%3Frelation%29%0A)


### Output

<table>
  <tr>
    <td><b>cause</b></td>
    <td><b>type</b></td>
    <td><b>outcome</b></td>
    <td><b>material</b></td>
    <td><b>evidence</b></td>
  </tr>
  <tr>
    <td>Alterations, Cellular proliferation / hyperplasia</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Formation, Hepatocellular and Bile duct tumors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Hepatotoxicity, Hepatopathy, including a constellation of observable effects</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Alterations, Cellular proliferation / hyperplasia</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Changes/Inhibition, Cellular Homeostasis and Apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Hepatotoxicity, Hepatopathy, including a constellation of observable effects</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Disruption, Lysosome</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Peptide Oxidation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>KE5 : Decrease, AKT/eNOS activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>KE5 : Decrease, AKT/eNOS activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>KE6 : Depletion, Nitric Oxide</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, EGFR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mucin production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Early Life Stage Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>KE8 : Increase, Vascular Resistance</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hypertension</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>KE7 : Impaired, Vasodilation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>KE8 : Increase, Vascular Resistance</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Peptide Oxidation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>KE2 : Decrease, GTPCH-1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impairment, Endothelial network</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Cardiovascular development/function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>reduced production, VEGF</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment, Endothelial network</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>reduced dimerization, ARNT/HIF1-alpha</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>reduced production, VEGF</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>dimerization, AHR/ARNT</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>reduced dimerization, ARNT/HIF1-alpha</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>dimerization, AHR/ARNT</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>KE6 : Depletion, Nitric Oxide</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>KE7 : Impaired, Vasodilation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>KE4 : Uncoupling, eNOS</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>KE6 : Depletion, Nitric Oxide</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>KE1 : S-Glutathionylation, eNOS</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>KE4 : Uncoupling, eNOS</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>KE3 : Decrease, Tetrahydrobiopterin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>KE4 : Uncoupling, eNOS</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>KE2 : Decrease, GTPCH-1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>KE3 : Decrease, Tetrahydrobiopterin</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Cyclooxygenase activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Prostaglandin E2 concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Cumulative fecundity and spawning</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Population growth rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, NADH-ubiquinone oxidoreductase  (complex I)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding of inhibitor, NADH-ubiquinone oxidoreductase (complex I)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, NADH-ubiquinone oxidoreductase  (complex I)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Peptide Oxidation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cholestasis, Pathology</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Bile accumulation, Pathological condition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Production, Reactive oxygen species</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Production, Critical Metabolites (CGA 330050 and CGA 265307)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, Liver “Dysfunctional” Changes by CGA 330050</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Inflammation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cholestasis, Pathology</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Bile accumulation, Pathological condition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Release, Cytokine</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Bile Salt Export Pump (ABCB11)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Bile accumulation, Pathological condition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding of agonist, Ionotropic glutamate receptors</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Overactivation, NMDARs</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Degeneration of dopaminergic neurons of the nigrostriatal pathway</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Parkinsonian motor deficits</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Degeneration of dopaminergic neurons of the nigrostriatal pathway</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Degeneration of dopaminergic neurons of the nigrostriatal pathway</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Neuroinflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Neuroinflammation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Degeneration of dopaminergic neurons of the nigrostriatal pathway</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impaired, Proteostasis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Degeneration of dopaminergic neurons of the nigrostriatal pathway</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impaired, Proteostasis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Alkylation, DNA</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cancer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, 3-hydroxyacyl-CoA dehydrogenase type-2 activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Mitochondrial fatty acid beta-oxidation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Mutations</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cancer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, SHP</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, SREBP1c</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cell Proliferation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Site of Contact Nasal Tumors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Mutations in Critical Genes</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Site of Contact Nasal Tumors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cell Proliferation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mutations in Critical Genes</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Respiratory or Squamous Metaplasia</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell Proliferation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Tissue Degeneration, Necrosis & Atrophy </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Respiratory or Squamous Metaplasia</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Tissue Degeneration, Necrosis & Atrophy </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Intracellular pH</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Catabolism of Muscle Protein</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Body Weight</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Not Increased, Circulating Ketone Bodies</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Catabolism of Muscle Protein</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Ketogenesis (production of ketone bodies)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Not Increased, Circulating Ketone Bodies</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, PPARalpha transactivation of gene expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Ketogenesis (production of ketone bodies)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Long term AHR receptor driven direct and indirect gene expression changes</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Formation, Hepatocellular and Bile duct tumors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Long term AHR receptor driven direct and indirect gene expression changes</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Alterations, Cellular proliferation / hyperplasia</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Long term AHR receptor driven direct and indirect gene expression changes</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Changes/Inhibition, Cellular Homeostasis and Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease of Thyroidal iodide</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Thyroid hormone synthesis, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease of GABAergic interneurons</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of synaptogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced levels of BDNF</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of GABAergic interneurons</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, CYP1A2/CYP1A5</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, CYP1A2/CYP1A5</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Oxidation, Uroporphyrinogen</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Accumulation, Highly carboxylated porphyrins</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Uroporphyria</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidation, Uroporphyrinogen</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, UROD</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Formation, Mallory body</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Formation, Liver fibrosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, Microvesicular fat</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Formation, Liver fibrosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (kupffer cell)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Formation, Mallory body</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (kupffer cell)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, Microvesicular fat</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (Bile duct cell)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Formation, Mallory body</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (Bile duct cell)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, Microvesicular fat</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Ballooning degeneration (hepatocyte)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Formation, Mallory body</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Ballooning degeneration (hepatocyte)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, Microvesicular fat</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (hepatocyte)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Formation, Mallory body</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (hepatocyte)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, Microvesicular fat</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Injury, Mitochondria</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Cytoplasmic vacuolization (kupffer cell)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Injury, Mitochondria</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Cytoplasmic vacuolization (Bile duct cell)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Injury, Mitochondria</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Ballooning degeneration (hepatocyte)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Injury, Mitochondria</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Cytoplasmic vacuolization (hepatocyte)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Disturbance, Lysosomal function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Cytoplasmic vacuolization (kupffer cell)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Disturbance, Lysosomal function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Cytoplasmic vacuolization (Bile duct cell)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Disturbance, Lysosomal function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Ballooning degeneration (hepatocyte)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Disturbance, Lysosomal function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Cytoplasmic vacuolization (hepatocyte)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Damage, Lipid bilayer</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Cytoplasmic vacuolization (kupffer cell)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Damage, Lipid bilayer</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Cytoplasmic vacuolization (Bile duct cell)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Damage, Lipid bilayer</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Ballooning degeneration (hepatocyte)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Damage, Lipid bilayer</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Cytoplasmic vacuolization (hepatocyte)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Phospholipase A</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Injury, Mitochondria</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Phospholipase A</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Disturbance, Lysosomal function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Phospholipase A</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Damage, Lipid bilayer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation/Proliferation, T-cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>sensitisation, skin</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Keratinocytes</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, Dendritic Cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Covalent Binding, Protein</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, Keratinocytes</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Renal ability to dilute urine</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Kidney toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Sodium reabsorption</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Kidney toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Renal plasma flow</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Kidney toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Glomerular filtration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Kidney toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (podocyte)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Renal ability to dilute urine</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (podocyte)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Sodium reabsorption</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (podocyte)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Renal plasma flow</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (podocyte)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Glomerular filtration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cystic dilatation (renal tubule)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Renal ability to dilute urine</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cystic dilatation (renal tubule)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Sodium reabsorption</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cystic dilatation (renal tubule)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Renal plasma flow</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cystic dilatation (renal tubule)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Glomerular filtration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (Renal tubule)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Renal ability to dilute urine</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Accumulation, Collagen</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Liver fibrosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (Renal tubule)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Sodium reabsorption</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (Renal tubule)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Renal plasma flow</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Cytoplasmic vacuolization (Renal tubule)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Glomerular filtration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Serum creatinine</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Cytoplasmic vacuolization (podocyte)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Serum creatinine</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Cystic dilatation (renal tubule)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Serum creatinine</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Cytoplasmic vacuolization (Renal tubule)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Thyroid hormone synthesis, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Serum creatinine</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>malformed, Male reproductive tract</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Fertility</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Testosterone</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>malformed, Male reproductive tract</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, cholesterol</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Testosterone</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, mevalonate</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, cholesterol</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, HMG-CoA reductase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, mevalonate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, HIF-1 alpha transcription</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, HIF-1 heterodimer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>modulation, Unknown</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, HIF-1 alpha transcription</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Aromatase (Cyp19a1) mRNA</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, 17beta-estradiol synthesis by ovarian granulosa cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, HIF-1 heterodimer</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Aromatase (Cyp19a1) mRNA</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Prolyl hydroxylases</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, HIF-1 heterodimer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (urothelial)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Adenomas/carcinomas (urothelial)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (urothelial cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Hyperplasia (urothelial)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (urothelial cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Regenerative cell proliferation (urothelial cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Urinary bladder calculi</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cytotoxicity (urothelial cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Leutinizing hormone (LH)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Hyperplasia (Leydig cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Bioactivation of testosterone</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Leutinizing hormone (LH)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, 5α-reductase activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Bioactivation of testosterone</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (hepatocytes)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Preneoplastic foci (hepatocytes)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (hepatocytes)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Regenerative cell proliferation (hepatocytes)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Androgen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, cell proliferation (hepatocytes)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (tubular epithelial cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Adenomas/carcinomas (renal tubular)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (tubular epithelial cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Hyperplasia (tubular epithelial cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (tubular epithelial cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Regenerative cell proliferation (tubular epithelial cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (forestomach epithelial cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Papillomas/carcinomas (squamous cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (forestomach epithelial cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Hyperplasia (forestomach epithelial cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Inflammation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Regenerative cell proliferation (forestomach epithelial cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (epithelial cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Inflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (corneal cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Papillomas/carcinomas (squamous cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Inflammation (corneal cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Regenerative cell proliferation (corneal cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (corneal cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Inflammation (corneal cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Plasma tyrosine</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cytotoxicity (corneal cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, 4-hydroxyphenyl-pyruvate dioxygenase (HPPD) enzyme</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Plasma tyrosine</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Preneoplastic foci (hepatocytes)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, hepatocellular adenomas and carcinomas</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, cell proliferation (hepatocytes)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Preneoplastic foci (hepatocytes)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Progesterone from corpus luteum</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Hyperplasia (glandular epithelial cells of endometrium)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (glandular epithelial cells of endometrium)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Endometrial adenocarcinomas</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, ChREBP</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Synthesis, De Novo FA</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (club cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Necrosis (terminal bronchiolar cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, hepatocellular adenomas and carcinomas</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Peptide Oxidation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Oxidative metabolism</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Peptide Oxidation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Induction of pyruvate dehydrogenase (PDH)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Oxidative metabolism</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (renal tubular cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Adenomas/carcinomas (renal tubular)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (tubular epithelial cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Hyperplasia (renal tubular cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Chloride conductance</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>hyperpolarisation, neuron</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Ataxia, paralysis, or hyperactivity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Mortality</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, population 1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>hyperpolarisation, neuron</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Ataxia, paralysis, or hyperactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Glutamate-gated chloride channel</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Chloride conductance</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Unknown</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Kidney Failure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, 5HT2c</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Unknown</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hippocampal anatomy, Altered </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hippocampal Physiology, Altered</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hippocampal Physiology, Altered</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cognitive Function, Decreased </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hippocampal gene expression, Altered </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hippocampal anatomy, Altered </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Thyroxine (T4) in neuronal tissue, Decreased </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hippocampal gene expression, Altered </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Luteinizing hormone (LH) </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Hyperplasia (Leydig cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Testosterone binding to androgen receptor (hypothalamus)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Luteinizing hormone (LH) </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (follicular cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Adenomas/carcinomas (follicular cell)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Hypertrophy and proliferation (follicular cell)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Hyperplasia (follicular cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Meiotic chromosome dynamics</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Chromosome number</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Disorganization, Meiotic Spindle</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Meiotic chromosome dynamics</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Estrogen receptor (ER) activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Progesterone from corpus luteum</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Prolactin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Estrogen receptor (ER) activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Dopaminergic activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Prolactin</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (Leydig cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Leydig cell tumors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Androgen receptor activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Testosterone binding to androgen receptor (hypothalamus)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (terminal bronchiolar cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Adenomas/carcinomas (bronchioloalveolar)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Regenerative cell proliferation (terminal bronchiolar epithelial cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Hyperplasia (terminal bronchiolar cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Necrosis (terminal bronchiolar cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Regenerative cell proliferation (terminal bronchiolar epithelial cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding, Tubulin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Chromosome number</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Chromosome number</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Aneuploid offspring</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Pyruvate dehydrogenase kinase (PDK) enzyme</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Induction of pyruvate dehydrogenase (PDH)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Disruption, Microtubule dynamics</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Disorganization, Meiotic Spindle</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding, Tubulin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Disruption, Microtubule dynamics</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (renal tubular cell)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Regenerative cell proliferation (tubular epithelial cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Accumulation of alpha2u microglobulin (proximal tubular epithelium)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cytotoxicity (renal tubular cell)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Binding of chemicals to 2u (serum)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Accumulation of alpha2u microglobulin (proximal tubular epithelium)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, cardiac arrthymia</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Action Potential</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, cardiac arrthymia</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>impaired, ion channels</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Action Potential</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Chromosome misseggregation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Reproductive Success</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Upregulated, Spindle assembly checkpoint protein Mad2-oocyte</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Chromosome misseggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Maturation inducing steroid receptor signalling, oocyte</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Upregulated, Spindle assembly checkpoint protein Mad2-oocyte</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Meiotic prophase I/metaphase I transition, oocyte</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Reproductive Success</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, cyclic adenosine monophosphate</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Meiotic prophase I/metaphase I transition, oocyte</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Maturation inducing steroid receptor signalling, oocyte</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, cyclic adenosine monophosphate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Maturation inducing steroid, plasma</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Maturation inducing steroid receptor signalling, oocyte</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Luteinizing hormone (LH), plasma </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Maturation inducing steroid, plasma</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Gonadotropin releasing hormone, hypothalamus</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Luteinizing hormone (LH), plasma </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Prostaglandin E2 concentration, hypothalamus</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Gonadotropin releasing hormone, hypothalamus</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Proliferation, Cell proliferation in the absence of cytotoxicity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hyperplasia, Hyperplasia</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Cyclooxygenase activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Prostaglandin E2 concentration, hypothalamus</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Ovulation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Reproductive Success</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Cyclooxygenase activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Prostaglandins, ovary</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Prostaglandins, ovary</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Ovulation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Generation, Amplified excitatory postsynaptic potential (EPSP)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, A paroxysmal depolarizing shift</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Neuronal synaptic inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Generation, Amplified excitatory postsynaptic potential (EPSP)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Prostaglandin F2alpha synthesis, ovary  </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Prostaglandin F2alpha concentration, plasma </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Cyclooxygenase activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Prostaglandin F2alpha synthesis, ovary  </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Cell injury/death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, Stellate cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Pheromone release</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Ability to attract spawning mates</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Prostaglandin F2alpha concentration, plasma </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Pheromone release</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Reproductive Success</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Population growth rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Ability to attract spawning mates</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Reproductive Success</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Spawning behavior</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Ability to attract spawning mates</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Prostaglandin F2alpha concentration, plasma </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Spawning behavior</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Prostaglandin F2alpha synthesis, ovary  </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Prostaglandin F2alpha concentration, plasma </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Cyclooxygenase activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Prostaglandin F2alpha synthesis, ovary  </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Ionotropic GABA receptor chloride channel conductance</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Neuronal synaptic inhibition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding at picrotoxin site, iGABAR chloride channel</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Ionotropic GABA receptor chloride channel conductance</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Accelerated, Aging</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Number of worker bees</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Accumulation, Damaged mitochondrial DNA</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accelerated, Aging</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Overwhelmed, Mitochondrial DNA repair mechanisms</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Damaged mitochondrial DNA</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Overwhelmed, Mitochondrial DNA repair mechanisms</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Up Regulation, CD36</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, FA Influx</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Desensitization, Nicotinic acetylcholine receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of neuronal network function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Nicotinic acetylcholine receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Desensitization, Nicotinic acetylcholine receptor</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, predation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, survival</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, locomotion</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, predation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, sedation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, locomotion</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, histaminergic neuron excitation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, sedation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Neurodegeneration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Neuronal network function in adult brain</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, sheltering</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, predation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, anxiety</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, sheltering</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, serotonin (5-HT) </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, anxiety</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, 5-hydroxytryptamine transporter (5-HTT; SERT)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, serotonin (5-HT) </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, muscular waves in foot</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, foot detachment</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, muscular waves in foot</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, locomotion</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, locomotion</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, predation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Neuronal network function in adult brain</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment, Learning and memory</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, A paroxysmal depolarizing shift</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Epileptic seizure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Ca++ ATPase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Ca++ (intracellular)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, testosterone level</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Malformation, Male reproductive tract</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Ataxia, paralysis, or hyperactivity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Overactivation, muscle contraction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Ataxia, paralysis, or hyperactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Overactivation, Neuronotransmitter release</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Overactivation, muscle contraction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>prolonged, Depolarization of neuronal membrane</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Overactivation, Neuronotransmitter release</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>modulation, sodium channel</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>prolonged, Depolarization of neuronal membrane</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Ca++ (intracellular)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Disruption, Mitochondrial electron transport chain</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Ether-a-go-go (ERG) voltage-gated potassium channel </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Sodium conductance 1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, feeding 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, survival</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, predation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, survival</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Sodium conductance 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Atrioventricular block and bradycardia</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, hypoxia</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, amputations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Respiratory distress/arrest</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, hypoxia</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Atrioventricular block and bradycardia</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Respiratory distress/arrest</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Ca and HCO3 transport to shell gland</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Eggshell thickness</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, feeding 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, predation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, swimming speed</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, predation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, swimming speed</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, feeding 1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Sodium conductance 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, swimming speed</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, sodium channel</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Sodium conductance 1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impairment, Learning and memory</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Abnormal, Foraging activity and behavior</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of neuronal network function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Nicotinic acetylcholine receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Abnormal, Roll change within caste</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Food storage</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Antiseptic incorporated in food</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Abnormal, Roll change within caste</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Hydrogen peroxide production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Antiseptic incorporated in food</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Glucose oxidase enzyme activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Hydrogen peroxide production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Viral susceptibility</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Abnormal, Foraging activity and behavior</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>impaired, Hive thermoregulation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Death/Failure, Colony</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Number of worker bees</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>impaired, Hive thermoregulation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>impaired, Development</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Number of worker bees</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Viral susceptibility</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>impaired, Development</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Suppression, Immune system</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Viral susceptibility</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Abnormal, Foraging activity and behavior</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Number of worker bees</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Appetite and hunger</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Abnormal, Foraging activity and behavior</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Energetic demands and therefore metabolic stress</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Appetite and hunger</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Brood care</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>impaired, Larval development</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Abnormal, Roll change within caste</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Brood care</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impairment, Learning and memory</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Abnormal, Roll change within caste</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>impaired, Larval development</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Death/Failure, Colony</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Food storage</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>impaired, Larval development</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Number of worker bees</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Death/Failure, Colony</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Na+/I- symporter (NIS)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Thyroid hormone synthesis, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Formation, Pro-mutagenic DNA Adducts</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Clonal Expansion/Cell Proliferation, to form Altered Hepatic Foci (AHF)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Clonal Expansion/Cell Proliferation, to form Altered Hepatic Foci (AHF)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Tumorigenesis, Hepatocellular carcinoma</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Induced Mutations in Critical Genes</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Clonal Expansion/Cell Proliferation, to form Altered Hepatic Foci (AHF)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Formation, Pro-mutagenic DNA Adducts</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Insufficient repair or mis-repair of pro-mutagenic DNA adducts</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Insufficient repair or mis-repair of pro-mutagenic DNA adducts</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Induced Mutations in Critical Genes</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>systemic inflammation leading to hepatic steatosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, AKT2</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Mitochondrial fatty acid beta-oxidation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Liver Steatosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, DHB4/HSD17B4</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, Mitochondrial fatty acid beta-oxidation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, PPARα</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, LXR alpha</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, NR1H4</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, PPARα</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, NR1H4</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, SHP</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, NRF2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, NR1H4</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, PXR/SXR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Up Regulation, CD36</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, PXR/SXR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Up Regulation, SCD-1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Down Regulation, HMGCS2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Ketogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, FoxA2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Down Regulation, HMGCS2</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Down Regulation, CPT1A</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Mitochondrial fatty acid beta-oxidation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, FoxA2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Down Regulation, CPT1A</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, PXR/SXR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, FoxA2</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Up Regulation, Acetyl-CoA carboxylase-1 (ACC-1)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, De Novo FA synthesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, LXR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Up Regulation, Acetyl-CoA carboxylase-1 (ACC-1)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Accumulation, Fatty acid</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Liver Steatosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Accumulation, Fatty acid</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Triglyceride formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, De Novo FA synthesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Fatty acid</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, PPAR alpha</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, Mitochondrial fatty acid beta-oxidation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, LXR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, PPAR alpha</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Suppression, VLDL secretion</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, LDL uptake</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Fatty acid</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Up Regulation, LDLR (low density lipoprotein receptor)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, LDL uptake</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Up Regulation, LDLR (low density lipoprotein receptor)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, FA Influx</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Fatty acid</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, PCK1 expression (control point for glycolysis/gluconeogenesis pathway)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Fatty acid</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Accumulation, Fatty acid</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Liver lipid</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Up Regulation, CD36</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, FA Influx</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, 17beta-estradiol synthesis by ovarian granulosa cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Plasma 17beta-estradiol concentrations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, PCK1 expression (control point for glycolysis/gluconeogenesis pathway)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Up Regulation, CD36</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Up Regulation, SCD-1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Triglyceride formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Up Regulation, FAS</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, De Novo FA synthesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, LXR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Up Regulation, SCD-1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, LXR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Up Regulation, FAS</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, SREBF1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Up Regulation, SCD-1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>peroxisome proliferator activated receptor promoter demethylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, SREBF1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Triglyceride formation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Liver Steatosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, ChREBP</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, De Novo FA synthesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, LXR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, SREBF1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Suppression, Constitutive androstane receptor, NR1l3</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>peroxisome proliferator activated receptor promoter demethylation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Suppression, Constitutive androstane receptor, NR1l3</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, LXR</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Mitochondrial fatty acid beta-oxidation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Fatty acid</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Accumulation, Triglyceride</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Liver lipid</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, Mitochondrial fatty acid beta-oxidation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Suppression, VLDL secretion</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Liver lipid</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hyperplasia, Leydig cell</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>impaired, Fertility</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Luteinizing hormone (LH) </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase proliferation, Leydig cell </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, testosterone level</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Luteinizing hormone (LH) </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Cholinergic Signaling</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Respiratory distress/arrest</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Acetylcholine accumulation in synapses</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Cholinergic Signaling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Acetylcholinesterase (AchE) Inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Acetylcholinesterase (AchE) Inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Cholinergic Signaling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Acetylcholinesterase (AchE) Inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Respiratory distress/arrest</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Aromatase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, 17beta-estradiol synthesis by ovarian granulosa cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced levels of BDNF</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of synaptogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Thyroxine (T4) in neuronal tissue, Decreased </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced levels of BDNF</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Na+/I- symporter (NIS)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of Thyroidal iodide</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Testosterone synthesis in Leydig cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, testosterone level</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Cholesterol transport in mitochondria</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Testosterone synthesis in Leydig cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Translocator protein (TSPO)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Cholesterol transport in mitochondria</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Steroidogenic acute regulatory protein (STAR)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Cholesterol transport in mitochondria</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Respiratory distress/arrest</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>peroxisome proliferator activated receptor promoter demethylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Up Regulation, CD36</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Malformation, Male reproductive tract</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>impaired, Fertility</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cognitive Function, Decreased </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Metabolism of AFB1, Production of Reactive Electrophiles</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Formation, Pro-mutagenic DNA Adducts</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase proliferation, Leydig cell </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hyperplasia, Leydig cell</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>reduction in ovarian granulosa cells, Aromatase (Cyp19a1)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, 17beta-estradiol synthesis by ovarian granulosa cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>irregularities, ovarian cycle</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>impaired, Fertility</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Plasma 17beta-estradiol concentrations</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>irregularities, ovarian cycle</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Lymphocytes</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Suppression, Immune system</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Suppression, Inflammatory cytokines</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Lymphocytes</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Nuclear factor kappa B (NF-kB)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Suppression, Inflammatory cytokines</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, IKB inhibitory protein</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, Nuclear factor kappa B (NF-kB)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Glucocorticoid Receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, IKB inhibitory protein</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Neurophysiology</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cognitive Function, Decreased </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Dendritic Cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation/Proliferation, T-cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Covalent Binding, Protein</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, Dendritic Cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, PPARα</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Translocator protein (TSPO)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, PPARα</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Steroidogenic acute regulatory protein (STAR)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Thyroperoxidase, Inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Cell injury/death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Neuroinflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Cell injury/death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Neurodegeneration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cell injury/death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Intracellular Calcium overload</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Overactivation, NMDARs</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Intracellular Calcium overload</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Angiogenesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment, Endothelial network</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease of neuronal network function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment, Learning and memory</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease of synaptogenesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of neuronal network function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Presynaptic release of glutamate</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of synaptogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Aberrant, Dendritic morphology</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of synaptogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Cell injury/death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of synaptogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced levels of BDNF</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Presynaptic release of glutamate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced levels of BDNF</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cell injury/death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Androgen receptor, Antagonism</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Alteration, Wnt pathway</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced levels of BDNF</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Aberrant, Dendritic morphology</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Calcium influx</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced levels of BDNF</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Induced Mutations in Critical Genes</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Tumorigenesis, Hepatocellular carcinoma</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Formation, Pro-mutagenic DNA Adducts</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Tumorigenesis, Hepatocellular carcinoma</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Alteration, Wnt pathway</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Feminisation or incomplete development, Primary and accessory male sex organs</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Vitellogenin accumulation into oocytes and oocyte growth/development</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Cumulative fecundity and spawning</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Vitellogenin synthesis in liver</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Plasma vitellogenin concentrations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, VegfR2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Angiogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Androgen receptor, Antagonism</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Transcription of genes by AR</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Unknown</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Proliferation, Cell proliferation in the absence of cytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Accumulation, Triglyceride</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Damaging, Mitochondria</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Agonism, Androgen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Testosterone synthesis by ovarian theca cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation of specific nuclear receptors, Transcriptional change</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cholestasis, Pathology</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Transcription of genes by AR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Alteration, Wnt pathway</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Transcription of genes by AR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Feminisation or incomplete development, Primary and accessory male sex organs</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Vitellogenin synthesis in liver</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Plasma vitellogenin concentrations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Thyroxine (T4) in neuronal tissue, Decreased </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Agonism, Androgen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Gonadotropins, circulating concentrations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Thyroperoxidase, Inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Thyroid hormone synthesis, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Thyroid hormone synthesis, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Testosterone synthesis by ovarian theca cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, 17beta-estradiol synthesis by ovarian granulosa cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, Sustained Hepatotoxicity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, Sustained Cell Proliferation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, Sustained Cell Proliferation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Formation, Liver tumor</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Stellate cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Collagen</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, SREBP-1c</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Synthesis, De Novo FA</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Systemic acute phase response</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Atherosclerosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Mucin production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Lung function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, goblet cell number</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mucin production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, EGFR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, goblet cell number</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA strand breaks</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered Signaling Pathways</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of rapid delayed rectifying potassium current </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Prolongation of Action Potential Duration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>hERG channel blockade</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition of rapid delayed rectifying potassium current </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Bone Loss</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Bone Remodeling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered Bone Cell Homeostasis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered Bone Cell Homeostasis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Bone Remodeling</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Bone Loss</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered Bone Cell Homeostasis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Bone Remodeling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered Signaling Pathways</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered Bone Cell Homeostasis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cell death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered Bone Cell Homeostasis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA strand breaks</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Neural Remodeling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered Signaling Pathways</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Neural Remodeling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, SCD-1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Synthesis, De Novo FA</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Pro-Inflammatory Mediators</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment, Learning and memory</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment, Learning and memory</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Neural Remodeling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Neural Remodeling</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment, Learning and memory</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Pro-Inflammatory Mediators</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Neural Remodeling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Tissue resident cell activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Pro-Inflammatory Mediators</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Tissue resident cell activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Tissue resident cell activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dysregulation, ACE2 expression and activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, (Micro)vascular dysfunction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Reactive Oxygen Species production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Oxidative damage</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Promotion, ovarian adenomas</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Promotion, Ovarian Cancer </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, androgen receptors (AR) activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hypospadias, increased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Mitochondrial dysfunction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Reactive oxygen species</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Oxidative Stress </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Heart failure </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Cardiac contractility </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Heart failure </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Mitochondrial ATP production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Cardiac contractility </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Mitochondrial ATP production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Mitochondrial Electron Transport Chain Complexes</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, androgen receptors (AR) activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>anogenital distance (AGD), decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Reactive Oxygen Species production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Nitric Oxide</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cell Proliferation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence of Cataracts</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence of Cataracts</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inadequate DNA repair</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence of Cataracts</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Modified Proteins</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence of Cataracts</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence of Cataracts</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell Proliferation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Oxidative damage to DNA</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Modified Proteins</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, DNA strand breaks</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Oxidative damage to DNA</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Modified Proteins</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Synaptic dysfunction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment, Learning and memory</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Loss of drebrin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Synaptic dysfunction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Overactivation, NMDARs</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Loss of drebrin</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Growth</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Reproductive Success</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, oxygen binding capacity by hemocyanin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, hemocyanin mRNA</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, pulmonate breathing</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Growth</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Cognitive, sensed as hypoxic/low oxygen environment</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, pulmonate breathing</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>increase oxidation of the di-copper moiety of the hemocyanin active site </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cognitive, sensed as hypoxic/low oxygen environment</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Renal pathology due to VTG deposition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Larval development</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>increase oxidation of the di-copper moiety of the hemocyanin active site </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, oxygen binding capacity by hemocyanin</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase in reactive oxygen and nitrogen species (RONS)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>increase oxidation of the di-copper moiety of the hemocyanin active site </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Mitochondrial swelling</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cell injury/death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Coupling of oxidative phosphorylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mitochondrial swelling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Glucose pool</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Cell proliferation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Glycolysis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Glucose pool</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Coupling of oxidative phosphorylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Glycolysis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, palatal shelf outgrowth</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Cell cycle, disrupted</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Meiotic chromosome dynamics</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA damage</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cell cycle, disrupted</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Damaging, Red blood cells; hemolysis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, RBC congestion in liver</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Nitric Oxide Levels</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Endothelial Dysfunction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cell membrane depolarization</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cell injury/death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased Na/K ATPase activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell membrane depolarization</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Adenosine triphosphate pool</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased Na/K ATPase activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Vascular Remodeling </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Endothelial Dysfunction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Vascular Remodeling </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Status epilepticus</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Intracellular Calcium overload</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Status epilepticus</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, glutamate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Overactivation, NMDARs</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Status epilepticus</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Endothelial Dysfunction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Damaging, Red blood cells; hemolysis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Methemoglobinemia, decreased hemoglobin, hematocrit, red blood cell number</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Nitric Oxide Levels</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Pro-inflammatory mediators</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Endothelial Dysfunction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Endothelial Dysfunction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered Signaling Pathways</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Endothelial Dysfunction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Nitric Oxide Levels</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered Signaling Pathways</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Nitric Oxide Levels</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Pro-inflammatory mediators</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered Signaling Pathways</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Damaging, Red blood cells; hemolysis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Liver and splenic hemosiderosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Oxidative Stress </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Adenosine triphosphate pool</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cell injury/death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Cell injury/death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Growth</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cytosolic calcium</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cell injury/death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Cardiovascular development/function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Coupling of oxidative phosphorylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cytosolic calcium</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, recruitment of inflammatory cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, secretion of proinflammatory mediators</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cell death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, secretion of proinflammatory mediators</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Production, Reactive oxygen species</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Peptide Oxidation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Incomplete ecdysis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, developmental abnormalities</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, New cuticle secretion</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Incomplete ecdysis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Weak, Procuticle protection</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, New cuticle secretion</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Prevent chitin degradation by chitinases</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Weak, Procuticle protection</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Chitin laminar organization</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Weak, Procuticle protection</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, knickkopf gene</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Prevent chitin degradation by chitinases</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, knickkopf gene</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Chitin laminar organization</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, 20-hydroxyecdysone</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, knickkopf gene</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Incomplete ecdysis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease,  hatching of egg</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Incomplete ecdysis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase,  delay in oviposition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase,  pigmentation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Incomplete ecdysis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase,  impairment of cuticle sclerotization</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Incomplete ecdysis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Defects in tanning of new cuticle</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase,  pigmentation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Defects in tanning of new cuticle</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase,  impairment of cuticle sclerotization</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, dopa decarboxylase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Defects in tanning of new cuticle</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Tyrosine</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, dopa decarboxylase</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, developmental abnormalities</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, sex ratio (F/M)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, developmental abnormalities</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Body volume of female adults</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, developmental abnormalities</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Delay, Ovarian maturation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, sex ratio (F/M)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Delay, Ovarian maturation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Body volume of female adults</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Vitellogenin mRNA</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Delay, Ovarian maturation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Estrogen receptor (ER) activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Vitellogenin mRNA</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Alcohol dehydrogenase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Estrogen receptor (ER) activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Smoothend relocation and activation </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, GLI1/2 translocation to nucleus </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Antagonism, Smoothened receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Smoothend relocation and activation </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Sonic Hedgehog second messenger production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Cell proliferation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, GLI1/2 target gene expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Sonic Hedgehog second messenger production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, estrogen receptor alpha</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impaired, Reproduction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase Chromosomal Aberrations</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased micro RNA expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, DNA damage and mutation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase Chromosomal Aberrations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, slincR expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Cardiovascular development/function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, palatal shelf outgrowth</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Ororofacial clefting</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Cell proliferation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, palatal shelf outgrowth</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, GLI1/2 translocation to nucleus </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, GLI1/2 target gene expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, RBC congestion in liver</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Methemoglobinemia, decreased hemoglobin, hematocrit, red blood cell number</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, PARP1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cell death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Neuroinflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Neuroinflammation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mitochondrial Injury</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Mitochondrial Injury</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Oxidative phosphorylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Oxidative Stress </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Unfolded Protein Response</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Endoplasmic reticulum stress</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Unfolded Protein Response</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Intracellular Calcium overload</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Endoplasmic reticulum stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Intracellular Calcium overload</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Oxidative phosphorylation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cell membrane depolarization</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Intracellular Calcium overload</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition GABAA receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell membrane depolarization</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cell death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Parkinsonian motor deficits</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation of calpain signalling</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Intracellular Calcium overload</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation of calpain signalling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation of metabotropic glutamate receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inositol triphosphate receptor activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inositol triphosphate receptor activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Intracellular Calcium overload</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>decreased folate uptake</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Neural tube defects</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Histone deacetylase inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Neural tube defects</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased sphingolipid-1-phosphate</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Histone deacetylase inhibition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of Ceramide Synthase </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased sphingolipid-1-phosphate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Affected folate transporter</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>decreased folate uptake</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced complex sphingolipids</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Affected folate transporter</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of Ceramide Synthase </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced complex sphingolipids</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Viable offspring, decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Population growth rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impaired, Spermatogenesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Viable offspring, decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, sox9 expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Cardiovascular development/function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, slincR expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Facial cartilage structures are reduced in size and morphologically distorted</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Alkylation, Protein</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cell injury/death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Facial cartilage structures are reduced in size and morphologically distorted</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, sox9 expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Facial cartilage structures are reduced in size and morphologically distorted</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Early Life Stage Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, sox9 expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Facial cartilage structures are reduced in size and morphologically distorted</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, slincR expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, sox9 expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>dimerization, AHR/ARNT</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, slincR expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Airway remodeling</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Chronic obstructive pulmonary disease</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Emphysema</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Chronic obstructive pulmonary disease</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Prostaglandin E2 concentration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Gap</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Pulmonary inflammation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Chronic obstructive pulmonary disease</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Fibroblast proliferation and differentiation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Airway remodeling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Epithelial-mesenchymal transition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Airway remodeling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dysfunctional Autophagy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Emphysema</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Emphysema</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Pulmonary inflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation of inflammation pathway</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Pulmonary inflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Non-coding RNA expression profile alteration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Dysfunctional Autophagy</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Non-coding RNA expression profile alteration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Non-coding RNA expression profile alteration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Fibroblast proliferation and differentiation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Non-coding RNA expression profile alteration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Epithelial-mesenchymal transition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Non-coding RNA expression profile alteration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Oxidative Stress </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Non-coding RNA expression profile alteration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation of inflammation pathway</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, estrogen receptor alpha</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Gonadotropins</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, estrogen receptor alpha</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Kisspeptin signalling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (epithelial cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Secondary genotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Substance interaction with the lung resident cell membrane components</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, DNA damage and mutation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Substance interaction with the lung resident cell membrane components</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Reactive oxygen species</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Secondary genotoxicity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, DNA damage and mutation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Reactive oxygen species</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Secondary genotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Feminisation or incomplete development, Primary and accessory male sex organs</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Impairment of reproductive capacity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (epithelial cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Reactive oxygen species</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, recruitment of inflammatory cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cytotoxicity (epithelial cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Sensory axonal peripheral neuropathy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Neuronal network function in adult brain</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Sensory axonal peripheral neuropathy</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress in Brain</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Neurodegeneration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation of Cyp2E1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Oxidative Stress in Brain</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Acetylcholinesterase (AchE) Inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation of Cyp2E1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, fibroblast proliferation and myofibroblast differentiation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Collagen</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, secretion of proinflammatory mediators</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, Dendritic Cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Covalent Binding, Protein</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Allergic Respiratory Hypersensitivity Response</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Covalent Binding, Protein</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, secretion of proinflammatory mediators</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Kidney toxicity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Kidney Failure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, renal proximal tubular necrosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Kidney toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase in inflammation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, renal proximal tubular necrosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, renal proximal tubular necrosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Nuclear factor kappa B (NF-kB)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase in inflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation of ER stress</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered gene expression, NRF2 dependent antioxidant pathway</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Oxidative Stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered gene expression, NRF2 dependent antioxidant pathway</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation of ER stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Mitochondrial Dysfunction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Mitochondrial Dysfunction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, Nuclear factor kappa B (NF-kB)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Mitochondrial Dysfunction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered gene expression, NRF2 dependent antioxidant pathway</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Mitochondrial membrane potential</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mitochondrial Dysfunction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Mitochondrial Electron Transport Chain Complexes</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Mitochondrial membrane potential</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Reproductive Success</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Population growth rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, predation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Population growth rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Oocyte Atresia</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impaired, Reproduction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impaired, Oocyte maturation and ovulation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Oocyte Atresia</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Maturation Inducing Steroid Surge by Granulosa cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impaired, Oocyte maturation and ovulation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Androgen and Progestin </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Maturation Inducing Steroid Surge by Granulosa cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Gonadotropins</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Androgen and Progestin </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Kisspeptin signalling</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Gonadotropins</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Disruption of sodium channel gating kinetics</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Disruption, action potential</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased spermatogenesis </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Population growth rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased spermatogenesis </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Reproduction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA damage</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased spermatogenesis </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Fecundity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Reproduction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased spermatogenesis </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Fecundity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased spermatogenesis </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Oxidative Stress</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase in reactive oxygen and nitrogen species (RONS)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Oxidative Stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase in reactive oxygen and nitrogen species (RONS)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, Epithelial Mesenchymal Transition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>metastatic breast cancer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Antagonism, Estrogen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, Epithelial Mesenchymal Transition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase activation, Nuclear factor kappa B (NF-kB)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Antagonism, Estrogen receptor</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased SIRT1 expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase activation, Nuclear factor kappa B (NF-kB)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased micro RNA expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased SIRT1 expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Mutations</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased micro RNA expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, DNA damage and mutation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inadequate DNA repair</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Premature cell differentiation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase risk, microcephaly</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation of Tumor Protein 53</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Premature cell differentiation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibit, voltage-gated sodium channel</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Disruption of sodium channel gating kinetics</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase risk, microcephaly</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase risk, microcephaly</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation of Tumor Protein 53</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, PPAR-gamma activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, HSD17B10 expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA damage</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation of Tumor Protein 53</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Angiotensin II </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Binding of agonist, Angiotensin II receptor type 1 receptor (AT1R)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Oxidative damage to DNA</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Oocyte apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Oxidative damage to DNA</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Follicular atresia</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Reactive Oxygen Species production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Oxidative damage to DNA</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, PPAR-beta activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, HSD17B10 expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA strand breaks</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Oocyte apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Oogenesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Cumulative fecundity and spawning</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA strand breaks</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Follicular atresia</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, circulating estrogen levels</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hyperplasia, ovarian epithelium</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, estrogens </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, circulating estrogen levels</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Steroidogenic acute regulatory protein (StAR) </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, estrogens </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, secretion of LH from anterior pituitary</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Steroidogenic acute regulatory protein (StAR) </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Suppression, Estrogen receptor (ER) activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, secretion of GnRH from hypothalamus</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, tumor growth</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Breast Cancer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, angiogenesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Breast Cancer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, tumor growth</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Invasion</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Breast Cancer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Migration (Endothelial Cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, angiogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Inflammation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, angiogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Inflammation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Invasion</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Invasion</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Migration (Endothelial Cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Motility</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, PPAR-alpha activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, HSD17B10 expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Inflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Mitochondrial Dysfunction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cytotoxicity (renal tubular cell)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Oxidative Stress</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mitochondrial Dysfunction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Mitochondrial Electron Transport Chain Complexes</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Oxidative Stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Neural crest cell migration, reduced</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>transposition of the great arteries</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Disruption, Progenitor cells of second heart field</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Neural crest cell migration, reduced</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, all-trans retinoic acid (atRA) concentration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Disruption, Progenitor cells of second heart field</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Reactive Oxygen Species production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Reproduction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Population trajectory</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Pollen abnormal</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Reproduction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Meiotic chromosome dynamics</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Pollen abnormal</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Programmed cell death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Reproduction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, DNA damage</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Mitochondrial ATP production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Reproduction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Reactive oxygen species</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Mitochondrial membrane potential</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Plasma vitellogenin concentrations</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Vitellogenin accumulation into oocytes and oocyte growth/development</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Reactive oxygen species</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, D1 protein deactivation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Reactive oxygen species</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, ATP production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Reproduction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased SARS-CoV-2 production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Intestinal barrier, disruption</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased SARS-CoV-2 production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Sustentacular cells, decrease </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Torsades de Pointes</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Sudden cardiac death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Prolongation of QT interval</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Torsades de Pointes</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Prolongation of Action Potential Duration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Prolongation of QT interval</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Plasma vitellogenin concentrations</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Renal pathology due to VTG deposition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dysregulation, ACE2 expression and activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Gut microbiota, alteration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Abnormal, Glucose homeostasis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Gestational diabetes mellitus</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Glucose uptake</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Abnormal, Glucose homeostasis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, GLUT4</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Glucose uptake</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, TNF</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, GLUT4</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased (ectopic) all-trans retinoic acid concentration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Premature initiation of meiosis in fetal male germ cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increases in cellular reactive oxygen species</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Porcupine-induced Wnt secretion and Wnt signaling activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced size of the ovarian follicle pool </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>irregularities, ovarian cycle</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Plasma 17beta-estradiol concentrations</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Vitellogenin synthesis in liver</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Accumulation, Cytosolic toxic Tau oligomers</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Neuroinflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impaired axonial transport</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Synaptic dysfunction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hyperphosphorylation of Tau</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Synaptic dysfunction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of neuronal network function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Accumulation, Cytosolic toxic Tau oligomers</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impaired axonial transport</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dysfunctional Autophagy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Cytosolic toxic Tau oligomers</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease of neuronal network function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Memory Loss</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Neuroinflammation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of neuronal network function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Alkylation, DNA</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mutations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mitochondrial dysfunction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Oxidative Stress </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased SARS-CoV-2 production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Viral infection and host-to-host transmission, proliferated</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Interferon-I antiviral response, antagonized by SARS-CoV-2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased SARS-CoV-2 production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>SARS-CoV-2 cell entry </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Interferon-I antiviral response, antagonized by SARS-CoV-2</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased SARS-CoV-2 production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>GSK3beta inactivation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Repression of Gbx2 expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hippocampal Physiology, Altered</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Loss, Cochlear function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Pregnane-X receptor, NR1l2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, Upregulation of glucuronyltransferase activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Disrupted meiotic initiation of fetal oogonia of the ovary</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced size of the ovarian follicle pool </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Bile accumulation, Pathological condition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation of specific nuclear receptors, Transcriptional change</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Hepatic thyroid hormone uptake/transport</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Clearance of thyroxine from serum</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, Upregulation of glucuronyltransferase activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Clearance of thyroxine from serum</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, all-trans retinoic acid (atRA) concentration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Disrupted meiotic initiation of fetal oogonia of the ovary</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Iodotyrosine deiodinase (IYD)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Cytoplasmic vacuolization (podocyte)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Cystic dilatation (renal tubule)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Cytoplasmic vacuolization (Renal tubule)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>altered, inner ear development</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Hearing</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cell death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>altered, inner ear development</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Kidney Failure</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Necrosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Kidney Failure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Lipid peroxidation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Necrosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Reactive oxygen species</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Lipid peroxidation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidation, Glutathione (To be considered with MIE)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Reactive oxygen species</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Platelet-neutrophil interactions, Increased </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Thromboinflammation, Increased </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Neutrophil activation, Increased </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Platelet-neutrophil interactions, Increased </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Platelet activation, Increased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Platelet-neutrophil interactions, Increased </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Release, Cytokine</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Neutrophil activation, Increased </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Release, Cytokine</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Platelet activation, Increased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Endothelial cell dysfunction </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Release, Cytokine</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cilia Beat Frequency, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>FOXJ1 Protein, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Parent compound is converted to the reactive metabolite and forms free radicals leading to oxidation of heme iron(II) in hemoglobin to iron(III)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Damaging, Red blood cells; hemolysis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cystic Fibrosis Transmembrane Regulator Function, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Motile Cilia Number/Length, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cilia Beat Frequency, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>FOXJ1 Protein, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Motile Cilia Number/Length, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mucociliary Clearance, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Lung function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Cilia Beat Frequency, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Mucociliary Clearance, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Airway Surface Liquid Height, Decreased </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cilia Beat Frequency, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Cystic Fibrosis Transmembrane Regulator Function, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Airway Surface Liquid Height, Decreased </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Parent compound is converted to the reactive metabolite and forms free radicals leading to oxidation of heme iron(II) in hemoglobin to iron(III)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Propagation, Oxidative stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>eya1 expression, inhibited</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>six1b expression, increased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>eya1 expression, inhibited</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>foxi1 expression, increased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>six1b expression, increased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Repression of Gbx2 expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>foxi1 expression, increased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase plasma Ang II</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Ang II type 1 receptor (AT1R)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induced dysregulation of ACE2 </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase plasma Ang II</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Prolonged TLR9 activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>NLRP3 inflammasome activity, increased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase activation, Nuclear factor kappa B (NF-kB)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Pro-inflammatory mediators</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase activation, Nuclear factor kappa B (NF-kB)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Release, Cytokine</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>increased MyD88 activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase activation, Nuclear factor kappa B (NF-kB)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Parent compound is converted to the reactive metabolite and forms free radicals leading to oxidation of heme iron(II) in hemoglobin to iron(III)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Formation, Formation of hemoglobin adducts</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Prolonged TLR9 activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>increased MyD88 activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Thyroid-stimulating hormone (TSH)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Hypertrophy and proliferation (follicular cell)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Thyroid-stimulating hormone (TSH)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Parent compound is converted to the reactive metabolite and forms free radicals leading to oxidation of heme iron(II) in hemoglobin to iron(III)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered regulation, Alpha hemoglobin</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cell Proliferation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, mesotheliomas</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Genomic instability</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell Proliferation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, DNA damage and mutation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Genomic instability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Frustrated phagocytosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Reactive oxygen species</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Frustrated phagocytosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, secretion of proinflammatory mediators</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>NLRP3 inflammasome activity, increased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hyperinflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Diminished protective oxidative stress response</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>NLRP3 inflammasome activity, increased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Cholinergic Signaling</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cognitive Function, Decreased </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease of neuronal network function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cognitive Function, Decreased </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Cholinergic Signaling</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of neuronal network function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Propagation, Oxidative stress</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Damaging, Red blood cells; hemolysis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>increase, placental insufficiency</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>increase, Preeclampsia</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>abnormal, placental labyrinth vasculature morphology</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>increase, placental insufficiency</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>reduced production, VEGF</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>abnormal, placental labyrinth vasculature morphology</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Cell proliferation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Eye size</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Overexpression of rasl11b</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Cell proliferation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of Plxna2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Overexpression of rasl11b</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of Fyna</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition of Plxna2</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of ALDH1A (RALDH)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, all-trans retinoic acid (atRA) concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Oocyte apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of egg production and cummulative fecundity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Propagation, Oxidative stress</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Down Regulation, Gulcose-6-phosphate dehydrogenase</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Alkylation, DNA</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inadequate DNA repair</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Bulky DNA adducts, increase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mutations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Bulky DNA adducts, increase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inadequate DNA repair</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Ionizing Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Oocyte apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Ionizing Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Population size</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Ionizing Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of egg production and cummulative fecundity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Ionizing Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>impaired, Fertility</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Ionizing Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased spermatogenesis </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Ionizing Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Meiotic chromosome dynamics</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Ionizing Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Oxidative Stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease of egg production and cummulative fecundity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Population size</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased spermatogenesis </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of egg production and cummulative fecundity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>impaired, Fertility</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of egg production and cummulative fecundity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Oocyte apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>impaired, Fertility</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Oxidative Stress</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Oocyte apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Meiotic chromosome dynamics</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased spermatogenesis </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Meiotic chromosome dynamics</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Oocyte apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA damage</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Oocyte apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA damage</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Meiotic chromosome dynamics</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Ionizing Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, DNA damage</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Ionizing Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Reactive oxygen species</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Triiodothyronine (T3)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Photoreceptor patterning</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Eye size</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Visual function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Triiodothyronine (T3)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Eye size</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Visual function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, retinal layer structure</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Visual function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Triiodothyronine (T3)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, retinal layer structure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Loss of alveolar capillary membrane integrity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Lung function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Alveolar collapse</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Lung function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of lung surfactant function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Lung function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Loss of alveolar capillary membrane integrity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced tidal volume </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Loss of alveolar capillary membrane integrity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition of lung surfactant function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced tidal volume </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Lung function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>olfactory sensory neurons, decrease </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>impaired olfactory function (anosmia) </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Sustentacular cells, decrease </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>impaired olfactory function (anosmia) </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Olfactory epithelium degeneration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>impaired olfactory function (anosmia) </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>olfactory sensory neurons, decrease </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Olfactory epithelium degeneration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Sustentacular cells, decrease </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>olfactory sensory neurons, decrease </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Coagulation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Diminished protective oxidative stress response</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Diminished protective oxidative stress response</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Coagulation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased SARS-CoV-2 production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Diminished protective oxidative stress response</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Bradykinin system, hyperactivated</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hyperinflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Fibrinolysis, decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, secretion of proinflammatory mediators</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Bradykinin system, hyperactivated</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Fibrinolysis, decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, recruitment of inflammatory cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hyperinflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Bradykinin system, hyperactivated</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, secretion of proinflammatory mediators</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Fibrinolysis, decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Bradykinin system, hyperactivated</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased SARS-CoV-2 production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Toll Like Receptor (TLR) Dysregulation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Aromatase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Male Biased Sex Ratio</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Agonism, Androgen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Male Biased Sex Ratio</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, ATP production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Leaf development</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Oxygen-evolving complex damage</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Photosystem II efficiency</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA damage</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Programmed cell death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Reproduction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Population growth rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Leaf development</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Reproduction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Photosynthesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, ATP production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Photosystem II efficiency</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Photosynthesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Sodium-sensitive hypertension</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Chronic kidney disease</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Reactive oxygen species</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Sodium-sensitive hypertension</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Angiotensin II </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Ang II type 1 receptor (AT1R)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hyperactivation of ACE/Ang-II/AT1R axis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Angiotensin II </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, extracellular matrix deposition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Liver fibrosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Reactive oxygen species</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, extracellular matrix deposition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Ang II type 1 receptor (AT1R)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Reactive oxygen species</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Reactive oxygen species</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase activation, Nuclear factor kappa B (NF-kB)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding of agonist, Angiotensin II receptor type 1 receptor (AT1R)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Reactive oxygen species</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Imbalanced salty and sweet taste responses</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impaired gustatory nerve</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Angiotensin II </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Imbalanced salty and sweet taste responses</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding to ACE2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Downregulation, ACE2</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding to ACE2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Dysregulation, ACE2 expression and activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>SARS-CoV-2 cell entry </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased SARS-CoV-2 production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase activation, Nuclear factor kappa B (NF-kB)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, secretion of proinflammatory mediators</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, secretion of proinflammatory mediators</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Collagen</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Toll Like Receptor (TLR) Dysregulation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, secretion of proinflammatory mediators</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Alkylation, DNA</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Heritable mutations in offspring</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impaired gustatory nerve</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>dysgeusia</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>decreased oocyte maturation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>impaired, Fertility</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>impaired, Fertility</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Population growth rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Coagulation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Thrombosis and Disseminated Intravascular Coagulation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding of antagonist, NMDA receptors</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, NMDARs</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Neuroinflammation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Encephalitis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Neurodegeneration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Encephalitis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding to ACE2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Neuroinflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Alveolar collapse</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Loss of alveolar capillary membrane integrity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Leaf development</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Growth</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased plasma Cortisol level</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>decreased oocyte maturation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Cortisol and 11β-(OH) testosterone decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased,  plasma 11-ketotestosterone level</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Cortisol and 11β-(OH) testosterone decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased plasma Cortisol level</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>11β-hydroxylase inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cortisol and 11β-(OH) testosterone decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impaired, Spermatogenesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>impaired, Fertility</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Transcription of genes by AR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Granulosa cell proliferation of gonadotropin-independent follicles, Reduced</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Free serum thyroxine (T4)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Clearance of thyroxine from serum</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Clearance of thyroxine from serum</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Acyl-CoA dehydrogenases</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Mitochondrial Fatty Acid Beta Oxidation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Glucocorticoid Receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Acyl-CoA dehydrogenases</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Accumulation, Triglyceride</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Liver Steatosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Mitochondrial Fatty Acid Beta Oxidation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Triglyceride</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Agonism, Androgen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Differentiation to Testis </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, cell proliferation (hepatocytes)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, hepatocellular adenomas and carcinomas</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, PPARα</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, hepatocellular adenomas and carcinomas</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, PPARα</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, cell proliferation (hepatocytes)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding, Thyroid binding globulin in serum</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Displacement, Serum thyroxine (T4) from carrier protein</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Displacement, Serum thyroxine (T4) from carrier protein</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Free serum thyroxine (T4)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding, Transthyretin in serum</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Displacement, Serum thyroxine (T4) from carrier protein</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Free serum thyroxine (T4)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Hepatic thyroid hormone uptake/transport</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Displacement, Serum thyroxine (T4) from transthyretin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Free serum thyroxine (T4)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding, Transthyretin in serum</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Displacement, Serum thyroxine (T4) from transthyretin</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Thyroid hormone-dependent gene expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Amphibian metamorphosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Triiodothyronine (T3) in tissues</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Thyroid hormone-dependent gene expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Thyroxine (T4) in serum</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Thyroid hormone-dependent gene expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Thyroxine (T4) in serum</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Amphibian metamorphosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Thyroid-stimulating hormone (TSH)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Thyroxine (T4) in serum</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Triiodothyronine (T3) in tissues</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Thyroid hormone-dependent gene expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Triiodothyronine (T3) in tissues</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Thyroid-stimulating hormone (TSH)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Hepatic thyroid hormone uptake/transport</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Na+/I- symporter (NIS)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Hearing</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Mitochondrial complex III antagonism</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Adenosine triphosphate pool</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Mitochondrial ATP synthase antagonism</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Adenosine triphosphate pool</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Adenosine triphosphate pool</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Reactive oxygen species</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Global DNA methylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Reactive Oxygen Species production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Global DNA methylation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Reactive Oxygen Species production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cell death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Growth</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Adenosine triphosphate pool</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Posterior swim bladder inflation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Swimming performance</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Adenosine triphosphate pool</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Oogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Cell proliferation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Growth</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Adenosine triphosphate pool</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Cell proliferation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Coupling of oxidative phosphorylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Adenosine triphosphate pool</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Antagonism, Androgen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Transcription of genes by AR</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation of ER stress</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Apoptotic cell death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase in inflammation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Immune mediated hepatitis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Apoptotic cell death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase in inflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>IFNγ signaling</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase in inflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Immune cell activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>IFNγ signaling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mitochondrial dysfunction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation of ER stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>benzoquinone imine and acylglucuronide metabolites</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Immune cell activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mitochondrial dysfunction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Apoptotic cell death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>benzoquinone imine and acylglucuronide metabolites</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Mitochondrial dysfunction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Chitobiase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Digestion of old cuticle</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Digestion of old cuticle</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Premature molting</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Chitinase </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Digestion of old cuticle</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Amphibian metamorphosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Aromatase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Differentiation to Testis </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased,  plasma 11-ketotestosterone level</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased spermatogenesis </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of 11β-HSD </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased,  plasma 11-ketotestosterone level</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased spermatogenesis </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>impaired, Fertility</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activator protein 1 activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Latent Transforming growth Factor beta expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inactivation of PPARγ</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, TGF-beta pathway</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, Epithelial Mesenchymal Transition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Pulmonary fibrosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, TGF-beta pathway</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, Epithelial Mesenchymal Transition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Latent Transforming growth Factor beta expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, TGF-beta pathway</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Pin-1 activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Latent Transforming growth Factor beta expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, JNK</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Pin-1 activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, JNK</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activator protein 1 activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Toll-like receptor 4 activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, JNK</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Male Biased Sex Ratio</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Population growth rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Differentiation to Testis </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Male Biased Sex Ratio</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, 17beta-estradiol synthesis by the undifferentiated gonad </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Differentiation to Testis </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Aromatase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, 17beta-estradiol synthesis by the undifferentiated gonad </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Visual function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Population growth rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Accumulation, Collagen</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Lung fibrosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Downregulation, ACE2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Angiotensin II </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, the risk of acute respiratory failure</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Antagonism, Androgen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Nipple retention (NR), increased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Transcription of genes by AR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Nipple retention (NR), increased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>reduction, testosterone levels </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, androgen receptors (AR) activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Antagonism, Androgen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, androgen receptors (AR) activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, NMDARs</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Calcium influx</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>decrease, transcription of genes by AR </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>anogenital distance (AGD), decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, androgen receptors (AR) activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>decrease, transcription of genes by AR </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Transcription of genes by AR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>anogenital distance (AGD), decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>reduction, testosterone levels </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, dihydrotestosterone (DHT) level</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Testosterone synthesis in Leydig cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>reduction, testosterone levels </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, androgen receptors (AR) activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Transcription of genes by AR</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Antagonism, Androgen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>anogenital distance (AGD), decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Nitric Oxide</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Long-term potentiation (LTP)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Ovarian follicle breakdown (F3)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Oogenesis (F3)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Ovarian somatic cell apoptosis (F3)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Ovarian follicle breakdown (F3)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Caspase transcription (F3)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Ovarian somatic cell apoptosis (F3)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Fecundity (F3)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Population growth rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Oogenesis (F3)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Fecundity (F3)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Oocyte apoptosis (F3)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Oogenesis (F3)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Caspase transcription (F3)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Oocyte apoptosis (F3)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Heritable DNA methylation (F3)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Caspase transcription (F3)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Global DNA methylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Heritable DNA methylation (F3)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA double-strand break</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Caspase transcription</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA methyltransferase inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, DNA double-strand break</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Ovarian follicle breakdown</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Oogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Ovarian somatic cell apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Ovarian follicle breakdown</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Caspase transcription</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Ovarian somatic cell apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Oocyte apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Oogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Caspase transcription</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Oocyte apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Global DNA methylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Caspase transcription</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA methyltransferase inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Global DNA methylation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Oxidative DNA damage</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, DNA double-strand break</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Reactive Oxygen Species production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Oxidative DNA damage</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Neutral lipids</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Adenosine triphosphate pool</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Lipid peroxidation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Neutral lipids</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Adenosine triphosphate pool</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Oxidative phosphorylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Adenosine triphosphate pool</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Mitochondrial membrane potential</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Oxidative phosphorylation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Reactive Oxygen Species production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Mitochondrial membrane potential</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Body fluid overload</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Abnormal osmoregulation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Body fluid overload</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Protein oxidation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Abnormal osmoregulation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Reactive Oxygen Species production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Protein oxidation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA double-strand break</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Formation of DNA photoproducts</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, DNA double-strand break</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Hyperplasia (urothelial)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Urothelial Tumor</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Urothelial cell injury/death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Regenerative cell proliferation (urothelial cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mitochondrial impairment</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Urothelial cell injury/death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cripto-1 expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, Fin regeneration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Swimming performance</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Population growth rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Fin regeneration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Swimming performance</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Neuroinflammation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Neurodegeneration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Activin signaling</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, Fin regeneration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cripto-1 expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, Activin signaling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Glucocorticoid Receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cripto-1 expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased,  plasma 11-ketotestosterone level</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impaired, Spermatogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduce, Sperm count</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA strand breaks</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, PPARα</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, cholesterol</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, cholesterol</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased,  plasma 11-ketotestosterone level</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>beta-catenin activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Epithelial-mesenchymal transition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Porcupine-induced Wnt secretion and Wnt signaling activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>beta-catenin activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Neurodegeneration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Neuroinflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Chronic reactive oxygen species</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Porcupine-induced Wnt secretion and Wnt signaling activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induced dysregulation of ACE2 </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Angiotensin II </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased inflammatory immune responses</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, the risk of acute respiratory failure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, secretion of proinflammatory mediators</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased inflammatory immune responses</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding to ACE2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>SARS-CoV-2 cell entry </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, secretion of proinflammatory mediators</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Acute phase response proteins expression, Increased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Triiodothyronine (T3)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Acinar cell proliferation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Pancreatic acinar cell tumors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased exocrine secretion from pancreatic acinar cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Acinar cell proliferation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased blood CCK level</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased exocrine secretion from pancreatic acinar cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Neuroanatomy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Neurophysiology</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased intestinal monitor peptide level</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased blood CCK level</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Trypsin inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased intestinal monitor peptide level</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Suppression of IL-4 production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment of T-cell dependent antibody response</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Suppression of STAT5 binding to cytokine gene promoters</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Suppression of IL-4 production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Blockade of STAT5 phosphorylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Suppression of STAT5 binding to cytokine gene promoters</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of JAK3</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Blockade of STAT5 phosphorylation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase of anti-DNA antibody from autoreactive B cell</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Exacerbation of systemic lupus erythematosus (SLE)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase of Th2 cells producing IL-4</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase of anti-DNA antibody from autoreactive B cell</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction of GATA3 expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase of Th2 cells producing IL-4</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding to estrogen receptor (ER)-α in immune cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction of GATA3 expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Mutations</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Heritable mutations in offspring</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Th17 cell migration and inflammation induction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Psoriatic skin disease</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, IL-23 from matured dendritic cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Th17 cell migration and inflammation induction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Stimulation, TLR7/8</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, IL-23 from matured dendritic cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Acetylcholinesterase (AchE) Inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Population growth rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impaired coordination and movement</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Population growth rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Acetylcholinesterase (AchE) Inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impaired coordination and movement</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Mortality</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Population growth rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impaired coordination and movement</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Cholinergic Signaling</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impaired coordination and movement</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Histone deacetylase inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Spermatocyte depletion</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Acetylcholinesterase (AchE) Inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Dysregulation of heart rate and vascular tone</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dysregulation of heart rate and vascular tone</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Respiratory distress/arrest</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Cholinergic Signaling</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Dysregulation of heart rate and vascular tone</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Suppression of  T cell activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment of TDAR</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Nuclear factor kappa B (NF-kB)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Suppression of  T cell activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impaired IL-1R1 signaling in T cell</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, Nuclear factor kappa B (NF-kB)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Histone acetylation, increase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cell cycle, disrupted</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>dimerization, AHR/ARNT</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, DNA methyltransferase expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, expression of gonadotropin releasing hormone receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, 17beta-estradiol synthesis by ovarian granulosa cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, hypermethylation of the promotor region of gonadotropin releasing hormone receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, expression of gonadotropin releasing hormone receptor</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA methyltransferase expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, hypermethylation of the promotor region of gonadotropin releasing hormone receptor</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease of egg production and cummulative fecundity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decline, Population trajectory</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impaired ovulation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of egg production and cummulative fecundity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, progesterone uptake, decresed maturation </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impaired ovulation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Plasma progesterone concentration </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, progesterone uptake, decresed maturation </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Progesterone synthesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Plasma progesterone concentration </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Antagonism,LH receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Progesterone synthesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Chromosomal aberrations</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, lung cancer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Mutations</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, lung cancer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, lung cancer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Chromosomal aberrations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mutations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cell Proliferation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, lung cancer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Chromosomal aberrations</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell Proliferation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Mutations</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell Proliferation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Deposition of Energy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, DNA strand breaks</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Alveolar collapse</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced tidal volume </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of lung surfactant function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Alveolar collapse</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cell Proliferation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Lung cancer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, DNA damage and mutation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell Proliferation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Reactive oxygen species</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, DNA damage and mutation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, recruitment of inflammatory cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Reactive oxygen species</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Release, Cytokine</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, recruitment of inflammatory cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Frustrated phagocytosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Release, Cytokine</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induced, dysfunction of microcirculation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impaired,anterior-posterior axis development</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Plasma HCY level</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induced, dysfunction of microcirculation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Homocysteine level </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Plasma HCY level</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased reactive oxygen species (in the mitochondria)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased reactive oxygen species (in the mitochondria)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease in mitochondrial oxidative phosphorylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of cystathionine beta-synthase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Homocysteine level </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Antagonism, Thyroid Receptor </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cognitive Function, Decreased </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Antagonism, Thyroid Receptor </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hippocampal gene expression, Altered </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding of inhibitor to mitochondrial complex V</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Mitochondrial Complex V inhibition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding of inhibitor to mitochondrial complex IV</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Mitochondrial Complex IV inhibition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding of inhibitor to mitochondrial complex III</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mitochondrial complex III antagonism</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impaired, Proteostasis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cell injury/death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, NADH-ubiquinone oxidoreductase  (complex I)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease in mitochondrial oxidative phosphorylation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA strand breaks</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Chromosomal aberrations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impaired inguinoscrotal testicular descent phase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Malformation, cryptorchidism - maldescended testis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, androgen receptors (AR) activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impaired inguinoscrotal testicular descent phase</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, testosterone synthesis/level</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, androgen receptors (AR) activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, dihydrotestosterone (DHT) level</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, androgen receptors (AR) activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, testosterone synthesis/level</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, dihydrotestosterone (DHT) level</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, 17-OH-progesterone conversion in androstenedione</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, testosterone synthesis/level</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, 17-OH-pregnenolone conversion in DHEA</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, testosterone synthesis/level</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA strand breaks</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mutations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Epithelial-mesenchymal transition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Treatment-resistant gastric cancer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Photoreceptor patterning</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Visual function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased plasma RA level</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Photoreceptor patterning</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased retinoic acid (RA) synthesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased plasma RA level</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Retinaldehyde dehydrogenase inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased retinoic acid (RA) synthesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Oxidative damage to DNA</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mutations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Oxidative damage to DNA</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, DNA strand breaks</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inadequate DNA repair</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Chromosomal aberrations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA strand breaks</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inadequate DNA repair</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inadequate DNA repair</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, DNA strand breaks</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Oxidative damage to DNA</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inadequate DNA repair</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Pro-inflammatory mediators</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell Proliferation (Epithelial Cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cell Proliferation (Epithelial Cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mutations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase in reactive oxygen and nitrogen species (RONS)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Tissue resident cell activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Leukocyte recruitment/activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase in reactive oxygen and nitrogen species (RONS)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase in reactive oxygen and nitrogen species (RONS)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, DNA damage</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Pro-inflammatory mediators</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase in reactive oxygen and nitrogen species (RONS)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Pro-inflammatory mediators</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Breast Cancer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Mitochondrial fatty acid beta-oxidation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Fatty acid</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Up Regulation, CYP1A1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA damage</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Tissue resident cell activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA damage</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mutations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Mutations</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell Proliferation (Epithelial Cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction fo Pigmentation pattern </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Population growth rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction of melanosome level</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction fo Pigmentation pattern </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction in melanin level</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction of melanosome level</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction of L-Dopaquinone</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction in melanin level</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of tyrosinase </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction of L-Dopaquinone</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, Focal Seizure</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, glutamate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Disruption, Mitochondrial electron transport chain</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Reactive Oxygen Species production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Muscarinic Acetylcholine Receptors</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Focal Seizure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Fecundity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Population growth rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, dihydrotestosterone (DHT) level</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Plasma 17beta-estradiol concentrations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>5α-reductase, inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, dihydrotestosterone (DHT) level</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Disruption, Mitochondrial electron transport chain</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Mitochondrial ATP production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Cytochrome P450 enzyme (CYP17A1) activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, 17-OH-progesterone conversion in androstenedione</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Cytochrome P450 enzyme (CYP17A1) activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, 17-OH-pregnenolone conversion in DHEA</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Oxidative DNA damage</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Reactive oxygen species</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Oxidative DNA damage</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Liver Injury</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation of hepatic stellate cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Liver Injury</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation of hepatic stellate cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Unfolded Protein Response</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Accumulation of misfolded proteins</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Unfolded Protein Response</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of N-linked glycosylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation of misfolded proteins</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Intracellular Calcium overload</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cell injury/death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, glutamate</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Overactivation, NMDARs</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Acetylcholine accumulation in synapses</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, Muscarinic Acetylcholine Receptors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidation/denatuation of membrane proteins</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inflamatory events in light-exposed tissues</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidation of membrane lipids</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inflamatory events in light-exposed tissues</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>ROS generation from photoactivated chemicals</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Oxidation/denatuation of membrane proteins</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>ROS generation from photoactivated chemicals</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Oxidation of membrane lipids</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Fibroproliferative airway lesions</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Bronchiolitis obliterans</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, Epithelial Mesenchymal Transition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Fibroproliferative airway lesions</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Inflammation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Fibroproliferative airway lesions</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Airway epithelial injury</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Inflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Proteasomal dysfunction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Airway epithelial injury</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Interaction of α-diketones with arginine residues</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Proteasomal dysfunction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impaired axonial transport</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Sensory axonal peripheral neuropathy</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Disturbance in microtubule dynamic instability</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impaired axonial transport</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding of microtubule stabilizing agents (MSA) to microtubules</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Disturbance in microtubule dynamic instability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Tissue resident cells (Kuppfer cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, proinflammatory mediators (TNFalpha)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Cell injury/death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, Tissue resident cells (Kuppfer cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Cell injury/death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Necrotic Tissue</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Caspase 8 pathway</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cell injury/death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Nuclear factor kappa B (NF-kB)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, Caspase 8 pathway</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, IKK complex</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, Nuclear factor kappa B (NF-kB)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Methemoglobinemia, decreased hemoglobin, hematocrit, red blood cell number</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Cyanosis occurs</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased proximal tubular vectorial transport</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Chemical induced Fanconi syndrome</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased Na/K ATPase activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased proximal tubular vectorial transport</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Oxidative phosphorylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased Na/K ATPase activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, NADH-ubiquinone oxidoreductase  (complex I)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Oxidative phosphorylation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered differentiation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Neural tube defects</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Gene Expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered differentiation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Histone acetylation, increase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Gene Expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Histone deacetylase inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Collagen production, reduced</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Collagen production, reduced</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Facial cartilage structures are reduced in size and morphologically distorted</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Neural crest cell migration, reduced</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Collagen production, reduced</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Histone deacetylase inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Neural crest cell migration, reduced</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Necrotic Tissue</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Liver Injury</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mitochondrial Complex V inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease in mitochondrial oxidative phosphorylation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mitochondrial Complex IV inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease in mitochondrial oxidative phosphorylation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Mitochondrial complex III antagonism</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease in mitochondrial oxidative phosphorylation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, Epithelial Mesenchymal Transition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Collagen Deposition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Leukocyte recruitment/activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, Stellate cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Pro-inflammatory mediators</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Leukocyte recruitment/activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Cell injury/death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Pro-inflammatory mediators</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Endocytotic lysosomal uptake</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Disruption, Lysosome</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased neurokinin A (NKA) by neuronal cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Respiratory irritability and Chronic Cough, </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>SP (Substance P) release, Local increase of SP</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Respiratory irritability and Chronic Cough, </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Respiratory irritability and Chronic Cough, </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Trigeminal and/or vagal nerve excitation causes Airway Hyper-responsiveness,Cough, Dyspnea</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, LXR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, SREBP-1c</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Plasma vitellogenin concentrations</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Cumulative fecundity and spawning</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Thyroid hormone synthesis, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Plasma 17beta-estradiol concentrations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased protection against oxidative stress</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Oxidative Stress </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding, Thiol/seleno-proteins involved in protection against oxidative stress</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased protection against oxidative stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Pro-inflammatory mediators</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, Stellate cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Tissue resident cell activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Pro-inflammatory mediators</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Disruption, Sarcomere assembly</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Cardiac contractility </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Disruption, Intracellular calcium mobilization</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Disruption, Sarcomere assembly</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Calcium currents</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Disruption, Intracellular calcium mobilization</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, LXR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, SCD-1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Cardiac ejection fraction </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Heart failure </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Cardiac contractility </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Cardiac ejection fraction </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Calcium binding to Troponin C</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Cardiac contractility </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Calcium currents</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Calcium binding to Troponin C</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Blockade, L-Type Calcium Channels </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Calcium currents</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Oogenesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Fecundity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, LXR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, FAS</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Fatty Acid Beta Oxidation, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Ketogenesis (production of ketone bodies)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, PPARalpha transactivation of gene expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Fatty Acid Beta Oxidation, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Opening of voltage-dependent calcium channel</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Cuticular chitin content</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cell membrane depolarization</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Opening of voltage-dependent calcium channel</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Sulfonylurea receptor binding</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell membrane depolarization</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Premature molting</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Cuticular chitin content</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Premature molting</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Chitin synthase 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Cuticular chitin content</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, LXR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, ChREBP</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Spermatocyte depletion</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Spermatocyte depletion</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Testicular atrophy</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>General Apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Neurodegeneration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Unfolded Protein Response</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>General Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Lipid Peroxidation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>General Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress in Brain</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Unfolded Protein Response</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, LXR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Up Regulation, CD36</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Protein Adduct Formation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Unfolded Protein Response</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Lipid Peroxidation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Protein Adduct Formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress in Brain</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Lipid Peroxidation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>CYP2E1 Activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Oxidative Stress in Brain</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Inflammation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, Epithelial Mesenchymal Transition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation of TGF-β signaling</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Inflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Long term AHR receptor driven direct and indirect gene expression changes</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Hepatotoxicity, Hepatopathy, including a constellation of observable effects</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased Pro-inflammatory mediators</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cell injury/death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Cell injury/death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Tissue resident cell activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Histone deacetylase inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Testicular atrophy</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Histone deacetylase inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Histone deacetylase inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cell cycle, disrupted</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Cell cycle, disrupted</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Histone deacetylase inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Histone acetylation, increase</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, activation of T (T) helper (h) type 2 cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, fibroblast proliferation and myofibroblast differentiation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Loss of alveolar capillary membrane integrity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, activation of T (T) helper (h) type 2 cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, recruitment of inflammatory cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Loss of alveolar capillary membrane integrity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, secretion of proinflammatory mediators</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, recruitment of inflammatory cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Substance interaction with the lung resident cell membrane components</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, secretion of proinflammatory mediators</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation/Proliferation, T-cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Allergic Respiratory Hypersensitivity Response</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, Liver “Dysfunctional” Changes by CGA 330050</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, Inducible Nitric Oxide Synthase by Metabolite CGA 265307</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Peptide Oxidation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>KE1 : S-Glutathionylation, eNOS</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Oncotic Necrosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Steatohepatisis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Reactive oxygen species</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Oncotic Necrosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Liver Steatosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Reactive oxygen species</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, cytosolic fatty acid</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Liver Steatosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Fatty Acid Beta Oxidation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, cytosolic fatty acid</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cell injury/death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Liver and splenic hemosiderosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Methemoglobinemia, decreased hemoglobin, hematocrit, red blood cell number</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Cell injury/death</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of neuronal network function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Neuroinflammation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cell injury/death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Glutamate dyshomeostasis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Cell injury/death</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Glutamate dyshomeostasis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Mitochondrial ATP production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cytotoxicity (renal tubular cell)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dysfunction, Mitochondria </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Mitochondrial ATP production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Alkylation, Protein</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Dysfunction, Mitochondria </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Disruption, Lysosome</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cytotoxicity (renal tubular cell)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Disturbance, Lysosomal function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Disruption, Lysosome</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding of substrate, endocytic receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Disturbance, Lysosomal function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cytotoxicity (renal tubular cell)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, Kidney toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dysfunction, Mitochondria </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cytotoxicity (renal tubular cell)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Depletion, mtDNA </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Dysfunction, Mitochondria </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of mitochondrial DNA polymerase gamma (Pol gamma)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Depletion, mtDNA </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Leaf cell mitosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Leaf development</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Mitochondrial ATP production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Leaf cell mitosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Oxidative phosphorylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Mitochondrial ATP production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Glycolysis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Oxidative phosphorylation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Photosynthesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Glycolysis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Light harvest capacity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Photosynthesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Chlorophyll synthesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Light harvest capacity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, ATP production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Chlorophyll synthesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Uncoupling of photophosphorylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, ATP production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, SREBF1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Liver Steatosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AKT2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, SREBF1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Ketogenesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Fatty acid</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>peroxisome proliferator activated receptor promoter demethylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, FA Influx</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, FA Influx</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Triglyceride formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Up Regulation, SCD-1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Triglyceride</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, AhR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Up Regulation, SCD-1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, Epithelial Mesenchymal Transition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Collagen</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Differentiation of fibroblasts</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Collagen</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Transforming Growth Factor beta pathway</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, Epithelial Mesenchymal Transition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Transforming Growth Factor beta pathway</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Differentiation of fibroblasts</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Latent Transforming Growth Factor Beta 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, Transforming Growth Factor beta pathway</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased sperm quantity or quality in the adult, Decreased fertility </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>impaired, Fertility</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, testosterone level</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased sperm quantity or quality in the adult, Decreased fertility </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Repressed expression of steroidogenic enzymes </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Testosterone synthesis in Leydig cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased apoptosis, decreased number of adult Leydig Cells </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Testosterone synthesis in Leydig cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Glucocorticoid Receptor Agonist, Activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Repressed expression of steroidogenic enzymes </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Glucocorticoid Receptor Agonist, Activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased apoptosis, decreased number of adult Leydig Cells </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impairment, Learning and memory</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, locomotion</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, histaminergic neuron excitation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment, Learning and memory</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Swimming performance</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, survival</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Swimming performance</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Growth, reduction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Notochord distortion or malformations</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Swimming performance</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inadequate DNA repair</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mutations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Weak collagen matrix</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Notochord distortion or malformations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction of collagen crosslinking</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Weak collagen matrix</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of lysyl oxidase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction of collagen crosslinking</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Thiol group of chemicals interact with sulfuhydryl groups of proteins to form thiol adducts</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition of lysyl oxidase</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>DNA double-strand break </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td> MLL chromosomal translocation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding to (interferes with) topoisomerase II enzyme</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>DNA double-strand break </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Accumulation, Collagen</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Pulmonary fibrosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>decreased methylation of dopamine transporter promoter</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>decreased dopamine</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>decreased DNA methylation of tyrosine hydroxylase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>decreased dopamine</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>decreased methylation of dopamine transporter promoter</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>obesity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>decreased DNA methylation of tyrosine hydroxylase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>obesity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>decreased reward</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>decreased dopamine</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>decreased reward</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>decreased methylation of dopamine transporter promoter</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>decreased reward</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>decreased DNA methylation of tyrosine hydroxylase</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>decreased dopamine</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>decreased reward</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>chronic high fat diet</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>decreased dopamine</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>increased adipogenesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>obesity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>activation of CCAAT/enhancer-binding protein alpha</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>increased adipogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>activation of CCAAT/enhancer-binding protein alpha</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation of specific nuclear receptors, PPAR-gamma activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation of specific nuclear receptors, PPAR-gamma activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>increased adipogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>peroxisome proliferator activated receptor promoter demethylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation of specific nuclear receptors, PPAR-gamma activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, De Novo FA synthesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Liver Steatosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, LXR alpha</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, De Novo FA synthesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Reactive Oxygen Species production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Lipid peroxidation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Follicular atresia</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Oogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Inducible Nitric Oxide Synthase by Metabolite CGA 265307</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, Sustained Hepatotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Acute phase response proteins expression, Increased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Systemic acute phase response</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased CGRP, neuronal release of CGRP</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Respiratory irritability and Chronic Cough, </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Trigeminal nerve activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased neurokinin A (NKA) by neuronal cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Trigeminal nerve activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Irritation of nasal mucosa inducing sneeze reflex</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hyperplasia, Hyperplasia</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Promotion, Hepatocelluar carcinoma</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Trigeminal nerve activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased CGRP, neuronal release of CGRP</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Trigeminal nerve activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>SP (Substance P) release, Local increase of SP</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of neurotransmitter vesicle release</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Anti-depressant Activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>hyperpolarisation, neuron</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Anti-depressant Activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Serotonin 1A Receptor Agonism</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Release of G Proteins</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of neurotransmitter vesicle release</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Analgesia</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition of N-type Ca ion channels</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition of neurotransmitter vesicle release</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Release of G Proteins</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition of N-type Ca ion channels</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Cardiovascular development/function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Early Life Stage Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>hyperpolarisation, neuron</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Analgesia</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Opening of G protein gated inward rectifying K channels</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>hyperpolarisation, neuron</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Release of G Proteins</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Opening of G protein gated inward rectifying K channels</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mu Opioid Receptor Agonism</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Release of G Proteins</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, fatty acid beta oxidation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, steatosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, HSD17B4 activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, fatty acid beta oxidation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, PPARalpha</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, HSD17B4 activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activated, LXR</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, PPARalpha</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, SHP activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activated, LXR</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, FXR activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, SHP activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>NFE2/Nrf2 repression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, FXR activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, RDX dose</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, GABA-A receptor activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, intracellular chloride</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activated, membrane depolarization</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, GABA-A receptor activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, intracellular chloride</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, GABA</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, GABA-A receptor activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, presynaptic neuron 2 activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, GABA</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, seizure</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, epilepsy</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, hippocampal hyperdepolarization</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, seizure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, surfactant</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, mucosal defense</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Helicobacter pylori infection</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, ammonium (NH4+)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, leukocyte activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activated, gastric ulcer formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, leukocyte adherence</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, leukocyte activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, PTGS2 function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, leukocyte adherence</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, angiogenesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activated, gastric ulcer formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, PTGS2 function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, angiogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, bicarbonate</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, mucosal defense</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, HSD17B10 expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, 3-hydroxyacyl-CoA dehydrogenase type-2 activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, PTGS1 function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, bicarbonate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, mucous</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, mucosal defense</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, PTGS1 function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, mucous</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, mucosal defense</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activated, gastric ulcer formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, mucosal blood flow</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, mucosal defense</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, PTGS1 function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, mucosal blood flow</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, platelet aggregation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activated, gastric ulcer formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, PTGS1 function</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, platelet aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, extracellular serotonin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, 5-HT2A (Serotonin 2A)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, 5-HT3</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, seizure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, extracellular serotonin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, 5-HT3</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, serotonin transporter activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, extracellular serotonin</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, synaptic release</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, extracellular serotonin</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, packaged serotonin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, synaptic release</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, intracellular serotonin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, packaged serotonin</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, serotonin transporter activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, intracellular serotonin</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, BDNF (Brain-derived neurotrophic factor)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, neuroplasticity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, glucocorticoid receptor activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, BDNF (Brain-derived neurotrophic factor)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, persistent proliferation/sustained proliferation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Liver Cancer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hepatocytotoxicity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Liver Cancer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Liver Cancer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation of Cyp2E1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hepatocytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hepatocytotoxicity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, persistent proliferation/sustained proliferation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Oxidative Stress </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hepatocytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation of Cyp2E1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Oxidative Stress </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inactivated, 5-HTR (serotonin receptors)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, BDNF (Brain-derived neurotrophic factor)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Suppression, IL-2 and IL-4 production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment, T-cell dependent antibody response</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, NFAT/AP-1 complex formation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Suppression, IL-2 and IL-4 production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Calcineurin Activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Interference, nuclear localization of NFAT</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced levels of BDNF</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment, Learning and memory</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Thyroid hormone synthesis, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment, Learning and memory</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Thyroid hormone synthesis, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of GABAergic interneurons</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Thyroid hormone synthesis, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced levels of BDNF</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Na+/I- symporter (NIS)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment, Learning and memory</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dopamine release in the brain, decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Sexual behavior, decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Locomotor activity, decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Reproductive Success</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Sexual behavior, decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Reproductive Success</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>7α-hydroxypregnenolone synthesis in the brain, decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Sexual behavior, decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dopamine release in the brain, decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Locomotor activity, decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>7α-hydroxypregnenolone synthesis in the brain, decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Dopamine release in the brain, decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>7α-hydroxypregnenolone synthesis in the brain, decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Locomotor activity, decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>CYP7B activity, inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Locomotor activity, decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>CYP7B activity, inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>7α-hydroxypregnenolone synthesis in the brain, decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, surfactant</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activate, mucosal defense</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activate, phospholipase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, surfactant</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, ammonium (NH4+)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, surfactant</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, mucosal blood flow</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activate, mucosal defense</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, mucous</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activate, mucosal defense</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, bicarbonate </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activate, mucosal defense</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, PTGS-1 (Prostaglandin-endoperoxide synthase 1)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, bicarbonate </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, PTGS-1 (Prostaglandin-endoperoxide synthase 1)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, mucous</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, PTGS-1 (Prostaglandin-endoperoxide synthase 1)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, mucosal blood flow</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, PTGS-1 (Prostaglandin-endoperoxide synthase 1)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, platelet aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, PTGS-2 (Prostaglandin-endoperoxide synthase 2)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, angiogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, PTGS-2 (Prostaglandin-endoperoxide synthase 2)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, leukocyte adherence</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, leukocyte adherence</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activate, leukocyte </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activate, leukocyte </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activated, gastric ulcer formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activate, mucosal defense</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibit, gastric ulcer formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, platelet aggregation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibit, gastric ulcer formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, angiogenesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibit, gastric ulcer formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Oogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA damage</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, intracellular chloride (Cl-)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inactive, membrane depolarization</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activate, GABA-A receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, intracellular chloride (Cl-)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, RDX dose</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activate, GABA-A receptor</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, GABA</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activate, GABA-A receptor</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activate, presynaptic neuron 2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, GABA</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, seizure</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, epilepsy</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, hippocampal hyperdepolarization</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, seizure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activated, membrane depolarization</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, hippocampal hyperdepolarization</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activated, voltage-gated sodium channel</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activated, membrane depolarization</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Treat, carbamazepine</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibit, voltage-gated sodium channel</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, intracellular sodium (Na+)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activated, voltage-gated sodium channel</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activated, NMDA receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, intracellular sodium (Na+)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, glutamate</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activated, NMDA receptor</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activated, presynaptic neuron 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, glutamate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Glucocorticoid Receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, BDNF (Brain-derived neurotrophic factor)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, cortisone</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, Glucocorticoid Receptor</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, neuroplasticity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, depression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, neuroplasticity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, agitation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduce expression, BDNF (Brain-derived neurotrophic factor)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, neuroplasticity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inactivated, 5-HTR (serotonin receptors)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduce expression, BDNF (Brain-derived neurotrophic factor)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, 5-HT3 (5-hydroxytryptamine)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, seizure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, vascular smooth muscle contraction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, hypertension</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, myosin light chain phosphorylation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, vascular smooth muscle contraction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activate, calmodulin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, myosin light chain phosphorylation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, intracellular calcium</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activate, calmodulin</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, inositol triphosphate</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, intracellular calcium</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activate, PLC (Phospholipase C)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, inositol triphosphate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, 5-HT2A (Serotonin 2A)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activate, PLC (Phospholipase C)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, extracellular serotonin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, 5-HT2A (Serotonin 2A)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, extracellular serotonin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inactivated, 5-HTR (serotonin receptors)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, extracellular serotonin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, 5-HT3 (5-hydroxytryptamine)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, synaptic release</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, extracellular serotonin</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, packaged serotonin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, synaptic release</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, intracellular serotonin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, packaged serotonin</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, serotonin transporter activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, intracellular serotonin</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, serotonin transporter activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, extracellular serotonin</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Gonadotropins, circulating concentrations</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Testosterone synthesis by ovarian theca cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, serotonin transporter activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, extracellular chloride (Cl-)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, serotonin transporter activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, extracellular sodium (Na+) </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, serotonin transporter activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, intracellular chloride (Cl-)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, serotonin transporter activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, intracellular sodium (Na+)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hippocampal Physiology, Altered</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hippocampal anatomy, Altered </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hippocampal gene expression, Altered </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Plasma 17beta-estradiol concentrations</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Plasma vitellogenin concentrations</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Agonism, Androgen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Vitellogenin synthesis in liver</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Agonism, Androgen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, 17beta-estradiol synthesis by ovarian granulosa cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Defect of Embryogenesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reproductive failure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Wnt pathway</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Defect of Embryogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, FOXO</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, Wnt pathway</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, JNK</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, FOXO</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Peptide Oxidation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, JNK</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Glutathione homeostasis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hepatotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Perturbation of cholesterol</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hepatotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Down Regulation, GSS and GSTs gene</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Glutathione homeostasis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, 3-hydroxy-3-methylglutaryl-CoA reductase gene</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Perturbation of cholesterol</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Glutathione synthesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, 3-hydroxy-3-methylglutaryl-CoA reductase gene</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Down Regulation, GSS and GSTs gene</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Glutathione synthesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Up Regulation, Unsaturated fatty acid</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Perturbation of cholesterol</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Up Regulation, SREBF2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Up Regulation, Unsaturated fatty acid</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, TGF-beta pathway</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reproductive failure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, JAK/STAT pathway</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, TGF-beta pathway</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Apoptosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reproductive failure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Damaging, Mitochondria</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, DNA Damage-Repair</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, HIF-1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Oxidative Stress / Activation, PMK-1 P38 MAPK</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, HIF-1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Oxidative Stress / Activation, PMK-1 P38 MAPK</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Damaging, Mitochondria</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Oxidative Stress / Activation, PMK-1 P38 MAPK</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, DNA Damage-Repair</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>ROS formation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Oxidative Stress / Activation, PMK-1 P38 MAPK</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, NADPH Oxidase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>ROS formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Gap</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Ca and HCO3 transport to shell gland</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Collagen Deposition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Lung fibrosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inactivation of PPARγ</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation of TGF-β signaling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, COX-2 expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Cardiovascular development/function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>dimerization, AHR/ARNT</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, COX-2 expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Excitatory postsynaptic potential</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Abdominal muscle contraction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Ecdysis motoneuron bursts</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Excitatory postsynaptic potential</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Circulating crustacean cardioactive peptide</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Ecdysis motoneuron bursts</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Circulating ecdysis triggering hormone</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Circulating crustacean cardioactive peptide</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Fushi tarazu factor-1 gene expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, Circulating ecdysis triggering hormone</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Nuclear receptor E75b gene expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Fushi tarazu factor-1 gene expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Ecdysone receptor agonism</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Nuclear receptor E75b gene expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mitochondrial impairment</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Necrosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mitochondrial impairment</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>narcosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Mitochondrial impairment</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Direct mitochondrial inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Mitochondrial impairment</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decompartmentalization</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Mitochondrial impairment</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, 5-hydroxytryptamine transporter (5-HTT; SERT)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, oocyte maturation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, serotonin (5-HT) </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>increased mantel display</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, cilia movement</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induced parturition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, valve movement</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induced parturition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, serotonin (5-HT) </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, cilia movement</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, serotonin (5-HT) </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, muscular waves in foot</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td> MLL chromosomal translocation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Infant leukaemia</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, FAS</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Synthesis, De Novo FA</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, oocyte maturation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>induced spawning</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, serotonin (5-HT) </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, valve movement</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induced parturition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Reproductive Success</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>induced spawning</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Reproductive Success</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induced parturition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Reproductive Success</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>increased mantel display</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induced parturition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, cilia movement</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>induced spawning</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, valve movement</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>induced spawning</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, FA Influx</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Triglyceride</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, 5-hydroxytryptamine transporter (5-HTT; SERT)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>increased mantel display</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, 5-hydroxytryptamine transporter (5-HTT; SERT)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, cilia movement</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, 5-hydroxytryptamine transporter (5-HTT; SERT)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, valve movement</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, 5-hydroxytryptamine transporter (5-HTT; SERT)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, muscular waves in foot</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Ca2+-calmodulin activated signal transduction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Ca2+-calmodulin activated signal transduction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment, Learning and memory</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Desensitization, Nicotinic acetylcholine receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Ca2+-calmodulin activated signal transduction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Second Messenger Production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Non-genomic signaling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Estrogen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Second Messenger Production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Motility</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Invasion</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Protein Production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Motility</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Protein Production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Apoptosis (Epithelial Cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Protein Production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Proliferation (Endothelial cells) </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Non-genomic signaling</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Gene Expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, DNA damage</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Gene Expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Oxidative Stress</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, DNA damage</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Protein Production</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Oxidative Stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered, Gene Expression</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Protein Production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, ER binding to T.F. to DNA (non-classical pathway)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Gene Expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, ER binding to DNA (classical pathway) </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Gene Expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Non-genomic signaling</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, ER binding to T.F. to DNA (non-classical pathway)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Estrogen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Non-genomic signaling</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Antagonism, Estrogen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, Vitellogenin synthesis in liver</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Agonism, Estrogen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Vitellogenin synthesis in liver</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Opening of calcium channel, Calcium influx</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Trigeminal nerve activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>TRPA1 activation, TRPA1 Receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Opening of calcium channel, Calcium influx</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Agonism, Estrogen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impaired development of, Reproductive organs</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Altered gene expression specific to CAR activation, Hepatocytes</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, cell proliferation (hepatocytes)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Constitutive androstane receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered gene expression specific to CAR activation, Hepatocytes</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Migration (Endothelial Cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Angiogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Proliferation (Endothelial cells) </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Angiogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decline, Population</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Alteration, Food-web structures</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Male offspring</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decline, Population</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, Male reproductive tract</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Male offspring</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, Doublesex1 gene</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, Male reproductive tract</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Juvenile hormone receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, Doublesex1 gene</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Agonism, Estrogen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Reproductive behaviour</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Ductal Hyperplasia </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Breast Cancer</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, ER binding to T.F. to DNA (non-classical pathway)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell Proliferation (Epithelial Cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, ER binding to DNA (classical pathway) </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Cell Proliferation (Epithelial Cells)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Impairment, Endothelial network</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Insufficiency, Vascular</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Estrogen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, ER binding to T.F. to DNA (non-classical pathway)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Apoptosis (Epithelial Cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Ductal Hyperplasia </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Cell Proliferation (Epithelial Cells)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Ductal Hyperplasia </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Estrogen receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, ER binding to DNA (classical pathway) </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, sodium conductance 2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, GABA release</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, sodium channel</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, sodium conductance 2</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, cell proliferation (hepatocytes)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Clonal Expansion of Altered Hepatic Foci</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Clonal Expansion of Altered Hepatic Foci</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, hepatocellular adenomas and carcinomas</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Phenotypic enzyme activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, cell proliferation (hepatocytes)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduction, Eggshell thickness</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>N/A, Reproductive failure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, PPARα</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Phenotypic enzyme activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, valve movement</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, predation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, water retention in foot</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, valve movement</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Reproductive Success</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Population</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, serotonin (5-HT) </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, oocyte maturation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Hepatic nuclear receptor(s)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, Upregulation of glucuronyltransferase activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Hepatic nuclear receptor(s)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Hepatic thyroid hormone uptake/transport</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Dual oxidase</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Thyroid hormone synthesis, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Pendrin</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Thyroid hormone synthesis, Decreased</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Deiodinase 3</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Triiodothyronine (T3) in tissues</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Deiodinase 2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Triiodothyronine (T3) in tissues</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Deiodinase 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Triiodothyronine (T3) in tissues</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Iodotyrosine deiodinase (IYD)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease of Thyroidal iodide</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Depletion, energy reserves</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, predation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, locomotion</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Depletion, energy reserves</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, foot detachment</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Depletion, energy reserves</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, water retention in foot</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, foot detachment</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, valve movement</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, water retention in foot</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, valve movement</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Depletion, energy reserves</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced fitness or even mortality, Acidosis, hypovolemic shock and organ dysfunction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impaired recruitment , Population trajectory</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Blood loss and development of anemia, Impaired oxygen delivery and nutrient delivery to tissue, impaired carbon dioxide and waste product removal</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced fitness or even mortality, Acidosis, hypovolemic shock and organ dysfunction</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Failure in vascular repair mechanisms, Unresolved blood loss (hemorrhage)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Blood loss and development of anemia, Impaired oxygen delivery and nutrient delivery to tissue, impaired carbon dioxide and waste product removal</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Under carboxylated clotting factors will not assemble on cell surfaces to form clot, Failure of secondary hemostasis  </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Failure in vascular repair mechanisms, Unresolved blood loss (hemorrhage)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Irreversible inhibition of hepatic VKOR by binding of AR at tyrosine 139, Failure to cycle vitamin K epoxide to vitamin K to form vitamin K hydroquinone</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Failure in gamma-glutamyl carboxylation of  clotting factors II, VII, IX and X, Under carboxylation of clotting factors (e.g., des-gamma-carboxy prothrombin) </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hemostasis, Depletion from blood of fully functional carboxylated clotting factors</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Under carboxylated clotting factors will not assemble on cell surfaces to form clot, Failure of secondary hemostasis  </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Failure in gamma-glutamyl carboxylation of  clotting factors II, VII, IX and X, Under carboxylation of clotting factors (e.g., des-gamma-carboxy prothrombin) </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hemostasis, Depletion from blood of fully functional carboxylated clotting factors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Triiodothyronine (T3) in tissues</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Altered, Amphibian metamorphosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Reactive oxygen species</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Oxidative Stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Unknown, MIE</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Reactive oxygen species</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Oxidative Stress</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, renal proximal tubular necrosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, renal ischemia</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Oxidative Stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, blood uric acid concentration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Oxidative Stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Energetic demands and therefore metabolic stress</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Abnormal, Foraging activity and behavior</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, renal proximal tubular necrosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, blood uric acid concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Deformed Wing Virus levels</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Weakened, Colony</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Weakened, Colony</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>impaired, Hive thermoregulation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Weakened, Colony</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Mitochondrial dysfunction 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>impaired, Hive thermoregulation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Abnormal, Role change within caste</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Weakened, Colony</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Abnormal, Foraging activity and behavior</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Abnormal, Role change within caste</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Nicotinic acetylcholine receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment, Learning and memory</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Weakened, Colony</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Death/Failure, Colony</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Abnormal, Foraging activity and behavior</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Weakened, Colony</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, cardiac arrhythmia</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, blood potassium concentration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, cardiac arrhythmia</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Prostaglandin F2alpha concentration, plasma </td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, renal ischemia</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Cyclooxygenase 1 activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Prostaglandin F2alpha concentration, plasma </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, renal proximal tubular necrosis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, blood potassium concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Occurrence, tophi (urate) deposition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, renal proximal tubular necrosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, blood uric acid concentration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Occurrence, tophi (urate) deposition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, organic anion transporter 1 (OAT1)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, blood uric acid concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Cell Proliferation (mesothelium)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, mesotheliomas</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, secretion of local growth factors</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Cell Proliferation (mesothelium)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Oxidative Stress</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, secretion of local growth factors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, inflammation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, secretion of local growth factors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>persistent, cytotoxicity (pleura or peritoneum)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Oxidative Stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>persistent, cytotoxicity (pleura or peritoneum)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, inflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, hyperplasia (mammary gland)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Adenomas/carcinomas (mammary)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, hyperplasia (mammary gland)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, latency period</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, prolactin secretion</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, hyperplasia (mammary gland)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Dopaminergic activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, prolactin secretion</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, lactotroph hyperplasia and hypertrophy</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, adenomas (pituitary)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, circulating estrogen levels</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, lactotroph hyperplasia and hypertrophy</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>interruption, Ovulation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, circulating estrogen levels</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, latency period</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Adenomas/carcinomas (mammary)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hyperplasia, Mammary gland</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Adenomas/carcinomas (mammary)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hyperplasia, Mammary gland</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, latency period</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, prolactin exposure</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hyperplasia, Mammary gland</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, circulating estrogen levels</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hyperplasia, Mammary gland</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>prolonged, estrus</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, prolactin exposure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>prolonged, estrus</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, circulating estrogen levels</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, LH Surge from anterior pituitary</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>prolonged, estrus</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, LH Surge from anterior pituitary</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>interruption, Ovulation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, GnRH pulsatility/release in hypothalamus</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, LH Surge from anterior pituitary</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Hyperplasia (glandular epithelial cells of endometrium)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, adenosquamous carcinomas of endometrium</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>squamous metaplasia, aberrant basal cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Hyperplasia (glandular epithelial cells of endometrium)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Proliferation/Clonal Expansion, aberrant basal cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>squamous metaplasia, aberrant basal cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Promotion, SIX-1 postive basal-type progenitor cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Proliferation/Clonal Expansion, aberrant basal cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, estrogen receptor alpha</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Promotion, SIX-1 postive basal-type progenitor cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>prepubertal increase, Estrogen receptor (ER) activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Activation, estrogen receptor alpha</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, bile flow</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, cholestasis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, cholestasis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>prolonged, elevation of serun CCK</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Synthesis, De Novo FA</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Triglyceride</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Acetylcholinesterase (AchE) Inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Acetylcholine accumulation in synapses</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Cellular proliferation / hyperplasia of acinar cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Pancreatic acinar tumors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>prolonged, elevation of serun CCK</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Cellular proliferation / hyperplasia of acinar cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, PPAR-alpha activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Alteration, lipid metabolism</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, PPAR-alpha activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, cholestasis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, PPAR-alpha activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, bile flow</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hyperplasia, ovarian stromal cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Promotion, ovarian granular cell tumors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hyperplasia, ovarian epithelium</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Promotion, ovarian adenomas</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, secretion of LH from anterior pituitary</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hyperplasia, ovarian stromal cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, secrection of FSH from anterior pituitary</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hyperplasia, ovarian epithelium</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, secrection of FSH from anterior pituitary</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hyperplasia, ovarian stromal cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, secretion of GnRH from hypothalamus</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, secretion of LH from anterior pituitary</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, secretion of GnRH from hypothalamus</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, secrection of FSH from anterior pituitary</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, E2 blood concentrations at hypothalamus</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, secretion of GnRH from hypothalamus</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Suppression, Estrogen receptor (ER) activity</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, E2 blood concentrations at hypothalamus</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Ovarian E2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, E2 blood concentrations at hypothalamus</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hypertrophy/hyperplasia, smooth muscle</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Promotion, mesovarian leiomyomas</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Proliferation/Clonal Expansion, smooth muscle</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Hypertrophy/hyperplasia, smooth muscle</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>relaxation, smooth muscle</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Proliferation/Clonal Expansion, smooth muscle</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased activity, beta-2 adrenergic receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>relaxation, smooth muscle</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Release, Cytokine</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Inflammation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, beta-2 adrenergic receptor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased activity, beta-2 adrenergic receptor</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, proliferation of mesenchymal cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, hemagiosarcoma</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, proliferation of mesenchymal cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, liposarcoma</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, proliferation of mesenchymal cells</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Firbrosarcoma</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, secretion of local growth factors</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, IGF-1 (mouse)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, secretion of local growth factors</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, proliferation of mesenchymal cells</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, adipogenesis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, secretion of local growth factors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation of specific nuclear receptors, PPAR-gamma activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, secretion of local growth factors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation of specific nuclear receptors, PPAR-gamma activation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, adipogenesis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, UROD</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Accumulation, Highly carboxylated porphyrins</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>N/A, Neurodegeneration</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Impairment, Learning and memory</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Antagonism, Histamine Receptor (H2)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decrease, histaminergic neuron excitation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, pharyngeal muscle paralysis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, Feeding</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Inhibitory postsynaptic potential</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, pharyngeal muscle paralysis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, Glutamate-gated chloride channels</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Chloride conductance</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Feeding</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, Somatic muscle paralysis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Inhibition, Feeding</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Inhibitory postsynaptic potential</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Induction, Somatic muscle paralysis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Neuronal synaptic inhibition</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Inhibitory postsynaptic potential</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increased, Chloride conductance</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Neuronal synaptic inhibition</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Activation, ionotropic GABA Receptor chloride channel</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Chloride conductance</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Induction, Somatic muscle paralysis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Deiodinase 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Posterior swim bladder inflation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Deiodinase 2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Posterior swim bladder inflation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td> Thyroxine (T4) in serum, Decreased</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Anterior swim bladder inflation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Deiodinase 1</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Triiodothyronine (T3)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Insufficiency, Vascular</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increased, Developmental Defects</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Triiodothyronine (T3)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Anterior swim bladder inflation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Anterior swim bladder inflation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Swimming performance</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Reduced, Posterior swim bladder inflation</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Swimming performance</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decreased, Triiodothyronine (T3)</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduced, Posterior swim bladder inflation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Inhibition, Deiodinase 2</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, Triiodothyronine (T3)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>stabilization, PPAR alpha co-repressor</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Decreased, PPARalpha transactivation of gene expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Binding of antagonist, PPAR alpha</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>stabilization, PPAR alpha co-repressor</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Interference, nuclear localization of NFAT</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Reduction, NFAT/AP-1 complex formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Decrease, Abdominal muscle contraction</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Incomplete ecdysis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Increase, Incomplete ecdysis</td>
    <td>https://h2020-sbd4nano.github.io/sbd-data-aopwiki/relationships/</td>
    <td>Increase, Mortality</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lysosomal damage</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>cathepsins</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>mitochondrial damage</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lysosomal damage</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cathepsins</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>cell uptake (amount)</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>lysosomal damage</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Phagocytosis</td>
    <td>https://www.sbd4nano.eu/bel/#kindOf</td>
    <td>cell uptake (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>Phagocytosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Pottasium</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>inflammasome activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>caspase-1</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>mature IL-1β</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>pro-caspase-1</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>caspase-1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>pro-interleukin (IL)-1β</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>mature IL-1β</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>NF-κB activation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>pro-interleukin (IL)-1β</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>NF-κB activation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>NLRP3 expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>Zeta-potential</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>Zeta-potential</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>Zeta-potential</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>Zeta-potential</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>inflammasome activation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>pro-caspase-1</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>inflammasome activation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>apoptosis-associated speck-like protein containing a CARD</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>inflammasome activation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>NLRP3 expression</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>ROS production</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>inflammasome activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>ROS production</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>oxidative stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>NADPH oxidase (NOX1) activation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aspect ratio (HARN)</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>NADPH oxidase (NOX1) activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aspect ratio (HARN)</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>frustrated phagocytosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Toll-like receptors</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>NF-κB activation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Toll-like receptors</td>
    <td>https://www.sbd4nano.eu/bel/#partOf</td>
    <td>cell membrane</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>charge</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>charge</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>charge</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>charge</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Pathogen-associated molecular patterns</td>
    <td>https://www.sbd4nano.eu/bel/#recognizedBy</td>
    <td>Toll-like receptors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lipopolysaccharides</td>
    <td>https://www.sbd4nano.eu/bel/#kindOf</td>
    <td>Pathogen-associated molecular patterns</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>medium</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>light</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>light</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>photo-reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>surface charge</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>surface charge</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>surface charge</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>charge</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Zeta-potential</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>sedimentation rate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>deformability</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>shape</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>deformability</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>size</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>charge</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>protein corona</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>cell uptake (type)</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>liver/spleen activity</td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorrelates</td>
    <td>concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>surface area</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>surface area</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>photo-reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>ROS production</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>ROS production</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>cell uptake (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>cell uptake (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>ROS production</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>ROS production</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>cytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>cytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>liver/spleen activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>liver/spleen activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>liver/spleen activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>liver/spleen activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>time of exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>time of exposure</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>surface area</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>surface area</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>time of exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>surface area</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>time of exposure</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>surface area</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>quantum and tunneling effects</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>quantum and tunneling effects</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>quantum and tunneling effects</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>quantum and tunneling effects</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>lactate dehydrogenase</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>lactate dehydrogenase</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>lactate dehydrogenase</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>lactate dehydrogenase</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>kidney activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>kidney activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>kidney activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>kidney activity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>cell type</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>cell type</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>cell type</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>cell type</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorrelates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>layers</td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorrelates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>layers</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorrelates</td>
    <td>photo-reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>photo-reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>layers</td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorrelates</td>
    <td>photo-reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>layers</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>photo-reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>size</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>enzyme degredation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>enzyme degredation</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>enzyme degredation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>enzyme degredation</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>kidney activity</td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorrelates</td>
    <td>concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>kidney activity</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>ROS production</td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorrelates</td>
    <td>concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>ROS production</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>kidney activity</td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorrelates</td>
    <td>oxidative stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>kidney activity</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>oxidative stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>ROS production</td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorrelates</td>
    <td>oxidative stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>ROS production</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>oxidative stress</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>dissolution</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>dissolution</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>dissolution</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>crystal structure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>dissolution</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>crystal structure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>crystal structure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#unknown</td>
    <td>crystal structure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>amination</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>amination</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>dissolution</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>dissolution</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>amination</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>amination</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>cell uptake (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>dissolution</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>dissolution</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>cell uptake (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>dissolution</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>environmental fate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>dissolution</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>environmental fate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>environmental fate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>environmental fate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>membrane crossing</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>membrane crossing</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>membrane crossing</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>membrane crossing</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>activation of caspase-3</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>activation of caspase-3</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>activation of caspase-3</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>activation of caspase-3</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>PEGylation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>PEGylation</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>cell uptake (amount)</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>cell uptake (amount)</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>PEGylation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>PEGylation</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>cell uptake (amount)</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>cell uptake (amount)</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>time of exposure</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>photo-reactivity</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>photo-reactivity</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>time of exposure</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>time of exposure</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>photo-reactivity</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>photo-reactivity</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>time of exposure</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>organ (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>organ (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure route</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>organ (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure route</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>organ (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure route</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure route</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>cytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure route</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure route</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>cytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure route</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure route</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure route</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure route</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure route</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure route</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>concentration</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>medium</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>medium</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure route</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>medium</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure route</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>medium</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure route</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>immunoproteasome LMP7</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>immunoproteasome LMP7</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>concentration</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>immunoproteasome LMP7</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>concentration</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>immunoproteasome LMP7</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>concentration</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>concentration</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>concentration</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>concentration</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>immunoproteasome LMP7</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>concentration</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>immunoproteasome LMP7</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>concentration</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>concentration</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>Toll-like receptors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>Toll-like receptors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>concentration</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>Toll-like receptors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>concentration</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>Toll-like receptors</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>medium</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>medium</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>autophagy</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>autophagy</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>medium</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>autophagy</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>medium</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>autophagy</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>exfoliation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>exfoliation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hydrophilicity</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>exfoliation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hydrophilicity</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>exfoliation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>interaction potential</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>interaction potential</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hydrophilicity</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>interaction potential</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Hydrophilicity</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>interaction potential</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>granuloma formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>granuloma formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>medium</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>granuloma formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>medium</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>granuloma formation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>medium</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>medium</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>medium</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>medium</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>medium</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>medium</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>membrane crossing</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>membrane crossing</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>membrane crossing</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>membrane crossing</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>environmental fate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>environmental fate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>environmental fate</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell adhesion</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell adhesion</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell adhesion</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell adhesion</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>cytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>cytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Dose</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>aggregation</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>cytotoxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>interaction potential</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>interaction potential</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>interaction potential</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>interaction potential</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>aggregation</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>photo-reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>exposure</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>photo-reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>crystal structure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>photo-reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>crystal structure</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>photo-reactivity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>crystal structure</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>crystal structure</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>stacks</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>stacks</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>temperature</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>temperature</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>stacks</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>size</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>stacks</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>size</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>temperature</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>size</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>temperature</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>size</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>Hydrophilicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>Hydrophilicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Surface charge</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>Hydrophilicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Surface charge</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>Hydrophilicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>crystal structure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>crystal structure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Surface charge</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>crystal structure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Surface charge</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>crystal structure</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>length</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>length</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>size</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>size</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>length</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>size</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>length</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>size</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>cell type</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>size</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>cell type</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>size</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>diameter</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>size</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>diameter</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>size</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>cell type</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>cell type</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>diameter</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>diameter</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>diameter</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>diameter</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>diameter</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>diameter</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#positivelyCorrelates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>shape</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>shape</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>shape</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>shape</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>shape</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Surface charge</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Surface charge</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>shape</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>shape</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell uptake (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Surface charge</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Surface charge</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell uptake (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>ultraviolet shielding function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>ultraviolet shielding function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mn-impurity</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>ultraviolet shielding function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mn-impurity</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>ultraviolet shielding function</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mn-impurity</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mn-impurity</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mn-impurity</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mn-impurity</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>toxicity</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mn-impurity</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>Mn-impurity</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>cell viability</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>cell uptake (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#DoesNotCorrelate</td>
    <td>cell uptake (type)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>activation of caspase-3</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>activation of caspase-3</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>activation of caspase-3</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>activation of caspase-3</td>
    <td>https://www.sbd4nano.eu/bel/#PositivelyCorrelates</td>
    <td>Apoptosis</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>cell uptake (amount)</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>lateral dimension</td>
    <td>https://www.sbd4nano.eu/bel/#NegativelyCorrelates</td>
    <td>ROS production</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>Surface charge</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>Surface charge</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>Surface charge</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>Surface charge</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>protein corona</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>dissolution</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>Suspension</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>coating/surface chemistry</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>Suspension</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>Suspension</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>core composition</td>
    <td>https://www.sbd4nano.eu/bel/#Correlates</td>
    <td>Suspension</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>surface modification</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>bioassay profile</td>
    <td>Nanomaterial</td>
    <td></td>
  </tr>
  <tr>
    <td>surface modification</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>bioassay profile</td>
    <td>Nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>surface modification</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>bioassay profile</td>
    <td>nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>particle type</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>bioassay profile</td>
    <td>Metal Oxide</td>
    <td></td>
  </tr>
  <tr>
    <td>particle type</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>bioassay profile</td>
    <td>metal oxide nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>surface modification</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>bioassay profile</td>
    <td>Metal Oxide</td>
    <td></td>
  </tr>
  <tr>
    <td>surface modification</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>bioassay profile</td>
    <td>metal oxide nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>bioassay reading</td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorreclates</td>
    <td>log 1/EC50</td>
    <td>Metal Oxide</td>
    <td></td>
  </tr>
  <tr>
    <td>bioassay reading</td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorreclates</td>
    <td>log 1/EC50</td>
    <td>metal oxide nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>exposure concentration</td>
    <td>https://www.sbd4nano.eu/bel/#changes</td>
    <td>LDH release</td>
    <td>Nanomaterial</td>
    <td></td>
  </tr>
  <tr>
    <td>exposure concentration</td>
    <td>https://www.sbd4nano.eu/bel/#changes</td>
    <td>LDH release</td>
    <td>Nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>exposure concentration</td>
    <td>https://www.sbd4nano.eu/bel/#changes</td>
    <td>LDH release</td>
    <td>nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>LDH release</td>
    <td>Nanomaterial</td>
    <td></td>
  </tr>
  <tr>
    <td>Particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>LDH release</td>
    <td>Nanomaterial</td>
    <td></td>
  </tr>
  <tr>
    <td>particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>LDH release</td>
    <td>Nanomaterial</td>
    <td></td>
  </tr>
  <tr>
    <td>particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>LDH release</td>
    <td>Nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>Particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>LDH release</td>
    <td>Nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>LDH release</td>
    <td>Nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>LDH release</td>
    <td>nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>Particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>LDH release</td>
    <td>nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>LDH release</td>
    <td>nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>surface modification</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td>Nanomaterial</td>
    <td></td>
  </tr>
  <tr>
    <td>surface modification</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td>Nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>surface modification</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td>nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td>Nanomaterial</td>
    <td></td>
  </tr>
  <tr>
    <td>Particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td>Nanomaterial</td>
    <td></td>
  </tr>
  <tr>
    <td>particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td>Nanomaterial</td>
    <td></td>
  </tr>
  <tr>
    <td>particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td>Nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>Particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td>Nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td>Nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td>nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>Particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td>nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>particle size</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>toxicity</td>
    <td>nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>particle size</td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorrelates</td>
    <td>oxditation state</td>
    <td>Metal Oxide</td>
    <td></td>
  </tr>
  <tr>
    <td>Particle size</td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorrelates</td>
    <td>oxditation state</td>
    <td>Metal Oxide</td>
    <td></td>
  </tr>
  <tr>
    <td>particle size</td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorrelates</td>
    <td>oxditation state</td>
    <td>Metal Oxide</td>
    <td></td>
  </tr>
  <tr>
    <td>particle size</td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorrelates</td>
    <td>oxditation state</td>
    <td>metal oxide nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>Particle size</td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorrelates</td>
    <td>oxditation state</td>
    <td>metal oxide nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>particle size</td>
    <td>https://www.sbd4nano.eu/bel/#negativelyCorrelates</td>
    <td>oxditation state</td>
    <td>metal oxide nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>pH</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>zeta potential</td>
    <td>Metal Oxide</td>
    <td></td>
  </tr>
  <tr>
    <td>pH value</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>zeta potential</td>
    <td>Metal Oxide</td>
    <td></td>
  </tr>
  <tr>
    <td>pH</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>zeta potential</td>
    <td>Metal Oxide</td>
    <td></td>
  </tr>
  <tr>
    <td>pH value</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>zeta potential</td>
    <td>Metal Oxide</td>
    <td></td>
  </tr>
  <tr>
    <td>pH</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>zeta potential</td>
    <td>metal oxide nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>pH value</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>zeta potential</td>
    <td>metal oxide nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>pH</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>zeta potential</td>
    <td>metal oxide nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>pH value</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>zeta potential</td>
    <td>metal oxide nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>zeta potential</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>aggregation</td>
    <td>Metal Oxide</td>
    <td></td>
  </tr>
  <tr>
    <td>zeta potential</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>aggregation</td>
    <td>Metal Oxide</td>
    <td></td>
  </tr>
  <tr>
    <td>zeta potential</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>aggregation</td>
    <td>Metal Oxide</td>
    <td></td>
  </tr>
  <tr>
    <td>zeta potential</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>aggregation</td>
    <td>Metal Oxide</td>
    <td></td>
  </tr>
  <tr>
    <td>zeta potential</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>Aggregation</td>
    <td>Metal Oxide</td>
    <td></td>
  </tr>
  <tr>
    <td>zeta potential</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>Aggregation</td>
    <td>Metal Oxide</td>
    <td></td>
  </tr>
  <tr>
    <td>zeta potential</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>aggregation</td>
    <td>metal oxide nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>zeta potential</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>aggregation</td>
    <td>metal oxide nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>zeta potential</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>aggregation</td>
    <td>metal oxide nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>zeta potential</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>aggregation</td>
    <td>metal oxide nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>zeta potential</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>Aggregation</td>
    <td>metal oxide nanoparticle</td>
    <td></td>
  </tr>
  <tr>
    <td>zeta potential</td>
    <td>https://www.sbd4nano.eu/bel/#correlates</td>
    <td>Aggregation</td>
    <td>metal oxide nanoparticle</td>
    <td></td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allCausalRelationships.rq | sed 's+<lang/>+en+' > allCausalRelationships.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allCausalRelationships.rq
```

This SPARQL query is available under CCZero.
