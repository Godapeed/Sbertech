package OOP.Paint;

import java.lang.Math;

public class Circle extends Figure implements Drawable{
    private Point point1;
    private Double radius;
    Circle(){
        this.point1 = new Point(0.0, 0.0);
        this.point = new Point(0.0, 0.0);
        this.radius = Math.sqrt(Math.pow(this.point1.getX()-this.point.getX(),2)+Math.pow(this.point1.getY()-this.point.getY(),2));
    }
    Circle(Double x1, Double y1, Double x2, Double y2){
        this.point1 = new Point(x2, y2);
        this.point = new Point(x1, y1);
        this.radius = Math.sqrt(Math.pow(this.point1.getX()-this.point.getX(),2)+Math.pow(this.point1.getY()-this.point.getY(),2));
    }
    @Override
    public Double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public Double perimenter() {
        return 2 * Math.PI * this.radius;
    }
    public String getPoints(){
        return "("+this.point.getX()+","+this.point.getY()+")"+"("+this.point1.getX()+","+this.point1.getY()+")";
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