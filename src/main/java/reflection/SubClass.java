package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class SubClass {
    static DataContainer data;

    public DataContainer getData(){
        return this.data;
    }
    public void setIntValue(int intValue){
        this.data.setIntValue(intValue);
    }
    public void setStringValue(String stringValue){
        this.data.setStringValue(stringValue);
    }
    public void setBooleanValue(boolean booleanValue){
        this.data.setBooleanValue(booleanValue);
    }
    public void invokeMethods(int day, int intValue, String stringValue, boolean booleanValue) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.data = new DataContainer(intValue, stringValue, booleanValue);
        Reflection r = new Reflection();
        r.findByAnnotation(day);
    }
    public void printDataContainer(DataContainer dataContainer) {
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
