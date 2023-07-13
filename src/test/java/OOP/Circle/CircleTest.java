package OOP.Circle;

import junit.framework.TestCase;

public class CircleTest extends TestCase {

    public void testArea() {
        Circle c = new Circle(12.0, "Red");
        assertEquals(452.3893421169302,c.area());
    }

    public void testPerimeter() {
        Circle c = new Circle(12.0, "Red");
        assertEquals(75.39822368615503,c.perimeter());
    }

    public void testTestToString() {
        Circle c = new Circle(12.0, "Red");
        assertEquals("12.0 Red 452.3893421169302 75.39822368615503",c.toString());
    }
}