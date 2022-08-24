import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Barsik"));
        cats.add(new Cat("Murzik"));
        Cat cat3 = new Cat("Qwerty");
        cats.add(cat3);
        cats.add(new Cat("Asdf"));

        System.out.println(cats);

        // Цикл с параметром
        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getId() == "Barsik") {
                cats.remove(i);
            }
        }

        System.out.println(cats);

        // Цикл for-each
        // Exception in thread "main" java.util.ConcurrentModificationException
        // Нельзя проводить одновременно перебор коллекции и изменение ее элементов
//        for (Cat cat : cats) {
//            if (cat.getId() == "Murzik") {
//                cats.remove(cat);
//            }
//        }
        // Ситуация тут аналогичная
//        for (Cat cat : cats) {
//            cats.add(new Cat("New cat"));
//        }
        // Как решить с удалением?
        Cat deletedCat = null;
        for (Cat cat : cats) {
            if (cat.getId() == "Murzik") {
                deletedCat = cat;
                break;
            }
        }
        cats.remove(deletedCat);

        System.out.println(cats);

        // Решение № 2 - копия всей коллекции (итерация по одной коллекции, а
        // удаление во второй)
        ArrayList<Cat> copyCats = new ArrayList<>(cats);
        for (Cat cat : copyCats) {
            if (cat.getId() == "Asdf") {
                cats.remove(cat);
            }
        }

        System.out.println(cats);

    }
}
