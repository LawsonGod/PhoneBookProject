package LAWSON_PhoneBookProject;
public class Contact {

    /*Création des variables utiles concernant des contactes + ajout de getters et setters pour
* les rendre accessibles, étant donné qu'elles sont par defaut privées*/


    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact(String lastName, String firstName, String phoneNumber) {

        this.lastName       = lastName;
        this.firstName      = firstName;
        this.phoneNumber    = phoneNumber;

    }
    @Override
    public String toString(){
        return this.lastName + " " + this.firstName + " " + this.phoneNumber;
    }



    private String lastName;
    private String firstName;
    private String phoneNumber;

}
