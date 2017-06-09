/**
 * DemandServType.java
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

import pack.model.altova.xml.types.SchemaIDRef;
import pack.model.altova.xml.types.SchemaInteger;

/**
 * DemandServType � il tipo dell'elemento
 * DemandServiceRequest. Una DemandServiceRequest � una
 * richiesta di servizio diretta ad un Server, fatta
 * specificando la domanda media di servizio (tempo di
 * servizio moltiplicato per il numero delle visite)
 * fornito ad ogni Workload che visita il Server specificato.
 * <pre>
 * <code>
 * &lt;xsd:complexType name="DemandServType"&gt;
 *	&lt;xsd:sequence&gt;
 *		&lt;xsd:element name="Transit" type="TransitType" maxOccurs="unbounded"/&gt;
 *	&lt;/xsd:sequence&gt;
 *	&lt;xsd:attribute name="WorkloadName" type="xsd:IDREF" use="required"/&gt;
 *	&lt;xsd:attribute name="ServerID" type="xsd:IDREF" use="required"/&gt;
 *	&lt;xsd:attribute name="TimeUnits" type="TimeUnitsType" use="optional"/&gt;
 *	&lt;xsd:attribute name="ServiceDemand" type="nonNegativeFloat" use="required"/&gt;
 *	&lt;xsd:attribute name="NumberOfVisits" type="xsd:nonNegativeInteger" use="optional"/&gt;
 * &lt;/xsd:complexType&gt;
 * </code>
 * </pre>
 *
 * @author Mirko Email: <a href="mailto:mirkoflamminj@virgilio.it">mirkoflamminj@virgilio.it</a>
 * @version 1.0
 */
