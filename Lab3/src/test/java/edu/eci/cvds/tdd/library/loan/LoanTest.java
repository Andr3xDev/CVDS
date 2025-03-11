package edu.eci.cvds.tdd.library.loan;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.*;

import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.user.User;

public class LoanTest {

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void mustCreateLoan() {
        Loan loan = new Loan();
        assertNotNull(loan);
    }

    @Test
    public void shouldGetBook() {
        Loan loan = new Loan();
        Book book = new Book("El jardin cromatico", "Andres Chavarro", "Si");
        loan.setBook(book);
        assertNotNull(loan.getBook());
    }

    @Test
    public void shouldNotGetBook() {
        Loan loan = new Loan();
        assertNull(loan.getBook());
    }

    @Test
    public void shouldSetBook() {
        Loan loan = new Loan();
        Book book = new Book("El jardin cromatico", "Andres Chavarro", "Si");
        assertDoesNotThrow(() -> loan.setBook(book));
    }

    @Test
    public void shouldNotSetBook() {
        Loan loan = new Loan();
        Object invalidValue = 100;
        assertThrows(ClassCastException.class, () -> {
            loan.setBook((Book) invalidValue);
        });
    }

    @Test
    public void shouldGetUser() {
        Loan loan = new Loan();
        User user = new User();
        loan.setUser(user);
        assertNotNull(loan.getUser());
    }

    @Test
    public void shouldNotGetUser() {
        Loan loan = new Loan();
        assertNull(loan.getUser());
    }

    @Test
    public void shouldSetUser() {
        Loan loan = new Loan();
        User user = new User();
        assertDoesNotThrow(() -> loan.setUser(user));
    }

    @Test
    public void shouldNotSetUser() {
        Loan loan = new Loan();
        Object invalidValue = 100;
        assertThrows(ClassCastException.class, () -> {
            loan.setUser((User) invalidValue);
        });
    }

    @Test
    public void shouldGetLoanDate() {
        Loan loan = new Loan();
        LocalDateTime loanDate = LocalDateTime.of(2025, 2, 10, 12, 0);
        loan.setLoanDate(loanDate);
        assertNotNull(loan.getLoanDate());
    }

    @Test
    public void shouldNotGetLoanDate() {
        Loan loan = new Loan();
        assertNull(loan.getLoanDate());
    }

    @Test
    public void shouldSetLoanDate() {
        Loan loan = new Loan();
        LocalDateTime loanDate = LocalDateTime.of(2025, 2, 10, 12, 0);
        assertDoesNotThrow(() -> loan.setLoanDate(loanDate));
    }

    @Test
    public void shouldNotSetLoanDate() {
        Loan loan = new Loan();
        Object invalidValue = 100;
        assertThrows(ClassCastException.class, () -> {
            loan.setLoanDate((LocalDateTime) invalidValue);
        });
    }

    @Test
    public void shouldNotGetStatus() {
        Loan loan = new Loan();
        assertNull(loan.getStatus());
    }

    public void shouldSetStatus() {
        Loan loan = new Loan();
        assertDoesNotThrow(() -> loan.setStatus(LoanStatus.ACTIVE));
    }

    @Test
    public void shouldGetReturnDate() {
        Loan loan = new Loan();
        LocalDateTime returnDate = LocalDateTime.of(2025, 2, 10, 12, 0);
        loan.setReturnDate(returnDate);
        assertNotNull(loan.getReturnDate());
    }

    @Test
    public void shouldNotGetReturnDate() {
        Loan loan = new Loan();
        assertNull(loan.getReturnDate());
    }

    @Test
    public void shouldSetReturnDate() {
        Loan loan = new Loan();
        LocalDateTime returnDate = LocalDateTime.of(2025, 2, 10, 12, 0);
        assertDoesNotThrow(() -> loan.setReturnDate(returnDate));
    }

    @Test
    public void shouldNotSetReturnDate() {
        Loan loan = new Loan();
        Object invalidValue = 100;
        assertThrows(ClassCastException.class, () -> {
            loan.setReturnDate((LocalDateTime) invalidValue);
        });
    }

    @Test
    public void testInvalidValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            LoanStatus.valueOf("INVALID");
        });
    }

    @AfterEach
    public void tearDown() {
    }
}