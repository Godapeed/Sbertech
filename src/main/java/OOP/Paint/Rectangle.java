package OOP.Paint;

public class Rectangle extends Figure implements Drawable{
    private Point point1;
    private Double side1;
    private Double side2;

    Rectangle(){
        this.point = new Point(0.0,0.0);
        this.point1 = new Point(0.0,0.0);
        this.side1 = this.point1.getX() - this.point.getX();
        this.side2 = this.point1.getY() - this.point.getY();
    }
    Rectangle(Double x1, Double y1, Double x2, Double y2){
        this.point = new Point(x1,y1);
        this.point1 = new Point(x2,y2);
        this.side1 = this.point1.getX() - this.point.getX();
        this.side2 = this.point1.getY() - this.point.getY();
    }
    @Override
    public Double area() {
        return Math.abs(side1 * side2);
    }

    @Override
    public Double perimenter() {
        return Math.abs(2 * (side1 + side2));
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