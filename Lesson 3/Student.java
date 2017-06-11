//Author: Sachin Haldipur
//Date: 04/05/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 3
//Exercise 12 a 
/*
 *Description of Program: The Student class will be instantiated by the ShowStudent class
 *
 */

public class Student
{
   private int idNumber;
   private int creditHoursEarned;
   private int pointsEarned;
   private int gradePointAverage;
   
   //constructor   
   public Student(){
   
         idNumber = 9999;
         pointsEarned = 12;
         creditHoursEarned = 3;
         gradePointAverage = pointsEarned/creditHoursEarned;
   
      System.out.println("The student id number is: " + idNumber);
      System.out.println("The student has earned " + pointsEarned + " points.");
      System.out.println("The student has earned " + creditHoursEarned + " credits.");
      System.out.println("The student has a grade point average of " + gradePointAverage + ".");
   }
   
   //accessor methods
   
   public int getIdNumber()
   {
      return idNumber;
   }
   
   public void setIdNumber(int idNumb)
   {
      idNumber = idNumb;
   }
   
   public int getCreditHoursEarned()
   {
      return creditHoursEarned;
   }
   
   public void setCreditHoursEarned(int credHrsErnd)
   {
      creditHoursEarned = credHrsErnd;
   }
   
   public int getPointsEarned()
   {
      return pointsEarned;
   }
   
   public void setPointsEarned(int ptsErnd)
   {
      pointsEarned = ptsErnd;
   }
   
   public int getGradePointAverage()
   {     
      return gradePointAverage;
   }
   
   public void setGradePointAverage(int ptsErnd,int credHrsErnd)
   {
      gradePointAverage = (ptsErnd/credHrsErnd);
   }
   
}