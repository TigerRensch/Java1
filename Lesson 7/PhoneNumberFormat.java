//Author: Sachin Haldipur
//Date: 05/09/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 7
//Exercise 1 (replacing with Chapter 7  exercise 9) 
/**Description of Program:
 *
 *This program will insert parentheses, a space and a dash into a 
 *string of 10 user entered numbers to format as a phone number.
 *   
 */
 
 import java.util.Scanner;
 
 public class PhoneNumberFormat
 {
  
   public static void main(String[] args)
   {
      
      String number;
      
      Scanner input = new Scanner(System.in);
      boolean acceptNumber = true;
      
      while (acceptNumber)
      {
         System.out.print("\nEnter phone number: ");
         number = input.nextLine();
                               
         StringBuilder phoneNumber = new StringBuilder(number);
         
         int numLength = phoneNumber.length();
   
         if (numLength < 10 || numLength > 10)
         {
            System.out.print("Please enter exactly 10 digits.");
         
         }else  
         {
            String areaCode = phoneNumber.substring(0,3);
            int areaCodetoInt = Integer.parseInt(areaCode);
         
            if (areaCodetoInt > 998)
            {
               System.out.print("Area code limit is 999. Enter an area code that is less than 999.");
            }else{
               phoneNumber.insert(0,"(");
               phoneNumber.insert(4,")");
               phoneNumber.insert(8,"-");
               
               System.out.print(phoneNumber);
            }
         
         }
            
      }
      
   }
  
 }