package OOP.PizzaOrder;

public class Main {
    public static void main(String[] args) {
        PizzaOrder p = new PizzaOrder("kjdfkdjf", Size.BIG,true,"dfdvfv fddf");
        System.out.println(p.toString());
        p.order();
        p.order();
    }
}