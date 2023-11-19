package LAWSON_PhoneBookProject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneBookProject {
    public static Scanner sc = null;
    public static void main(String[] args) {

       sc = new Scanner(System.in);

        String userLastName = getUserInput("Entrez un nom de famille: ");
        String userFirstName = getUserInput("Entrez un Prénom");
        String userPhoneNumber = getUserInput("Entrez un numéro de téléphone");

        Contact newContact = new Contact(userLastName, userFirstName, userPhoneNumber);

        System.out.println(newContact.toString());   /* Sans le toString le systeme print out renvoi un sort de code ASCII qui fait reference à sa place dans la mémoire*/

        File phoneBookFile = new File("/Users/godwilllawson/Desktop/PhoneBookContact/LAWSON_PhoneBookProject/phoneBook_contact.txt");


        if(phoneBookFile.exists()){
            System.out.println("Le fichier existe à l'emplacement donné");
        }
        else {
            System.out.println("Le fichier n'existe pas");

            try {
                phoneBookFile.createNewFile();
                System.out.println("Le fichier à été créé");
            }  catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(phoneBookFile, true));
            fileWriter.append(newContact.toString() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
    public  static String getUserInput(String userRequest){

        System.out.println(userRequest);
        return sc.nextLine();
    }

}
