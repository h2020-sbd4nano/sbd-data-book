# allLicenses.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX sbdbel:  <https://www.sbd4nano.eu/bel/#>
PREFIX dcterms: <http://purl.org/dc/terms/>

SELECT (COUNT(DISTINCT ?resource) AS ?count) ?license
WHERE {
  ?resource a ?type .
  MINUS { ?resource a sbdbel:CausalRelationship }
  OPTIONAL { ?resource dcterms:license ?license }
} GROUP BY ?license
  ORDER BY DESC(?count)
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0A%0ASELECT%20%28COUNT%28DISTINCT%20%3Fresource%29%20AS%20%3Fcount%29%20%3Flicense%0AWHERE%20%7B%0A%20%20%3Fresource%20a%20%3Ftype%20.%0A%20%20MINUS%20%7B%20%3Fresource%20a%20sbdbel%3ACausalRelationship%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fresource%20dcterms%3Alicense%20%3Flicense%20%7D%0A%7D%20GROUP%20BY%20%3Flicense%0A%20%20ORDER%20BY%20DESC%28%3Fcount%29%0A)


### Output

<table>
  <tr>
    <td><b>count</b></td>
    <td><b>license</b></td>
  </tr>
  <tr>
    <td>6119</td>
    <td></td>
  </tr>
  <tr>
    <td>1777</td>
    <td>http://creativecommons.org/publicdomain/zero/1.0/</td>
  </tr>
  <tr>
    <td>261</td>
    <td>https://creativecommons.org/licenses/by/4.0/</td>
  </tr>
  <tr>
    <td>23</td>
    <td>https://www.wikidata.org/entity/Q50423863</td>
  </tr>
  <tr>
    <td>17</td>
    <td>http://example.com/unknown</td>
  </tr>
  <tr>
    <td>14</td>
    <td>https://creativecommons.org/licenses/by/4.0/legalcode</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://creativecommons.org/publicdomain/zero/1.0/</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/aurora</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/biorima</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/calibrate</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/charisma</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/cusp</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/enanomapper</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/gov4nano</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/gracious</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/harmless</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/imptox</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/nanoinformatix</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/nanoreg</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/nanoreg2</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/patrols</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/plasticfate</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/plasticheal</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/polyrisk</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/riskgone</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/sabydoma</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/sabyna</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/sbd4nano</td>
  </tr>
  <tr>
    <td>1</td>
    <td>https://search.data.enanomapper.net/about/sunshine</td>
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
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allLicenses.rq | sed 's+<lang/>+en+' > allLicenses.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allLicenses.rq
```

This SPARQL query is available under CCZero.
