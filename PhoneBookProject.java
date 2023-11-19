package LAWSON_PhoneBookProject;

import java.util.Scanner;

public class PhoneBookProject {
    public static Scanner sc = null;
    public static void main(String[] args) {

       sc = new Scanner(System.in);

        String userLastName = getUserInput("Entrez un nom de famille: ");
        String userFirstName = getUserInput("Entrez un Prénom");
        String userPhoneNumber = getUserInput("Entrez un numéro de téléphone");

        System.out.println(userLastName);
        System.out.println(userFirstName);
        System.out.println(userPhoneNumber);

        sc.close();
    }
    public  static String getUserInput(String userRequest){

        System.out.println(userRequest);
        return sc.nextLine();
    }

}
