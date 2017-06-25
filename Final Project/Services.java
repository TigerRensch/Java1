/**
 *Author: Sachin Haldipur
 *Date: 6/24/2017
 *Class Info: CIS163AA - Java Programming: Level I
 *Final Project
 *Chapter 9
 *Exercise 7
 *
 *Services class
 */



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Services {

    public static void main(String[]args){
        boolean run = true;
        int option;
        final int SERVICE = 1;
        final int PRICE = 2;
        final int TIME = 3;
        final int EXIT = 0;
        String path = "services.txt";

        ArrayList<String> serviceList = new ArrayList<String>();
        ArrayList<String> priceList = new ArrayList<String>();
        ArrayList<String> timeList = new ArrayList<String>();

        do{
            //clear array list to prevent duplication
            serviceList.clear();
            priceList.clear();
            timeList.clear();


            //load in real estate data from file

            BufferedReader bufferedReader = null;
            String line = null;
            String[] lineArray;

            try {
                //Read File
                bufferedReader = new BufferedReader(new FileReader(path));
                //Loop until the end of the file creating students
                while((line = bufferedReader.readLine()) != null) {
                    lineArray = line.split(",");
                    if(lineArray.length == 3){
                        serviceList.add(lineArray[0]);
                        priceList.add(lineArray[1]);
                        timeList.add(lineArray[2]);
                    }
                }


            }catch(FileNotFoundException e) {
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


            Scanner input = new Scanner(System.in);



            ServicesFinder finder = new ServicesFinder();

            System.out.print("\nTo sort data by service description enter " + SERVICE  + ". To sort data by price enter " + PRICE + ". To sort data by time enter " + TIME + ". To exit enter " + EXIT + " : >>");
            option = input.nextInt();

            if(option == 1){

                final String[][] serviceData = new String[][] {
                        new String[] { serviceList.get(0), priceList.get(0), timeList.get(0)},
                        new String[] { serviceList.get(1), priceList.get(1), timeList.get(1)},
                        new String[] { serviceList.get(2), priceList.get(2), timeList.get(2)},
                        new String[] { serviceList.get(3), priceList.get(3), timeList.get(3)},
                        new String[] { serviceList.get(4), priceList.get(4), timeList.get(4)}};



                finder.SortPerService(serviceData);

            }

            if(option == 2){

                final String[][] serviceData = new String[][] {
                        new String[] { priceList.get(0), serviceList.get(0), timeList.get(0)},
                        new String[] { priceList.get(1), serviceList.get(1), timeList.get(1)},
                        new String[] { priceList.get(2), serviceList.get(2), timeList.get(2)},
                        new String[] { priceList.get(3), serviceList.get(3), timeList.get(3)},
                        new String[] { priceList.get(4), serviceList.get(4), timeList.get(4)}};

                finder.SortPerPrice(serviceData);
            }

            if(option == 3){

                final String[][] serviceData = new String[][] {
                        new String[] { timeList.get(0), priceList.get(0), serviceList.get(0)},
                        new String[] { timeList.get(1), priceList.get(1), serviceList.get(1)},
                        new String[] { timeList.get(2), priceList.get(2), serviceList.get(2)},
                        new String[] { timeList.get(3), priceList.get(3), serviceList.get(3)},
                        new String[] { timeList.get(4), priceList.get(4), serviceList.get(4)}};

                finder.SortPerTime(serviceData);
            }



            if(option == 0){
                run = finder.Exit();

            }
        }while(run);


    }

}
