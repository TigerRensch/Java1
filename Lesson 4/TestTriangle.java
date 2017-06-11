//Author: Sachin Haldipur
//Date: 04/08/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 4
//Exercise 1 c 
//Description of Program: This program has a TestTriangle class that tests the Triangle class output.

public class TestTriangle
{
   public static void main(String[] args)
   {
      int a = 2;
      int b = 3;
      
      Triangle triangle = new Triangle(a,b);
      triangle.calculateValue();
      
   }

}