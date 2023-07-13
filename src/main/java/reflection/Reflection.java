package reflection;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Arrays;

public class Reflection {
    private static final List<Class<? extends SubClass>> list = List.of(FSubClass.class, TSubClass.class);
    public void findByAnnotation(int day) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        for (Class<? extends SubClass> classs : list){
            SubClass instance = classs.getDeclaredConstructor().newInstance();
            if (classs.getAnnotation(Day.class).day() == day){
                for (int priority=1; priority<=list.size()+1; priority++){
                    findMetod(classs, priority);
                    instance.printDataContainer(instance.getData());
                }
            }
        }
    }
    public void findMetod(Class<? extends SubClass> classs, int priority){
        Arrays.stream(classs.getDeclaredMethods()).forEach(
                method -> {
                    if (method.isAnnotationPresent(Priority.class)) {
                        Priority pr = method.getAnnotation(Priority.class);
                        if (pr.Priority() == priority){
                            try {
                                method.invoke(classs.newInstance());
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            } catch (InvocationTargetException e) {
                                throw new RuntimeException(e);
                            } catch (InstantiationException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
        );
    }
}
