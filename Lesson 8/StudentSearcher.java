//Author: Sachin Haldipur
//Date: 05/09/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 8
//Exercise 1 
/**Description of Program:
 *
 *This class will make use of array lists to store the student
 *   
 */
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentSearcher{

      //fields
      String firstName;
      String lastName;
      String gpa;
      String path = "students.txt";
      
      //array lists
      ArrayList<String> studentfNameList = new ArrayList<String>();
      ArrayList<String> studentlNameList = new ArrayList<String>();
      ArrayList<String> gpaList = new ArrayList<String>();
      ArrayList<String> idList = new ArrayList<String>();
      
      ArrayList<String> studentProfile = new ArrayList<String>();

      
      
   public ArrayList<String> searchStudent(String studentId){
   
   //clear array lists to prevent duplication
   studentfNameList.clear();
   studentlNameList.clear();
   gpaList.clear();
   idList.clear();
   
      //load student list 
         BufferedReader bufferedReader = null;
    		  String line = null;
    		  String[] lineArray;
           
           try {
            	//Read File
                bufferedReader = new BufferedReader(new FileReader(path));
                //Loop until the end of the file creating students
                while((line = bufferedReader.readLine()) != null) {
                	lineArray = line.split(",");
                	if(lineArray.length == 4){                     
                		studentfNameList.add(lineArray[0]);
                     studentlNameList.add(lineArray[1]);
                     gpaList.add(lineArray[2]);
                     idList.add(lineArray[3]);                   
                	}
                }
                
               for(int i = 0; i < idList.size(); i++){              
                  if(studentId.equals(idList.get(i)))
                  {
                     for(int j = 0; j < studentfNameList.size(); j++){
                        if(i == j){
                           firstName = studentfNameList.get(j);                                                 
                           //System.out.print("\n" + firstName);
                         
                           studentProfile.add(firstName);
                           
                        }
                     }

                  }
                  
               }
               
                           
               for(int i = 0; i < idList.size(); i++){                 
                  if(studentId.equals(idList.get(i)))
                  {
                     for(int j = 0; j < studentlNameList.size(); j++){
                        if(i == j){
                           lastName = studentlNameList.get(j);                                                 
                           //System.out.print("\n" + lastName);
                           
                           studentProfile.add(lastName);
                                                
                        }
                     }

                  }                  
               }

                                       
               for(int i = 0; i < idList.size(); i++){
                  if(studentId.equals(idList.get(i)))
                  {
                     for(int j = 0; j < gpaList.size(); j++){                   
            
                        if(i == j)
                        {
                          studentId = idList.get(i);
                          gpa = gpaList.get(j);
                          
                          //System.out.print("\n" + studentId);
                          //System.out.print("\n" + gpa);
                          
                          studentProfile.add(studentId);
                          studentProfile.add(gpa);
                          
                         
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
         
         return studentProfile;
            
        }

      
}