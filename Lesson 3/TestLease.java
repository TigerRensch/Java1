//Author: Sachin Haldipur
//Date: 04/05/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 3
//Exercise 13 b 
/*
 *Description of Program:  This application will make use of the Lease class.
 *
 */
import java.util.Scanner;

public class TestLease
{
      

   
   public static void main(String[] args)
   {
      Lease lease1 = new Lease();
      Lease lease2 = new Lease();
      Lease lease3 = new Lease(); 
      Lease lease4 = new Lease();
 
     
      lease1 = getData(lease1);
      
      showValues(lease1);
      lease1.addPetFee();
      showValues(lease1);
      
      lease2 = getData(lease2);
      showValues(lease2);
      
      lease3 = getData(lease3);
      showValues(lease3);
      
      //constructor default values
      showValues(lease4);      
                 
   }
   
   public static Lease getData(Lease s)
   {
      
              
       String aptTenantName;
       int apartmentNumber;
       int monthlyRentAmount;
       int termOfLease;
              
       Scanner input = new Scanner(System.in);      
       
       System.out.print("\nEnter apartment tenant name >> ");
       aptTenantName = input.nextLine();
       s.setAptTenantName(aptTenantName);
       
       System.out.print("Enter apartment number >> ");
       apartmentNumber = input.nextInt();
       s.setApartmentNumber(apartmentNumber);
       
       System.out.print("Enter monthly rent amount >> ");
       monthlyRentAmount = input.nextInt();
       s.setMonthlyRentAmount(monthlyRentAmount);
       
       System.out.print("Enter term of lease >> ");
       termOfLease = input.nextInt();
       s.setTermofLease(termOfLease);
       
       return s;
          
   }
   
   public static void showValues(Lease value)
   
   {
       System.out.print("\n" + value.getAptTenantName() + " will live in apartment number " + value.getApartmentNumber() 
       + " and pay a monthly rent of " + " $" + value.getMonthlyRentAmount() + " for " + value.getTermOfLease() + " months.");
   }

}