package generics.Task3;

// Интерфейс валидатора
interface Validator<T> {
    boolean validate(T object);
}
