import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) != list.get(i + 1)) {
                list.set(count, list.get(i + 1));
                count++;
            }
        }
        System.out.println(list);
        System.out.println(count);
        System.out.println(list.subList(0, count));
    }

}

