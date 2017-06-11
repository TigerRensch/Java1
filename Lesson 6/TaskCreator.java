 //Author: Sachin Haldipur
//Date: 04/15/2017 
//Author: Sachin Haldipur
//Date: 04/05/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 6
//Exercise 3 
/**Description of Program:
 *
 * This class will use the Task class to create new tasks. 
 * Task ID is auto created for each task.   
 */
 
 import java.util.Scanner;
 
 public class TaskCreator
 {
   public static void main(String[] args)
   {
    
     final int CONFIRM_TASK = 1;
     int taskConfirmReceived;
     String taskTitleReceived;
     int taskTimeReceived;
     String taskTimeOfDayReceived;
     double priceReceived;
     int taskId = 0; 
          
     Scanner input = new Scanner(System.in);
     
     System.out.print("Would you like to add a task? If so enter " + CONFIRM_TASK);          
     taskConfirmReceived = input.nextInt();

     if(taskConfirmReceived == 1){
      
     }else {
            System.out.print("Thank you and have a good day.");          
     }
     
     while(taskConfirmReceived == 1)
     {
      //instantiate Task class to use methods                     
          Task task = new Task();       
          
          //user inputs        
          
          // Skip newline
          input.nextLine();
          
          System.out.print("\nPlease enter task name: ");
          taskTitleReceived = input.nextLine();
          
          
          System.out.print("\nPlease enter task time: ");
          taskTimeReceived = input.nextInt();
          
          // Skip newLine
          input.nextLine();
          
          System.out.print("\nPlease enter AM or PM: ");
          taskTimeOfDayReceived = input.nextLine();
                         
          System.out.print("\nPlease enter task price: ");
          priceReceived = input.nextDouble();
          
          //use accessor methods       
          task.setTitle(taskTitleReceived);
          String title = task.getTitle();
          
          task.setTime(taskTimeReceived);
          int time = task.getTime();
          
          task.setTimeOfDay(taskTimeOfDayReceived);
          String timeOfDay = task.getTimeOfDay();
           
          task.setPrice(priceReceived);
          double price = task.getPrice();
                 
          //display all tasks and auto generate ID for each displayed
          taskId++;
                 
          System.out.print("Do you want to display your tasks? Enter 1 for Yes or any other number for No: ");
          int displayTaskConfirm = input.nextInt();
          
          if(displayTaskConfirm == 1){
            System.out.print("ID: " + taskId + "," + " Task title: " + title + "," +  " Task time: " + time + "" + taskTimeOfDayReceived + "," +  " Task price: " + price);
          }else {
            System.out.print("Thank you and have a good day.");
            break;
          }          
                                                           
          System.out.print("\nAdd another task? If so enter " + CONFIRM_TASK);          
          taskConfirmReceived = input.nextInt();
          
          if(taskConfirmReceived != 1)
          {
             System.out.print("Thank you and have a good day.");
             break;
          }
      }

     }      
          
 }