//Author: Sachin Haldipur
//Date: 04/08/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 4
//Exercise 1 a 
//Description of Program: Creating the class Car to be used by TestCar

public class Car
{
   private String make;
   private int speed;
   private static int defaultSpeed = 50;
   
   //constructor
   public Car(String make)
   {
      this.make = make;
   }
   
   public int speed()
   {
      return defaultSpeed;
   }
   
   public void speed(int speed)
   {
      this.speed = speed;
   }
   
   public int getSpeed()
   {
      return speed;
   }
   

   
}