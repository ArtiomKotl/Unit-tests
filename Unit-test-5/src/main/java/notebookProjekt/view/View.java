package notebookProjekt.view;

import notebookProjekt.model.Contact;

import java.util.List;

public class View {

    public void printContacts(List<Contact> contacts) {
        System.out.println("Список контактов:");
        for(Contact contact : contacts) {
            System.out.println(contact.getName() + " - " + contact.getPhone());
        }
    }

    public void printContactDetails(Contact contact) {
        System.out.println("Имя: " + contact.getName());
        System.out.println("Телефон: " + contact.getPhone());
    }

    public void printActions() {
        System.out.println("Доступные действия:");
        System.out.println("1 - Добавить контакт");
        System.out.println("2 - Удалить контакт");
        System.out.println("3 - Изменить контакт");
        System.out.println("4 - Просмотреть контакт");
        System.out.println("5 - Выход");
    }

}

