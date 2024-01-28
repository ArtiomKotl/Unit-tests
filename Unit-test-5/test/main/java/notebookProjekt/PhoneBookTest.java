package main.java.notebookProjekt;
import notebookProjekt.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    PhoneBook phoneBook;

    @BeforeEach
    void setup() {
        phoneBook = new PhoneBook();
    }

    @Test
    void addContact() {
        phoneBook.addContact("John", "12345");
        assertEquals(1, phoneBook.getContact("John").size());
    }


    @Test
    void getContact() {
        phoneBook.addContact("Alice", "5678");
        List<String> numbers = phoneBook.getContact("Alice");
        assertEquals("5678", numbers.get(0));
    }

    @Test
    void delContact() {
        phoneBook.addContact("Bob", "91011");
        phoneBook.delContact("Bob");
        assertNull(phoneBook.getContact("Bob"));
    }


    @Test
    void changeContact() {
        phoneBook.addContact("Mike", "1213");
        phoneBook.changeContact("Mike", "9999");
        assertEquals("9999", phoneBook.getContact("Mike").get(0));
    }

    @Test
    void testAddContact() {
        phoneBook.addContact("John Doe", "12345");

        assertTrue(phoneBook.getList().contains("John Doe: [12345]"));
    }

    @Test
    void testDeleteContact() {

        phoneBook.addContact("John Doe", "12345");

        assertTrue(phoneBook.getList().contains("John Doe: [12345]"));

        phoneBook.delContact("John Doe");

        assertFalse(phoneBook.getList().contains("John Doe: [12345]"));
    }



    @Test
    void testContactLifecycle() {
        // Добавляем новый контакт
        phoneBook.addContact("John Doe", "12345");

        // Проверяем, что контакт добавлен
        assertEquals("12345", phoneBook.getContact("John Doe").get(0));

        // Изменяем номер телефона у контакта
        phoneBook.changeContact("John Doe", "54321");

        // Проверяем, что номер изменен
        assertEquals("54321", phoneBook.getContact("John Doe").get(0));

        // Удаляем контакт
        phoneBook.delContact("John Doe");

        // Проверяем, что контакт удален
        assertNull(phoneBook.getContact("John Doe"));

    }




}
