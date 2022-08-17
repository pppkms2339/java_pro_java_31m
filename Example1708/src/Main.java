public class Main {

    public static void main(String[] args) {
        Double[] array1 = {0.1, 0.2};
        Integer[] array2 = {1, 2};
        Test<Double> test1 = new Test<>(array1);
        System.out.println(test1.avg());
        Test<Integer> test2 = new Test<>(array2);
        System.out.println(test2.avg());
    }

}
