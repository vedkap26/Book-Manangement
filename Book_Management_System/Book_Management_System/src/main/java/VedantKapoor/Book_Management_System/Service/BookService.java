package VedantKapoor.Book_Management_System.Service;

import VedantKapoor.Book_Management_System.Entity.Book;

import java.util.List;

public interface BookService {

    public String postBook(Book book);

    public List<Book> getBook();

    public Book getBookById(Long id);

    public Book updateBook(Book book, Long id);

    public void deletebook(Long id);
}
