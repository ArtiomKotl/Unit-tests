package notebookProjekt;

import notebookProjekt.controller.PhoneBookController;
import notebookProjekt.view.PhoneBookView;

public class Main {

    public static void main(String[] args) {

        PhoneBookController phoneBookController = new PhoneBookController();
        PhoneBookView phoneBookView = new PhoneBookView ();

        while (true) {

            int choice = phoneBookView.printMenuAndGetChoice();

            switch (choice) {
                case 1:
                    // Добавить контакт
                    String name = phoneBookView.getContactNameInput();
                    String phone = phoneBookView.getContactPhoneInput();
                    phoneBookController.addContact(name, phone);
                    break;

                case 2:
                    // Удалить контакт
                    String nameToRemove = phoneBookView.getContactNameToRemove();
                    phoneBookController.removeContact(nameToRemove);
                    break;

                case 3:
                    // Изменить контакт
                    String nameToUpdate = phoneBookView.getContactNameToUpdate();
                    String newPhone = phoneBookView.getNewContactPhoneInput();
                    phoneBookController.updateContact(nameToUpdate, newPhone);
                    break;

                case 4:
                    // Показать контакты
                    phoneBookController.showContacts();
                    break;

                case 5:
                    // Выход
                    System.exit(0);
                    break;
            }
        }

    }

}
