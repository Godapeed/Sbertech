package OOP.Book;

import junit.framework.TestCase;

public class AuthorTest extends TestCase {

    public void testTestSetName() {
        Author a = new Author("Kirill", "man", "@email");
        a.setName("Pasha");
        assertEquals("Pasha", a.getName());
    }

    public void testSetSex() {
        Author a = new Author("Kirill", "man", "@email");
        a.setSex("combat helicopter");
        assertEquals("combat helicopter", a.getSex());
    }

    public void testSetEmail() {
        Author a = new Author("Kirill", "man", "@email");
        a.setEmail("Kirill@email.ru");
        assertEquals("Kirill@email.ru",a.getEmail());
    }

    public void testTestToString() {
        Author a = new Author("Kirill", "man", "@email");
        assertEquals("Kirill man @email",a.toString());
    }
}