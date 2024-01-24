package notebookProjekt.controller;

import notebookProjekt.model.Contact;
import notebookProjekt.view.View;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(String name) {
        for(Contact contact : contacts) {
            if(contact.getName().equals(name)) {
                contacts.remove(contact);
                break;
            }
        }
    }

    public void updateContact(String name, String newPhone) {
        for(Contact contact : contacts) {
            if(contact.getName().equals(name)) {
                contact.setPhone(newPhone);
                break;
            }
        }
    }

    public List<Contact> getContacts() {
        return contacts;
    }

}
