package generics.Task3;

// Исключение для невалидного запроса
class InvalidRequestException extends RuntimeException {
    public InvalidRequestException(String message) {
        super(message);
    }
}
