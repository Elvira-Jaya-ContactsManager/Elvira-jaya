package contactsManager;

import util.Input;

public class ContactCRUD {

    //Constructors
    public ContactCRUD() {

    }

    //Custom Methods

    //Method for loading contacts onto the user interface
    public void loadContacts() {

    }

    //Method for displaying the main menu with options for the user to choose from
    public int displayMainMenu() {
        Input userInput = new Input();

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
    public void addContact() {

    }

    //Method for deleting a contact
    public void deleteContact() {

    }
}
