package OOP.Paint;

import java.lang.Math;
public class Triangle extends Figure implements Drawable{
    private Point point1;
    private Point point2;
    private Double a;
    private Double b;
    private Double c;
    private Double p;
    Triangle(){
        this.point = new Point(0.0,0.0);
        this.point1 = new Point(0.0,0.0);
        this.point2 = new Point(0.0,0.0);
        this.a = Math.sqrt(Math.pow(this.point1.getX()-this.point.getX(),2)+Math.pow(this.point1.getY()-this.point.getY(),2));
        this.b = Math.sqrt(Math.pow(this.point2.getX()-this.point.getX(),2)+Math.pow(this.point2.getY()-this.point.getY(),2));
        this.c = Math.sqrt(Math.pow(this.point1.getX()-this.point2.getX(),2)+Math.pow(this.point1.getY()-this.point2.getY(),2));
        this.p = (a+b+c)/2;
    }
    Triangle(Double x1, Double y1, Double x2, Double y2, Double x3, Double y3){
        this.point = new Point(x1,y1);
        this.point1 = new Point(x2,y2);
        this.point2 = new Point(x3,y3);
        this.a = Math.sqrt(Math.pow(this.point1.getX()-this.point.getX(),2)+Math.pow(this.point1.getY()-this.point.getY(),2));
        this.b = Math.sqrt(Math.pow(this.point2.getX()-this.point.getX(),2)+Math.pow(this.point2.getY()-this.point.getY(),2));
        this.c = Math.sqrt(Math.pow(this.point1.getX()-this.point2.getX(),2)+Math.pow(this.point1.getY()-this.point2.getY(),2));
        this.p = (a+b+c)/2;
    }
    @Override
    public Double area() {
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public Double perimenter() {
        return p*2;
    }
    public String getPoints(){
        return "("+this.point.getX()+","+this.point.getY()+")"+"("+this.point1.getX()+","+this.point1.getY()+")"+
                "("+this.point2.getX()+","+this.point2.getY()+")";
    }
    @Override
    public void draw() {
        this.color = Color.Black;
    }

    @Override
    public void draw(Color color) {
        this.color = color;
    }
}