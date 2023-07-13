package OOP.Book;

import junit.framework.TestCase;

public class BookTest extends TestCase {

    public void testSetAuthor() {
        Author a = new Author("Kirill", "man", "@email");
        Book b = new Book(a,2020);
        Author a1 = new Author("Pasha", "man", "@email");
        b.setAuthor(a1);
        assertEquals("Pasha",b.getAuthor().getName());
    }

    public void testSetYear() {
        Author a = new Author("Kirill", "man", "@email");
        Book b = new Book(a,2020);
        Integer y = 2023;
        b.setYear(y);
        assertEquals(y, b.getYear());
    }

    public void testTestToString() {
        Author a = new Author("Kirill", "man", "@email");
        Book b = new Book(a,2020);
        assertEquals("Kirill 2020", b.toString());
    }
}