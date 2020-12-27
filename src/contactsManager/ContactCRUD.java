package contactsManager;

import util.Input;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;

public class ContactCRUD extends Input {
    Input userInput = new Input();
    FileReader contactsReader = new FileReader("src/contactsManager", "contacts.txt", "contacts.log");

    //Constructors
    public ContactCRUD() throws IOException {
    }

    //Custom Methods


    //Method for displaying the main menu with options for the user to choose from
    public int displayMainMenu() {

        System.out.println("Welcome to Contacts Manager");
        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");

        int userChoice = userInput.getInt(1, 5, "Enter an option (1, 2, 3, 4 or 5):");
        return userChoice;
    }

//    //Method for updating contact list based on user's choice from the displayMainMenu
//    public void updateContactList(int userChoice) throws IOException {
//        switch(userChoice) {
//            case 1:
//                loadContacts();
//                displayMainMenu();
//                break;
//            case 2:
////                addContact();
//        }
//
//    }

    //Method for loading contacts onto the user interface
    public void loadContacts() throws IOException {
        contactsReader.writeToLog("Successfully read the " + contactsReader.getFileName() + " file!");
        System.out.printf("%-15s | %s  \n -----------------------------\n", "Name", "Phone Number");
        for(int i = 0; i < contactsReader.getFileLines().size(); i++) {
            System.out.println(contactsReader.getFileLines().get(i));
        }

    }

    //Method for searching a contact by name
    public void searchContactByName() {

    }


//    //Method for adding a contact
    public void addContact() {
        int userChoice = displayMainMenu();

        try {
            if(userChoice == 2){
                this.userInput.getName("Enter a name:");
                this.userInput.getPhoneNumber();
            }
        }
        catch(Exception e) {
            System.out.println("Please enter ");
        }

    }

    //Method for deleting a contact
    public void deleteContact() {

    }
}
