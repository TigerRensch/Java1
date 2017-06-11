//Author: Sachin Haldipur
//Date: 04/15/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 5
//Exercise 1
 
/*Description of Program: Creating the Restaurant class
 *There was no salad price, and as it seems that salad is separate
 *and does not come with a sandwich, a salad price was created.
 */

import java.util.Scanner;

public class Restaurant 
{
   public static void main(String[] args)
   {
      int orderType;
      int toppingConfirm;
      int lettuceConfirm;
      int tomatoConfirm;
      int cheeseConfirm;
      double sandwichPrice = 7.00;
      double saladPrice = 5.00;
      double additionalSandwichToppingPrice = 1.00;      
      double additionalSaladToppingPrice = 0.5;
      double totalSandwichPrice;
      double totalSaladPrice;
      final int SANDWICH_CODE = 1;
      final int SALAD_CODE = 2;
      final int TOPPING_YES = 1;
      final int TOPPING_NO = 2;
      final int LETTUCE_YES = 1;
      final int LETTUCE_NO = 2;
      final int TOMATO_YES = 1;
      final int TOMATO_NO = 2;
      final int CHEESE_YES = 1;
      final int CHEESE_NO = 2;
      
      int sandwichToppingCount = 0;
      int saladToppingCount = 0;

      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter  " + SANDWICH_CODE + " for sandwich, or " + SALAD_CODE + " for salad.");
      orderType = input.nextInt();
      
      switch(orderType)
      {
         case 1:          
            if(orderType == 1)
            {
               System.out.println("A sandwich is $" + sandwichPrice + ".");
               System.out.println("Do you want additional sandwich toppings? If yes, enter " + TOPPING_YES + ", if no enter " + TOPPING_NO + ".");
               toppingConfirm = input.nextInt();
               
               if(toppingConfirm == 1){
                  System.out.println("If you want lettuce enter " + LETTUCE_YES + ", if not enter " + LETTUCE_NO + "." );
                  lettuceConfirm = input.nextInt();
                  
                  if(lettuceConfirm == 1)
                  {
                     System.out.println("You have added lettuce for $" + additionalSandwichToppingPrice + "." );
                     sandwichToppingCount++;
                  }
                  
                  System.out.println("If you want tomatoes enter " + TOMATO_YES + ", if not enter " + TOMATO_NO + "." );
                  tomatoConfirm = input.nextInt();
                  
                  if(tomatoConfirm == 1){
                     System.out.println("You have added tomato for $" + additionalSandwichToppingPrice + "." );
                     sandwichToppingCount++;
                  }
                  
                  System.out.println("If you want cheese enter " + CHEESE_YES + ", if not enter " + CHEESE_NO + "." );
                  cheeseConfirm = input.nextInt();

                  if(cheeseConfirm == 1){
                     System.out.println("You have added cheese for $" + additionalSandwichToppingPrice + "." );
                     sandwichToppingCount++;
                  }
                  
                  totalSandwichPrice = sandwichPrice + (sandwichToppingCount * additionalSandwichToppingPrice);
                  
                  System.out.println("Your total sandwich cost is $" + totalSandwichPrice + ".");            
                  
               }
               else
               {
                  System.out.println("Your total sandwich cost is $" + sandwichPrice + ".");
               }
               
            }                   
            break;
         
         case 2:
            if(orderType == 2)
            {
               System.out.println("A salad is $" + saladPrice + ".");
               System.out.println("Do you want additional salad toppings? If yes, enter " + TOPPING_YES + ", if no enter " + TOPPING_NO + ".");
               toppingConfirm = input.nextInt();
               
               if(toppingConfirm == 1)
               {
                  System.out.println("If you want tomatoes enter " + TOMATO_YES + ", if not enter " + TOMATO_NO + "." );
                  tomatoConfirm = input.nextInt();
                  
                  if(tomatoConfirm == 1)
                  {
                     System.out.println("You have added tomato for $" + additionalSaladToppingPrice + "." );
                     saladToppingCount++;
                  }
                  
                  System.out.println("If you want cheese enter " + CHEESE_YES + ", if not enter " + CHEESE_NO + "." );
                  cheeseConfirm = input.nextInt();
                  
                  if(cheeseConfirm == 1){
                     System.out.println("You have added cheese for $" + additionalSaladToppingPrice + "." );
                     saladToppingCount++;
                  }
                  
                  totalSaladPrice = saladPrice + (saladToppingCount * additionalSaladToppingPrice);
                  
                  System.out.println("Your total salad cost is $" + totalSaladPrice + ".");            

               }
               else
               {
                  System.out.println("Your total salad cost is $" + saladPrice + ".");
               }

            }
                        
            break;
         default:
            System.out.print("Neither a sandwich or salad has been chosen.");
      }
   }
}