//Author: Sachin Haldipur
//Date: 04/15/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 6
//Exercise 2 
/**Description of Program:
 *
 * This class will use the StudentFileReader class to find a student.
 * StudentFileReader class did not function as intended, so it was modified and included
 * in the School class.   
 */
 
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

 
  
 public class School
 {
      
   public static void main(String[] args)
   {
      
      
      final int STUDENT_ID = 0;
      final int FIND_STUDENT = 1;
      final int EXIT = 2;
      int optionReceived = 0;
      String path = "students.txt";
      boolean acceptInput = true;
      boolean exit = false;
      int studentId;
      ArrayList<String> studentNameList = new ArrayList<String>();
      ArrayList<String> studentNumberList = new ArrayList<String>();
      String studentIdString = "";
                    
      Scanner input = new Scanner(System.in);
      
       System.out.print("To find a student enter " + FIND_STUDENT + ". To exit enter " + EXIT + ".");          
       optionReceived = input.nextInt();

               
         //load student list first
         if(optionReceived == 1){
           BufferedReader bufferedReader = null;
    		  String line = null;
    		  String[] lineArray;
           
           try {
            	//Read File
                bufferedReader = new BufferedReader(new FileReader(path));
                //Loop until the end of the file creating students
                while((line = bufferedReader.readLine()) != null) {
                	lineArray = line.split(",");
                	if(lineArray.length == 2){                     
                		studentNameList.add(lineArray[0]);
                     studentNumberList.add(lineArray[1]);                   
                	}else{
                		System.out.println("Error! There is an error parsing the student list");
                	}
                }
               
               //search list for student based on user input student ID        
               System.out.print("Enter student id: " + STUDENT_ID);
               studentId = input.nextInt();
               studentIdString = new Integer(studentId).toString();
               int length = studentIdString.length();
               
               //compensate for leading zero issue 
               if(length == 2){
                  studentIdString = "00" + studentIdString;
               }
                                            
               //System.out.print("studentIdString is: " + studentIdString);//test
               for(int i = 0; i < studentNumberList.size(); i++){
                  //System.out.print("\nstudentNumber from list is : " + studentNumberList.get(i));//test 
                  if(studentIdString.equals(studentNumberList.get(i)))
                  {
                     for(int j = 0; j < studentNameList.size(); j++){                   
                        //System.out.print("\nstudent number index: " + i);//test
                        //System.out.print("\nstudent name index: " + j);//test
                        if(i == j)
                        {
                           System.out.print("\nThe student with id number " + studentNumberList.get(i) + " is " + studentNameList.get(j) + ".");
                        }
                     
                     }
                  }
                  
               }   
            }
            catch(FileNotFoundException e) {
            	e.printStackTrace();             
            }
            catch(IOException e) {
            	e.printStackTrace(); 
            }
            finally{
                try {
    				bufferedReader.close();
    			} catch (IOException e) {
    				e.printStackTrace();
    			} 
            }
                                  
         }
                  
         //exit the application
         if(optionReceived == 2)
         {
            exit = true;
            System.out.print("You have exited the application.");
         }

                       
   }
 }