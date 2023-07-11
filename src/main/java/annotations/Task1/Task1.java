package annotations.Task1;

import java.lang.annotation.*;
public class Task1 {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface WeekDayInherited {
        int value();
    }
}
