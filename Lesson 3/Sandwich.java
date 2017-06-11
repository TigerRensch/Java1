//Author: Sachin Haldipur
//Date: 04/05/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 3
//Exercise 11 a 
//Description of Program: This program will have a Sandwich class that will be instantiated by the TestSandwich application
//The modification with the added default constructor has been added.
public class Sandwich
{
   private String mainIngredient;
   private String breadType;
   private double price;
   
   //constructor
   public Sandwich()
   
   {
      mainIngredient = "turkey";
      breadType = "rye";
      price = 5.99;
      
      System.out.println("The default ingredient is " + mainIngredient + ".");
      System.out.println("The default bread type is " + breadType + ".");
      System.out.println("The default price is " + price + ".");
   }
   
   public String getMainIngredient()
   {
      return mainIngredient;
   }
   
   public void setMainIngredient(String ingredient)
   {
      mainIngredient = ingredient;
   }
   
   public String getBreadType()
   {
      return breadType;
   }
   
   public void setBreadType(String type)
   {
      breadType = type;
   }
   
   public double getPrice()
   {
      return price;
   }
   
   public void setPrice(double pr)
   {
      price = pr;
   }
}