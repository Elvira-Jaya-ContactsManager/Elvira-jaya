package contactsManager;

import util.Input;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactCRUD extends Input {
    Input userInput = new Input();
    FileReader contactsReader = new FileReader("src/contactsManager", "contacts.txt", "contacts.log");

    //Constructors
    public ContactCRUD() throws IOException {
    }

    //Method for displaying the main menu with options for the user to choose from
    public int displayMainMenu() {

        System.out.println("Welcome to Contacts Manager");
        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");

        int userNumberChoice = userInput.getInt(1, 5, "Enter an option (1, 2, 3, 4 or 5):");
        return userNumberChoice;
    }

    //Method for updating contact list based on user's choice from the displayMainMenu
    public void updateContactList() throws Exception {

        int selectedUserNumber = displayMainMenu();

            switch (selectedUserNumber) {
                case 1:
                    loadContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    searchContactByName();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    exitApplication();
                    break;
                default:
                    System.out.println("Thank you for using the Contacts Manager Application!");
            }

    }

    //Method for loading contacts onto the user interface
    public void loadContacts() throws IOException {
        contactsReader.writeToLog("Successfully read the " + contactsReader.getFileName() + " file!");
        System.out.printf("%-15s | %s  \n -----------------------------\n", "Name", "Phone Number");
        for (int i = 0; i < contactsReader.getFileLines().size(); i++) {
            System.out.println(contactsReader.getFileLines().get(i));
        }
        displayMainMenu();
    }

    //Method for searching a contact by name
    public void searchContactByName() throws IOException {
        Path contactsPath = Paths.get("src/contactsManager", "contacts.txt");
        List<String> contactList = Files.readAllLines(contactsPath);
        String name = this.userInput.getName("Enter a name");

        for (String contact : contactList) {
            if (contact.contains(name)) {
                System.out.println(contact);
            }
        }
    }

    //Method for adding a contact
    public void addContact() throws Exception {
        String firstName = this.userInput.getName("Enter a first name");
        String lastName = this.userInput.getName("Enter a last name");
        String userPhoneNumber = this.userInput.getPhoneNumber();
        Contact addAContact = new Contact(firstName, lastName, userPhoneNumber);
        Files.write(
                Paths.get("src/contactsManager", "contacts.txt"),
                Arrays.asList(addAContact.combineProperties()),
                StandardOpenOption.APPEND
        );
    }

    //Method for deleting a contact
    public void deleteContact() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/contactsManager", "contacts.txt"));
        List<String> newList = new ArrayList<>();
        String lastName = this.userInput.getName("Enter a last name");

        for (String line : lines) {
            if (line.contains(lastName)) {
                newList.remove(lastName);
                continue;
            }
            newList.add(line);
        }

        Files.write(Paths.get("src/contactsManager", "contacts.txt"), newList);
    }

    //Method for exiting the application
    public void exitApplication() throws Exception {
        boolean quitProgram = userInput.yesNo("Are you sure you want to quit?[y/n]");

        if(quitProgram) {
            System.out.println("Goodbye!");
        } else {
            updateContactList();
        }
    }
}
