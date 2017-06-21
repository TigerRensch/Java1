import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by sachinhaldipur on 6/19/17.
 */
public class RealEstate {

    public static void main(String[]args){

        String location;
        String price;
        String description;
        int option;
        final int PRICE = 1;
        final int LOCATION = 2;
        final int EXIT = 3;


        Scanner input = new Scanner(System.in);

        String [] data = new String[2];

        RealEstateFinder finder = new RealEstateFinder();

        System.out.print("\nTo find real estate by price enter " + PRICE  + ". To find real estate by location enter " + LOCATION + ". To exit enter " + EXIT + " : >>");
        option = input.nextInt();

        if(option == 1){

            System.out.print("\nPlease enter your price: >>");
            price = input.nextLine();

            System.out.print("\nPlease enter your description: >>");
            description = input.nextLine();

            data[0] = price;
            data[1] = description;

            finder.SortPerPrice(data);

        }

        if(option == 2){
            System.out.print("\nPlease enter your location: >>");
            location = input.nextLine();

            System.out.print("\nPlease enter your description: >>");
            description = input.nextLine();

            data[0] = location;
            data[1] = description;

            finder.SortPerLocation(data);

        }

        if(option == 3){
            finder.Exit();
        }
    }


}
