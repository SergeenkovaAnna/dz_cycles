package ru.skypro.lesson9;

import java.util.Objects;

public class Book {

    private int publishingYear;

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

    private final String title;


    public Book(String title, int publishingYear) {
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

    public String toString() {
        return "Название: " + getTitle() + ";" + " Год издания:" + getPublishingYear();
    }

}
