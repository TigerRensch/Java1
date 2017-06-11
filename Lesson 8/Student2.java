//Author: Sachin Haldipur
//Date: 05/09/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 8
//Exercise 1 
/*Description of Program:
 *
 *This class will use the StudentSearcher class
 *   
 */
 
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 

public class Student2{
   public static void main(String[] args)
   { 
      String studentId;     
      String firstName;           
      String lastName;           
      String id; 
      String gpa; 
      
      
           
      boolean search = true;
      
      Scanner input = new Scanner(System.in);

      
      StudentSearcher studentSearcher = new StudentSearcher();

      ArrayList<String> studentProfile = new ArrayList<String>();
      
      while(search){  
    
          //list of student id's to provide users    
           System.out.print("\nHere is a list of student id's to search from: 1111,1122,2111,2212,3323,3333,3222. Please make your selection: >>");
           studentId = input.nextLine();
           
           if(studentId.equals("")){
             System.out.print("Please enter a student id after the list is given to you.");
           }else{
            
            studentProfile = studentSearcher.searchStudent(studentId);
           
            if(studentProfile.isEmpty()){
             System.out.print("The student profile could not be found.");
            }else{
             firstName = studentProfile.get(0);
             lastName =  studentProfile.get(1);
             id = studentProfile.get(2);
             gpa = studentProfile.get(3);
                                
             System.out.print(firstName + " " + lastName + " with student id of " + id + " has a gpa of " + gpa + ".");
             
            }
                                                                    
            studentProfile.clear();
             
           }
          
                
      }
            
   }
}