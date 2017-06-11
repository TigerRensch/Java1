//Author: Sachin Haldipur
//Date: 04/15/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 5
//Exercise 3 
//Description of Program:Creating the Internal Revenue Service class


import java.util.Scanner;

public class IRS
{
   public static void main(String[] args)
   {
         
      int messageReceiverW2;
      int messageReceiverReceipts;
      int messageReceiverDeduction;
      
      final int EXIST_W2 = 1;
      final int NOT_EXIST_W2 = 2;
      final int RECEIPTS_EXIST = 1;
      final int NO_RECEIPTS_EXIST = 2;
      final int DEDUCT_YES = 1;
      final int DEDUCT_NO = 2;
      
      boolean criteriaW2 = false;
      boolean criteriaReceipts = false;
      boolean criteriaDeductions = false;
      
      
      final double INFRACTION_W2 = 500.00;
      final double INFRACTION_RECEIPT = 300.00;
      final double DEDUCTIONS_GREATER_THAN_THREE = 1000.00;
      
      
            
      Scanner input = new Scanner(System.in);
         
      System.out.print("Did the customer provide a W-2? If yes enter " + EXIST_W2 + " if no enter " + NOT_EXIST_W2 + ".");
      messageReceiverW2 = input.nextInt();
      
      System.out.print("Did the customer provide donation receipts? If yes enter " + RECEIPTS_EXIST + " if no enter " + NO_RECEIPTS_EXIST + ".");
      messageReceiverReceipts = input.nextInt();
      
      System.out.print("Did the customer deduct more than three children? If yes enter " + DEDUCT_YES + " if no enter " + DEDUCT_NO + ".");
      messageReceiverDeduction = input.nextInt();
   
      if(messageReceiverW2 == 1){
         System.out.print("\nThe customer has passed the W-2 provision criteria.");
         criteriaW2 = true;
         
         
      }else if(messageReceiverW2 == 2){
         System.out.print("\nThe charge for the W-2 infraction is " + INFRACTION_W2); 
      }
      
      
      if(messageReceiverReceipts == 1)
      {
          System.out.print("\nThe customer has passed the donation receipt criteria.");
          criteriaReceipts = true;
                       
      }else if(messageReceiverReceipts == 2)
      {
         System.out.print("\nThe charge for the donation receipt infraction is " + INFRACTION_RECEIPT); 
      }
      
      if(messageReceiverDeduction == 1 && criteriaW2 == false && criteriaReceipts == false )
      {
         System.out.print("\nThe charge for the child deductions greater than three when the other two infractions are present is " + DEDUCTIONS_GREATER_THAN_THREE + ".");
         
      }else if(messageReceiverDeduction == 1 && criteriaW2 == true && criteriaReceipts == true )
      {
         System.out.print("\nThe customer has passed the child deduction criteria. There is no child deduction infraction.");
         criteriaDeductions = true;
      }
      
     
      //pass/fail status
      if(criteriaW2 == false && criteriaReceipts == false && criteriaDeductions == false )
      {
 
         System.out.print("\n All three criteria have failed.  A bill is being generated.");
         double totalBill = INFRACTION_W2 + INFRACTION_RECEIPT + DEDUCTIONS_GREATER_THAN_THREE;
         System.out.print("\nThe customer total is $" + totalBill + ".");  
         
      }
      
     
      if(criteriaW2 == true && criteriaReceipts == true && criteriaDeductions == false )
      {
        System.out.print("\nW2 and donation receipt criteria have passed.  The customer is cleared of infractions.");
      }
      
     
      if(criteriaW2 == true && criteriaReceipts == false && criteriaDeductions == false )
      {
        System.out.print("\nThe donation receipt criteria has failed.  A bill is being generated.");
        double totalBill = INFRACTION_RECEIPT;
        System.out.print("\nThe customer total is $" + totalBill + ".");

      }
      
      
      if(criteriaW2 == true && criteriaReceipts == false && criteriaDeductions == true )
      {
        System.out.print("\nThe donation receipt criteria has failed.  A bill is being generated.");
        double totalBill = INFRACTION_RECEIPT;
        System.out.print("\nThe customer total is $" + totalBill + ".");
      }
      
      
      if(criteriaW2 == false && criteriaReceipts == true && criteriaDeductions == true )
      {
        System.out.print("\nThe W2 criteria has failed.  A bill is being generated.");
        double totalBill = INFRACTION_W2;
        System.out.print("\nThe customer total is $" + totalBill + ".");
      }
      
     
      if(criteriaW2 == false && criteriaReceipts == true && criteriaDeductions == false )
      {
        System.out.print("\nThe W2 criteria has failed.  A bill is being generated.");
        double totalBill = INFRACTION_W2;
        System.out.print("\nThe customer total is $" + totalBill + ".");
      }
      

      
      if(criteriaW2 == true && criteriaReceipts == true && criteriaDeductions == true )
      {
         System.out.print("\nAll three criteria have passed.  The customer is cleared of infractions.");
      }
      
      
   }

}