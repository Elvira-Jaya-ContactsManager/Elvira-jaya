package contactsManager;

import util.Input;

public class ContactsManagerApplication {

    //Main Method
    public static void main(String[] args) throws Exception {
        Input input = new Input();
        ContactCRUD contactsManager = new ContactCRUD();
        contactsManager.updateContactList();
    }
}
