package ru.skypro.lesson9;

public class ClassObject {
    public static void main(String[] args) {
        Author author1 = new Author("Jack", "London");
        Book book1 = new Book(author1, "The white silence", 2019);
        System.out.println(book1);
        System.out.println(author1);
            System.out.println("republished " + book1.setPublishingYear(2021));

        Author author2 = new Author("Sugmund", "Freud");
        Book book2 = new Book(author2,"Введение в психоанализ", 1917);
        System.out.println(book2);
        System.out.println(author2);
        System.out.println("republished " + book2.setPublishingYear(2009));
    }
}
