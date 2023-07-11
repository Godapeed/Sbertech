package generics.Task1;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static <T extends Number> int countEvenElements(Collection<T> collection) {
        int count = 0;
        for (T element : collection) {
            if (element.intValue() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int evenCount = countEvenElements(numbers);
        System.out.println("Число четных элементов: " + evenCount);
    }
}