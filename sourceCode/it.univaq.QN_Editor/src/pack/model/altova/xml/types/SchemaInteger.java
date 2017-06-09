/**
 * SchemaInteger.java
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

import java.math.BigInteger;

public class SchemaInteger implements SchemaType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigInteger value;

	public SchemaInteger(String newvalue) {
		value = new BigInteger(newvalue);
	}

	public int hashCode() {
		return value.hashCode();
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof SchemaInteger))
			return false;
		return value.equals(((SchemaInteger)obj).value);
	}

	public Object clone() {
		return new SchemaInteger(value.toString());
	}

	public String toString() {
		return value.toString();
	}

	public String asString() {
		return toString();
	}

	public int compareTo(Object obj) {
		return compareTo((SchemaInteger)obj);
	}

	private int compareTo(SchemaInteger obj) {
		return value.compareTo(obj.value);
	}
}
