package VedantKapoor.Book_Management_System.Controller;

import VedantKapoor.Book_Management_System.Entity.Book;
import VedantKapoor.Book_Management_System.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/save")
    public String postBook(@RequestBody Book book){
        return bookService.postBook(book);
    }

    @GetMapping("/get")
    public List<Book> getBook(){
        return bookService.getBook();
    }

    @GetMapping("/get/{id}")
    public Book getBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @PutMapping("/updatebook/{id}")
    public Book updateBook(@RequestBody Book book,@PathVariable Long id){
        return bookService.updateBook(book,id);
    }

    @DeleteMapping("/deletebook/{id}")
    public String deleteBook(@PathVariable Long id){
        bookService.deletebook(id);
        return "Book Deleted";
    }
}
