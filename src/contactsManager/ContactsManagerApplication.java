package contactsManager;

import util.Input;

import java.io.File;

public class ContactsManagerApplication {

    //Main Method
    public static void main(String[] args) throws Exception {
        Input input = new Input(); //Creating a new instance of Scanner, that makes new user input available


//        long phoneNumber = input.getPhoneNumber(); //storing the radius from the user input
//        String firstName = input.getName("Enter your first name:"); //creating a new circle using radius1
//        String lastName = input.getName("Enter your last name:"); //creating a new circle using radius1
//
//        System.out.println(firstName);
//        System.out.println(lastName);
//        System.out.println(phoneNumber);

        ContactCRUD crudExample = new ContactCRUD();
        crudExample.loadContacts();
        FileReader contactsReader = new FileReader("src/contactsManager", "contacts.txt", "contacts.log");
    }
}
