package OOP.Paint;

public class Point {
    private Double x;
    private Double y;
    Point(Double x1, Double y1){
        this.x = x1;
        this.y = y1;
    }
    public Double getX(){
        return this.x;
    }
    public Double getY(){
        return this.y;
    }
}