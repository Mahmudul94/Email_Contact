/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Email;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.xml.bind.JAXB;

/**
 *
 * @author Shommow
 */
public class createContactxml {
    public static void main(String[] args) {
         // open clients.xml, write objects to it then close file
	BufferedWriter output = null ;
	Scanner input = null;
   try {
	  output = Files.newBufferedWriter(Paths.get("contact.xml"));
      input = new Scanner(System.in);

      // stores the Accounts before XML serialization
     Contacts myList = new Contacts();

      System.out.printf("%s%n%s%n? ", 
         "Enter first name, last name, Email, Phonenumber and Address.",
         "Enter end-of-file indicator to end input.");

      while (input.hasNext()) { // loop until end-of-file indicator
         try {
            // create new record
            Contact record = new Contact(input.nextLine(),input.nextLine(), input.nextLine(), input.nextLine(),
                                         input.nextLine());

            // add to AccountList
            myList.getMycontacts().add(record);
         } 
         catch (NoSuchElementException elementException) {
            System.err.println("Invalid input. Please try again.");
            input.nextLine(); // discard input so user can try again
         } 

         System.out.print("? ");
      }

      // write AccountList's XML to output
      JAXB.marshal(myList, output);
      
   }
   catch (IOException ioException) {
      System.err.println("Error opening file. Terminating.");
   } 
   finally {
	   try {
		   output.close();
	   }	 
	   catch (IOException ioException) {
		   System.err.println(ioException.getMessage());
	   }
	      input.close();
   }
    }
    
}
