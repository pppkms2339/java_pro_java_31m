import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Barsik"));
        cats.add(new Cat("Murzik"));
        Cat cat3 = new Cat("Qwerty");
        cats.add(cat3);
        cats.add(new Cat("Asdf"));

        System.out.println(cats);

        // Получение итератора
        Iterator<Cat> catIterator = cats.iterator();
        while (catIterator.hasNext()) {
            Cat cat = catIterator.next();  // получение очередного кота
            if (cat.getId() == "Barsik") {
                //cats.remove(cat);
                catIterator.remove();
            }
        }

        System.out.println(cats);

        // Использование ListIterator-а
        ListIterator<Cat> listIterator = cats.listIterator(cats.size() - 1);
        while (listIterator.hasPrevious()) {
            Cat cat = listIterator.previous();
            cat.setId("ehfe;adhf;adhf");
            listIterator.set(cat);
        }

    }
}
