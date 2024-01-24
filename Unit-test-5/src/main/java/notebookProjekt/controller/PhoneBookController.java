package notebookProjekt.controller;

import notebookProjekt.model.Contact;
import notebookProjekt.view.PhoneBookView;

import java.util.List;

public class PhoneBookController {

    private PhoneBook model;
    private PhoneBookView view;

    public PhoneBookController() {
        this.model = new PhoneBook();
        this.view = new PhoneBookView();
    }

    public void addContact(String name, String phone) {
        Contact contact = new Contact(name, phone);
        model.addContact(contact);
    }

    public void removeContact(String name) {
        model.removeContact(name);
    }

    public void updateContact(String name, String newPhone) {
        model.updateContact(name, newPhone);
    }

    public void showContacts() {
        List<Contact> contacts = model.getContacts();
        view.showContacts(contacts);
    }

}
