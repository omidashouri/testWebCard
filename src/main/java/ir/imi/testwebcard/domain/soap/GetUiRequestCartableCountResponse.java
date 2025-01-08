
package ir.imi.testwebcard.domain.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetUiRequestCartableCountResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getUiRequestCartableCountResult"
})
@XmlRootElement(name = "GetUiRequestCartableCountResponse")
public class GetUiRequestCartableCountResponse {

    @XmlElement(name = "GetUiRequestCartableCountResult")
    protected String getUiRequestCartableCountResult;

    /**
     * Gets the value of the getUiRequestCartableCountResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetUiRequestCartableCountResult() {
        return getUiRequestCartableCountResult;
    }

    /**
     * Sets the value of the getUiRequestCartableCountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetUiRequestCartableCountResult(String value) {
        this.getUiRequestCartableCountResult = value;
    }

}
