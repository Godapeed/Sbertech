package annotations.Task4;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface NewInheritedAnnotation {
    String value() default "";
}