/**
 * ClosedWorkloadType.java
 *
 * This file was generated by XMLSPY 5 Enterprise Edition.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the XMLSPY Documentation for further details.
 * http://www.altova.com/xmlspy
 */


package pack.model.schema;

import pack.model.altova.xml.types.SchemaID;
import pack.model.altova.xml.types.SchemaIDRef;
import pack.model.altova.xml.types.SchemaInteger;

/**
 * Un ClosedWorkload (Carico di Lavoro
 * "Chiuso") � un Workload	(Carico di Lavoro) con una
 * popolazione fissa che circola tra i Servers.
 * <pre>
 * <code>
 * &lt;xsd:element name="ClosedWorkload" minOccurs="0" maxOccurs="unbounded"&gt;
 *	&lt;xsd:complexType&gt;
 *		&lt;xsd:sequence&gt;
 *			&lt;xsd:element name="Transit" type="TransitType" maxOccurs="unbounded"/&gt;
 *		&lt;/xsd:sequence&gt;
 *		&lt;xsd:attribute name="WorkloadName" type="xsd:ID" use="required"/&gt;
 *		&lt;xsd:attribute name="NumberOfJobs" type="xsd:nonNegativeInteger" use="required"/&gt;
 *		&lt;xsd:attribute name="ThinkTime" type="nonNegativeFloat" use="required"/&gt;
 *		&lt;xsd:attribute name="TimeUnits" type="TimeUnitsType" use="optional"/&gt;
 *		&lt;xsd:attribute name="ThinkDevice" type="xsd:IDREF" use="required"/&gt;
 *	&lt;/xsd:complexType&gt;
 * &lt;/xsd:element&gt;
 * </code>
 * </pre>
 * @author Mirko Email: <a href="mailto:mirkoflamminj@virgilio.it">mirkoflamminj@virgilio.it</a>
 * @version 1.0
 */

