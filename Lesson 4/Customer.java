//Author: Sachin Haldipur
//Date: 04/08/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 4
//Exercise 1 b 
//Description of Program: Creating the class Customer to be used by TestCustomer
 

public class Customer
{
   private String name;
   private String lastName;
   private CreditCard creditCard;

   //constructor
   public Customer(String name, String lastName)
   {
      this.name = name;
      this.lastName = lastName;
      creditCard = new CreditCard();
   }
   
   //accessor methods
   
   public void setName(String name){
      this.name = name;
   }
   
   public String getName()
   {
      return name;
   }
   
   public void setLastName(String lastName){
      this.lastName = lastName;
   }
   
   public String getLastName()
   {
      return lastName;
   }

   //nested class
   private class CreditCard
   {
      public void payCard()
      {
         System.out.println("Paid.");        
      }
   }
   
   //this method calls the nested class payCard method
   public void creditCardPay()
   {
      creditCard.payCard();
   }
   
}