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

        String [][] realEstateData = new String[5][2];

        RealEstateFinder finder = new RealEstateFinder();

        System.out.print("\nTo sort real estate data by price enter " + PRICE  + ". To sort real estate data by location enter " + LOCATION + ". To exit enter " + EXIT + " : >>");
        option = input.nextInt();

        if(option == 1){

            for(int i = 0; i < realEstateNameList.size(); i++){
                realEstateData[0][0] = realEstateNameList.get(i);
                realEstateData[1][0] = realEstateNameList.get(i);
                realEstateData[2][0] = realEstateNameList.get(i);
                realEstateData[3][0] = realEstateNameList.get(i);
                realEstateData[4][0] = realEstateNameList.get(i);

            }

            finder.SortPerPrice(realEstateData);

        }

        if(option == 2){


            for(int i = 0; i < realEstateNameList.size(); i++){
                realEstateData[0][0] = realEstateNameList.get(i);
                realEstateData[1][0] = realEstateNameList.get(i);
                realEstateData[2][0] = realEstateNameList.get(i);
                realEstateData[3][0] = realEstateNameList.get(i);
                realEstateData[4][0] = realEstateNameList.get(i);

            }

            finder.SortPerLocation(realEstateData);
        }

        if(option == 3){
            finder.Exit();
        }
    }


}
