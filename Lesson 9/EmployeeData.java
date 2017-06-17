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


import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class EmployeeData {

    public static void main(String[]args){

        //boolean search = true;
        int numEmployees;
        int employeeNum = 0;
        String employeeData;
        ArrayList<String> itemList = new ArrayList<String>();
        ArrayList<String> employeeList = new ArrayList<String>();
        String path = "employees.txt";
        String firstName = "";
        String lastName = "";
        String numericID = "";
        String hourlyWage = "";


        Scanner input = new Scanner(System.in);

        Employee[] emps = new Employee[7];

            System.out.print("\nHow many employees do you want to enter: >>");
            numEmployees = input.nextInt();

            input.nextLine();

            System.out.print("\nPlease enter the Employee's Data separated by exactly one space first name, last name, numeric ID and hourly wage >>");
            employeeData = input.nextLine();

            Employee employee = new Employee();
            String[] itemSeparator = employeeData.split(" ");

            for(int i=0;i<itemSeparator.length;i++){
                String item = itemSeparator[i];

                if(i == 0){
                    employee.setFirstName(item);
                    firstName = employee.getFirstName();
                }

                if(i == 1){
                    employee.setLastName(item);
                    lastName = employee.getLastName();
                }

                if(i == 2){
                    employee.setNumericID(item);
                    numericID = employee.getNumericID();
                }

                if(i == 3){
                    employee.setHourlyWage(item);
                    hourlyWage = employee.getHourlyWage();
                }

            }

            employeeNum ++;

            System.out.print("Employee # " + employeeNum);
            System.out.print("\nEmployee Name: " + firstName + "  " + lastName);
            System.out.print("\nID: " + numericID);
            System.out.print("\nHourly wage: " + hourlyWage);


    }
}