public class ClosedWorkloadType 
	extends pack.model.altova.xml.Node 
	{
	
	private static final long serialVersionUID = 1L;

	public ClosedWorkloadType() {
		super();
	}

	public ClosedWorkloadType(org.w3c.dom.Node node) {
		super(node);
	}

	/**
	 * Restituisce true se e solo se � presente un
	 * attributo WorkloadName.
	 * @return
	 */
	public boolean hasWorkloadName() {
		return hasDomChild(Attribute, null, "WorkloadName");
	}

	/**
	 * Aggiunge l'attributo WorkloadName.
	 * @param value
	 */
	private void addWorkloadName(SchemaID value) {
		setDomChild(Attribute, null, "WorkloadName", value.toString());
	}

	/**
	 * Aggiunge l'attributo WorkloadName.
	 * @param value
	 * @throws Exception
	 */
	public void addWorkloadName(String value) throws Exception {
		addWorkloadName(new SchemaID(value));
	}

	/**
	 * Restituisce true se e solo se questo elemento ha
	 * un attributo NumberOfJobs.
	 * @return
	 */
	public boolean hasNumberOfJobs() {
		return hasDomChild(Attribute, null, "NumberOfJobs");
	}

	/**
	 * Restituisce l'attributo NumberOfJobs. index �
	 * ignorato.
	 * @param index
	 * @return
	 * @throws Exception
	 */
	public SchemaInteger getNumberOfJobsAt(int index) throws Exception {
		return new SchemaInteger(getDomNodeValue(getDomChildAt(Attribute, null, "NumberOfJobs", index)));
	}

	/**
	 * Restituisce l'attributo NumberOfJobs.
	 * @return
	 * @throws Exception
	 */
	public SchemaInteger getNumberOfJobs() throws Exception {
		return getNumberOfJobsAt(0);
	}

	/**
	 * Aggiunge l'attributo NumberOfJobs.
	 * @param value
	 */
	private void addNumberOfJobs(SchemaInteger value) {
		setDomChild(Attribute, null, "NumberOfJobs", value.toString());
	}

	/**
	 * Aggiunge l'attributo NumberOfJobs.
	 * @param value
	 * @throws Exception
	 */
	public void addNumberOfJobs(String value) throws Exception {
		addNumberOfJobs(new SchemaInteger(value));
	}

	/**
	 * Restituisce true se e solo se ci sono attributi
	 * ThinkTime.
	 * @return
	 */
	public boolean hasThinkTime() {
		return hasDomChild(Attribute, null, "ThinkTime");
	}

	/**
	 * Restituisce l'attributo ThinkTime. index �
	 * ignorato.
	 * @param index
	 * @return
	 * @throws Exception
	 */
	private nonNegativeFloat getThinkTimeAt(int index) throws Exception {
		return new nonNegativeFloat(getDomNodeValue(getDomChildAt(Attribute, null, "ThinkTime", index)));
	}

	/**
	 * Restituisce l'attributo ThinkTime.
	 * @return
	 * @throws Exception
	 */
	public nonNegativeFloat getThinkTime() throws Exception {
		return getThinkTimeAt(0);
	}

	/**
	 * Aggiunge l'attributo ThinkTime.
	 * @param value
	 */
	private void addThinkTime(nonNegativeFloat value) {
		setDomChild(Attribute, null, "ThinkTime", value.toString());
	}

	/**
	 * Aggiunge l'attributo ThinkTime.
	 * @param value
	 * @throws Exception
	 */
	public void addThinkTime(String value) throws Exception {
		addThinkTime(new nonNegativeFloat(value));
	}

	/**
	 * Restituisce true se e solo se questo elemento ha
	 * un attributo TimeUnits.
	 * @return
	 */
	public boolean hasTimeUnits() {
		return hasDomChild(Attribute, null, "TimeUnits");
	}

	/**
	 * Restituisce l'attributo TimeUnits. index � ignorato.
	 * @param index
	 * @return
	 * @throws Exception
	 */
	private TimeUnitsType getTimeUnitsAt(int index) throws Exception {
		return new TimeUnitsType(getDomNodeValue(getDomChildAt(Attribute, null, "TimeUnits", index)));
	}

	/**
	 * Restituisce l'attributo TimeUnits.
	 * @return
	 * @throws Exception
	 */
	public TimeUnitsType getTimeUnits() throws Exception {
		return getTimeUnitsAt(0);
	}

	/**
	 * Restituisce true se e solo se � presente un attributo
	 * ThinkDevice.
	 * @return
	 */
	public boolean hasThinkDevice() {
		return hasDomChild(Attribute, null, "ThinkDevice");
	}

	/**
	 * Restituisce l'attributo ThinkDevice. index �
	 * ignorato.
	 * @param index
	 * @return
	 * @throws Exception
	 */
	private SchemaIDRef getThinkDeviceAt(int index) throws Exception {
		return new SchemaIDRef(getDomNodeValue(getDomChildAt(Attribute, null, "ThinkDevice", index)));
	}

	/**
	 * Restituisce l'attributo ThinkDevice.
	 * @return
	 * @throws Exception
	 */
	public SchemaIDRef getThinkDevice() throws Exception {
		return getThinkDeviceAt(0);
	}

	/**
	 * Aggiunge un attributo ThinkDevice a questo elemento.
	 * @param value
	 */
	private void addThinkDevice(SchemaIDRef value) {
		setDomChild(Attribute, null, "ThinkDevice", value.toString());
	}

	/**
	 * Aggiunge un attributo ThinkDevice a questo elemento.
	 * @param value
	 * @throws Exception
	 */
	public void addThinkDevice(String value) 
		throws Exception 
		{
		addThinkDevice(new SchemaIDRef(value));
		}

	/**
	 * Restituisce il numero di elementi Transit presenti.
	 * @return
	 */
	public int getTransitCount() {
		return getDomChildCount(Element, null, "Transit");
	}

	/**
	 * Restituisce true se e solo se � presente un elemento
	 * Transit.
	 * @return
	 */
	public boolean hasTransit() {
		return hasDomChild(Element, null, "Transit");
	}

	/**
	 * Restituisce l'elemento Transit numero index, tra tutti
	 * gli elementi transit presenti.
	 * @param index
	 * @return
	 * @throws Exception
	 */
	public TransitType getTransitAt(int index) throws Exception {
		return new TransitType(getDomChildAt(Element, null, "Transit", index));
	}

	/**
	 * Aggiunge un elemento Transit.
	 * @param value
	 */
	public void addTransit(TransitType value) {
		appendDomElement(null, "Transit", value);
	}

	/**
	 * Restituisce l'attributo WorkloadName. index �
	 * ignorato.
	 * @param index
	 * @return
	 * @throws Exception
	 */
	public SchemaID getWorkloadNameAt(int index) throws Exception {
		return new SchemaID(getDomNodeValue(getDomChildAt(Attribute, null, "WorkloadName", index)));
	}

	/**
	 * Rimuove l'elemento Transit numero index tra tutti
	 * gli elementi Transit presenti.
	 * @param index
	 */
	public void removeTransitAt(int index) 
		{
		removeDomChildAt(Element, null, "Transit", index);
		}
	
	@Override
	public boolean equals(Object obj)
		{
		if (!(obj instanceof ClosedWorkloadType))
			return false;
		ClosedWorkloadType closedWorkloadTypeEq = (ClosedWorkloadType)obj;
		if (!this.hasTransit() && closedWorkloadTypeEq.hasTransit())
			return false;
		if (this.hasTransit() && !closedWorkloadTypeEq.hasTransit())
			return false;
		if (this.hasTransit() && closedWorkloadTypeEq.hasTransit())
			{
			if (this.getTransitCount() != closedWorkloadTypeEq.getTransitCount())
				return false;
			for (int i = 0; i < this.getTransitCount(); i++)
				{
				try {
					if (!this.getTransitAt(i).equals(closedWorkloadTypeEq.getTransitAt(i)))
						return false;
					}
				catch (Exception e)
					{
					return false;
					}
				}
			}
		if (!this.hasWorkloadName() && closedWorkloadTypeEq.hasWorkloadName())
			return false;
		if (this.hasWorkloadName() && !closedWorkloadTypeEq.hasWorkloadName())
			return false;
		if (this.hasWorkloadName() && closedWorkloadTypeEq.hasWorkloadName())
			{
			try {
				if (!this.getWorkloadNameAt(0).equals(closedWorkloadTypeEq.getWorkloadNameAt(0)))
					return false;
				}
			catch (Exception e)
				{
				return false;
				}
			}
		if (!this.hasNumberOfJobs() && closedWorkloadTypeEq.hasNumberOfJobs())
			return false;
		if (this.hasNumberOfJobs() && !closedWorkloadTypeEq.hasNumberOfJobs())
			return false;
		if (this.hasNumberOfJobs() && closedWorkloadTypeEq.hasNumberOfJobs())
			{
			try {
				if (!this.getNumberOfJobs().asString().equals(closedWorkloadTypeEq.getNumberOfJobs().asString()))
					return false;
				}
			catch (Exception e)
				{
				return false;
				}
			}
		if (!this.hasThinkTime() && closedWorkloadTypeEq.hasThinkTime())
			return false;
		if (this.hasThinkTime() && !closedWorkloadTypeEq.hasThinkTime())
			return false;
		if (this.hasThinkTime() && closedWorkloadTypeEq.hasThinkTime())
			{
			try {
				if (!this.getThinkTime().asString().equals(closedWorkloadTypeEq.getThinkTime().asString()))
					return false;
				}
			catch (Exception e)
				{
				return false;
				}
			}
		if (!this.hasTimeUnits() && closedWorkloadTypeEq.hasTimeUnits())
			return false;
		if (this.hasTimeUnits() && !closedWorkloadTypeEq.hasTimeUnits())
			return false;
		if (this.hasTimeUnits() && closedWorkloadTypeEq.hasTimeUnits())
			{
			try {
				if (!this.getTimeUnits().asString().equals(closedWorkloadTypeEq.getTimeUnits().asString()))
					return false;
				}
			catch (Exception e)
				{
				return false;
				}
			}
		if (!this.hasThinkDevice() && closedWorkloadTypeEq.hasThinkDevice())
			return false;
		if (this.hasThinkDevice() && !closedWorkloadTypeEq.hasThinkDevice())
			return false;
		if (this.hasThinkDevice() && closedWorkloadTypeEq.hasThinkDevice())
			{
			try {
				if (!this.getThinkDevice().asString().equals(closedWorkloadTypeEq.getThinkDevice().asString()))
					return false;
				}
			catch (Exception e)
				{
				return false;
				}
			}
		return true;
		}
	
	/**
	 * Inserisce un elemento Transit alla posizione numero
	 * index tra tutti gli elementi Transit presenti.
	 * @param value
	 * @param index
	 */
	public void insertTransitAt(TransitType value, int index) 
		{
		insertDomElementAt(null, "Transit", index, value);
		}
	
	/**
	 * Aggiunge un attributo TimeUnits a questo elemento.
	 * @param value
	 * @throws Exception
	 */
	public void addTimeUnits(String value) throws Exception 
		{
		addTimeUnits(new TimeUnitsType(value));
		}
	
	/**
	 * Aggiunge un attributo TimeUnits a questo elemento.
	 * @param value
	 */
	public void addTimeUnits(TimeUnitsType value) 
		{
		setDomChild(Attribute, null, "TimeUnits", value.toString());
		}
	}
