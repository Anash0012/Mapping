package com.example.Mapping.Repository;

import com.example.Mapping.Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepo extends JpaRepository<Books, String> {
}