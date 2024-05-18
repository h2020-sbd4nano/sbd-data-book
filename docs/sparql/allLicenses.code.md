# allLicenses.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX sbd:  <https://www.sbd4nano.eu/rdf/#>
PREFIX sbdbel:  <https://www.sbd4nano.eu/bel/#>
PREFIX dcterms: <http://purl.org/dc/terms/>

SELECT (COUNT(DISTINCT ?resource) AS ?count) ?license
WHERE {
  VALUES ?ca { sbdbel:CausalAssertion sbd:CausalAssertion }
  ?resource a ?type .
  MINUS { ?resource a ?ca }
  OPTIONAL { ?resource dcterms:license ?license }
} GROUP BY ?license
  ORDER BY DESC(?count)
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20sbd%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0A%0ASELECT%20%28COUNT%28DISTINCT%20%3Fresource%29%20AS%20%3Fcount%29%20%3Flicense%0AWHERE%20%7B%0A%20%20VALUES%20%3Fca%20%7B%20sbdbel%3ACausalAssertion%20sbd%3ACausalAssertion%20%7D%0A%20%20%3Fresource%20a%20%3Ftype%20.%0A%20%20MINUS%20%7B%20%3Fresource%20a%20%3Fca%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fresource%20dcterms%3Alicense%20%3Flicense%20%7D%0A%7D%20GROUP%20BY%20%3Flicense%0A%20%20ORDER%20BY%20DESC%28%3Fcount%29%0A)


### Output

<table>
  <tr>
    <td><b>count</b></td>
    <td><b>license</b></td>
  </tr>
  <tr>
    <td>39267</td>
    <td></td>
  </tr>
  <tr>
    <td>2013</td>
    <td>http://creativecommons.org/publicdomain/zero/1.0/</td>
  </tr>
  <tr>
    <td>304</td>
    <td>https://creativecommons.org/licenses/by/4.0/</td>
  </tr>
  <tr>
    <td>83</td>
    <td>https://creativecommons.org/licenses/by/4.0/legalcode</td>
  </tr>
  <tr>
    <td>83</td>
    <td>http://example.com/unknown</td>
  </tr>
  <tr>
    <td>29</td>
    <td>https://www.wikidata.org/entity/Q50423863</td>
  </tr>
  <tr>
    <td>22</td>
    <td>https://creativecommons.org/licenses/by-nc/3.0/de/legalcode</td>
  </tr>
  <tr>
    <td>9</td>
    <td>https://opensource.org/licenses/MIT</td>
  </tr>
  <tr>
    <td>7</td>
    <td>https://www.elsevier.com/tdm/userlicense/1.0/</td>
  </tr>
  <tr>
    <td>7</td>
    <td>https://opensource.org/licenses/GPL-3.0</td>
  </tr>
  <tr>
    <td>3</td>
    <td>https://creativecommons.org/licenses/by/4.0</td>
  </tr>
  <tr>
    <td>3</td>
    <td>https://doi.org/10.15223/policy-029</td>
  </tr>
  <tr>
    <td>3</td>
    <td>https://spdx.org/licenses/Unlicense</td>
  </tr>
  <tr>
    <td>2</td>
    <td>https://creativecommons.org/publicdomain/zero/1.0/</td>
  </tr>
  <tr>
    <td>2</td>
    <td>http://rsc.li/journals-terms-of-use</td>
  </tr>
  <tr>
    <td>2</td>
    <td>http://creativecommons.org/licenses/by-nc-nd/4.0/</td>
  </tr>
  <tr>
    <td>2</td>
    <td>http://www.apache.org/licenses/LICENSE-2.0</td>
  </tr>
  <tr>
    <td>2</td>
    <td>https://creativecommons.org/licenses/by-nc/4.0/</td>
  </tr>
  <tr>
    <td>1</td>
    <td>http://onlinelibrary.wiley.com/termsAndConditions#am</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/gov4nano</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/gracious</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/harmless</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/imptox</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/nanoinformatix</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/nanoreg</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/nanoreg2</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/patrols</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/plasticfate</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/plasticheal</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/polyrisk</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/riskgone</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/sabydoma</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/sabyna</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/sbd4nano</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/sunshine</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://www.echemportal.org/echemportal/page/12</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://www.epa.gov/web-policies-and-procedures/epa-disclaimers</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://www.goreni.org/gr3_data_protection.php</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://qsardb.food.dtu.dk/db/index.html</td>
  </tr>
  <tr>
    <td>1</td>
    <td>http://www.t3db.ca/downloads</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://creativecommons.org/licenses/by/3.0/</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://www.ncis.org.au/about-us/copyright/</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://creativecommons.org/licenses/by-nc-nd/4.0/</td>
  </tr>
  <tr>
    <td>1</td>
    <td>http://doi.wiley.com/10.1002/tdm_license_1.1</td>
  </tr>
  <tr>
    <td>1</td>
    <td>http://creativecommons.org/licenses/by/2.0</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://creativecommons.org/licenses/by-nc-sa/4.0/legalcode</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://creativecommons.org/licenses/by-nc/4.0/legalcode</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/aurora</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/biorima</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/calibrate</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/charisma</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/cusp</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://enanomapper.adma.ai/about/enanomapper</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://springernature.figshare.com/articles/dataset/MOESM1_of_Role_of_chemical_composition_and_redox_modification_of_poorly_soluble_nanomaterials_on_their_ability_to_enhance_allergic_airway_sensitisation_in_mice/10071023</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://springernature.figshare.com/articles/dataset/MOESM1_of_Role_of_chemical_composition_and_redox_modification_of_poorly_soluble_nanomaterials_on_their_ability_to_enhance_allergic_airway_sensitisation_in_mice/10071032</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://creativecommons.org/share-your-work/public-domain/cc0</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://opensource.org/licenses/CECILL-2.1</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://opensource.org/licenses/AGPL-3.0</td>
  </tr>
  <tr>
    <td>1</td>
    <td>http://creativecommons.org/licenses/by/3.0/</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://opensource.org/license/bsd-3-clause/</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://opensource.org/license/bsd-2-clause/</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://github.com/ammar257ammar/Nanosafety-data-reusability-34-datasets/blob/main/LICENSE</td>
  </tr>
  <tr>
    <td>1</td>
    <td>http://creativecommons.org/licenses/by-sa/4.0/</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allLicenses.rq | sed 's+<lang/>+en+' > allLicenses.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allLicenses.rq
```

This SPARQL query is available under CCZero.
