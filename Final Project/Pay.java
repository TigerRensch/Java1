/**
 *Author: Sachin Haldipur
 *Date: 6/24/2017
 *Class Info: CIS163AA - Java Programming: Level I
 *Final Project
 *Chapter 5
 *Exercise 6 (pp.295-296)
 *
 *Pay class
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Pay {

    public static void main(String[]args){
        final int SKILL_LEVEL_ONE = 1;
        final int SKILL_LEVEL_TWO = 2;
        final int SKILL_LEVEL_THREE = 3;

        final double SKILL_LEVEL_ONE_HOURLY_PAY = 17.00;
        final double SKILL_LEVEL_TWO_HOURLY_PAY = 20.00;
        final double SKILL_LEVEL_THREE_HOURLY_PAY = 22.00;

        //benefit options for skill levels one and two

        final int MEDICAL_INSURANCE = 1;
        final int DENTAL_INSURANCE = 2;
        final int LONG_TERM_DISABILITY_INSURANCE = 3;

        //weekly insurance cost to employee
        final double MEDICAL_INSURANCE_COST = 32.50;
        final double DENTAL_INSURANCE_COST = 20.00;
        final double LONG_TERM_DISABILITY_INSURANCE_COST = 10.00;

        //benefit options for skill level three
        final double RETIREMENT_RATE = 0.03;

        boolean run = true;
        int skillLevelReceived;
        int hoursWorkedReceived;
        double pay;
        double overtimeRate = 1.5;

        do{
            Scanner input = new Scanner(System.in);

            System.out.print("Please enter your skill level.");
            System.out.print("For skill level 1 enter " + SKILL_LEVEL_ONE + ".\nFor skill level 2 enter " + SKILL_LEVEL_TWO + ".\nFor skill level 3 enter " + SKILL_LEVEL_THREE + ". >>");
            skillLevelReceived = input.nextInt();

            System.out.print("Please enter hours worked: >>");
            hoursWorkedReceived = input.nextInt();

            if(skillLevelReceived == 1){
                System.out.print("Your hours worked are: " + hoursWorkedReceived);
                System.out.print("Your hour pay rate is " + "$" + SKILL_LEVEL_ONE_HOURLY_PAY + "per hour.");

                if(hoursWorkedReceived == 40){
                    pay = hoursWorkedReceived * SKILL_LEVEL_ONE_HOURLY_PAY;
                    System.out.print("Your regular pay for 40 hours worked is " + pay + "per hour.");
                }else if (hoursWorkedReceived > 40){
                    int overtimeHours = hoursWorkedReceived - 40;
                    double overtimePay = overtimeHours * overtimeRate;



                }


            }

        }while(run);






    }

}
