package pl.szymonleyk.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping(path="/books")
    public @ResponseBody String add (@RequestBody Book book) {
        bookRepository.save(book);
        return "Saved";
    }

    @GetMapping(path="/books")
    public @ResponseBody List<Book> getAll() {
        return bookRepository.findAll();
    }

}
