package annotations.Task5_6;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(DataContainerMethods.class)
public @interface DataContainerMethod {
    String value() default "";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface DataContainerMethods {
    DataContainerMethod[] value();
}