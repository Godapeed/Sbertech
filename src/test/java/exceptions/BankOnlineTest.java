package exceptions;

import junit.framework.TestCase;

public class BankOnlineTest extends TestCase {
    public void testSend1(){
        BankOnline bank = new BankOnline();
        try {
            // Правильные данные, перевод выполнится
            bank.send("1234567890123456", 1000.0);
        } catch (BankOnlineException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch
        (NullPointerException e) {
            System.out.println("Ошибка: один из аргументов равен null!");
        }
        assertEquals("Перевод успешно выполнен!", bank.str);
    }
    public void testSend2() {
        BankOnline bank = new BankOnline();
        try {
            // Неправильно введен номер карты
            bank.send("123456789012345j", 1000.0);
        } catch (BankOnlineException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch
        (NullPointerException e) {
            System.out.println("Ошибка: один из аргументов равен null!");
        }
        assertEquals("Ошибка: Неправильно введен номер карты!","Ошибка: "+bank.str);
    }
    public void testSend3() {
        BankOnline bank = new BankOnline();
        try {
            // Перевод на заблокированную карту
            bank.send("1111111111111111", 1000.0);
        } catch (BankOnlineException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch
        (NullPointerException e) {
            System.out.println("Ошибка: один из аргументов равен null!");
        }
        assertEquals("Ошибка: Перевод на заблокированную карту запрещен!","Ошибка: "+bank.str);
    }
    public void testSend4() {
        BankOnline bank = new BankOnline();
        try {
            // Отрицательная сумма перевода
            bank.send("1234567890123456", -1000.0);
        } catch (BankOnlineException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch
        (NullPointerException e) {
            System.out.println("Ошибка: один из аргументов равен null!");
        }
        assertEquals("Ошибка: Сумма перевода не может быть отрицательной!","Ошибка: "+bank.str);
    }
    public void testSend5() {
        BankOnline bank = new BankOnline();
        try {
            // Превышен лимит
            bank.send("1234567890123456", 60000.0);
        } catch (BankOnlineException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch
        (NullPointerException e) {
            System.out.println("Ошибка: один из аргументов равен null!");
        }
        assertEquals("Ошибка: Превышен лимит перевода (50 000)!","Ошибка: "+bank.str);
    }
    public void testSend6(){
        BankOnline bank = new BankOnline();
        try {
            // Один из аргументов равен null
            bank.send(null, 1000.0);
        } catch (BankOnlineException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch
        (NullPointerException e) {
            System.out.println("Ошибка: один из аргументов равен null!");
        }
        assertEquals("Ошибка: один из аргументов равен null!","Ошибка: "+bank.str);
    }
    public void testSend7() {
        BankOnline bank = new BankOnline();
        try {
            // Перевод на заблокированную карту
            bank.send("2222222222222222", 1000.0);
        } catch (BankOnlineException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch
        (NullPointerException e) {
            System.out.println("Ошибка: один из аргументов равен null!");
        }
        assertEquals("Ошибка: Перевод на заблокированную карту запрещен!","Ошибка: "+bank.str);
    }
    public void testSend8() {
        BankOnline bank = new BankOnline();
        try {
            // Перевод на заблокированную карту
            bank.send("3333333333333333", 1000.0);
        } catch (BankOnlineException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch
        (NullPointerException e) {
            System.out.println("Ошибка: один из аргументов равен null!");
        }
        assertEquals("Ошибка: Перевод на заблокированную карту запрещен!","Ошибка: "+bank.str);
    }
    public void testSend9() {
        BankOnline bank = new BankOnline();
        try {
            // Неправильно введен номер карты
            bank.send("vw2332434fvdsv re", 1000.0);
        } catch (BankOnlineException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch
        (NullPointerException e) {
            System.out.println("Ошибка: один из аргументов равен null!");
        }
        assertEquals("Ошибка: Неправильно введен номер карты!","Ошибка: "+bank.str);
    }
    public void testSend10() {
        BankOnline bank = new BankOnline();
        try {
            // Неправильно введен номер карты
            bank.send("dfvdfdf", 1000.0);
        } catch (BankOnlineException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch
        (NullPointerException e) {
            System.out.println("Ошибка: один из аргументов равен null!");
        }
        assertEquals("Ошибка: Неправильно введен номер карты!","Ошибка: "+bank.str);
    }
}