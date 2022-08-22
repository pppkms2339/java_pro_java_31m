import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {

    public static final int CATS_COUNT = 12;

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        for (int i = 0; i < CATS_COUNT; i++) {
            cats.add(new Cat("Cat N " + i));
        }

        // Итерации по коллекции
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i).getName());
        }
        System.out.println();
        // С помощью цикла for-each
        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }
        System.out.println();
        // С помощью итератора
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        // Поиск и удаление элемента с помощью цикла по индексам
        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getName().equals("Cat N 5")) {
                cats.remove(i);
            }
        }
        System.out.println(cats);
        // Поиск и удаление элемента с помощью цикла for-each
        for (Cat cat : cats) {
            if (cat.getName().equals("Cat N 4")) {
                cats.remove(cat);
            }
        }
        System.out.println(cats);
    }

}
