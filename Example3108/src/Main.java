import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        List<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        list2.add(6);
        list2.add(9);
        List<Integer> list3 = new LinkedList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                list3.add(list1.get(i));
                i++;
            } else {
                list3.add(list2.get(j));
                j++;
            }
        }
        if (i < list1.size()) {
            // В первом списке остались элементы, копируем их
            list3.addAll(list1.subList(i, list1.size()));
//            while (i < list1.size()) {
//                list3.add(list1.get(i));
//                i++;
//            }
        }
        if (j < list2.size()) {
            // Во втором списке остались элементы, копируем их
            list3.addAll(list2.subList(j, list2.size()));
//            while (j < list2.size()) {
//                list3.add(list2.get(j));
//                j++;
//            }
        }
        System.out.println(list3);
    }

}
