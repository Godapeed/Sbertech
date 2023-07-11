package reflection;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Main m = new Main();
        DataContainer dataContainer = m.makeDataContainer(LocalDate.now(), 12, "fdfd", true);
        printDataContainer(dataContainer);

        method1(dataContainer);

        System.out.println("DataContainer after method calls:");
        printDataContainer(dataContainer);
    }

    public DataContainer makeDataContainer(LocalDate Date, int intValue, String stringValue, boolean booleanValue){
        return new DataContainer(intValue, stringValue, booleanValue);
    }

    public static void method1(DataContainer dataContainer) {
        // Первый метод
        // Внесите изменения в dataContainer
        dataContainer.setIntValue(20);
        dataContainer.setStringValue("Method 1");
        dataContainer.setBooleanValue(false);
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
