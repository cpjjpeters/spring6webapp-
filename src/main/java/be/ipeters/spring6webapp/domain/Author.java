package be.ipeters.spring6webapp.domain;

import lombok.Data;

import java.util.Set;

/* carlpeters created on 11/10/2024 inside the package - be.ipeters.spring6webapp.domain */
@Data
public class Author {
    private String firstName;
    private String lastName;
    private Set<Book> books;

    public Author() {
    }

    public Author(Set<Book> books) {
        this.books = books;
    }

    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }
}
