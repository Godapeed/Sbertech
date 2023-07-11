package generics.Task3;

// Валидатор для ответа
class ResponseValidator implements Validator<Response> {
    public boolean validate(Response response) {
        // Валидация ответа
        return true; // Реализовать реальную логику валидации
    }
}