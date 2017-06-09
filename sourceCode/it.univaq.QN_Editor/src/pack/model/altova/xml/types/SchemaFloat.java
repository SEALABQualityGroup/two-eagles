/**
 * SchemaFloat.java
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

public class SchemaFloat implements SchemaType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float value;

	private SchemaFloat(float newvalue) {
		value = newvalue;
	}

	public SchemaFloat(String newvalue) {
		value = Float.parseFloat(newvalue);
	}

	public int hashCode() {
		return Float.floatToIntBits(value);
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof SchemaFloat))
			return false;
		return value == ((SchemaFloat)obj).value;
	}

	public Object clone() {
		return new SchemaFloat(value);
	}

	public String toString() {
		return Float.toString(value);
	}

	public String asString() {
		return toString();
	}

	public int compareTo(Object obj) {
		return compareTo((SchemaFloat)obj);
	}

	public int compareTo(SchemaFloat obj) {
		return Float.compare(value, obj.value);
	}
}
