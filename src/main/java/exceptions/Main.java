package exceptions;

public class Main {
    public static void main(String[] args) {
        BankOnline bank = new BankOnline();

        try {
            // Правильные данные, перевод выполнится
            bank.send("1234567890123456", 1000.0);

            // Неправильно введен номер карты
            //bank.send("123456789012345j", 1000.0);

            // Перевод на заблокированную карту
            //bank.send("1111111111111111", 1000.0);

            // Отрицательная сумма перевода
            //bank.send("1234567890123456", -1000.0);

            // Превышен лимит
            //bank.send("1234567890123456", 60000.0);

            // Один из аргументов равен null
            //bank.send(null, 1000.0);
        } catch (BankOnlineException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch
        (NullPointerException e) {
            System.out.println("Ошибка: один из аргументов равен null!");
        }
    }
}