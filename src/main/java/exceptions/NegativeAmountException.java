package exceptions;

// Класс-исключение для отрицательной суммы перевода
class NegativeAmountException extends BankOnlineException {
    public NegativeAmountException() {
        super("Сумма перевода не может быть отрицательной!");
    }
}
