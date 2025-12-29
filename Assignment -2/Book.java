package Assignment2;
public class Book {
    String title;

    Book(String t) {
        title = t;
    }
}
class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Book b2 = new Book("Python Essentials");

        System.out.println(b1.title);
        System.out.println(b2.title);
    }
}
