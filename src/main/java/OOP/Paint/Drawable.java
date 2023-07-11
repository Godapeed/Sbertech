package OOP.Paint;

enum Color{Black, White, Blue, Red, Yellow}

public interface Drawable{
    public void draw();
    public void draw(Color color);
    public String getPoints();
}