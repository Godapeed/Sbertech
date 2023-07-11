package streams;

import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        // Задача 1: Отсортировать все двузначные элементы
        Stream<Integer> intStream = Stream.of(23, 45, 12, 67, 99, 10, 58, 76, 33, 88);
        List<Integer> sortedInts = intStream.filter(i -> i >= 10 && i <= 99).sorted().collect(Collectors.toList());
        System.out.println("Отсортированные двузначные элементы: " + sortedInts);

        // Задача 2: Найти среднее значение
        Stream<Integer> intStream2 = Stream.of(23, 45, 12, 67, 99, 10, 58, 76, 33, 88);
        OptionalDouble average = intStream2.mapToInt(Integer::intValue).average();
        System.out.println("Среднее значение: " + average.getAsDouble());

        // Задача 3: Создать Stream из String-ов
        Stream<String> stringStream = Stream.of("apple", "banana", "orange", "grape", "mango");

        // Преобразуем в Stream из StreamContainer
        Stream<StreamContainer> streamContainerStream = stringStream.map(s -> new StreamContainer(s, new Random().nextLong()));

        // Выводим значение каждого элемента
        streamContainerStream.forEach(container -> System.out.println("Name: " + container.getName() + ", Count: " + container.getCount()));

        // Преобразуем Stream в Map
        Stream<String> stringStream2 = Stream.of("apple", "banana", "orange", "grape", "mango");
        Map<Long, String> map = stringStream2.collect(Collectors.toMap(s -> new Random().nextLong(), s -> s));
        System.out.println(map);

        // Создаем Map<String, List>
        Map<String, List<String>> mapWithList = new HashMap<>();
        mapWithList.put("Fruits", Arrays.asList("apple", "banana", "orange"));
        mapWithList.put("Vegetables", Arrays.asList("carrot", "potato"));
        mapWithList.put("Colors", Arrays.asList("red", "green", "blue"));

        // Приводим Map к единому Stream-у StreamContainer
        Stream<StreamContainer> containerStream = mapWithList.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream().map(value -> new StreamContainer(value, entry.getKey().hashCode())));

        // Создаем список из всех StreamContainer-ов и считаем количество элементов
        List<StreamContainer> containerList = containerStream.collect(Collectors.toList());
        long count = containerList.stream().count();
        System.out.println("Количество элементов: " + count);

        // Создаем String из 1 и 0
        String binaryString = "1001010101";

        // Преобразуем строку в Stream из Boolean-ов
        Stream<Boolean> booleanStream = binaryString.chars().mapToObj(c -> c == '1');

        // При помощи reduce() просчитываем конечный результат через "И"
        boolean result = booleanStream.reduce(true, (b1, b2) -> b1 && b2);
        System.out.println("Результат через \"И\": " + result);
    }
}
