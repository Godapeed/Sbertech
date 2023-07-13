package reflection;

@Day(day = 2)
public class TSubClass extends SubClass{
    @Priority(Priority = 1)
    public void print1(){
        System.out.println("d1sd");
        this.setStringValue("M1C2");
    }
    @Priority(Priority = 2)
    public void print2(){
        System.out.println("d2sd");
        this.setIntValue(22);
    }
    @Priority(Priority = 3)
    public void print3(){
        System.out.println("d3sd");
        this.setBooleanValue(false);
    }
}
