package ru.skypro.lesson9;

public class Author {
    private String authorName;
    private String authorFirstName;

    public Author(String authorName, String authorFirstName) {
        this.authorName = authorName;
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

}
