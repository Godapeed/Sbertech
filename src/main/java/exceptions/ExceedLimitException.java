package exceptions;

// Класс-исключение для превышения лимита
class ExceedLimitException extends BankOnlineException {
    public ExceedLimitException() {
        super("Превышен лимит перевода (50 000)!");
    }
}