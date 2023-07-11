package OOP.Paint;

public class PaintExample {
    public static void main(String[] args) {
        Circle c = new Circle(0.0,0.0,-2.0,0.0);
        FigureUtil.draw(c, Color.Red);
        System.out.println(FigureUtil.area(c));
        Rectangle r = new Rectangle(2.0,0.0,-5.0,5.0);
        FigureUtil.draw(r);
        System.out.println(FigureUtil.area(r));
        Square sq = new Square(0.0,0.0,4.0,4.0);
        FigureUtil.draw(sq, Color.White);
        System.out.println(FigureUtil.perimeter(sq));
        Triangle t = new Triangle(0.0,0.0,5.0,0.0,3.0,5.0);
        FigureUtil.draw(t, Color.Yellow);
        System.out.println(FigureUtil.area(t));
    }
}