package exceptions;

// Класс-исключение для неправильно введенной карты
class InvalidCardException extends BankOnlineException {
    public InvalidCardException() {
        super("Неправильно введен номер карты!");
    }
}
