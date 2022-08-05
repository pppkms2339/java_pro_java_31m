import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        test(10);
        System.out.println();
        test(1, 2, 3);
        System.out.println();
        test();
        System.out.println(Arrays.toString(args));
    }

    private static void test(int... v) {
        System.out.println("length = " + v.length);
        for (int p : v) {
            System.out.println(p);
        }
    }

}
