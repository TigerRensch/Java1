//Author: Sachin Haldipur
//Date: 04/15/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 5
//Exercise 2
 
//Description of Program: Creating the Plumbers class

/*This code needs to eventually be refactored because there is too much repetition
 *especially where the possibilities of both plumbing events exist.
 *
 */
import java.util.Scanner;

public class Plumbers
{
                
      //nested class
      private class BillPay
      {
         public void customerBillPay(double price)
         {
           System.out.println("\nYou are being billed $" + price);
                 
         }
      }
      
        
      public static void main(String[] args)
      {
         
         int callType;
         int roomsDamaged;
         int floodMessageReceiver;
         int burstPipeMessageReceiver;
         int pipesBurst;
         double roomsDamagedPrice;
         double pipesBurstPrice;
         final int FLOOD_CONFIRM = 1;
         final int FLOOD_IGNORE = 2;
         final int BURST_PIPE_CONFIRM = 1;
         final int BURST_PIPE_IGNORE = 2;
         final int FLOOD_CODE = 1;
         final int PIPE_CODE = 2;
         final double ONE_ROOM_FLOOD_PRICE = 300.00;
         final double TWO_ROOM_FLOOD_PRICE = 500.00;
         final double MULTIPLE_ROOM_FLOOD_PRICE = 750.00;
         final double ONE_PIPE_PRICE = 50.00;
         final double TWO_PIPE__PRICE = 70.00;
         final double MULTIPLE_PIPE_PRICE = 100.00;
       
                  
         Scanner input = new Scanner(System.in);
         
         System.out.print("Are you experiencing a flood?  If yes type " + FLOOD_CONFIRM + ", if no type " + FLOOD_IGNORE + ".");
         floodMessageReceiver = input.nextInt();
         
         System.out.print("Are you experiencing a burst pipe? If yes type " + BURST_PIPE_CONFIRM + ", if no type " + BURST_PIPE_IGNORE + "." );              
         burstPipeMessageReceiver = input.nextInt();
         
         //either a flood or burst pipe event happen
         if(floodMessageReceiver == 1 && burstPipeMessageReceiver == 2)
         {
                      
            System.out.print("For flood event, please enter the amount of damaged rooms: ");
            roomsDamaged = input.nextInt();
            
            if(roomsDamaged == 1)
            {
               roomsDamagedPrice = ONE_ROOM_FLOOD_PRICE;
               System.out.print("Your rooms damaged price is $" + roomsDamagedPrice );
               Plumbers pl = new Plumbers();
               Plumbers.BillPay bp = pl.new BillPay();
               bp.customerBillPay(roomsDamagedPrice);
            }
            
            if(roomsDamaged == 2)
            {
               roomsDamagedPrice = TWO_ROOM_FLOOD_PRICE;
               System.out.print("Your rooms damaged price is $" + roomsDamagedPrice );
               Plumbers pl = new Plumbers();
               Plumbers.BillPay bp = pl.new BillPay();
               bp.customerBillPay(roomsDamagedPrice);

            }
            
            if(roomsDamaged >= 3)
            {
               roomsDamagedPrice = MULTIPLE_ROOM_FLOOD_PRICE;
               System.out.print("Your rooms damaged price is $" + roomsDamagedPrice );
               Plumbers pl = new Plumbers();
               Plumbers.BillPay bp = pl.new BillPay();
               bp.customerBillPay(roomsDamagedPrice);

            }    
         }
         
         if(burstPipeMessageReceiver == 1 && floodMessageReceiver == 2)
         {
                      
            System.out.print("For pipe burst event, please enter the amount of pipes burst: ");
            pipesBurst = input.nextInt();
            
            if(pipesBurst == 1)
            {
               pipesBurstPrice = ONE_PIPE_PRICE;
               System.out.print("Your pipes burst price is $" + pipesBurstPrice );
               Plumbers pl = new Plumbers();
               Plumbers.BillPay bp = pl.new BillPay();
               bp.customerBillPay(pipesBurstPrice);
    
            }
            
            if(pipesBurst == 2)
            {
               pipesBurstPrice =  TWO_PIPE__PRICE;
               System.out.print("Your pipes burst price is $" + pipesBurstPrice );
               Plumbers pl = new Plumbers();
               Plumbers.BillPay bp = pl.new BillPay();
               bp.customerBillPay(pipesBurstPrice);
     
            }
            
            if(pipesBurst >= 3)
            {
               pipesBurstPrice = MULTIPLE_PIPE_PRICE;
               System.out.print("Your pipes burst price is $" + pipesBurstPrice );
               Plumbers pl = new Plumbers();
               Plumbers.BillPay bp = pl.new BillPay();
               bp.customerBillPay(pipesBurstPrice);
            }

         }
                         
         //both a flood and burst pipe event happen
         if(floodMessageReceiver == 1 && burstPipeMessageReceiver == 1)
         {
                              
            System.out.print("For flood event, please enter the amount of damaged rooms: ");
            roomsDamaged = input.nextInt();
            
            System.out.print("For pipe burst event, please enter the amount of pipes burst: ");
            pipesBurst = input.nextInt();
            
            
            if(roomsDamaged == 1 && pipesBurst == 1)
            {
               roomsDamagedPrice = ONE_ROOM_FLOOD_PRICE;
               pipesBurstPrice = ONE_PIPE_PRICE;
               System.out.print("Your rooms damaged price is $" + roomsDamagedPrice );
               System.out.print("\nYour pipes burst price is $" + pipesBurstPrice );
               
               double totalPrice = roomsDamagedPrice + pipesBurstPrice;
            
               System.out.print("\nYour total price is $" + totalPrice);
               
               Plumbers pl = new Plumbers();
               Plumbers.BillPay bp = pl.new BillPay();
               bp.customerBillPay(totalPrice);

            }
            
            if(roomsDamaged == 1 && pipesBurst == 2)
            {
               roomsDamagedPrice = ONE_ROOM_FLOOD_PRICE;
               pipesBurstPrice =  TWO_PIPE__PRICE;
               System.out.print("Your rooms damaged price is $" + roomsDamagedPrice );
               System.out.print("\nYour pipes burst price is $" + pipesBurstPrice );
               
               double totalPrice = roomsDamagedPrice + pipesBurstPrice;
            
               System.out.print("\nYour total price is $" + totalPrice);
               
               Plumbers pl = new Plumbers();
               Plumbers.BillPay bp = pl.new BillPay();
               bp.customerBillPay(totalPrice);
               
            }
            
            if(roomsDamaged == 1 && pipesBurst >= 3)
            {
               roomsDamagedPrice = ONE_ROOM_FLOOD_PRICE;
               pipesBurstPrice = MULTIPLE_PIPE_PRICE;
               System.out.print("Your rooms damaged price is $" + roomsDamagedPrice );
               System.out.print("\nYour pipes burst price is $" + pipesBurstPrice );
               
               double totalPrice = roomsDamagedPrice + pipesBurstPrice;
            
               System.out.print("\nYour total price is $" + totalPrice);
               
               Plumbers pl = new Plumbers();
               Plumbers.BillPay bp = pl.new BillPay();
               bp.customerBillPay(totalPrice);

            }
            
            

            if(roomsDamaged == 2 && pipesBurst == 1)
            {
               roomsDamagedPrice = TWO_ROOM_FLOOD_PRICE;
               pipesBurstPrice = ONE_PIPE_PRICE;
               System.out.print("Your rooms damaged price is $" + roomsDamagedPrice );
               System.out.print("\nYour pipes burst price is $" + pipesBurstPrice );
               
               double totalPrice = roomsDamagedPrice + pipesBurstPrice;
            
               System.out.print("\nYour total price is $" + totalPrice);
               
               Plumbers pl = new Plumbers();
               Plumbers.BillPay bp = pl.new BillPay();
               bp.customerBillPay(totalPrice);

            }
            
            if(roomsDamaged == 2 && pipesBurst == 2)
            {
               
               roomsDamagedPrice = TWO_ROOM_FLOOD_PRICE;
               pipesBurstPrice =  TWO_PIPE__PRICE;
               System.out.print("Your rooms damaged price is $" + roomsDamagedPrice );
               System.out.print("\nYour pipes burst price is $" + pipesBurstPrice );
               
               double totalPrice = roomsDamagedPrice + pipesBurstPrice;
            
               System.out.print("\nYour total price is $" + totalPrice);
               
               Plumbers pl = new Plumbers();
               Plumbers.BillPay bp = pl.new BillPay();
               bp.customerBillPay(totalPrice);

            }
            
            if(roomsDamaged == 2 && pipesBurst >= 3)
            {
               roomsDamagedPrice = TWO_ROOM_FLOOD_PRICE;
               pipesBurstPrice = MULTIPLE_PIPE_PRICE;
               System.out.print("Your rooms damaged price is $" + roomsDamagedPrice );
               System.out.print("\nYour pipes burst price is $" + pipesBurstPrice );
               
               double totalPrice = roomsDamagedPrice + pipesBurstPrice;
            
               System.out.print("\nYour total price is $" + totalPrice);
               
               Plumbers pl = new Plumbers();
               Plumbers.BillPay bp = pl.new BillPay();
               bp.customerBillPay(totalPrice);

            }
            
            
            if(roomsDamaged >= 3 && pipesBurst == 1)
            {
               roomsDamagedPrice = MULTIPLE_ROOM_FLOOD_PRICE;
               pipesBurstPrice = ONE_PIPE_PRICE;
               System.out.print("Your rooms damaged price is $" + roomsDamagedPrice );
               System.out.print("\nYour pipes burst price is $" + pipesBurstPrice );
               
               double totalPrice = roomsDamagedPrice + pipesBurstPrice;
            
               System.out.print("\nYour total price is $" + totalPrice);
               
               Plumbers pl = new Plumbers();
               Plumbers.BillPay bp = pl.new BillPay();
               bp.customerBillPay(totalPrice);


            }
            
            if(roomsDamaged >= 3 && pipesBurst == 2)
            {
               roomsDamagedPrice = MULTIPLE_ROOM_FLOOD_PRICE;
               pipesBurstPrice =  TWO_PIPE__PRICE;
               System.out.print("Your rooms damaged price is $" + roomsDamagedPrice );
               System.out.print("\nYour pipes burst price is $" + pipesBurstPrice );
               
               double totalPrice = roomsDamagedPrice + pipesBurstPrice;
            
               System.out.print("\nYour total price is $" + totalPrice);
               
               Plumbers pl = new Plumbers();
               Plumbers.BillPay bp = pl.new BillPay();
               bp.customerBillPay(totalPrice);

            }
            
            if(roomsDamaged >= 3 && pipesBurst >= 3)
            {
               roomsDamagedPrice = MULTIPLE_ROOM_FLOOD_PRICE;
               pipesBurstPrice = MULTIPLE_PIPE_PRICE;
               System.out.print("Your rooms damaged price is $" + roomsDamagedPrice );
               System.out.print("\nYour pipes burst price is $" + pipesBurstPrice );
               
               double totalPrice = roomsDamagedPrice + pipesBurstPrice;
            
               System.out.print("\nYour total price is $" + totalPrice);
               
               Plumbers pl = new Plumbers();
               Plumbers.BillPay bp = pl.new BillPay();
               bp.customerBillPay(totalPrice);

            }
            
                             
         }
                
         //neither a flood nor a burst pipe event happen
         if(floodMessageReceiver != 1 && burstPipeMessageReceiver != 1)
         {
            System.out.print("Sorry, we only handle natural flood and burst pipe plumbing calls.");
         }
                         
      }

}
 