//Author: Sachin Haldipur
//Date: 06/11/2017
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 9
//Exercise 2
/*Description of Program:
 *
 *This is the EmployeeData class
 *
 */


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;




public class EmployeeData {

    public static void main(String[]args){

        boolean search = true;
        int numEmployees = 0;
        int employeeNum;
        String employeeData;
        String firstName = "";
        String lastName = "";
        String numericID = "";
        String hourlyWage = "";
        String[]employeeItem = new String[4];
        String[][] employeeItemsArray = new String[4][4];


        while(search){

            Scanner input = new Scanner(System.in);


            System.out.print("\nHow many employees do you want to enter: >>");
            numEmployees = input.nextInt();

            input.nextLine();

            System.out.print("\nPlease enter the Employee's Data separated by exactly one space first name, last name, numeric ID and hourly wage >>");
            employeeData = input.nextLine();

            employeeItem = employeeData.split(" ");

            employeeNum = 0;

//            employeeItemsArray[0][0] = employeeItem[0];
//            employeeItemsArray[0][1] = employeeItem[1];

            for(int i = 0; i < employeeItemsArray.length; i++){
                for(int j = 0; j < employeeItem.length;j++){
                    employeeItemsArray[employeeNum][j] = employeeItem[j];
                }

            }


            employeeNum ++;


            if(employeeNum != numEmployees){
                System.out.print("\nInput the next Employee >>");
                employeeData = input.nextLine();

                System.out.print(employeeData);

                employeeItem = employeeData.split(" ");

//                employeeItemsArray[1][0] = employeeItem[0];
//                employeeItemsArray[1][1] = employeeItem[1];

                for(int i = 0; i < employeeItemsArray.length; i++){
                    for(int j = 0; j < employeeItem.length;j++){
                        employeeItemsArray[employeeNum][j] = employeeItem[j];
                    }

                }
            }



            search = false;


        }

    }


}
