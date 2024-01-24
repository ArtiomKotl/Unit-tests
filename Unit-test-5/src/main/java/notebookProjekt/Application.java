package notebookProjekt;

import notebookProjekt.controller.PhoneBookController;
import notebookProjekt.view.PhoneBookView;

public class Application {

    private PhoneBookController controller;
    private PhoneBookView view;

    public static void main(String[] args) {
        Application app = new Application();
        app.init();
        app.run();
    }

    private void init() {
        this.controller = new PhoneBookController();
        this.view = new PhoneBookView();
    }

    private void run() {
        while (true) {
            int choice = view.printMenuAndGetChoice();

            switch (choice) {
                case 1:
                    // Добавить контакт
                    String name = view.getContactNameInput();
                    String phone = view.getContactPhoneInput();
                    controller.addContact(name, phone);
                    break;

                case 2:
                    // Показать контакты
                    controller.showContacts();
                    break;

                // ...код для других действий

                case 0:
                    // Выход
                    System.exit(0);
            }
        }
    }

}

