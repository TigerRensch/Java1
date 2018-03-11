//Author: Sachin Haldipur
//Date: 04/05/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 3
//Exercise 12 b 
/*
 *Description of Program: The ShowStudent class will instantiate the Student1 class
 */

public class ShowStudent
{
   
   public static void main(String[] args)
   {
   
      int idNumber = 5;
      int creditHoursEarned = 3;
      int pointsEarned = creditHoursEarned * 4;
      int gradePointAverage;
   
      Student1 object = new Student1();
   
      object.setIdNumber(idNumber);
      int ID = object.getIdNumber();
    
      object.setCreditHoursEarned(creditHoursEarned);
      int creditHrsEarned = object.getCreditHoursEarned();

      object.setPointsEarned(pointsEarned);
      int ptsEarned = object.getPointsEarned();
     
      object.setGradePointAverage(pointsEarned,creditHoursEarned);
      int gpa = object.getGradePointAverage();
        
      System.out.println("The student's gpa is " + gpa + ".");
      System.out.println("The student's id number is " + ID + ".");
      System.out.println("The student has earned " + creditHrsEarned + " credits.");
      System.out.println("The student has earned " + ptsEarned + " points.");
           
  
 
   }
   
  
}