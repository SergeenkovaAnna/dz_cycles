package ru.skypro.lesson9;

import java.util.Objects;

public class Book {

    private int publishingYear;
    private final String title;
    private final Author author;


    public Book(Author author, String title, int publishingYear) {
        this.author = author;
        this.title=title;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }


    public int getPublishingYear() {
        return this.publishingYear;
    }

    public int setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
        return publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishingYear, title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "publishingYear=" + publishingYear +
                ", title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
