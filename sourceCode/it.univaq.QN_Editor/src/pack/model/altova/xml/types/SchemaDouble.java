/**
 * SchemaDouble.java
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

class SchemaDouble implements SchemaType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double value;

	private SchemaDouble(double newvalue) {
		value = newvalue;
	}

	public int hashCode() {
		return (int)Double.doubleToLongBits(value);
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof SchemaDouble))
			return false;
		return value == ((SchemaDouble)obj).value;
	}

	public Object clone() {
		return new SchemaDouble(value);
	}

	public String toString() {
		return Double.toString(value);
	}

	public String asString() {
		return toString();
	}

	public int compareTo(Object obj) {
		return compareTo((SchemaDouble)obj);
	}

	private int compareTo(SchemaDouble obj) {
		return Double.compare(value, obj.value);
	}
}
