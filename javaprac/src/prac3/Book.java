package prac3;

import java.util.Scanner;

class Book1{
    String author, title, genre;
    int year;
    Book1(String author, String title,String genre, int year){
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    @Override
    public String toString() {
        return ("Автор книги: " + author + "\nНазвание книги: " + title + "\nНапечатали книгу в " + year + "\nЖанр книги: "+ genre);
    }
}

public class Book {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите автора книги, название, жанр и год выпуска:");
        Book1 book = new Book1(in.nextLine(), in.nextLine(), in.nextLine(), in.nextInt());
        System.out.println(book.toString());
    }
}