package reflection;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        SubClass sub = new SubClass();
        sub.invokeMethods(2,12,"fgf",true);
        sub.invokeMethods(1,11,"AAA",false);
    }
}
