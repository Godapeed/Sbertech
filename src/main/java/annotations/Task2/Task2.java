package annotations.Task2;

import java.lang.annotation.*;
public class Task2 {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @Repeatable(Methods.class)
    public @interface MethodDescription {
        int hours();
        int priority();
        String description();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface Methods {
        MethodDescription[] value();
    }
}
