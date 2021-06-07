package com.itimbalenco.homework.homework28052021.Book;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Sherlock", 12.50, 100, new Author("Arthur Conan Doil", "conan@gmail.com", 'm')));
        books.add(new Book("Lost", 18.50, 200, new Author("Arthur Conan Doil", "conan@gmail.com", 'm')));
        books.add(new Book("Tarzan", 17.50, 100, new Author("Edgar Rise Barrouse", "edgar@gmail.com", 'm')));
        books.add(new Book("Tarzan 2", 17.50, 100, new Author("Edgar Rise Barrouse", "edgar@gmail.com", 'm')));
        books.add(new Book("The war", 12.50, 100, new Author("Herbert Walles", "conan@gmail.com", 'm')));
        books.add(new Book("Sherlock 2", 12.50, 100, new Author("Arthur Conan Doil", "conan@gmail.com", 'm')));

        TestInterface<Book, Author> testInterface = (book, author) -> book.getAuthor().equals(author);
        IncreasePrice<Book> increasePrice = (Book book) -> book.setPrice(book.getPrice() * 2);

        books.stream().filter(book -> book.getAuthor().equals(new Author("Arthur Conan Doil", "conan@gmail.com", 'm'))).forEach(System.out::println);
        increase(books, increasePrice);
        System.out.println(books);

    }

    static void increase(ArrayList<Book> books, IncreasePrice<Book> predicate){
        Book book;
        for (int i = 0; i < books.size(); i++) {
            predicate.increase(books.get(i));
        }
    }

}
