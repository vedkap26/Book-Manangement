package VedantKapoor.Book_Management_System.Entity;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;
    private Long isbn;
    private String bookName;
    private String bookAuthor;
    private Long price;

    public Long getISBN() {
        return isbn;
    }

    public void setISBN(Long ISBN) {
        this.isbn = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Book() {
    }

    public Book(Long ISBN, String bookName, String bookAuthor, Long price) {
        this.isbn = ISBN;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.price = price;
    }
}
