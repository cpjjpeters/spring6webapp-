package be.ipeters.spring6webapp.domain;

/* carlpeters created on 11/10/2024 inside the package - be.ipeters.spring6webapp.domain */
public class Author {
    private String firstName;
    private String lastName;

    public Author() {
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
