package OOP.PizzaOrder;

import junit.framework.TestCase;

public class PizzaOrderTest extends TestCase {

    public void testTestSetName() {
        PizzaOrder p = new PizzaOrder("kjdfkdjf", Size.BIG,true,"dfdvfv fddf");
        p.setName("dsdsd");
        assertEquals("dsdsd", p.getName());
    }

    public void testSetSize() {
        PizzaOrder p = new PizzaOrder("kjdfkdjf", Size.BIG,true,"dfdvfv fddf");
        p.setSize(Size.SMALL);
        assertEquals(Size.SMALL, p.getSize());
    }

    public void testSetSauce() {
        PizzaOrder p = new PizzaOrder("kjdfkdjf", Size.BIG,true,"dfdvfv fddf");
        p.setSauce(false);
        assertFalse(p.getSauce());
    }

    public void testSetAddress() {
        PizzaOrder p = new PizzaOrder("kjdfkdjf", Size.BIG,true,"dfdvfv fddf");
        p.setAddress("dsfdbgbfb");
        assertEquals("dsfdbgbfb", p.getAddress());
    }

    public void testTestToString() {
        PizzaOrder p = new PizzaOrder("kjdfkdjf", Size.BIG,true,"dfdvfv fddf");
        assertEquals("kjdfkdjf Большая пицца с соусом на адрес dfdvfv fddf не принят",p.toString());
    }
}