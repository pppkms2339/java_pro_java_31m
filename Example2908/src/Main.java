import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);   // добавление в конец списка
        list.addFirst(10);
        list.addLast(30);
        list.add(1, 15);    // добавление в указанный индекс
        for (Integer i : list) {
            System.out.println(i);
        }
        list.remove();  // удаление с конца

    }

}
