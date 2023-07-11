package generics.Task3;

// Валидатор для запроса
class RequestValidator implements Validator<Request> {
    public boolean validate(Request request) {
        // Валидация запроса
        return true; // Реализовать реальную логику валидации
    }
}