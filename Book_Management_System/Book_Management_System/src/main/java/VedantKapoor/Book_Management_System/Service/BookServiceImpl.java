package VedantKapoor.Book_Management_System.Service;

import VedantKapoor.Book_Management_System.Entity.Book;
import VedantKapoor.Book_Management_System.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public String postBook(Book book) {
        bookRepository.save(book);
        return "Book saved successfully";
    }

    @Override
    public List<Book> getBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(()->new RuntimeException());
    }

    @Override
    public Book updateBook(Book book, Long id) {
        Book newBook= bookRepository.findById(id).orElseThrow(()->new RuntimeException());
        newBook.setBookAuthor(book.getBookAuthor());
        newBook.setBookName(book.getBookName());
        newBook.setPrice(book.getPrice());
        newBook.setISBN(book.getISBN());

        return bookRepository.save(newBook);

    }

    @Override
    public void deletebook(Long id) {
        bookRepository.deleteById(id);
    }
}
