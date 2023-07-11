package OOP.PizzaOrder;

enum Size{SMALL, MEDIUM, BIG}

public class PizzaOrder {
    private String name;
    private Size size;
    private boolean sauce;
    private String address;
    private boolean order;
    PizzaOrder(String n, Size s, boolean sa, String a){
        this.name = n;
        this.size = s;
        this.sauce = sa;
        this.address = a;
    }
    public void order(){
        if (this.order){
            System.out.println("Заказ уже принят.");
        }
        else {
            String s = switch (size) {
                case SMALL -> "Маленькая пицца";
                case MEDIUM -> "Средняя пицца";
                case BIG -> "Большая пицца";
            };
            String s1;
            if (sauce) {
                s1 = "с соусом";
            } else {
                s1 = "без соуса";
            }
            System.out.println("Заказ принят. " + s + " «" + name + "» " + s1 + " на адрес " + address + ".");
            this.order = true;
        }
    }
    public void cancel(){
        System.out.println("Заказ отменен.");
    }
    public String setName(String n){
        return this.name = n;
    }
    public Size setSize(Size s){
        return this.size = s;
    }
    public boolean setSauce(boolean s){
        return this.sauce = s;
    }
    public String setAddress(String a){
        return this.address = a;
    }
    public String getName(){
        return this.name;
    }
    public Size getSize(){
        return this.size;
    }
    public boolean getSauce(){
        return this.sauce;
    }
    public String getAddress(){
        return this.address;
    }
    public String toString(){
        String s = switch (size) {
            case SMALL -> "Маленькая пицца";
            case MEDIUM -> "Средняя пицца";
            case BIG -> "Большая пицца";
        };
        String s1, s2;
        if (sauce) {
            s1 = "с соусом";
        } else {
            s1 = "без соуса";
        }
        if (order) {
            s2 = "принят";
        } else {
            s2 = "не принят";
        }
        return name+" "+s+" "+s1+" на адрес "+address+" "+s2;
    }
}