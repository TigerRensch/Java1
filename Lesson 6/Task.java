//Author: Sachin Haldipur
//Date: 04/05/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 6
//Exercise 3 
/**Description of Program:
 *
 * This class will be used by the Task class to create new tasks. 
 *    
 */

public class Task
{
     
     
     private String title;
     private int time; 
     private String timeOfDay;
     private double price;
          
         
     //accessor methods
     
     public String getTitle()
     {
        return title;
     }
   
     public void setTitle(String title)
     {
        this.title = title;
     }
     
     public int getTime()
     {
         return time;
     }
     
     public void setTime(int time)
     {
         this.time = time;
     }
     
     public String getTimeOfDay()
     {
         return timeOfDay;
     }
     
     public void setTimeOfDay(String timeOfDay)
     {
         this.timeOfDay = timeOfDay;  
     }
          
     public double getPrice()
     {
         return price;
     }
     
     public void setPrice(double price)
     {
         this.price = price;
     }     
          
 }