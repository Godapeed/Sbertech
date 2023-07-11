package generics.Task3;

public class Main {
    public static void main(String[] args) {
        Validator<Request> requestValidator = new RequestValidator();
        Validator<Response> responseValidator = new ResponseValidator();

        ExternalService<Request, Response> service = new ExternalService<>(requestValidator, responseValidator);

        // Выполнение запроса к внешнему сервису
        Request request = new Request();

        Response response = service.execute(request);
        // Дальнейшая обработка ответа
    }
}
