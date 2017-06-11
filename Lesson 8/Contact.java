//Author: Sachin Haldipur
//Date: 05/09/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 8
//Exercise 2 
/**Description of Program:
 *
 *This class has the following fields, name, number, and address.
 *   
 */

import java.util.ArrayList;

public class Contact{
   //fields
   String name;
   String number;
   String address;
   
   ArrayList<String> cont = new ArrayList<String>();
 
   
   public ArrayList<String> createContact(String contactName,String contactNumber,String contactAddress){
   
   
      name = contactName;
      number = contactNumber;
      address = contactAddress;
      
      cont.add(name);
      cont.add(number);
      cont.add(address);
      
      return cont;
      
   }   
}