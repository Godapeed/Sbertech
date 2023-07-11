package exceptions;

// Класс-исключение для всех исключений BankOnline
class BankOnlineException extends Exception {
    public BankOnlineException(String message) {
        super(message);
    }
}
