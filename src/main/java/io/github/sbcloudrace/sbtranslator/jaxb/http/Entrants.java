
package io.github.sbcloudrace.sbtranslator.jaxb.http;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Entrants complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Entrants">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LobbyEntrantInfo" type="{}LobbyEntrantInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entrants", propOrder = {
    "lobbyEntrantInfo"
})
public class Entrants {

    @XmlElement(name = "LobbyEntrantInfo", nillable = true)
    protected List<LobbyEntrantInfo> lobbyEntrantInfo;

    /**
     * Gets the value of the lobbyEntrantInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lobbyEntrantInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLobbyEntrantInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LobbyEntrantInfo }
     * 
     * 
     */
    public List<LobbyEntrantInfo> getLobbyEntrantInfo() {
        if (lobbyEntrantInfo == null) {
            lobbyEntrantInfo = new ArrayList<LobbyEntrantInfo>();
        }
        return this.lobbyEntrantInfo;
    }

}
