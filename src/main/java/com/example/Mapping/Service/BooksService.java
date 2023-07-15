package com.example.Mapping.Service;

import com.example.Mapping.Model.Books;
import com.example.Mapping.Repository.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    private final BooksRepo booksRepo;

    @Autowired
    public BooksService(BooksRepo booksRepo) {
        this.booksRepo = booksRepo;
    }
    public List<Books> getAllBooks() {
        return booksRepo.findAll();
    }

    public Books getBookById(String id) {
        return booksRepo.findById(id).orElse(null);
    }

    public Books createBook(Books book) {
        return booksRepo.save(book);
    }

    public Books updateBook(Books book) {
        return booksRepo.save(book);
    }

    public void deleteBook(String id) {
        booksRepo.deleteById(id);

    }
}
