/**
 *
 */


import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class RealEstate {

    public static void main(String[]args){

        int option;
        final int PRICE = 1;
        final int LOCATION = 2;
        final int EXIT = 3;
        String path = "realestate.txt";

        ArrayList<String> realEstateNameList = new ArrayList<String>();
        ArrayList<String> realEstatePriceList = new ArrayList<String>();
        ArrayList<String> realEstateLocationList = new ArrayList<String>();

        //clear array list to prevent duplication
        realEstateNameList.clear();
        realEstatePriceList.clear();
        realEstateLocationList.clear();


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
                    realEstateNameList.add(lineArray[0]);
                    realEstatePriceList.add(lineArray[1]);
                    realEstateLocationList.add(lineArray[2]);
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

        String [][] realEstateData = new String[5][3];

        RealEstateFinder finder = new RealEstateFinder();

        System.out.print("\nTo sort real estate data by price enter " + PRICE  + ". To sort real estate data by location enter " + LOCATION + ". To exit enter " + EXIT + " : >>");
        option = input.nextInt();

        if(option == 1){

                realEstateData[0][0] = realEstatePriceList.get(0);
                realEstateData[1][0] = realEstatePriceList.get(1);
                realEstateData[2][0] = realEstatePriceList.get(2);
                realEstateData[3][0] = realEstatePriceList.get(3);
                realEstateData[4][0] = realEstatePriceList.get(4);

                realEstateData[0][1] = realEstateNameList.get(0);
                realEstateData[1][1] = realEstateNameList.get(1);
                realEstateData[2][1] = realEstateNameList.get(2);
                realEstateData[3][1] = realEstateNameList.get(3);
                realEstateData[4][1] = realEstateNameList.get(4);

                realEstateData[0][2] = realEstateLocationList.get(0);
                realEstateData[1][2] = realEstateLocationList.get(1);
                realEstateData[2][2] = realEstateLocationList.get(2);
                realEstateData[3][2] = realEstateLocationList.get(3);
                realEstateData[4][2] = realEstateLocationList.get(4);

            finder.SortPerPrice(realEstateData);

        }

        if(option == 2){
                realEstateData[0][0] = realEstateNameList.get(0);
                realEstateData[1][0] = realEstateNameList.get(1);
                realEstateData[2][0] = realEstateNameList.get(2);
                realEstateData[3][0] = realEstateNameList.get(3);
                realEstateData[4][0] = realEstateNameList.get(4);
            finder.SortPerLocation(realEstateData);
        }

        if(option == 3){
            finder.Exit();
        }
    }


}
