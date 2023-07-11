package generics.Task3;

// Исключение для невалидного ответа
class InvalidResponseException extends RuntimeException {
    public InvalidResponseException(String message) {
        super(message);
    }
}
