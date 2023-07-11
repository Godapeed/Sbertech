package lambdas;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Создаем список и добавляем экземпляры классов
        List<Sounding> soundings = new ArrayList<>();
        soundings.add(new Cat());
        soundings.add(new Dog());

        // Вызываем метод sound() у всех объектов в списке
        for (Sounding sounding : soundings) {
            sounding.sound();
        }

        // Добавляем анонимный класс в список и вызываем метод sound()
        soundings.add(new Sounding() {
            @Override
            public void sound() {
                System.out.println("Moo");
            }
        });

        // Добавляем лямбда-функцию в список и вызываем метод sound()
        soundings.add(() -> System.out.println("Quack"));

        // Добавляем ссылки на методы класса, не реализующего интерфейс, в список и вызываем метод sound()
        soundings.add(Main::lionSound);
        soundings.add(Main::elephantSound);

        // Вызываем метод sound() у всех объектов в списке с использованием forEach
        soundings.forEach(Sounding::sound);
    }

    private static void lionSound() {
        System.out.println("Roar");
    }

    private static void elephantSound() {
        System.out.println("Trumpet");
    }
}
