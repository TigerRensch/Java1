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

public class Pay {

    public static void main(String[]args){
        final int SKILL_LEVEL_ONE = 1;
        final int SKILL_LEVEL_TWO = 2;
        final int SKILL_LEVEL_THREE = 3;

        final double SKILL_LEVEL_ONE_HOURLY_PAY = 17.00;
        final double SKILL_LEVEL_TWO_HOURLY_PAY = 20.00;
        final double SKILL_LEVEL_THREE_HOURLY_PAY = 22.00;

        //benefit options for skill levels two and three

        final int MEDICAL_INSURANCE = 1;
        final int DENTAL_INSURANCE = 1;
        final int LONG_TERM_DISABILITY_INSURANCE = 1;
        final int RETIREMENT = 1;

        //weekly insurance cost to employee
        final double MEDICAL_INSURANCE_COST = 32.50;
        final double DENTAL_INSURANCE_COST = 20.00;
        final double LONG_TERM_DISABILITY_INSURANCE_COST = 10.00;

        //benefit options for skill level three
        final double RETIREMENT_RATE = 0.03;

        boolean run = true;
        int skillLevelReceived;
        int hoursWorkedReceived;
        int medInsuranceReceived;
        int dentalInsuranceReceived;
        int ltdInsuranceReceived;
        int retirementReceived;
        double deductions = 0.00;
        double pay;
        double overtimeRate = 1.5;

        ArrayList<Double> deductionList = new ArrayList<Double>();

        do{
            deductionList.clear();
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.print("\nPlease enter your skill level.");
            System.out.print("\nFor skill level 1 enter " + SKILL_LEVEL_ONE + ".\nFor skill level 2 enter " + SKILL_LEVEL_TWO + ".\nFor skill level 3 enter " + SKILL_LEVEL_THREE + ". >>");
            skillLevelReceived = input.nextInt();

            System.out.print("\nPlease enter hours worked: >>");
            hoursWorkedReceived = input.nextInt();

            if(skillLevelReceived == 1){
                System.out.print("\nYour hours worked are: " + hoursWorkedReceived);
                System.out.print("\nYour hourly pay rate is " + "$" + SKILL_LEVEL_ONE_HOURLY_PAY + " per hour.");

                if(hoursWorkedReceived == 40){
                    pay = hoursWorkedReceived * SKILL_LEVEL_ONE_HOURLY_PAY;
                    System.out.print("\nYour regular pay for 40 hours worked is " + pay + " per hour.");
                }else if (hoursWorkedReceived > 40){
                    int overtimeHours = hoursWorkedReceived - 40;
                    pay = 40 * SKILL_LEVEL_ONE_HOURLY_PAY;
                    double overtimePay = (SKILL_LEVEL_ONE_HOURLY_PAY * overtimeRate) * overtimeHours;
                    double overtimePayPerHour = SKILL_LEVEL_ONE_HOURLY_PAY * overtimeRate;
                    double totalPay = pay + overtimePay;
                    System.out.print("\nYour regular pay for 40 hours worked is " + "$" + pay + " per hour.");
                    System.out.print("\nYour overtime pay for " + overtimeHours + " worked is " + "$" + overtimePay + " or " + "$" + overtimePayPerHour + " per hour.");
                    System.out.print("\nYour gross pay is $ " + totalPay);

                }
            }

            if(skillLevelReceived == 2){
                System.out.print("\nYour hours worked are: " + hoursWorkedReceived);
                System.out.print("\nYour hourly pay rate is " + "$" + SKILL_LEVEL_TWO_HOURLY_PAY + " per hour.");

                if(hoursWorkedReceived == 40){
                    pay = hoursWorkedReceived * SKILL_LEVEL_TWO_HOURLY_PAY;
                    System.out.print("\nYour regular pay for 40 hours worked is " + pay + " per hour.");
                }else if (hoursWorkedReceived > 40){
                    int overtimeHours = hoursWorkedReceived - 40;
                    pay = 40 * SKILL_LEVEL_TWO_HOURLY_PAY;
                    double overtimePay = (SKILL_LEVEL_TWO_HOURLY_PAY * overtimeRate) * overtimeHours;
                    double overtimePayPerHour = SKILL_LEVEL_TWO_HOURLY_PAY * overtimeRate;
                    double totalPay = pay + overtimePay;
                    System.out.print("\nYour regular pay for 40 hours worked is " + "$" + pay + " per hour.");
                    System.out.print("\nYour overtime pay for " + overtimeHours + " worked is " + "$" + overtimePay + " or " + "$" + overtimePayPerHour + " per hour.");
                    System.out.print("\nYour gross pay is $ " + "$" + totalPay);

                    System.out.print("\nDo you want medical insurance?  If yes enter " + MEDICAL_INSURANCE + ".");
                    medInsuranceReceived = input.nextInt();

                    if(medInsuranceReceived == 1){
                        totalPay = totalPay - MEDICAL_INSURANCE_COST;
                        System.out.print("\nYour net pay after medical insurance deduction is now " + "$" + totalPay + ".");
                        deductionList.add(MEDICAL_INSURANCE_COST);
                    }

                    System.out.print("\nDo you want dental insurance?  If yes enter " + DENTAL_INSURANCE + ".");
                    dentalInsuranceReceived = input.nextInt();

                    if(dentalInsuranceReceived == 1){
                        totalPay = totalPay - DENTAL_INSURANCE_COST;
                        System.out.print("\nYour net pay after dental insurance deduction is now " + "$" + totalPay + ".");
                        deductionList.add(DENTAL_INSURANCE_COST);
                    }

                    System.out.print("\nDo you want long term disability insurance?  If yes enter " + LONG_TERM_DISABILITY_INSURANCE + ".");
                    ltdInsuranceReceived = input.nextInt();

                    if(ltdInsuranceReceived == 1){
                        totalPay = totalPay - LONG_TERM_DISABILITY_INSURANCE_COST;
                        System.out.print("\nYour net pay after long term disability insurance deduction is now " + "$" + totalPay + ".");
                        deductionList.add(LONG_TERM_DISABILITY_INSURANCE_COST);
                    }

                }

            }

            if(skillLevelReceived == 3){
                System.out.print("\nYour hours worked are: " + hoursWorkedReceived);
                System.out.print("\nYour hourly pay rate is " + "$" + SKILL_LEVEL_THREE_HOURLY_PAY + " per hour.");

                if(hoursWorkedReceived == 40){
                    pay = hoursWorkedReceived * SKILL_LEVEL_THREE_HOURLY_PAY;
                    System.out.print("\nYour regular pay for 40 hours worked is " + pay + " per hour.");
                }else if (hoursWorkedReceived > 40){
                    int overtimeHours = hoursWorkedReceived - 40;
                    pay = 40 * SKILL_LEVEL_THREE_HOURLY_PAY;
                    double overtimePay = (SKILL_LEVEL_THREE_HOURLY_PAY * overtimeRate) * overtimeHours;
                    double overtimePayPerHour = SKILL_LEVEL_THREE_HOURLY_PAY * overtimeRate;
                    double totalPay = pay + overtimePay;
                    System.out.print("\nYour regular pay for 40 hours worked is " + "$" + pay + " per hour.");
                    System.out.print("\nYour overtime pay for " + overtimeHours + " worked is " + "$" + overtimePay + " or " + "$" + overtimePayPerHour + " per hour.");
                    System.out.print("\nYour gross pay is $ " + "$" + totalPay);

                    System.out.print("\nDo you want medical insurance?  If yes enter " + MEDICAL_INSURANCE + ".");
                    medInsuranceReceived = input.nextInt();

                    if(medInsuranceReceived == 1){
                        totalPay = totalPay - MEDICAL_INSURANCE_COST;
                        System.out.print("\nYour net pay after medical insurance deduction is now " + "$" + totalPay + ".");
                        deductionList.add(MEDICAL_INSURANCE_COST);
                    }

                    System.out.print("\nDo you want dental insurance?  If yes enter " + DENTAL_INSURANCE + ".");
                    dentalInsuranceReceived = input.nextInt();

                    if(dentalInsuranceReceived == 1){
                        totalPay = totalPay - DENTAL_INSURANCE_COST;
                        System.out.print("\nYour net pay after dental insurance deduction is now " + "$" + totalPay + ".");
                        deductionList.add(DENTAL_INSURANCE_COST);
                    }

                    System.out.print("\nDo you want long term disability insurance?  If yes enter " + LONG_TERM_DISABILITY_INSURANCE + ".");
                    ltdInsuranceReceived = input.nextInt();

                    if(ltdInsuranceReceived == 1){
                        totalPay = totalPay - LONG_TERM_DISABILITY_INSURANCE_COST;
                        System.out.print("\nYour net pay after long term disability insurance deduction is now " + "$" + totalPay + ".");
                        deductionList.add(LONG_TERM_DISABILITY_INSURANCE_COST);
                    }

                    System.out.print("\nDo you want to participate in the retirement plan?");
                    System.out.print("\nYou will contribute 3% of your weekly gross pay.  If you choose to opt for this enter " + RETIREMENT + ".");
                    retirementReceived = input.nextInt();

                    if(retirementReceived == 1){
                        totalPay = totalPay - (totalPay * RETIREMENT_RATE);
                        System.out.print("\nYour net pay after participating in the retirement plan is " + "$" + totalPay + ".");
                        deductionList.add((totalPay * RETIREMENT_RATE));
                    }


                }

            }
            double totalDeductions = 0;
            for(int i = 0; i < deductionList.size(); i++){
                totalDeductions += deductionList.get(i);
            }

            System.out.print("\nYour total deductions are " + totalDeductions + ".");

        }while(run);






    }

}
