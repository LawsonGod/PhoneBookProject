package LAWSON_PhoneBookProject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneBookProject {
    public static Scanner sc = null;
    public static final String PHONE_BOOK_FILE_PATH = "/Users/godwilllawson/Desktop/PhoneBookContact/LAWSON_PhoneBookProject/phoneBook_contact.txt";
    public static void main(String[] args) {

       sc = new Scanner(System.in);

        String userLastName = getUserInput("Entrez un nom de famille: ");
        String userFirstName = getUserInput("Entrez un Prénom");
        String userPhoneNumber = getUserInput("Entrez un numéro de téléphone");

        Contact newContact = new Contact(userLastName, userFirstName, userPhoneNumber);

        System.out.println(newContact.toString());   /* Sans le toString le systeme print out renvoi un sort de code ASCII qui fait reference à sa place dans la mémoire*/
        File phoneBookFile = getOrCreatePhoneBookFile(PHONE_BOOK_FILE_PATH);
        appendContactToPhoneBook(phoneBookFile, newContact);


        sc.close();
    }
    public  static String getUserInput(String userRequest){
        System.out.println(userRequest);
        return sc.nextLine();
    }
    public static File getOrCreatePhoneBookFile(String phoneBookFilePath){

        File phoneBookFile = new File(phoneBookFilePath);

        if(phoneBookFile.exists()){
            return phoneBookFile;
        }
            try {
                phoneBookFile.createNewFile();
                System.out.println("Le fichier à été créé dans (" + phoneBookFilePath + ")");
                return phoneBookFile;
            }  catch (IOException e) {
                e.printStackTrace();
            }
        return null ;
    }
    public static void appendContactToPhoneBook(File phoneBookFile, Contact newContact){

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(phoneBookFile, true));){

            fileWriter.append(newContact.toString() + "\n");
            System.out.println("Contact ajouté");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
