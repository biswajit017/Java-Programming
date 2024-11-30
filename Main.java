package naresh_it_Exam.Library_Management;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title of the Book: " + title);
        System.out.println("Author of this Book: " + author);
    }
}

class Library {
    String name;
    Book book;

    public Library(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    public void LibraryDetails() {
        System.out.println("The Name of the Library: " + name);
        System.out.println("Book Details:");
        book.displayDetails(); 
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("The Catcher in the Rye", "J.D. Salinger");

        Library l1 = new Library("Central Library", b1);

        l1.LibraryDetails();
    }
}
