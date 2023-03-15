
package SOAP.wsdl.gt.com.tigo.services;

import java.util.ArrayList;
import java.util.List;
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOf_Location" type="{http://services.tigo.com.gt}ListOf_Location" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfLocation"
})
@XmlRootElement(name = "VME_Location_Output")
public class VMELocationOutput {

    @XmlElement(name = "ListOf_Location")
    protected List<ListOfLocation> listOfLocation;

    /**
     * Gets the value of the listOfLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOfLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfLocation }
     * 
     * 
     */
    public List<ListOfLocation> getListOfLocation() {
        if (listOfLocation == null) {
            listOfLocation = new ArrayList<ListOfLocation>();
        }
        return this.listOfLocation;
    }

}
