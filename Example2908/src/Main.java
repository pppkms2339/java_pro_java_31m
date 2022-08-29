import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5000000; i++) {
            list.add(Integer.valueOf(i));
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            list.add(2000000, Integer.valueOf(i));
        }
        System.out.println("Time LinkedList: " + (System.currentTimeMillis() - start));

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5000000; i++) {
            list2.add(Integer.valueOf(i));
        }
        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            list2.add(2000000, Integer.valueOf(i));
        }
        System.out.println("Time ArrayList: " + (System.currentTimeMillis() - start));
    }

}
