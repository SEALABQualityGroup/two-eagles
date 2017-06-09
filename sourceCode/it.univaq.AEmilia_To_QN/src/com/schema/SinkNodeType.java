/**
 * SinkNodeType.java
 *
 * This file was generated by XMLSPY 5 Enterprise Edition.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the XMLSPY Documentation for further details.
 * http://www.altova.com/xmlspy
 */


package com.schema;

import com.altova.xml.types.SchemaID;

/**
 * Un SinkNode rappresenta un nodo nel quale un OpenWorkload
 * termina il suo cammino, dopo aver ricevuto servizio,
 * uscendo da una rete di code. Un SinkNode non fornisce
 * alcun tipo di servizio.
 * <pre>
 * <code>
 * &lt;xsd:element name="SinkNode" minOccurs="0" maxOccurs="unbounded"&gt;
 * 	&lt;xsd:complexType&gt;
 * 		&lt;xsd:attribute name="Name" type="xsd:ID" use="required"/&gt;
 * 	&lt;/xsd:complexType&gt;
 * &lt;/xsd:element&gt;
 * </code>
 * </pre>
 *
 * @author Mirko Email: <a href="mailto:mirkoflamminj@virgilio.it">mirkoflamminj@virgilio.it</a>
 * @version 1.0
 */
public class SinkNodeType extends com.altova.xml.Node {

	private static final long serialVersionUID = 1L;

	public SinkNodeType() {
		super();
	}

	public SinkNodeType(SinkNodeType node) {
		super(node);
	}

	public SinkNodeType(org.w3c.dom.Node node) {
		super(node);
	}

	public SinkNodeType(org.w3c.dom.Document doc) {
		super(doc);
	}

	public int getNameMinCount() {
		return 1;
	}

	public int getNameMaxCount() {
		return 1;
	}

	public int getNameCount() {
		return getDomChildCount(Attribute, null, "Name");
	}

	public boolean hasName() {
		return hasDomChild(Attribute, null, "Name");
	}

	public SchemaID getNameAt(int index) throws Exception {
		return new SchemaID(getDomNodeValue(getDomChildAt(Attribute, null, "Name", index)));
	}

	public SchemaID getName() throws Exception {
		return getNameAt(0);
	}

	public void removeNameAt(int index) {
		removeDomChildAt(Attribute, null, "Name", index);
	}

	public void removeName() {
		while (hasName())
			removeNameAt(0);
	}

	public void addName(SchemaID value) {
		setDomChild(Attribute, null, "Name", value.toString());
	}

	public void addName(String value) throws Exception {
		addName(new SchemaID(value));
	}

	public void insertNameAt(SchemaID value, int index) {
		insertDomChildAt(Attribute, null, "Name", index, value.toString());
	}

	public void insertNameAt(String value, int index) throws Exception {
		insertNameAt(new SchemaID(value), index);
	}

	public void replaceNameAt(SchemaID value, int index) {
		replaceDomChildAt(Attribute, null, "Name", index, value.toString());
	}

	public void replaceNameAt(String value, int index) throws Exception {
		replaceNameAt(new SchemaID(value), index);
	}
}