public class DemandServType 
	extends pack.model.altova.xml.Node 
	{

	private static final long serialVersionUID = 1L;
	
	public DemandServType() {
		super();
	}

	public DemandServType(org.w3c.dom.Node node) {
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
	 * Restituisce l'attributo WorkloadName. index �
	 * ignorato.
	 * @param index
	 * @return
	 * @throws Exception
	 */
	public SchemaIDRef getWorkloadNameAt(int index) throws Exception {
		return new SchemaIDRef(getDomNodeValue(getDomChildAt(Attribute, null, "WorkloadName", index)));
	}

	/**
	 * Restituisce l'attributo WorkloadName.
	 * @return
	 * @throws Exception
	 */
	public SchemaIDRef getWorkloadName() throws Exception 
		{
		return getWorkloadNameAt(0);
		}

	/**
	 * Restituisce true se e solo se � presente un
	 * attributo ServerID.
	 * @return
	 */
	public boolean hasServerID() {
		return hasDomChild(Attribute, null, "ServerID");
	}

	/**
	 * Restituisce true se e solo se � presente un
	 * attributo ServerID.
	 * @return
	 */
	public SchemaIDRef getServerIDAt(int index) throws Exception {
		return new SchemaIDRef(getDomNodeValue(getDomChildAt(Attribute, null, "ServerID", index)));
	}

	/**
	 * Rimuove l'attributo ServerID. index � ignorato.
	 * @param index
	 */
	public void removeServerIDAt(int index) {
		removeDomChildAt(Attribute, null, "ServerID", index);
	}

	/**
	 * Restituisce true se e solo se � presente un
	 * attributo TimeUnits.
	 * @return
	 */
	public boolean hasTimeUnits() {
		return hasDomChild(Attribute, null, "TimeUnits");
	}

	/**
	 * Restituisce true se e solo se � presente un
	 * attributo TimeUnits.
	 * @return
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
	 * Restituisce true se e solo se � presente un
	 * attributo ServiceDemand.
	 * @return
	 */
	public boolean hasServiceDemand() {
		return hasDomChild(Attribute, null, "ServiceDemand");
	}

	/**
	 * Restituisce true se e solo se � presente un
	 * attributo ServiceDemand.
	 * @return
	 */
	private nonNegativeFloat getServiceDemandAt(int index) throws Exception {
		return new nonNegativeFloat(getDomNodeValue(getDomChildAt(Attribute, null, "ServiceDemand", index)));
	}

	/**
	 * Restituisce l'attributo ServiceDemand.
	 * @return
	 * @throws Exception
	 */
	public nonNegativeFloat getServiceDemand() throws Exception {
		return getServiceDemandAt(0);
	}

	/**
	 * Restituisce true se e solo se � presente un
	 * attributo NumberOfVisits.
	 * @return
	 */
	public boolean hasNumberOfVisits() {
		return hasDomChild(Attribute, null, "NumberOfVisits");
	}

	/**
	 * Restituisce l'attributo NumberOfVisits. index �
	 * ignorato.
	 * @param index
	 * @return
	 * @throws Exception
	 */
	private SchemaInteger getNumberOfVisitsAt(int index) throws Exception {
		return new SchemaInteger(getDomNodeValue(getDomChildAt(Attribute, null, "NumberOfVisits", index)));
	}

	/**
	 * Restituisce l'attributo NumberOfVisits.
	 * @return
	 * @throws Exception
	 */
	public SchemaInteger getNumberOfVisits() throws Exception {
		return getNumberOfVisitsAt(0);
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
	 * Aggiunge l'attributo WorkloadName.
	 * @param value
	 * @throws Exception
	 */
	public void addWorkloadName(String value) throws Exception 
		{
		addWorkloadName(new SchemaIDRef(value));
		}
	
	/**
	 * Aggiunge l'attributo WorkloadName.
	 * @param value
	 */
	public void addWorkloadName(SchemaIDRef value) 
		{
		setDomChild(Attribute, null, "WorkloadName", value.toString());
		}
	
	/**
	 * Aggiunge l'attributo ServerID.
	 * @param value
	 */
	public void addServerID(SchemaIDRef value) 
		{
		setDomChild(Attribute, null, "ServerID", value.toString());
		}

	/**
	 * Aggiunge l'attributo ServerID.
	 * @param value
	 */
	public void addServerID(String value) 
		throws Exception 
		{
		addServerID(new SchemaIDRef(value));
		}	
	
	/**
	 * Aggiunge l'attributo TimeUnits.
	 * @param value
	 * @throws Exception
	 */
	public void addTimeUnits(String value) throws Exception 
		{
		addTimeUnits(new TimeUnitsType(value));
		}

	/**
	 * Aggiunge l'attributo TimeUnits.
	 * @param value
	 */
	public void addTimeUnits(TimeUnitsType value) 
		{
		setDomChild(Attribute, null, "TimeUnits", value.toString());
		}
	
	/**
	 * Aggiunge l'attributo ServiceDemand.
	 * @param value
	 */
	public void addServiceDemand(nonNegativeFloat value) 
		{
		setDomChild(Attribute, null, "ServiceDemand", value.toString());
		}

	/**
	 * Aggiunge l'attributo ServiceDemand.
	 * @param value
	 */
	public void addServiceDemand(String value) throws Exception 
		{
		addServiceDemand(new nonNegativeFloat(value));
		}	
	
	/**
	 * Aggiunge l'attributo NumberOfVisits.
	 * @param value
	 */
	public void addNumberOfVisits(SchemaInteger value) 
		{
		setDomChild(Attribute, null, "NumberOfVisits", value.toString());
		}

	/**
	 * Aggiunge l'attributo NumberOfVisits.
	 * @param value
	 */
	public void addNumberOfVisits(String value) throws Exception 
		{
		addNumberOfVisits(new SchemaInteger(value));
		}
		
	/**
	 * Inserisce un elemento Transit alla posizione numero
	 * index tra tutti gli elementi Transit presenti.
	 * @param value
	 * @param index
	 */
	public void insertTransitAt(TransitType value, int index) {
		insertDomElementAt(null, "Transit", index, value);
	}

	/**
	 * Aggiunge un elemento Transit.
	 * @param value
	 */
	public void addTransit(TransitType value) {
		appendDomElement(null, "Transit", value);
	}

	/**
	 * Rimuove l'elemento Transit numero index tra tutti
	 * gli elementi Transit presenti.
	 * @param index
	 */
	public void removeTransitAt(int index) {
		removeDomChildAt(Element, null, "Transit", index);
	}

	@Override
	public boolean equals(Object obj)
		{
		if (!(obj instanceof DemandServType))
			return false;
		DemandServType demandServTypeEq = (DemandServType)obj;
		if (!this.hasTransit() && demandServTypeEq.hasTransit())
			return false;
		if (this.hasTransit() && !demandServTypeEq.hasTransit())
			return false;
		if (this.hasTransit() && demandServTypeEq.hasTransit())
			{
			if (this.getTransitCount() != demandServTypeEq.getTransitCount())
				return false;
			for (int i = 0; i < this.getTransitCount(); i++)
				{
				try {
					if (!this.getTransitAt(i).equals(demandServTypeEq.getTransitAt(i)))
						return false;
					}
				catch (Exception e)
					{
					return false;
					}
				}
			}
		if (!this.hasWorkloadName() && demandServTypeEq.hasWorkloadName())
			return false;
		if (this.hasWorkloadName() && !demandServTypeEq.hasWorkloadName())
			return false;
		if (this.hasWorkloadName() && demandServTypeEq.hasWorkloadName())
			{
			try {
				if (!this.getWorkloadName().equals(demandServTypeEq.getWorkloadName()))
					return false;
				}
			catch (Exception e)
				{
				return false;
				}
			}
		if (!this.hasServerID() && demandServTypeEq.hasServerID())
			return false;
		if (this.hasServerID() && !demandServTypeEq.hasServerID())
			return false;
		if (this.hasServerID() && demandServTypeEq.hasServerID())
			{
			try {
				if (!this.getServerID().asString().equals(demandServTypeEq.getServerID().asString()))
					return false;
				}
			catch (Exception e)
				{
				return false;
				}
			}
		if (!this.hasTimeUnits() && demandServTypeEq.hasTimeUnits())
			return false;
		if (this.hasTimeUnits() && !demandServTypeEq.hasTimeUnits())
			return false;
		if (this.hasTimeUnits() && demandServTypeEq.hasTimeUnits())
			{
			try {
				if (!this.getTimeUnits().asString().equals(demandServTypeEq.getTimeUnits().asString()))
					return false;
				}
			catch (Exception e)
				{
				return false;
				}
			}
		if (!this.hasServiceDemand() && demandServTypeEq.hasServiceDemand())
			return false;
		if (this.hasServiceDemand() && !demandServTypeEq.hasServiceDemand())
			return false;
		if (this.hasServiceDemand() && demandServTypeEq.hasServiceDemand())
			{
			try {
				if (!this.getServiceDemand().asString().equals(demandServTypeEq.getServiceDemand().asString()))
					return false;
				}
			catch (Exception e)
				{
				return false;
				}
			}
		if (!this.hasNumberOfVisits() && demandServTypeEq.hasNumberOfVisits())
			return false;
		if (this.hasNumberOfVisits() && !demandServTypeEq.hasNumberOfVisits())
			return false;
		if (this.hasNumberOfVisits() && demandServTypeEq.hasNumberOfVisits())
			{
			try {
				if (!this.getNumberOfVisits().asString().equals(demandServTypeEq.getNumberOfVisits().asString()))
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
	 * Restituisce l'attributo ServerID.
	 * @return
	 * @throws Exception
	 */
	public SchemaIDRef getServerID() throws Exception 
		{
		return getServerIDAt(0);
		}
	}
