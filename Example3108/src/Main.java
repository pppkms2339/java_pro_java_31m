import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(rotateList(list, 2));
    }

    private static List<Integer> rotateList(List<Integer> list, int k) {
        if (k == 0) {
            return list;
        }
        int length = list.size();
        List<Integer> result = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            result.add(k % length, list.get(i));
            k++;
        }
        return result;
    }

}
