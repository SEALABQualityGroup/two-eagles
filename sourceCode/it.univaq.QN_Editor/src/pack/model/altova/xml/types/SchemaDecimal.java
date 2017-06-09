/**
 * SchemaDecimal.java
 *
 * This file was generated by XMLSPY 5 Enterprise Edition.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the XMLSPY Documentation for further details.
 * http://www.altova.com/xmlspy
 */

package pack.model.altova.xml.types;

import java.math.BigDecimal;

class SchemaDecimal implements SchemaType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal value;

	private SchemaDecimal(String newvalue) {
		value = new BigDecimal(newvalue);
	}

	public int hashCode() {
		return value.hashCode();
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof SchemaDecimal))
			return false;
		return value.equals(((SchemaDecimal)obj).value);
	}

	public Object clone() {
		return new SchemaDecimal(value.toString());
	}

	public String toString() {
		return value.toString();
	}

	public String asString() {
		return toString();
	}

	public int compareTo(Object obj) {
		return compareTo((SchemaDecimal)obj);
	}

	private int compareTo(SchemaDecimal obj) {
		return value.compareTo(obj.value);
	}
}
