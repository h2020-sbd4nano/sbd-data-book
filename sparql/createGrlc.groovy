// Copyright (c) 2020  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

@Grab(group='io.github.egonw.bacting', module='managers-rdf', version='0.1.2')
@Grab(group='io.github.egonw.bacting', module='managers-ui', version='0.1.2')

bioclipse = new net.bioclipse.managers.BioclipseManager(".");

inFile = args[0];
langs  = args[1];

sparql = new File(inFile).text
if (sparql.contains("\"<lang/>,en\""))
  sparql = sparql.replace("\"<lang/>,en\"", "?_lang")

println """#+ endpoint: https://sbd4nanolandscape.rdf.bigcat-bioinformatics.org/sparql
#+ endpoint_in_url: False
#+ enumerate:
#+   - lang:"""

for (lang in langs.split(" ")) {
  println "#+     - ${lang},en"
}

println """
"""

println sparql
