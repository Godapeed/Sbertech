package OOP.Paint;

import junit.framework.TestCase;

public class FigureUtilTest extends TestCase {

    public void testArea() {
        Circle c = new Circle(0.0,0.0,-2.0,0.0);
        Double d = FigureUtil.area(c);
        assertEquals(12.56, d);
    }

    public void testPerimeter() {
    }

    public void testDraw() {
    }

    public void testTestDraw() {
    }
}