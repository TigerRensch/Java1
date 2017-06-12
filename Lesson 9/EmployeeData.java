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
        String employeeData;
        ArrayList<String> itemList = new ArrayList<String>();
        ArrayList<String> employeeList = new ArrayList<String>();
        String path = "employees.txt";

        Scanner input = new Scanner(System.in);

        Employee[] emps = new Employee[7];

        //while(search){
            System.out.print("\nHow many employees do you want to enter: >>");
            numEmployees = input.nextInt();

            //Bob,Mike,clerk,10.25,1111

            input.nextLine();

            System.out.print("\nPlease enter the Employee's Data separated by exactly one space first name, last name, numeric ID and hourly wage >>");
            employeeData = input.nextLine();
            //System.out.print(employeeData);

            //pass the string and break it delimit by space
            String[] itemSeparator = employeeData.split(" ");
            for(String item : itemSeparator){
                itemList.add(item);
            }

            System.out.print(itemList);

            //get the data from the file

            BufferedReader bufferedReader = null;
            String line = null;
            String[] lineArray;

            try {
                //Read File
                bufferedReader = new BufferedReader(new FileReader(path));
                //Loop until the end of the file creating students
                while((line = bufferedReader.readLine()) != null) {
                    lineArray = line.split(",");
                    if(lineArray.length == 5){
                        employeeList.add(lineArray[0]);
                        employeeList.add(lineArray[1]);
                        employeeList.add(lineArray[2]);
                        employeeList.add(lineArray[3]);
                        employeeList.add(lineArray[4]);
                    }
                }
            }
            catch(FileNotFoundException e) {
                e.printStackTrace();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
            finally{
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            //match the data from the string and the file (2 for loops)
            //if there is match pass it to the Employee class
            //through the set method
            //retrieve the result through the get method

        Employee employee = new Employee();

        for(int i = 0; i < itemList.size(); i++){
                for(int j = 0; j < employeeList.size(); j++){
                    if(i == j){
                        employee.setFirstName(itemList.get(i));
                    }
                }
        }



            //push that into an array

            //print out the result


        //}


    }
}
