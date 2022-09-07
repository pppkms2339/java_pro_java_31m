public class Person implements Comparable<Person> {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        // сравнивается объекты this и o
        // если возвращается число < 0, то this "меньше" o
        // если возвращается число > 0, то this "больше" o
        // если возвращается число = 0, то this равен o

        // Сравнение лексикографически по полю mame
        return name.compareTo(o.name);

        // Другое правило сравнения - по длине строк в поле name
//        if (name.length() < o.name.length()) {
//            return -1;
//        }
//        if (name.length() > o.name.length()) {
//            return 1;
//        } else {
//            return 0;
//        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
