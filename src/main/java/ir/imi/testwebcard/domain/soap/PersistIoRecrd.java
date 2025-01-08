
package ir.imi.testwebcard.domain.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="keyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ioDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="deviceModuleType" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="hadwareCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keyNumber",
    "ioDateTime",
    "deviceModuleType",
    "hadwareCode"
})
@XmlRootElement(name = "PersistIoRecrd")
public class PersistIoRecrd {

    protected String keyNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ioDateTime;
    protected long deviceModuleType;
    protected long hadwareCode;

    /**
     * Gets the value of the keyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyNumber() {
        return keyNumber;
    }

    /**
     * Sets the value of the keyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyNumber(String value) {
        this.keyNumber = value;
    }

    /**
     * Gets the value of the ioDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIoDateTime() {
        return ioDateTime;
    }

    /**
     * Sets the value of the ioDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIoDateTime(XMLGregorianCalendar value) {
        this.ioDateTime = value;
    }

    /**
     * Gets the value of the deviceModuleType property.
     * 
     */
    public long getDeviceModuleType() {
        return deviceModuleType;
    }

    /**
     * Sets the value of the deviceModuleType property.
     * 
     */
    public void setDeviceModuleType(long value) {
        this.deviceModuleType = value;
    }

    /**
     * Gets the value of the hadwareCode property.
     * 
     */
    public long getHadwareCode() {
        return hadwareCode;
    }

    /**
     * Sets the value of the hadwareCode property.
     * 
     */
    public void setHadwareCode(long value) {
        this.hadwareCode = value;
    }

}
