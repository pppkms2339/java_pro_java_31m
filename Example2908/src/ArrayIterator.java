import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private T[] array;     // массив, по которому идет итератор
    private int index = 0;  // текущее положение итератора

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
        if (index < array.length) {
            return array[index++];

        } else {
            System.out.println("No such element!");
            return null;
        }
    }

    @Override
    public void remove() {
        // реализовать свою логику удаления из массива
        int i = index - 1;
        array[i] = null;
    }
}
