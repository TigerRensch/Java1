//Author: Sachin Haldipur
//Date: 06/11/201
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

    public void main(String[]args){

        boolean search = true;
        int numEmployees;
        String employeeData;


        Scanner input = new Scanner(System.in);

        Employee[] emps = new Employee[7];

        while(search){
            System.out.print("\nHow many employees do you want to enter: >>");
            numEmployees = input.nextInt();

            System.out.print("\nPlease enter the Employee's Data separated by exactly one space first name, last name, numeric ID and hourly wage >>");
            employeeData = input.nextLine();



        }


    }
}
