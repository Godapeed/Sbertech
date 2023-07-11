package OOP.Paint;

public class FigureUtil{
    private FigureUtil(){

    }
    public static Double area(Figure figure){
        return figure.area();
    }
    public static Double perimeter(Figure figure){
        return figure.perimenter();
    }
    public static void draw(Drawable figure){
        figure.draw();
        System.out.println("Нарисована черная фигура с координатами "+figure.getPoints());
    }
    public static void draw(Drawable figure, Color color){
        figure.draw(color);
        String col = switch (color) {
            case Black -> "черная";
            case Red -> "красная";
            case Blue -> "синяя";
            case Yellow -> "желтая";
            case White -> "белая";
        };
        System.out.println("Нарисована "+col+" фигура с координатами "+figure.getPoints());
    }
}