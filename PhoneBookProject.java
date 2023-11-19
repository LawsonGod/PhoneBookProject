package LAWSON_PhoneBookProject;

import java.io.File;
import java.util.Scanner;

public class PhoneBookProject {
    public static Scanner sc = null;
    public static void main(String[] args) {

       sc = new Scanner(System.in);

      /*  String userLastName = getUserInput("Entrez un nom de famille: ");
        String userFirstName = getUserInput("Entrez un Prénom");
        String userPhoneNumber = getUserInput("Entrez un numéro de téléphone");

        Contact newContact = new Contact(userLastName, userFirstName, userPhoneNumber);

        System.out.println(newContact.toString());*/   /* Sans le toString le systeme print out renvoi un sort de code ASCII qui fait reference à sa place dans la mémoire*/

        File phoneBookFile = new File("/Users/godwilllawson/Desktop/PhoneBookContact/LAWSON_PhoneBookProject/phoneBook_contact.txt");
        if(phoneBookFile.exists()){
            System.out.println("Le fichier existe à l'emplacement donné");
        }
        else {
        System.out.println("Le fichier n'existe pas");
            }
        sc.close();
    }
    public  static String getUserInput(String userRequest){

        System.out.println(userRequest);
        return sc.nextLine();
    }

}
