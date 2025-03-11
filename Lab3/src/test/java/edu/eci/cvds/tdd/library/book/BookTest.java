package edu.eci.cvds.tdd.library.book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    public BookTest() {
    }

    @Test
    public void mustCreateBook() {
        Book book = new Book("El principito", "Antoine de Saint-Exupery", "9783162763");
        assertNotNull(book);
    }

    @Test
    public void shouldNotGetTittle() {
        Book book = new Book("El principito", "Antoine de Saint-Exupery", "9783162763");
        assertNotEquals("Habitos Atomicos", book.getTittle());
    }

    @Test
    public void shouldGetTitle() {
        Book book = new Book("El principito", "Antoine de Saint-Exupery", "9783162763");
        assertEquals("El principito", book.getTittle());
    }

    @Test
    public void shouldNotGetAuthor() {
        Book book = new Book("El principito", "Antoine de Saint-Exupery", "9783162763");
        assertNotEquals("Adam Sandler", book.getAuthor());
    }

    @Test
    public void shouldGetAuthor() {
        Book book = new Book("El principito", "Antoine de Saint-Exupery", "9783162763");
        assertEquals("Antoine de Saint-Exupery", book.getAuthor());
    }

    @Test
    public void shouldNotGetIsbn() {
        Book book = new Book("El principito", "Antoine de Saint-Exupery", "9783162763");
        assertNotEquals("1111183832", book.getIsbn());
    }

    @Test
    public void shouldGetIsbn() {
        Book book = new Book("El principito", "Antoine de Saint-Exupery", "9783162763");
        assertEquals("9783162763", book.getIsbn());
    }
}