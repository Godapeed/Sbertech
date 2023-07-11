package OOP.Paint;

public class Square extends Figure implements Drawable{
    private Point point1;
    private Double side;
    Square(){
        this.point = new Point(0.0,0.0);
        this.point1 = new Point(0.0,0.0);
        this.side = this.point1.getX() - this.point.getX();
    }
    Square(Double x1, Double y1, Double x2, Double y2){
        this.point = new Point(x1,y1);
        this.point1 = new Point(x2,y2);
        this.side = this.point1.getX() - this.point.getX();
    }
    @Override
    public Double area() {
        return Math.abs(side * side);
    }

    @Override
    public Double perimenter() {
        return Math.abs(4 * side);
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