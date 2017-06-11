//Author: Sachin Haldipur
//Date: 04/08/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 4
//Exercise 1 b 
/*
 *Description of Program: This program has a TestCustomer class that instigates 
 *the constructor for the Customer class and then calls the pay customer method.
 */
public class TestCustomer
{
   public static void main(String[] args)
   {
      String fName = "John";
      String lName = "Smith";
      
      Customer customer = new Customer(fName,lName);
      
      customer.creditCardPay();
   }
}