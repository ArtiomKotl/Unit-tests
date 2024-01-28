package notebookProjekt;

public class Main {
    private static final String ACTION_1 = "Maximilian";
    public static void main(String[] args) {


        PhoneBook phoneBook = new PhoneBook();
        fillingPhoneBook (phoneBook);
        System.out.println(phoneBook.getList());
        phoneBook.sortedPrint ();
        System.out.println ("------------------------------");
        System.out.println (phoneBook.getContact ( ACTION_1 ));

    }


    public static void fillingPhoneBook(PhoneBook phoneBook){

        phoneBook.addContact("Pavel", "456433");
        phoneBook.addContact("Ivan", "456123");
        phoneBook.addContact("Ivan", "41237537");
        phoneBook.addContact("Igor", "6783738");
        phoneBook.addContact("Pavel", "45345345");
        phoneBook.addContact("Ivan", "4345345");
        phoneBook.addContact("Ilias", "222444");
        phoneBook.addContact("Igor", "654321");
        phoneBook.addContact(ACTION_1, "123456");
        phoneBook.addContact("Tom", "874653");
        phoneBook.addContact(ACTION_1, "654321");







    }
}
