package exceptions;

public class BankOnline {
    private static final String[] blockedCards = {
            "1111111111111111",
            "2222222222222222",
            "3333333333333333"
    };
    public void send(String cardNumber, Double money) throws BankOnlineException {
            if (cardNumber == null || money == null) {
                throw new NullPointerException("Аргументы не могут быть null!");
            }

            if (!cardNumber.matches("\\d{16}")) {
                throw new InvalidCardException();
            }

            if (isCardBlocked(cardNumber)) {
                throw new BlockedCardException();
            }

            if (money < 0) {
                throw new NegativeAmountException();
            }

            if (money > 50000) {
                throw new ExceedLimitException();
            }

            // Реализация метода send
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
