import java.util.Scanner;

class Book{
    String author, title, genre;
    int year;
    Book(String author, String title, int year, String genre){
        this.author = author;
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return ("Автор книги " + author + "\nНазвание книги " + title + "\nНапечатали книгу в " + year + "\nЖанр книги "+ genre);
    }
}

public class gg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите автора книги, название, год выпуска и жанр:");
        Book book = new Book(in.nextLine(), in.nextLine(), in.nextInt(), in.nextLine());
        System.out.println(book.toString());
    }
}