package OOP.Circle;

import java.lang.Math;

public class Circle {
    private final Double radius;
    private final String color;

    Circle(Double r, String c){
        this.radius = r;
        this.color = c;
    }
    public Double area(){
        return Math.PI * this.radius * this.radius;
    }
    public Double perimeter(){
        return Math.PI * 2 * this.radius;
    }
    public String toString(){
        return this.radius+" "+this.color+" "+this.area()+" "+this.perimeter();
    }
}