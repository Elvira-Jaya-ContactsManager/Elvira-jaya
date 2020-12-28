package contactsManager;

public class Contact {
    //properties
    private String firstName;
    private String lastName;
    private String phoneNumber;

    //Contacts Constructor
    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    //Method for combining 3 properties for display & format information

    public String combineProperties(){
        return String.format("%s %-15s  ||%s ",this.firstName, this.lastName,this.phoneNumber);
    }

    //Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}
