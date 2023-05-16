# Titanium Oxide

Because the eNanoMapper ontology [<cite>Q27062683</cite>] is loaded, we can take advantage of the
hierarchy of the ontology. For example, we can list all <topic>titania</topic>'s (npo:NPO_1541)
with this SPARQL:

<sparql>allTitanias</sparql>

This gives us this list of nanomaterials:

<out>allTitanias</out>

## Causal relationships

This approach can be used to find datasets, models, causal relationships, etc applicable to a certain
nanomaterial or nanomaterial class. For example, we can list all relationships for <topic>JRCNM01005a</topic>:

<sparql>allJRCNM01005aRelationships</sparql>

But for a specific material, such relationships may not exist:

<out>allJRCNM01005aRelationships</out>

In that case, we can better look for relationships for the class of nanoforms this
material is part of.

### All metal oxides

For example, we can list all relationships for all metal oxides:

<sparql>allMetalOxideRelationships</sparql>

We find here that basically all relationships are defined at a
<topic>metal oxide</topic> level:

<out>allMetalOxideRelationships</out>

## References

<references/>
