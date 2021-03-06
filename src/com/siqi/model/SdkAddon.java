//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.12 at 07:10:29 ���� CST 
//

package com.siqi.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for sdk-addon complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="sdk-addon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="license" type="{http://schemas.android.com/sdk/android/addon/5}license" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="add-on" type="{http://schemas.android.com/sdk/android/addon/5}add-on" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extra" type="{http://schemas.android.com/sdk/android/addon/5}add-on" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sdk-addon", propOrder = { "license", "addOn", "extra" })
@XmlRootElement
public class SdkAddon {

	protected List<License> license;
	@XmlElement(name = "add-on")
	protected List<AddOn> addOn;
	protected List<AddOn> extra;

	/**
	 * Gets the value of the license property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the license property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLicense().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link License }
	 * 
	 * 
	 */
	public List<License> getLicense() {
		if (license == null) {
			license = new ArrayList<License>();
		}
		return this.license;
	}

	/**
	 * Gets the value of the addOn property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the addOn property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAddOn().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link AddOn }
	 * 
	 * 
	 */
	public List<AddOn> getAddOn() {
		if (addOn == null) {
			addOn = new ArrayList<AddOn>();
		}
		return this.addOn;
	}

	/**
	 * Gets the value of the extra property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the extra property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getExtra().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link AddOn }
	 * 
	 * 
	 */
	public List<AddOn> getExtra() {
		if (extra == null) {
			extra = new ArrayList<AddOn>();
		}
		return this.extra;
	}

}
