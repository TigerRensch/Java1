//Author: Sachin Haldipur
//Date: 04/15/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 6
//Exercise 1 
/**Description of Program:
 *
 * This is a coffee shop application.
 */
 
 import java.util.Scanner;
 
 public class CoffeeShop
 {
   public static void main(String[] args)
   {
      //customer order selection
      final int CUSTOMER_ORDER = 1;
      int customerOrderReceived;
      int customerOrderCount = 0;
      final int NONE_SELECTED = 4;

      
      //main drink selections
      final double COFFEE_PRICE = 3.25;
      final double ESPRESSO_PRICE = 4.25;
      final double TEA_PRICE = 2.75;
      
      //coffee selection
      //final double ICED_PRICE = 0.00;
      final double CREAM_PRICE = 0.50;
      final double SUGAR_PRICE = 0.50;
      
      //espresso
      //final double CARAMEL_PRICE = 0.00;
      //final double CHOCOLATE_PRICE = 0.00;
      
      //one extra shot of espresso
      //final double ONE_SHOT_PRICE = 0.00;
      final double TWO_SHOTS_PRICE = 1.25;
      
      //total coffee prices
      double totalCoffeePrice;
      double totalCreamPrice;
      double totalSugarPrice;
      double totalCoffeeOrderPrice = 0;
      
      //total espresso prices
      double totalEspressoPrice;
      double twoShotPrice;
      double totalEspressoOrderPrice = 0;
      
      //total tea price
      double totalTeaOrderPrice = 0;
      
      //total order price
      double totalPrice;
      
      //coffee acceptance choices
      //final int COFFEE_NO = 2;
      final int ICED_YES = 1;
      final int ICED_NO = 2;
      final int CREAM_YES = 1;
      final int CREAM_NO = 2;
      final int SUGAR_YES = 1;
      final int SUGAR_NO = 2;
      
      //drink message and acceptance choices
      int drinkMessageReceived;
      final int COFFEE_YES = 1;
      final int ESPRESSO_YES = 2;
      final int TEA_YES = 3;

      
      //number of coffees
      int coffeeNumOrderReceived;
      int numCoffeesOrdered = 0;
      int totalCoffeeOrdered = 0;
      int coffeeCounter = 0;
      
      //iced option
      int iceMessageReceived = 0;
      
      //number of creams
      int creamMessageReceived;
      int creamNumOrderReceived = 0;
      int numCreamsOrdered = 0;
      int totalCreamOrdered = 0;
      int creamCounter = 0;
      
      //number of sugars
      int sugarMessageReceived;
      int sugarNumOrderReceived = 0;
      int numSugarsOrdered = 0;
      int totalSugarOrdered = 0;
      int sugarCounter = 0;
      
      //number of espressos
      int espressoNumOrderReceived;
      int numEspressosOrdered = 0;
      int totalEspressoOrdered = 0;
      int espressoCounter = 0;
      int espressoOptionMessageReceived;
      
      //espresso acceptance choices
      final int CARAMEL_YES = 1;
      final int CHOCOLATE_YES = 2;
      int numShotsOrdered = 0;
      int shotMessageReceived;
      int shotNumOrderReceived;
      int totalShotsOrdered = 0;
      
      //number of teas
      int numTeasOrdered = 0;
      int teaNumOrderReceived;
      int teaCounter = 0;
      int totalTeaOrdered = 0;
      
      Scanner input = new Scanner(System.in);
      
      
      //main order -- while loop to return to order prompt in case customer wants additional purchases
      System.out.print("Would you like to place an order? If yes, enter " + CUSTOMER_ORDER);
      customerOrderReceived = input.nextInt();
      
      while(customerOrderReceived == 1)
      {                
        //coffee order
         System.out.print("\nDo you want coffee, espresso or tea? If coffee enter " + COFFEE_YES + " ,if espresso enter " + ESPRESSO_YES + " ,if tea enter " + TEA_YES + ", if none of these select " + NONE_SELECTED + ".");
         drinkMessageReceived = input.nextInt();
         
         if(drinkMessageReceived == 4){
            customerOrderReceived = 2;
         }
      
         if(drinkMessageReceived == 1){
            System.out.print("How many coffees do you want? Enter the number: "  + numCoffeesOrdered);
            coffeeNumOrderReceived = input.nextInt();
                    
             for(int co = coffeeNumOrderReceived; co > 0; co--)
             {
               coffeeCounter++;
               totalCoffeeOrdered += 1;
               
               //iced or hot coffee
               System.out.print("\nDo you want coffee " + coffeeCounter + " to be iced? If yes enter " + ICED_YES + " if no enter " + ICED_NO + ".");
               iceMessageReceived = input.nextInt();
               
               if(iceMessageReceived == 1)
               {
                  System.out.print("\nCoffee number " + coffeeCounter + " is iced.");
               }
               
               if(iceMessageReceived == 2)
               {
                  System.out.print("\nCoffee number " + coffeeCounter + " is hot.");
               }
               
               //cream order
               System.out.print("\nDo you want cream for coffee " + coffeeCounter + "? If yes enter " + CREAM_YES + " if no enter " + CREAM_NO + ".");
               creamMessageReceived = input.nextInt();
                          
               if(creamMessageReceived == 1)
               {
                  System.out.print("\nHow many creams do you want for coffee " + coffeeCounter + "? Enter the number: "  + numCreamsOrdered);
                  creamNumOrderReceived = input.nextInt();
               
                  for(int cr = creamNumOrderReceived; cr > 0; cr--)
                  {
                     totalCreamOrdered +=1;             
                  }
   
               }
               
               //sugar order 
               System.out.print("\nDo you want sugar for coffee "  + coffeeCounter + "? If yes enter " + SUGAR_YES + " if no enter " + SUGAR_NO + ".");
               sugarMessageReceived = input.nextInt();
               
               if(sugarMessageReceived == 1)
               {
                  System.out.print("\nHow many sugars do you want for coffee " + coffeeCounter + "? Enter the number: "  + numSugarsOrdered);
                  sugarNumOrderReceived = input.nextInt();
                   
                  for(int s = sugarNumOrderReceived; s > 0; s-- )
                  {
                     totalSugarOrdered +=1;
                  }
               }
                       
             }
            
            //calculate total price/and other information for coffee order
                 
            System.out.print("\nTotal coffee ordered is: " + totalCoffeeOrdered);
            System.out.print("\nTotal cream ordered is: " + totalCreamOrdered);
            System.out.print("\nTotal sugar ordered is: " + totalSugarOrdered);
            
            totalCoffeePrice = totalCoffeeOrdered * COFFEE_PRICE;
            totalCreamPrice = totalCreamOrdered * CREAM_PRICE;
            totalSugarPrice = totalSugarOrdered * SUGAR_PRICE;
            
            System.out.print("\ntotalCoffeePrice: " + totalCoffeePrice);
            System.out.print("\ntotalCreamPrice: " + totalCreamPrice);
            System.out.print("\ntotalSugarPrice: " + totalSugarPrice);
            
            totalCoffeeOrderPrice = totalCoffeePrice + totalCreamPrice + totalSugarPrice;
   
            System.out.print("\nYour total coffee order price is $" + totalCoffeeOrderPrice);
       
         }
      
         //espresso order
         if(drinkMessageReceived == 2)
         {
           System.out.print("\nHow many espressos do you want? Enter the number: "  + numEspressosOrdered);
           espressoNumOrderReceived = input.nextInt();
           
           for(int e = espressoNumOrderReceived; e > 0; e--)
           {
              espressoCounter++;
              totalEspressoOrdered += 1;
              
              //espresso flavor choices
               System.out.print("\nDo you want espresso " + espressoCounter + " to be caramel or chocolate? If caramel enter " + CARAMEL_YES + " if chocolate enter " + CHOCOLATE_YES + ".");
               espressoOptionMessageReceived = input.nextInt();
               
               if(espressoOptionMessageReceived == 1)
               {
                  System.out.print("\nEspresso " + espressoCounter + " is caramel.");
               }
               
               if (espressoOptionMessageReceived == 2)
               {
                  System.out.print("\nEspresso " + espressoCounter + " is chocolate.");
               }
               
             //espresso shot options 
             System.out.print("\nHow many shots do you want? Enter the number (limit of 2 shots): "  + numShotsOrdered);
             shotNumOrderReceived = input.nextInt();
             
             if(shotNumOrderReceived == 2)        
             {
               for (int s = shotNumOrderReceived; s > 0; s--)
               {
                  totalShotsOrdered+=1;
               }
   
             }
                  
           }
           
           //calculate total price/and other information for espresso order
           System.out.print("\nTotal espresso ordered is: " + totalEspressoOrdered);
           totalEspressoPrice = totalEspressoOrdered * ESPRESSO_PRICE;
           System.out.print("\nTotal espresso price is: " + totalEspressoPrice);
           
           //System.out.print("\ntotalShotOrdered: " + totalShotsOrdered);
           
   
           twoShotPrice = totalShotsOrdered/2 * TWO_SHOTS_PRICE;
            
           //System.out.print("\ntotal twoShotPrice: " + twoShotPrice);
            
           totalEspressoOrderPrice = totalEspressoPrice + twoShotPrice;
           System.out.print("\nYour total espresso order price is $" + totalEspressoOrderPrice);
                 
         }
      
         //tea order
         if(drinkMessageReceived == 3)
         {
           System.out.print("\nHow many teas do you want? Enter the number: "  + numTeasOrdered);
           teaNumOrderReceived = input.nextInt();
           
           for(int t = teaNumOrderReceived; t > 0; t--)
           {
              teaCounter++;
              totalTeaOrdered += 1;
           }
           
           //calculate total price/and other information for tea order
           totalTeaOrderPrice = totalTeaOrdered * TEA_PRICE;
           System.out.print("\nYour total tea order price is $" + totalTeaOrderPrice);
           
         }      
            totalPrice = totalCoffeeOrderPrice + totalEspressoOrderPrice + totalTeaOrderPrice; 
         
            System.out.print("\nYour grand total order price is $" + totalPrice);
         }     
   }
 }
 
 