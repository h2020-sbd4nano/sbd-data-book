# allModels.rq

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX rdfs:    <http://www.w3.org/2000/01/rdf-schema#>
PREFIX sbd:     <https://www.sbd4nano.eu/rdf/#>
PREFIX dc:      <http://purl.org/dc/elements/1.1/>
PREFIX dct:     <http://purl.org/dc/terms/>

SELECT ?model ?modeLabel ?provider WHERE {
  ?model a sbd:Model ; rdfs:label ?modelLabel ;
     dc:source/dct:title ?provider
} ORDER BY ?model
```

[run](https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/?q=PREFIX%20rdfs%3A%20%20%20%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%0APREFIX%20sbd%3A%20%20%20%20%20%3Chttps%3A%2F%2Fwww.sbd4nano.eu%2Frdf%2F%23%3E%0APREFIX%20dc%3A%20%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dct%3A%20%20%20%20%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0A%0ASELECT%20%3Fmodel%20%3FmodeLabel%20%3Fprovider%20WHERE%20%7B%0A%20%20%3Fmodel%20a%20sbd%3AModel%20%3B%20rdfs%3Alabel%20%3FmodelLabel%20%3B%0A%20%20%20%20%20dc%3Asource%2Fdct%3Atitle%20%3Fprovider%0A%7D%20ORDER%20BY%20%3Fmodel%0A)


### Output

<table>
  <tr>
    <td><b>model</b></td>
    <td><b>provider</b></td>
  </tr>
  <tr>
    <td>http://enaloscloud.novamechanics.com/EnalosWebApps/ZetaPotential/</td>
    <td>NanoSolveIT Tools</td>
  </tr>
  <tr>
    <td>https://aerosol.cloud.nanosolveit.eu/</td>
    <td>NanoSolveIT Tools</td>
  </tr>
  <tr>
    <td>https://atena.urv.cat/model/#Anantha2021</td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td>https://atena.urv.cat/model/#Gajewicz2015</td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td>https://atena.urv.cat/model/#Papa2015-TiO2</td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td>https://atena.urv.cat/model/#Papa2015-TiO2ZnO</td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td>https://atena.urv.cat/model/#Papa2015-ZnO</td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td>https://atena.urv.cat/model/#Puzyn2011</td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td>https://atena.urv.cat/model/#Serratosa2022</td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td>https://atena.urv.cat/model/#Serratosa2022-TiO2</td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td>https://atena.urv.cat/model/#Serratosa2022-TiO2ZnO</td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td>https://atena.urv.cat/model/#Serratosa2022-ZnO</td>
    <td>SbD4nano Nanocompound</td>
  </tr>
  <tr>
    <td>https://cellviability.cloud.nanosolveit.eu/</td>
    <td>NanoSolveIT Tools</td>
  </tr>
  <tr>
    <td>https://deepdaph.cloud.nanosolveit.eu/</td>
    <td>NanoSolveIT Tools</td>
  </tr>
  <tr>
    <td>https://example.org/nanoinformatix-platform.greendecision.eu/SimpleBMD</td>
    <td>NanoInformaTIX Tools</td>
  </tr>
  <tr>
    <td>https://funmappone.cloud.nanosolveit.eu/</td>
    <td>NanoSolveIT Tools</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/10</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/100</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/101</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/102</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/103</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/104</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/106</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/107</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/110</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/113</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/119</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/12</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/122</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/123</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/13</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/131</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/134</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/136</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/138</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/139</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/141</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/144</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/148</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/149</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/15</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/150</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/151</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/152</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/154</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/155</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/156</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/157</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/158</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/159</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/16</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/160</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/161</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/17</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/173</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/175</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/176</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/177</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/178</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/18</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/186</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/188</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/189</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/190</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/191</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/192</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/193</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/194</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/195</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/196</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/200</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/202</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/203</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/205</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/212</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/213</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/216</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/218</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/219</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/220</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/223</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/23</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/237</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/238</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/245</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/25</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/258</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/261</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/263</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/264</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/265</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/266</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/267</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/268</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/271</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/272</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/273</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/274</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/275</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/276</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/277</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/28</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/281</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/282</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/284</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/286</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/287</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/288</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/289</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/29</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/290</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/291</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/292</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/293</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/294</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/296</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/297</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/298</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/299</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/3</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/30</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/300</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/301</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/302</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/303</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/305</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/306</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/307</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/309</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/310</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/311</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/312</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/313</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/314</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/315</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/316</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/318</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/319</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/320</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/322</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/323</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/324</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/325</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/326</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/327</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/328</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/329</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/330</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/331</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/334</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/336</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/337</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/338</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/339</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/34</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/340</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/341</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/342</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/343</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/344</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/345</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/346</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/348</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/349</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/358</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/359</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/36</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/360</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/361</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/363</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/364</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/365</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/366</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/367</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/368</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/37</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/372</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/374</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/376</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/377</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/379</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/38</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/381</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/383</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/386</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/387</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/388</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/389</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/39</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/392</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/394</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/395</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/397</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/398</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/399</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/40</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/401</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/402</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/405</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/406</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/407</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/409</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/41</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/410</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/411</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/413</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/415</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/416</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/417</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/419</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/42</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/423</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/424</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/425</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/426</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/427</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/43</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/430</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/432</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/435</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/436</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/439</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/440</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/441</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/442</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/443</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/444</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/450</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/451</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/455</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/456</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/46</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/460</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/464</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/468</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/470</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/473</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/475</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/476</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/477</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/478</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/479</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/48</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/480</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/482</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/483</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/485</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/486</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/487</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/488</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/489</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/490</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/491</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/51</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/54</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/57</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/58</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/6</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/60</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/61</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/62</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/63</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/64</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/65</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/7</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/72</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/77</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/78</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/79</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/8</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/80</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/87</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/88</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/89</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/90</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/96</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop/97</td>
    <td>AOP-Wiki AOPs</td>
  </tr>
  <tr>
    <td>https://nanofase.cloud.nanosolveit.eu/</td>
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
