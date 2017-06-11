//Author: Sachin Haldipur
//Date: 04/08/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 4
//Exercise 1 c 
//Description of Program: This program has a Triangle class that will be used by the TestTriangle class

import java.lang.Math;

public class Triangle
{
   public int A;
   public int B;
   public int C;
   
   //constructor
   public Triangle(int A, int B)
   {
      this.A = A;
      this.B = B;
   }
   
   public void calculateValue()
   {
      int cSquared = (A * A) + (B * B);
      double C = Math.sqrt(cSquared);
       
      System.out.println("The value of C is " + C + ".");
   }
}