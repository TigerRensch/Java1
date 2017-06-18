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
        int employeeNum = 0;
        String employeeData;
        String firstName = "";
        String lastName = "";
        String numericID = "";
        String hourlyWage = "";
        String[] employeeItemArray = new String[4];
        ArrayList<String> employeeList = new ArrayList<>();



        while(search){

            Scanner input = new Scanner(System.in);


            System.out.print("\nHow many employees do you want to enter: >>");
            numEmployees = input.nextInt();

            input.nextLine();

            System.out.print("\nPlease enter the Employee's Data separated by exactly one space first name, last name, numeric ID and hourly wage >>");
            employeeData = input.nextLine();

            employeeItemArray = employeeData.split(" ");
            employeeList.addAll(Arrays.asList(employeeItemArray));

            employeeNum ++;

            if(employeeNum > 0){

                if(employeeNum != numEmployees){
                    System.out.print("\nInput the next Employee >>");
                    employeeData = input.nextLine();

                    employeeItemArray = employeeData.split(" ");
                    employeeList.addAll(Arrays.asList(employeeItemArray));
                }
                else if(employeeNum == numEmployees){
                    for(int i=0; i < employeeList.size(); i++){

                        Employee employee = new Employee();

                        for(int j = 0; j < employeeItemArray.length; j++){
                            String item = employeeItemArray[j];

                            if(j == 0){
                                employee.setFirstName(item);
                                firstName = employee.getFirstName();
                            }

                        }

                        System.out.print("\nEmployee # " + employeeNum);

                        System.out.print("\nEmployee Name: " + firstName);

                    }
                }
            }

        }

    }


}
