package unit_tests.Task1;

import junit.framework.TestCase;
import org.junit.Test;
import mockito.*;

public class ClassATest extends TestCase {
    @Test
    public void testMethodA() {
        ClassA a = new ClassA();
        a.methodA();

        // Проверяем только вызов метода ClassB.methodB
        // без вызова реального метода
        Mockito.verify(Mockito.mock(ClassB.class)).methodB();
    }
}