//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.25 at 09:13:08 AM EET 
//

package gov.nih.nlm.ncbi.snp.docsum;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="resourceId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="linkValue" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType( XmlAccessType.FIELD)
@XmlType( name = "")
@XmlRootElement( name = "RsLinkout")
public class RsLinkout {

	@XmlAttribute( name = "resourceId", required = true)
	protected String resourceId;
	@XmlAttribute( name = "linkValue", required = true)
	protected String linkValue;

	/**
	 * Gets the value of the resourceId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResourceId() {

		return resourceId;
	}

	/**
	 * Sets the value of the resourceId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResourceId( String value) {

		this.resourceId = value;
	}

	/**
	 * Gets the value of the linkValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLinkValue() {

		return linkValue;
	}

	/**
	 * Sets the value of the linkValue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLinkValue( String value) {

		this.linkValue = value;
	}

}
