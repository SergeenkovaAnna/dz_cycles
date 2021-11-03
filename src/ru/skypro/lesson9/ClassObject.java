package ru.skypro.lesson9;

public class ClassObject {
    public static void main(String[] args) {
        Author author1 = new Author("Jack", "London");
        Book book1 = new Book(2019);
        System.out.println(author1.getAuthorName() + " " + author1.getAuthorFirstName());
        System.out.println(book1.getPublishingYear());
        book1.setPublishingYear(2013);
        System.out.println("republished " + book1.publishingYear);

        Author author2 = new Author("Sugmund", "Freud");
        Book book2 = new Book(1917);
        System.out.println(author2.getAuthorName() + " " + author2.getAuthorFirstName());
        System.out.println(book2.getPublishingYear());
        book2.setPublishingYear(2009);
        System.out.println("republished " + book2.publishingYear);
    }
}
