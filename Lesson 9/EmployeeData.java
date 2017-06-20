//Author: Sachin Haldipur
//Date: 06/11/2017
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 9
//Exercise 2
/*Description of Program:
 *
 * This is the EmployeeData class
 * Limitation: The array has a 4 index limit, at most 2 employees can be entered currently to prevent repetition of final index twice.
 * Solution to overcome limitation: This needs to be refactored to use an array list since we need mutabliity and flexibility.
 */



import java.util.Scanner;






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
        int employeeNumCount = 0;

        while(search){

            Scanner input = new Scanner(System.in);


            System.out.print("\nHow many employees do you want to enter: >>");
            numEmployees = input.nextInt();

            input.nextLine();

            System.out.print("\nPlease enter the Employee's Data separated by exactly one space first name, last name, numeric ID and hourly wage >>");
            employeeData = input.nextLine();

            employeeItem = employeeData.split(" ");

            employeeNum = 0;
            int index = 0;


            for(int i = index; i < employeeItemsArray.length; i++){
                for(int j = 0; j < employeeItem.length;j++){
                    employeeItemsArray[i][j] = employeeItem[j];
                }

            }



            employeeNum ++;


            if(employeeNum != numEmployees){

                index = index + 1;

                System.out.print("\nInput the next Employee >>");
                employeeData = input.nextLine();

                System.out.print(employeeData);

                employeeItem = employeeData.split(" ");


                for(int i = index; i < employeeItemsArray.length; i++){
                    for(int j = 0; j < employeeItem.length;j++){
                        employeeItemsArray[i][j] = employeeItem[j];
                    }

                }

            }

            //once all indexes are populated the array can be looped through

            Employee employee = new Employee();

            for(int i = 0; i < employeeItemsArray.length; i++){
                for(int j = 0; j < employeeItemsArray.length; j++){
                    if(i == 0){

                        employee.setFirstName(employeeItemsArray[0][0]);
                        employee.setLastName(employeeItemsArray[0][1]);
                        employee.setNumericID(employeeItemsArray[0][2]);
                        employee.setHourlyWage(employeeItemsArray[0][3]);

                        firstName = employee.getFirstName();
                        lastName = employee.getLastName();
                        numericID = employee.getNumericID();
                        hourlyWage = employee.getHourlyWage();

                    }

                    if(i == 1){

                        employee.setFirstName(employeeItemsArray[1][0]);
                        employee.setLastName(employeeItemsArray[1][1]);
                        employee.setNumericID(employeeItemsArray[1][2]);
                        employee.setHourlyWage(employeeItemsArray[1][3]);

                        firstName = employee.getFirstName();
                        lastName = employee.getLastName();
                        numericID = employee.getNumericID();
                        hourlyWage = employee.getHourlyWage();

                    }

                    if(i == 2){
                        firstName = "Doesn't exist.";
                        lastName = " ";
                        numericID = "Doesn't exist.";
                        hourlyWage = "Doesn't exist.";
                    }

                    if(i == 3){
                        firstName = "Doesn't exist.";
                        lastName = " ";
                        numericID = "Doesn't exist.";
                        hourlyWage = "Doesn't exist.";
                    }

                }

                employeeNumCount ++;

                System.out.print("\nEmployee # " + employeeNumCount);
                System.out.print("\nEmployee name: " + firstName + " " + lastName);
                System.out.print("\nID: " + numericID);
                System.out.print("\nHourly wage: " + hourlyWage);

            }



            search = false;


        }

    }


}
