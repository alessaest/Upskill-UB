package org.agoncal.quarkus.starting;

import java.util.List;
import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BookRepository {

    public List<Book> getAllBooks() {
        return List.of(
            new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee", 1960, "Fiction"),
            new Book(3, "1984", "George Orwell", 1948, "Dystopian Fiction")
        );
    }

    public Optional<Book> getBook(int id) {
        return getAllBooks().stream().filter(book -> book.id() == id).findFirst();
    }
}
