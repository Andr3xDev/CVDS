package edu.eci.cvds.tdd.library;

import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.user.User;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void mustCreateLibrary() {
        Library library = new Library();
        assertNotNull(library);
    }

    @Test
    public void shouldCreateUser() {
        User user = new User();
        Library library = new Library();
        library.addUser(user);
        assertNotNull(user);
    }

    // Add book
    @Test
    public void shouldAddBook() {
        Library library = new Library();
        Book book = new Book("El jardin cromatico", "Andres Chavarro", "Si");
        library.addBook(book);
        assertTrue(library.addBook(book));
    }

    @Test
    public void shouldAddBookNew() {
        Library library = new Library();
        Book book = new Book("El jardin cromatico", "Andres Chavarro", "Si");
        assertTrue(library.addBook(book));
    }

    @Test
    public void shouldNotAddBook() {
        Library library = new Library();
        Book book = null;
        assertFalse(library.addBook(book));
    }

    @Test
    public void shouldLoanBook() {
        Library library = new Library();
        Book book = new Book("El jardin cromatico", "Andres Chavarro", "Si");
        User user = new User();
        user.setId("101010");
        library.addUser(user);
        library.addBook(book);
        assertNotNull(library.loanABook("101010", "Si"));
    }

    @Test
    public void shouldNotLoanBook() {
        Library library = new Library();
        assertNull(library.loanABook("101010", "Si"));
    }

    @Test
    public void shouldReturnBook() {
        Library library = new Library();
        assertNull(library.loanABook("101010", "Si"));
    }

    @Test
    public void shouldAddUser() {
        Library library = new Library();
        User user = new User();
        library.addUser(user);
        assertEquals(user, library.getLastUser());
    }

    @AfterEach
    public void tearDown() {
    }
}