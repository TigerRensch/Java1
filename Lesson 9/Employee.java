//Author: Sachin Haldipur
//Date: 06/11/2017
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 9
//Exercise 2
/*Description of Program:
 *
 *This class will be used with the EmployeeData class
 *
 */

public class Employee {

    private String firstName;
    private String lastName;
    private int numericID;
    private double hourlyWage;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getNumericID() {
        return numericID;
    }

    public void setNumericID(int numericID){
        this.numericID = numericID;
    }

    public double getHourlyWage(){
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage){
        this.hourlyWage = hourlyWage;
    }
}
