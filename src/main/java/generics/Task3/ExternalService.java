package generics.Task3;

import java.util.function.Predicate;

// Класс для взаимодействия с внешним сервисом
class ExternalService<TRequest, TResponse> {
    private Validator<TRequest> requestValidator;
    private Validator<TResponse> responseValidator;

    public ExternalService(Validator<TRequest> requestValidator, Validator<TResponse> responseValidator) {
        this.requestValidator = requestValidator;
        this.responseValidator = responseValidator;
    }

    // Метод для выполнения операций с внешним сервисом
    public TResponse execute(TRequest request) {
        if (!requestValidator.validate(request)) {
            throw new InvalidRequestException("Невалидный запрос");
        }

        // Взаимодействие с внешним сервисом

        TResponse response = null; // Вернуть реальный результат взаимодействия

        if (!responseValidator.validate(response)) {
            throw new InvalidResponseException("Невалидный ответ");
        }

        return response;
    }
}
