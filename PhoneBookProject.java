package PhoneBookProject;

import java.util.Scanner;

public class PhoneBookProject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nom de famille: ");
        String userLastName = sc.nextLine();

        System.out.println("Entrez un Prénom: ");
        String userFirstName = sc.nextLine();

        System.out.println("Entrez un numéro de téléphone: ");
        String userPhoneNumber = sc.nextLine();



        System.out.println(userLastName);
        System.out.println(userFirstName);
        System.out.println(userPhoneNumber);

        sc.close();

    }

}
