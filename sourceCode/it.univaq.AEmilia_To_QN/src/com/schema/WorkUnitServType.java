/**
 * WorkUnitServType.java
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

import com.altova.xml.types.SchemaIDRef;
import com.altova.xml.types.SchemaInteger;

/**
 * Una WorkUnitServiceRequest (di tipo WorkUnitServType)
 * � una richiesta di servizio diretta ad un WorkUnitServer,
 * fatta specificando il numero medio di visite che i
 * Workloads effettueranno al WorkUnitServer.
 * <pre>
 * <code>
 * &lt;xsd:complexType name="WorkUnitServType"&gt;
 * 	&lt;xsd:sequence&gt;
 * 		&lt;xsd:element name="Transit" type="TransitType" maxOccurs="unbounded"/&gt;
 * 	&lt;/xsd:sequence&gt;
 * 	&lt;xsd:attribute name="WorkloadName" type="xsd:IDREF" use="required"/&gt;
 * 	&lt;xsd:attribute name="ServerID" type="xsd:IDREF" use="required"/&gt;
 * 	&lt;xsd:attribute name="NumberOfVisits" type="xsd:nonNegativeInteger" use="optional"/&gt;
 * &lt;/xsd:complexType&gt;
 * </code>
 * </pre>
 *
 * @author Mirko Email: <a href="mailto:mirkoflamminj@virgilio.it">mirkoflamminj@virgilio.it</a>
 * @version 1.0
 */

public class WorkUnitServType extends com.altova.xml.Node {

	private static final long serialVersionUID = 1L;

	public WorkUnitServType() {
		super();
	}

	public WorkUnitServType(WorkUnitServType node) {
		super(node);
	}

	public WorkUnitServType(org.w3c.dom.Node node) {
		super(node);
	}

	public WorkUnitServType(org.w3c.dom.Document doc) {
		super(doc);
	}

	public int getWorkloadNameMinCount() {
		return 1;
	}

	public int getWorkloadNameMaxCount() {
		return 1;
	}

	public int getWorkloadNameCount() {
		return getDomChildCount(Attribute, null, "WorkloadName");
	}

	public boolean hasWorkloadName() {
		return hasDomChild(Attribute, null, "WorkloadName");
	}

	public SchemaIDRef getWorkloadNameAt(int index) throws Exception {
		return new SchemaIDRef(getDomNodeValue(getDomChildAt(Attribute, null, "WorkloadName", index)));
	}

	public SchemaIDRef getWorkloadName() throws Exception {
		return getWorkloadNameAt(0);
	}

	public void removeWorkloadNameAt(int index) {
		removeDomChildAt(Attribute, null, "WorkloadName", index);
	}

	public void removeWorkloadName() {
		while (hasWorkloadName())
			removeWorkloadNameAt(0);
	}

	public void addWorkloadName(SchemaIDRef value) {
		setDomChild(Attribute, null, "WorkloadName", value.toString());
	}

	public void addWorkloadName(String value) throws Exception {
		addWorkloadName(new SchemaIDRef(value));
	}

	public void insertWorkloadNameAt(SchemaIDRef value, int index) {
		insertDomChildAt(Attribute, null, "WorkloadName", index, value.toString());
	}

	public void insertWorkloadNameAt(String value, int index) throws Exception {
		insertWorkloadNameAt(new SchemaIDRef(value), index);
	}

	public void replaceWorkloadNameAt(SchemaIDRef value, int index) {
		replaceDomChildAt(Attribute, null, "WorkloadName", index, value.toString());
	}

	public void replaceWorkloadNameAt(String value, int index) throws Exception {
		replaceWorkloadNameAt(new SchemaIDRef(value), index);
	}

	public int getServerIDMinCount() {
		return 1;
	}

	public int getServerIDMaxCount() {
		return 1;
	}

	public int getServerIDCount() {
		return getDomChildCount(Attribute, null, "ServerID");
	}

	public boolean hasServerID() {
		return hasDomChild(Attribute, null, "ServerID");
	}

	public SchemaIDRef getServerIDAt(int index) throws Exception {
		return new SchemaIDRef(getDomNodeValue(getDomChildAt(Attribute, null, "ServerID", index)));
	}

