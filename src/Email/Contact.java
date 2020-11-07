/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Email;

/**
 *
 * @author Shommow
 */
public class Contact {

   private String firstName;
   private String lastName;
   private String email;
   private String phoneNumber;
   private String address;
   
   public Contact(String firstName,String lastName,String email,String phoneNumber,String address){
       this.firstName=firstName;
       this.lastName=lastName;
       this.email=email;
       this.phoneNumber=phoneNumber;
       this.address=address;
       
   }
    public Contact(){
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact{" + "firstName=" + firstName + ", lastName=" + lastName + ", "
                + "email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + '}';
    }
    
    
    
}
