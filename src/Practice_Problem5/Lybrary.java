package Practice_Problem5;

class Book {
    // Attributes (fields)
    private String title;
    private String author;

    // Constructor 1: only title
    public Book(String title) {
        this.title = title;
        this.author = null;  // not set
    }

    // Constructor 2: title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods (optional)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Title: " + title);
        if (author != null) {
            System.out.println("Author: " + author);
        } else {
            System.out.println("Author: Not specified");
        }
    }
}

public class Lybrary {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics");
        Book book2 = new Book("Effective Java", "Joshua Bloch");

        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
    }
}
