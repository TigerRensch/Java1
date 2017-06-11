//Author: Sachin Haldipur
//Date: 04/08/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 4
//Exercise 1 a 
/*
 *Description of Program: This program has a TestCar class that instantiates a car 
 *and prints the default speed as well as a modified speed.
 */

public class TestCar
{
   public static void main(String args[])
   {
      int modSpeed = 75;
      String make = "Chrysler";
      
      Car car1 = new Car(make);
      
      int defaultSpeed = car1.speed();
    
      Car car2 = new Car(make);
         
      car2.speed(modSpeed);
      int modifiedSpeed = car2.getSpeed();       
      
      System.out.println("The default speed is: " + defaultSpeed + ".");
      
      System.out.println("The modified speed is: " + modifiedSpeed + ".");
      
   }
}