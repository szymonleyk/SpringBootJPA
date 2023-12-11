package pl.szymonleyk.springjpa;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping(path="/books")
    public @ResponseBody Book add (@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping(path="/books")
    public @ResponseBody List<Book> getAll() {
        return bookRepository.findAll();
    }

}
