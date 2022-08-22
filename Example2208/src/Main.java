import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(100);

        ArrayList<Cat> cats = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            cats.add(new Cat(Integer.toString(i)));
        }
        Cat catLast = new Cat("Cat");
        // Добавляются новые элементы в ArrayList по умолчанию всегда в конец
        cats.add(catLast);
        // Вывод на экран индекса объекта Cat
        System.out.println(cats.indexOf(catLast));

        Cat catFirst = new Cat("Qwerty");
        cats.add(0, catFirst);


        // Проверим, что catFirst имеет индекс 0, а catLast - 13
        System.out.println(cats.indexOf(catFirst));
        System.out.println(cats.indexOf(catLast));

        // Размер коллекции
        System.out.println(cats.size());

        // Получим catLast по индексу
        Cat catFromCollection = cats.get(13);
        System.out.println(catFromCollection);

        // Проверка наличия объекта в коллекции
        System.out.println(cats.contains(catLast));

        // Изменение элемента коллекции
        cats.set(0, catLast);
        //System.out.println(Arrays.toString(cats.toArray()));
        System.out.println(cats);

        // Удаление элементов коллекции (остальные элементы сдвигаются циклически)
        cats.remove(0); // удаление по индексу
        cats.remove(catLast);   // удаление объекта
        System.out.println(cats);

        cats.set(5, null);
        System.out.println(cats);
        System.out.println(cats.get(5));

        // Очищаем список
        cats.clear();
        System.out.println(cats);
    }

}
