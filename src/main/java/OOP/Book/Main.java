package OOP.Book;

import OOP.Circle.Circle;

public class Main {
    public static void main(String[] args) {
        Author p = new Author("Black", "m", "AAA!");
        System.out.println(p.toString());
        Book b = new Book(p, 2002);
        System.out.println(b.toString());
    }
}