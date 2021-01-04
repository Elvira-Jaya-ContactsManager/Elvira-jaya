package contactsManager;

public class ContactsManagerApplication {

    //Main Method
    public static void main(String[] args) throws Exception {
        ContactCRUD contactsManager = new ContactCRUD();
        contactsManager.updateContactList();
    }
}