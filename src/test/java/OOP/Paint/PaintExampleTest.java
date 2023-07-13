package OOP.Paint;

import junit.framework.TestCase;

public class PaintExampleTest extends TestCase {
    public void test1(){
        Circle c = new Circle(0.0,0.0,-2.0,0.0);
        assertEquals(12.566370614359172,FigureUtil.area(c));
    }
    public void test2(){
        Rectangle r = new Rectangle(2.0,0.0,-5.0,5.0);
        assertEquals(35.0,FigureUtil.area(r));
    }
    public void test3(){
        Square sq = new Square(0.0,0.0,4.0,4.0);
        assertEquals(16.0, FigureUtil.perimeter(sq));
    }
    public void test4(){
        Triangle t = new Triangle(0.0,0.0,5.0,0.0,3.0,5.0);
        assertEquals(12.499999999999996, FigureUtil.area(t));
    }
}