package exceptions;

public class BankOnline {
    public String str;
    private static final String[] blockedCards = {
            "1111111111111111",
            "2222222222222222",
            "3333333333333333"
    };
    public void send(String cardNumber, Double money) throws BankOnlineException {
            if (cardNumber == null || money == null) {
                str = "один из аргументов равен null!";
                throw new NullPointerException("Аргументы не могут быть null!");
            }

            if (!cardNumber.matches("\\d{16}")) {
                str = "Неправильно введен номер карты!";
                throw new InvalidCardException();
            }

            if (isCardBlocked(cardNumber)) {
                str = "Перевод на заблокированную карту запрещен!";
                throw new BlockedCardException();
            }

            if (money < 0) {
                str = "Сумма перевода не может быть отрицательной!";
                throw new NegativeAmountException();
            }

            if (money > 50000) {
                str = "Превышен лимит перевода (50 000)!";
                throw new ExceedLimitException();
            }

            // Реализация метода send
            str = "Перевод успешно выполнен!";
            System.out.println("Перевод успешно выполнен!");
        }

        private boolean isCardBlocked(String cardNumber) {
            for (String blockedCard : blockedCards) {
                if (blockedCard.equals(cardNumber)) {
                    return true;
                }
            }
            return false;
        }
}
