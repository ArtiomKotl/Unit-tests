package main.java.book;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {
    @Test
    public void testFindBookById() {
        BookRepository mockRepository = mock(BookRepository.class);

        when(mockRepository.findById("111")).thenReturn(new Book("111", "Test Book", "Test Author"));

        BookService bookService = new BookService(mockRepository);

        Book result = bookService.findBookById("111");

        assertEquals("Test Book", result.getTitle());
        assertEquals("Test Author", result.getAuthor());
    }

    @Test
    public void testFindAllBooks() {
        BookRepository mockRepository = mock(BookRepository.class);

        when(mockRepository.findAll()).thenReturn(List.of(new Book("111", "Test Book", "Test Author")));

        BookService bookService = new BookService(mockRepository);

        List<Book> result = bookService.findAllBooks();

        assertEquals(1, result.size());
        assertEquals("Test Book", result.get(0).getTitle());
        assertEquals("Test Author", result.get(0).getAuthor());
    }
}