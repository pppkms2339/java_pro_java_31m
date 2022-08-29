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
    }

}
