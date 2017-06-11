//Author: Sachin Haldipur
//Date: 05/09/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 8
//Exercise 2 
/**Description of Program:
 *
 *This class will present the user with the following options: 
 *Add, Remove, Change Order, Print, and Exit.   
 */
 
 import java.util.Scanner;
 import java.util.ArrayList;
 import java.util.Collections;
 
 public class MyContacts{
 
    public static void main(String[] args)
    { 
      final int ADD = 1;
      final int REMOVE = 2;
      final int CHANGE_ORDER = 3;
      final int PRINT = 4;
      final int EXIT = 5;
      int optionReceived;
      int indexNumReceived;
      int indexSwap1;
      int indexSwap2;
      String contactName;
      String contactNumber;
      String contactAddress;
      
      String name;
      String number;
      String address;
      
      ArrayList<String> cont = new ArrayList<String>();
      ArrayList<ArrayList<String>> contList = new ArrayList<ArrayList<String>>();
      
      boolean enterContact = true;
      
      while(enterContact){
         Scanner input = new Scanner(System.in);
             
         System.out.print("\nTo enter a new contact choose the Add option by pressing " + ADD + ". \nTo print the contact list with the array index select Remove by pressing " + REMOVE + ". \nTo print the contact list with the array index order choose the Change Order option by pressing " + CHANGE_ORDER + ".\nTo print the contact list with the array index choose the Print option by pressing " + PRINT + ". \nTo exit press " + EXIT + ".");
         optionReceived = input.nextInt();
   
         if(optionReceived == 1){
            Contact contact = new Contact();
            
            input.nextLine();
   
            
            System.out.print("Enter contact name: >>");
            contactName = input.nextLine();
            
                     
            System.out.print("\nEnter contact number: >>");
            contactNumber = input.nextLine();
          
            System.out.print("\nEnter contact address: >>");
            contactAddress = input.nextLine();
            
            
            cont = contact.createContact(contactName,contactNumber,contactAddress);
            
            contList.add(cont); 
         }
         
         if(optionReceived == 2){
            for (ArrayList<String> contListItem : contList) {
               int index =contList.indexOf(contListItem);
               System.out.print("\nThe contact list item is " + contListItem + "and it's index is " + index + ".");
            }
            
            System.out.print("\nEnter the index number of the contact you want deleted: >>");
            indexNumReceived = input.nextInt();
            
            for(ArrayList<String> contListItem : contList){
               int index = contList.indexOf(contListItem);
               
               if(indexNumReceived == index){
                  contList.remove(index);                 
               }
            }
            
            for (ArrayList<String> contListItem : contList) {
               int index =contList.indexOf(contListItem);
               System.out.print("\nThe contact list item is " + contListItem + "and it's index is " + index + ".");
            }


         }else if(contList.isEmpty()){
            System.out.print("No contacts have been added.");
         }
         
         if(optionReceived == 3){
            
            for (ArrayList<String> contListItem : contList) {
               int index =contList.indexOf(contListItem);
               System.out.print("\nThe contact list item is " + contListItem + "and it's index is " + index + ".");
            }
                        
            System.out.print("\nEnter the index number of the contact you want to move: >>");
            indexSwap1 = input.nextInt();
            
            System.out.print("\nEnter the index number of where you want to move the contact to: >>");
            indexSwap2 = input.nextInt();
            
            Collections.swap(contList, indexSwap1, indexSwap2);
            
            for (ArrayList<String> contListItem : contList) {
               int index =contList.indexOf(contListItem);
               System.out.print("\nThe reordered contact list item is " + contListItem + "and it's index is " + index + ".");
            }

         }
         
         if(optionReceived == 4){
            for (ArrayList<String> contListItem : contList) {
                  int index =contList.indexOf(contListItem);
                  System.out.print("\nThe contact list item is " + contListItem + "and it's index is " + index + ".");
            }
         }
         
         if(optionReceived == 5){
            enterContact = false;
            System.out.print("You have exited the application.");
         }
      }   
      
    }
 
 }