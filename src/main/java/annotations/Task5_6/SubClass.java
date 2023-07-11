package annotations.Task5_6;

import lombok.NonNull;

@NewInheritedAnnotation("SubClass")
class SubClass extends BaseClass {
    @DataContainerMethod(value="Method1")
    public void method1(@NonNull DataContainer data) {
        // Реализация метода
    }

    @DataContainerMethod(value="Method2")
    public void method2(@NonNull DataContainer data,@NonNull int parameter) {
        // Реализация метода
    }
}
