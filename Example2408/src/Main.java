import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Barsik"));
        cats.add(new Cat("Murzik"));
        Cat qwerty = new Cat("Qwerty");
        cats.add(qwerty);
        cats.add(new Cat("Asdf"));

        System.out.println(cats);
        System.out.println("size = " + cats.size());

        cats.remove(1);

        System.out.println(cats);
        System.out.println("size = " + cats.size());

        cats.remove(qwerty);

        System.out.println(cats);
        System.out.println("size = " + cats.size());

    }
}
