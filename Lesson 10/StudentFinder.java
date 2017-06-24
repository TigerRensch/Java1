/**
 *Author: Sachin Haldipur
 *Date: 6/24/2017
 *Class Info: CIS163AA - Java Programming: Level I
 *Lesson 10
 *Exercise 1
 *  This is the StudentFinder class that will make use of the Student3 class.
 */

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class StudentFinder {

    //fields
    String firstName;

    String path = "students.txt";


    //array lists
    ArrayList<String> studentfNameList = new ArrayList<String>();
    ArrayList<String> studentlNameList = new ArrayList<String>();
    ArrayList<String> gpaList = new ArrayList<String>();
    ArrayList<String> idList = new ArrayList<String>();





    public void searchStudent(String studentLetter){

        //clear array lists to prevent duplication
        studentfNameList.clear();
        studentlNameList.clear();
        gpaList.clear();
        idList.clear();

        //load student list
        BufferedReader bufferedReader = null;
        String line = null;
        String[] lineArray;

        try {
            //Read File
            bufferedReader = new BufferedReader(new FileReader(path));
            //Loop until the end of the file creating students
            while((line = bufferedReader.readLine()) != null) {
                lineArray = line.split(",");
                if(lineArray.length == 4){
                    studentfNameList.add(lineArray[0]);
                    studentlNameList.add(lineArray[1]);
                    gpaList.add(lineArray[2]);
                    idList.add(lineArray[3]);
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



        final String[][] studentData = new String[][] {
                new String[] { studentfNameList.get(0), studentlNameList.get(0), gpaList.get(0), idList.get(0)},
                new String[] { studentfNameList.get(1), studentlNameList.get(1), gpaList.get(1), idList.get(1)},
                new String[] { studentfNameList.get(2), studentlNameList.get(2), gpaList.get(2), idList.get(2)},
                new String[] { studentfNameList.get(3), studentlNameList.get(3), gpaList.get(3), idList.get(3)},
                new String[] { studentfNameList.get(4), studentlNameList.get(4), gpaList.get(4), idList.get(4)},
                new String[] { studentfNameList.get(5), studentlNameList.get(5), gpaList.get(5), idList.get(5)},
                new String[] { studentfNameList.get(6), studentlNameList.get(6), gpaList.get(6), idList.get(6)},
        };




        Arrays.sort(studentData, new Comparator<String[]>() {
            @Override
            public int compare(final String[] p1, final String[] p2) {
                final String price1 = p1[0];
                final String price2 = p2[0];
                return price1.compareTo(price2);
            }
        });



        System.out.print("The student profile that was chosen based on the first name input: ");


        //loop through the sorted list to find the first name containing the letter input
        for(int i = 0; i<studentData.length;i++){

            for(int j = 0; j < studentData[i].length; j++){

                 firstName = studentData[i][0];

                 if(firstName.contains(studentLetter)){
                     System.out.print(studentData[i][j] + ",");
                 }

            }

            System.out.print("\n");

        }


        System.out.print("\nThe rest of the student profiles sorted alphabetically by first name: " + "\n");


        for(int i = 0; i<studentData.length;i++){

            for(int j = 0; j < studentData[i].length; j++){

                firstName = studentData[i][0];

                if(!firstName.contains(studentLetter)){
                    System.out.print(studentData[i][j] + ",");
                }

            }
            System.out.print("\n");

        }



    }
}
