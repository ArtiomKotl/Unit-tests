package notebookProjekt.view;

import notebookProjekt.model.Contact;

import java.util.List;
import java.util.Scanner;

public class PhoneBookView {

    private Scanner scanner = new Scanner(System.in);

    public int printMenuAndGetChoice() {

        System.out.println("Меню:");
        System.out.println("1 - Добавить контакт");
        System.out.println("2 - Удалить контакт");
        System.out.println("3 - Изменить контакт");
        System.out.println("4 - Показать контакты");
        System.out.println("5 - Выход");

        System.out.print("Выберите действие: ");
        int choice = scanner.nextInt();

        return choice;
    }

    public String getContactNameInput() {
        System.out.print("Введите имя контакта: ");
        return scanner.nextLine();
    }

    public String getContactPhoneInput() {
        System.out.print("Введите номер телефона: ");
        return scanner.nextLine();
    }

    public String getContactNameToRemove() {
        System.out.print("Введите имя контакта для удаления: ");
        return scanner.nextLine();
    }

    public String getContactNameToUpdate() {
        System.out.print("Введите имя контакта для изменения: ");
        return scanner.nextLine();
    }

    public String getNewContactPhoneInput() {
        System.out.print("Введите новый номер телефона: ");
        return scanner.nextLine();
    }

    public void showContacts(List<Contact> contacts) {
        System.out.println("Список контактов:");

        for(Contact contact : contacts) {
            System.out.println();
            System.out.println("Имя: " + contact.getName());
            System.out.println("Телефон: " + contact.getPhone());
        }

        System.out.println();
    }

    // Другие методы для вывода данных и получения ввода

}

