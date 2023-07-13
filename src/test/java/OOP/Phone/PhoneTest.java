package OOP.Phone;

import junit.framework.TestCase;

public class PhoneTest extends TestCase {

    public void testReceiveCall() {
        Phone p = new Phone();
        p.receiveCall("Kirill");
        assertEquals("Kirill", p.str);
    }

    public void testGetNumber() {
        Phone p = new Phone("+79357839485", "fdf");
        assertEquals("+79357839485",p.getNumber());
    }

    public void testTestReceiveCall() {
        Phone p = new Phone();
        p.receiveCall("Pasha","+792475839434");
        assertEquals("call",p.str);
    }

    public void testSendMessage() {
        Phone p = new Phone();
        p.sendMessage(new String[] {"+7013094834", "+792475839434"});
        assertEquals("null+7013094834+792475839434",p.str);
    }

    public void testTestToString() {
        Phone p = new Phone();
        assertEquals("Standart Standart Standart",p.toString());
    }
}