package reflection;

import lombok.NonNull;

@NewInheritedAnnotation("SubClass")
class SubClass extends BaseClass {
    @DataContainerMethod(value="Method1")
    public void method1(@NonNull DataContainer data) {
        System.out.println("Method1 is do.");
    }

    @DataContainerMethod(value="Method2")
    public void method2(@NonNull DataContainer data, @NonNull int parameter) {
        System.out.println("Method2 is do.");
    }
}
