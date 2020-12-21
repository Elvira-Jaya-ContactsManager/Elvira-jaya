package contactsManager;

import util.Input;

import java.util.Scanner;

public class ContactCRUD extends Input {
    Input userInput = new Input();


    //Constructors
    public ContactCRUD() {
    }

    //Custom Methods

    //Method for loading contacts onto the user interface
    public void loadContacts() {
        //will need  to load contacts from file(1.create contacts.txt, able to load ot from the file
    }

    //Method for displaying the main menu with options for the user to choose from
    public int displayMainMenu() {

        System.out.println("Welcome to Contacts Manager");
        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");

        int userChoice = userInput.getInt(1,5,"Enter an option (1, 2, 3, 4 or 5):");
        return userChoice;
    }

    //Method for searching a contact by name
    public void searchContactByName() {

    }

    //Method for updating contact list based on user's choice from the displayMainMenu
    public void updateContactList() {

    }

    //Method for adding a contact

//    public void addContact() {
//        Input userInput = new Input();
//        int userChoice = displayMainMenu();
//
//        if(userChoice == 2){
//            userInput.getName("Enter a name:");
//             working on User Input to get the next Int
//            userInput.getPhoneNumber();
//
//
//        }
//    }

    //Method for deleting a contact
    public void deleteContact() {

    }
}
