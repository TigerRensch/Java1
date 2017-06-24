/**
 *Author: Sachin Haldipur
 *Date: 6/24/2017
 *Class Info: CIS163AA - Java Programming: Level I
 *Lesson 10
 *Exercise 1
 *  This is the Student3 class that will make use of the StudentFinder class.
 */


import java.util.Scanner;


public class Student3 {

    public static void main(String[] args)
    {
        String studentLetter;


        Scanner input = new Scanner(System.in);



            //user prompted to enter the first letter of a student's name
            System.out.print("\nPlease enter the first letter of a student's first name: >>");
            studentLetter = input.nextLine();

            if(studentLetter.equals("")){
                System.out.print("You did not enter a letter. Please enter the first letter of a student's first name");
            }else{

                StudentFinder studentFinder = new StudentFinder();

                studentFinder.searchStudent(studentLetter);


            }




    }
}
