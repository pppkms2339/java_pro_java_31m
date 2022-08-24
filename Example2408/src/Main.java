import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Barsik"));
        cats.add(new Cat("Murzik"));
        Cat cat3 = new Cat("Qwerty");
        cats.add(cat3);
        cats.add(new Cat("Asdf"));

        //cats.remove(cat3.getName());    //cats.remove("Qwerty");

        System.out.println(cats);
        System.out.println("size = " + cats.size());

        cats.remove(1); // Удаление объекта по индексу в этой коллекции

        System.out.println(cats);
        System.out.println("size = " + cats.size());

        cats.remove(cat3);  // Удаление объекта по имени объекта

        System.out.println(cats);
        System.out.println("size = " + cats.size());

    }
}
