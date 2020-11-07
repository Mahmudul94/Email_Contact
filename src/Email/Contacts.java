/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Email;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;


public class Contacts {
    @XmlElement(name="Contacts")
    private List<Contact> mycontact = new ArrayList<>();
    
    public List<Contact> getMycontacts(){
        return mycontact;
    }
}
