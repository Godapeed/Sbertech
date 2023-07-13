package reflection;

@Day(day = 1)
public class FSubClass extends SubClass{
    @Priority(Priority = 1)
    public void print1(){
        System.out.println("d1jk");
        this.setStringValue("M1C1");
    }
    @Priority(Priority = 2)
    public void print2(){
        System.out.println("d2jk");
        this.setIntValue(11);
    }
    @Priority(Priority = 3)
    public void print3(){
        System.out.println("d3jk");
        this.setBooleanValue(true);
    }
}
