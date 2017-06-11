//Author: Sachin Haldipur
//Date: 04/05/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 3
//Exercise 13 a 
/*
 *Description of Program:  Creating a Lease class for use in the TestLease application
 */
 

public class Lease
{
   private String aptTenantName;
   private int apartmentNumber;
   private int monthlyRentAmount;
   private int termOfLease;
   
   //constructor
   
   public Lease()
   {
      aptTenantName = "XXX";
      apartmentNumber = 0;
      monthlyRentAmount = 1000;
      termOfLease = 12;  
   }
   
   //accessor methods
   
   public String getAptTenantName()
   {
      return aptTenantName;
   }
   
   public void setAptTenantName(String aTenantName)
   {
      aptTenantName = aTenantName;
   }

   public int getApartmentNumber()
   {
      return apartmentNumber;
   }
   
   public void setApartmentNumber(int aptNum)
   {
      apartmentNumber = aptNum;
   }
   
   public int getMonthlyRentAmount()
   {
      return monthlyRentAmount;
   }
   
   public void setMonthlyRentAmount(int mRentAmnt)
   {
      monthlyRentAmount = mRentAmnt;
   }
   
   public int getTermOfLease()
   {
      return termOfLease;
   }
   
   public void setTermofLease(int tOfLease)
   {
      termOfLease = tOfLease;
   }
   
   //other methods
   
   public void addPetFee()
   {
      
      int petFee = 10;
      int rentPlusFee = getMonthlyRentAmount() + petFee;
      
      System.out.println("\nThe rent with pet fee is " + "$" + rentPlusFee + ".");
      
      //update the rent amount with the additional pet fee
      setMonthlyRentAmount(rentPlusFee); 
      
      explainPetPolicy();
      
   }
     
   public static void explainPetPolicy()
   {
      System.out.println("Anyone who has pets will incur an extra $10 fee on top of the monthly rent.");
   }
}