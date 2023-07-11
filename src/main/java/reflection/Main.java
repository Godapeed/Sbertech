package reflection;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Date date = new Date();
        m.createInstances(date, 12, "dfd", true);

    }

    public void createInstances(Date date, int intValue, String stringValue, boolean booleanValue) {
        DataContainer data = new DataContainer(intValue, stringValue, booleanValue);

        // создаем экземпляр класса BaseClass
        BaseClass base = new BaseClass();

        // создаем экземпляр класса ChildClass
        ChildClass child = new ChildClass();

        // создаем экземпляр класса SubClass
        SubClass sub = new SubClass();

        invokeMethods(sub, data);
    }

    public static void invokeMethods(SubClass sub, DataContainer data) {
        // Получаем все методы с аннотацией DataContainerMethod
        Arrays.stream(SubClass.class.getDeclaredMethods())
                .filter(method -> method.isAnnotationPresent(DataContainerMethod.class))
                .forEach(method -> {
                    DataContainerMethod annotation = method.getAnnotation(DataContainerMethod.class);
                    String priority = annotation.value();
                    // вызываем методы в зависимости от приоритета
                    if (priority == "Method1") {
                        // вызываем первый метод с приоритетом 1
                        try {
                            method.invoke(sub, new DataContainer());
                            printDataContainer(data);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else
                        if (priority == "Method2") {
                        // вызываем второй метод с приоритетом 2
                        try {
                            method.invoke(sub, new DataContainer(), 123);
                            printDataContainer(data);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

    }

    public static void printDataContainer(DataContainer dataContainer) {
        // Выводим значения полей DataContainer с помощью рефлексии
        Field[] fields = dataContainer.getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                System.out.println(field.getName() + ": " + field.get(dataContainer));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

}
