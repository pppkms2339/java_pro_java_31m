public class Main {

    public static void main(String[] args) {
        String[] array1 = {"qwerty", "asd"};
        Integer[] array2 = {1, 2, 3, 4, 5};
        print(array1);
        print(array2);
    }

    public static <T> void print(T[] items) {
        for(T item : items) {
            System.out.println(item);
        }
    }

}
