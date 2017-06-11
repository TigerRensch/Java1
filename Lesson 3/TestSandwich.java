//Author: Sachin Haldipur
//Date: 04/05/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 3
//Exercise 11 b 
/*
 *Description of Program: This program will have a TestSandwich application that will instantiate one
 *sandwich object and demonstrate the use of the set and get methods
 */
 
 public class TestSandwich
 {
 
   public static void main(String[] args)
   {
      String ingredient = "tuna";
      String bread = "wheat";
      double price = 10.00;
      
      Sandwich object = new Sandwich();
   
      object.setMainIngredient(ingredient);
      String newIngredient = object.getMainIngredient();
      
      object.setBreadType(bread);
      String newBreadType = object.getBreadType();
      
      object.setPrice(price);
      double newPrice = object.getPrice();
       
      System.out.println("The main ingredient is " + newIngredient);
      System.out.println("The main bread used is " + newBreadType);
      System.out.println("The price will be " + "$" + newPrice);
      
          
   }
 
   
 }