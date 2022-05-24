# allLicenses.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX sbdbel:  <https://www.sbd4nano.eu/bel/#>
PREFIX dcterms: <http://purl.org/dc/terms/>

SELECT ?license (COUNT(DISTINCT ?resource) AS ?count)
WHERE {
  ?resource a ?type .
  MINUS { ?resource a sbdbel:CausalRelationship }
  OPTIONAL { ?resource dcterms:license ?license }
} GROUP BY ?license
  ORDER BY DESC(?count)
```

[run](https://query.wikidata.org/embed.html#PREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0A%0ASELECT%20%3Flicense%20%28COUNT%28DISTINCT%20%3Fresource%29%20AS%20%3Fcount%29%0AWHERE%20%7B%0A%20%20%3Fresource%20a%20%3Ftype%20.%0A%20%20MINUS%20%7B%20%3Fresource%20a%20sbdbel%3ACausalRelationship%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fresource%20dcterms%3Alicense%20%3Flicense%20%7D%0A%7D%20GROUP%20BY%20%3Flicense%0A%20%20ORDER%20BY%20DESC%28%3Fcount%29%0A) or [edit](https://query.wikidata.org/#PREFIX%20sbdbel%3A%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Fbel%2F%23%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0A%0ASELECT%20%3Flicense%20%28COUNT%28DISTINCT%20%3Fresource%29%20AS%20%3Fcount%29%0AWHERE%20%7B%0A%20%20%3Fresource%20a%20%3Ftype%20.%0A%20%20MINUS%20%7B%20%3Fresource%20a%20sbdbel%3ACausalRelationship%20%7D%0A%20%20OPTIONAL%20%7B%20%3Fresource%20dcterms%3Alicense%20%3Flicense%20%7D%0A%7D%20GROUP%20BY%20%3Flicense%0A%20%20ORDER%20BY%20DESC%28%3Fcount%29%0A)



### Output

<table>
  <tr>
    <td><b>license</b></td>
    <td><b>count</b></td>
  </tr>
  <tr>
    <td>http://example.com/unknown</td>
    <td>1580</td>
  </tr>
  <tr>
    <td>https://www.wikidata.org/entity/Q50423863</td>
    <td>23</td>
  </tr>
  <tr>
    <td>http://creativecommons.org/publicdomain/zero/1.0/</td>
    <td>16</td>
  </tr>
  <tr>
    <td>https://creativecommons.org/licenses/by/4.0/legalcode</td>
    <td>10</td>
  </tr>
  <tr>
    <td></td>
    <td>2</td>
  </tr>
  <tr>
    <td>https://creativecommons.org/publicdomain/zero/1.0/</td>
    <td>1</td>
  </tr>
  <tr>
    <td>https://search.data.enanomapper.net/about/sbd4nano</td>
    <td>1</td>
  </tr>
  <tr>
    <td>https://creativecommons.org/licenses/by-nc-sa/4.0/legalcode</td>
    <td>1</td>
  </tr>
  <tr>
    <td>https://creativecommons.org/licenses/by-nc/4.0/legalcode</td>
    <td>1</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -s https://raw.githubusercontent.com/h2020-sbd4nano/sbd-data-book/master/sparql/allLicenses.rq | sed 's+<lang/>+en+' > allLicenses.rq

curl -H "Accept: text/tab-separated-values" -G https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@allLicenses.rq
```

This SPARQL query is available under CCZero.
