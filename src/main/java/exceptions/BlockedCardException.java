package exceptions;

// Класс-исключение для заблокированных карт
class BlockedCardException extends BankOnlineException {
    public BlockedCardException() {
        super("Перевод на заблокированную карту запрещен!");
    }
}
