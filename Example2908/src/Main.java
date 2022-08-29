import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Iterator<Integer> integerIterator = list.iterator();

        Integer[] integerArray = {10, 20, 3, -4, -5};
        ArrayIterator<Integer> arrayIterator = new ArrayIterator<>(integerArray);
        while (arrayIterator.hasNext()) {
            int value = arrayIterator.next();
            if (value == 3) {
                arrayIterator.remove();
            }
        }
        System.out.println(Arrays.toString(integerArray));

        // Создание итератора для строкового массива
        ArrayIterator<String> arrayIterator2 = new ArrayIterator<>(new String[]{"qwerty", "asdf"});

        // Тестирование второго способа
        Iterator<Integer> arrayIterator3 = getIterator(integerArray);
        while (arrayIterator3.hasNext()) {
            //...
        }
    }

    // Реализация с помощью обобщенного метода, возвращающего Iterator
    private static <T> Iterator<T> getIterator(T[] array) {
        return new Iterator<T>() {

            private int count = array.length;;
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public T next() {
                if (index < count) {
                    return array[index++];

                } else {
                    System.out.println("No such element!");
                    return null;
                }
            }
        };
    }

}
