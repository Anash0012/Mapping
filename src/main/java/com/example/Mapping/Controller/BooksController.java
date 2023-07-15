package com.example.Mapping.Controller;

import com.example.Mapping.Model.Books;
import com.example.Mapping.Service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
    private final BooksService booksService;

    @Autowired
    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping
    public List<Books> getAllBooks() {
        return booksService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Books getBookById(@PathVariable("id") String id) {
        return booksService.getBookById(id);
    }

    @PostMapping
    public Books createBook(@RequestBody Books book) {
        return booksService.createBook(book);
    }

    @PutMapping("/{id}")
    public Books updateBook(@PathVariable("id") String id, @RequestBody Books book) {
        book.setBookID(id);
        return booksService.updateBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") String id) {
        booksService.deleteBook(id);
    }
}
