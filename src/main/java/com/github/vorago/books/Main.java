package com.github.vorago.books;

public class Main {
    public static void main(String[] args) {
        Book cleanCode = new Book(null,null,0,0);
        cleanCode.setName("Clean Code");
        cleanCode.setAuthor("Robert Martin");
        cleanCode.setYear(2010);
        cleanCode.setNumOfPages(600);

        Book headFirstJava = new Book(null,null,0,0);
        headFirstJava.setName("Head First Java");
        headFirstJava.setAuthor("Kathy Sierra");
        headFirstJava.setYear(2005);
        headFirstJava.setNumOfPages(722);

        Book thinkingInJava = new Book(null,null,0,0);
        thinkingInJava.setName("Thinking In Java");
        thinkingInJava.setAuthor("Bruce Eckel");
        thinkingInJava.setYear(2006);
        thinkingInJava.setNumOfPages(1200);

        Book powerOfNow = new Book("Power of Now", "Eckhart Tolle", 2001, 224);
        Book theEditions = new Book("The Edition", "Sigmar Polke", 2017, 127);
        System.out.println("Power of Now title: " + powerOfNow.getName());

        thinkingInJava.describe();
        headFirstJava.describe();
        cleanCode.describe();
        theEditions.describe();

    }
}
