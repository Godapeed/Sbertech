package generics.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void swapElements(List<?> list, int index1, int index2) {
        swapHelper(list, index1, index2);
    }

    private static <T> void swapHelper(List<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");

        System.out.println("До замены: " + strings);
        swapElements(strings, 0, 1);
        System.out.println("После замены: " + strings);

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(33);
        System.out.println("До замены: " + integers);
        swapElements(integers, 0, 1);
        System.out.println("После замены: " + integers);
    }
}
