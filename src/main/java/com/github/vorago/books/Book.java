package com.github.vorago.books;
/*
Create class Book, describing a book including: release year, author, name, number of pages. For each of the properties there shall be getter and setter methods.
Write a main() method which demonstrates creating 3 Book objects with different property values, e.g.
Book cleanCode = new Book();
cleanCode.setTitle("Clean Code");
cleanCode.setAuthor("Robert Martin");
and so on...

Add to the Book class from Task 2 a constructor to set initial property values. Modify your main() method to demonstrate using such constructor to create books, e.g.
Book powerOfNow = new Book("Power of Now", "Eckhart Tolle", 2001, 224);
System.out.println("Power of Now title: " + powerOfNow.getTitle());
and so on...
*/

public class Book {
    private int year;
    private String author;
    private String name;
    private int numOfPages;

    public Book(String name, String author, int year, int numOfPages) {
        this.year = year;
        this.author = author;
        this.name = name;
        this.numOfPages = numOfPages;
    }

    public void describe() {
        System.out.println("Name: " + this.getName() + "; Author: " + this.getAuthor() +
                "; Year: " + this.getYear() + "; Pages: " + this.getNumOfPages());
    }


    public int getYear() {
        return year;
    }


    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
}