	public SchemaIDRef getServerID() throws Exception {
		return getServerIDAt(0);
	}

	public void removeServerIDAt(int index) {
		removeDomChildAt(Attribute, null, "ServerID", index);
	}

	public void removeServerID() {
		while (hasServerID())
			removeServerIDAt(0);
	}

	public void addServerID(SchemaIDRef value) {
		setDomChild(Attribute, null, "ServerID", value.toString());
	}

	public void addServerID(String value) throws Exception {
		addServerID(new SchemaIDRef(value));
	}

	public void insertServerIDAt(SchemaIDRef value, int index) {
		insertDomChildAt(Attribute, null, "ServerID", index, value.toString());
	}

	public void insertServerIDAt(String value, int index) throws Exception {
		insertServerIDAt(new SchemaIDRef(value), index);
	}

	public void replaceServerIDAt(SchemaIDRef value, int index) {
		replaceDomChildAt(Attribute, null, "ServerID", index, value.toString());
	}

	public void replaceServerIDAt(String value, int index) throws Exception {
		replaceServerIDAt(new SchemaIDRef(value), index);
	}

	public int getNumberOfVisitsMinCount() {
		return 0;
	}

	public int getNumberOfVisitsMaxCount() {
		return 1;
	}

	public int getNumberOfVisitsCount() {
		return getDomChildCount(Attribute, null, "NumberOfVisits");
	}

	public boolean hasNumberOfVisits() {
		return hasDomChild(Attribute, null, "NumberOfVisits");
	}

	public SchemaInteger getNumberOfVisitsAt(int index) throws Exception {
		return new SchemaInteger(getDomNodeValue(getDomChildAt(Attribute, null, "NumberOfVisits", index)));
	}

	public SchemaInteger getNumberOfVisits() throws Exception {
		return getNumberOfVisitsAt(0);
	}

	public void removeNumberOfVisitsAt(int index) {
		removeDomChildAt(Attribute, null, "NumberOfVisits", index);
	}

	public void removeNumberOfVisits() {
		while (hasNumberOfVisits())
			removeNumberOfVisitsAt(0);
	}

	public void addNumberOfVisits(SchemaInteger value) {
		setDomChild(Attribute, null, "NumberOfVisits", value.toString());
	}

	public void addNumberOfVisits(String value) throws Exception {
		addNumberOfVisits(new SchemaInteger(value));
	}

	public void insertNumberOfVisitsAt(SchemaInteger value, int index) {
		insertDomChildAt(Attribute, null, "NumberOfVisits", index, value.toString());
	}

	public void insertNumberOfVisitsAt(String value, int index) throws Exception {
		insertNumberOfVisitsAt(new SchemaInteger(value), index);
	}

	public void replaceNumberOfVisitsAt(SchemaInteger value, int index) {
		replaceDomChildAt(Attribute, null, "NumberOfVisits", index, value.toString());
	}

	public void replaceNumberOfVisitsAt(String value, int index) throws Exception {
		replaceNumberOfVisitsAt(new SchemaInteger(value), index);
	}

	public int getTransitMinCount() {
		return 1;
	}

	public int getTransitMaxCount() {
		return Integer.MAX_VALUE;
	}

	public int getTransitCount() {
		return getDomChildCount(Element, null, "Transit");
	}

	public boolean hasTransit() {
		return hasDomChild(Element, null, "Transit");
	}

	public TransitType getTransitAt(int index) throws Exception {
		return new TransitType(getDomChildAt(Element, null, "Transit", index));
	}

	public TransitType getTransit() throws Exception {
		return getTransitAt(0);
	}

	public void removeTransitAt(int index) {
		removeDomChildAt(Element, null, "Transit", index);
	}

	public void removeTransit() {
		while (hasTransit())
			removeTransitAt(0);
	}

	public void addTransit(TransitType value) {
		appendDomElement(null, "Transit", value);
	}

	public void insertTransitAt(TransitType value, int index) {
		insertDomElementAt(null, "Transit", index, value);
	}

	public void replaceTransitAt(TransitType value, int index) {
		replaceDomElementAt(null, "Transit", index, value);
	}
}