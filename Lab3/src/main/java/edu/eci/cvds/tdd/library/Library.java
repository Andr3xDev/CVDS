package edu.eci.cvds.tdd.library;

import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.loan.Loan;
import edu.eci.cvds.tdd.library.loan.LoanStatus;
import edu.eci.cvds.tdd.library.user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Library responsible for manage the loans and the users.
 */
public class Library {

    private final List<User> users;
    private final Map<Book, Integer> books;
    private final List<Loan> loans;

    public Library() {
        users = new ArrayList<>();
        books = new HashMap<>();
        loans = new ArrayList<>();
    }

    /**
     * Adds a new {@link edu.eci.cvds.tdd.library.book.Book} into the system, the
     * book is store in a Map that contains
     * the {@link edu.eci.cvds.tdd.library.book.Book} and the amount of books
     * available, if the book already exist the
     * amount should increase by 1 and if the book is new the amount should be 1,
     * this method returns true if the
     * operation is successful false otherwise.
     *
     * @param book The book to store in the map.
     *
     * @return true if the book was stored false otherwise.
     */
    public boolean addBook(Book book) {
        if (book != null && books.containsKey(book)) {
            int numBooks = books.get(book);
            books.put(book, numBooks++);
            return true;
        } else if (book != null) {
            books.put(book, 1);
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method creates a new loan with for the User identify by the userId and
     * the book identify by the isbn,
     * the loan should be store in the list of loans, to successfully create a loan
     * is required to validate that the
     * book is available, that the user exist and the same user could not have a
     * loan for the same book
     * {@link edu.eci.cvds.tdd.library.loan.LoanStatus#ACTIVE}, once these
     * requirements are meet the amount of books is
     * decreased and the loan should be created with
     * {@link edu.eci.cvds.tdd.library.loan.LoanStatus#ACTIVE} status and
     * the loan date should be the current date.
     *
     * @param userId id of the user.
     * @param isbn   book identification.
     *
     * @return The new created loan.
     */
    public Loan loanABook(String userId, String isbn) {
        User user = getUser(userId);
        Book book = getBook(isbn);
        if (book == null || books.get(book) < 1 || user == null) {
            return null;
        } else {
            int numBooks = books.get(book);
            books.put(book, numBooks--);
            return createLoan(user, book);
        }
    }

    /**
     * Create a loan and adds it in the loans list
     * 
     * @param user loan taker
     * @param book book on loan
     * @return loan info object
     */
    public Loan createLoan(User user, Book book) {
        Loan loan = new Loan();
        loan.setBook(book);
        loan.setUser(user);
        loan.setLoanDate(null);
        loan.setReturnDate(null);
        loan.setStatus(null);
        loans.add(loan);
        return loan;
    }

    /**
     * This method return a loan, meaning that the amount of books should be
     * increased by 1, the status of the Loan
     * in the loan list should be
     * {@link edu.eci.cvds.tdd.library.loan.LoanStatus#RETURNED} and the loan return
     * date should be the current date, validate that the loan exist.
     *
     * @param loan loan to return.
     *
     * @return the loan with the RETURNED status.
     */
    public Loan returnLoan(Loan loan) {
        // TODO Implement the login of loan a book to a user based on the UserId and the
        // isbn.
        return null;
    }

    /**
     * This method adds users to the list that collects all users
     * 
     * @param user user to add
     * @return the addition to the list
     */
    public boolean addUser(User user) {
        return users.add(user);
    }

    /**
     * This method is used to know the las user added,
     * it's usefull if we want the las user object
     * 
     * @return last user object added
     */
    public User getLastUser() {
        return users.getLast();
    }

    /**
     * Method to get a book with the ssid and return it
     * 
     * @param ssid objetive id
     * @return book object with same id
     */
    public Book getBook(String ssid) {
        for (Book book : books.keySet()) {
            if (book.getIsbn() == ssid) {
                return book;
            }
        }
        return null;
    }

    /**
     * Method to get a user with his id
     * 
     * @param idUser objetive user
     * @return user objetct with same id
     */
    public User getUser(String idUser) {
        for (User user : users) {
            if (user.getId() == idUser) {
                return user;
            }
        }
        return null;
    }
}