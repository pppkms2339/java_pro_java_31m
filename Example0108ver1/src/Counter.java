public class Counter {
    // Описать класс, реализующий десятичный счетчик, который может увеличивать
    // или уменьшать свое значение на единицу в заданном диапазоне. Предусмотреть
    // инициализацию счетчика значениями по умолчанию и произвольными значениями.
    // Счетчик имеет два метода: увеличения и уменьшения, и свойство, позволяющее
    // получить его текущее состояние.

    private int count;
    private final int a, b;

    public Counter() {
        count = 0;
        a = -10;
        b = 10;
    }

    public Counter(int count, int a, int b) {
        this.count = count;
        this.a = a;
        this.b = b;
    }

    public void plus() {
        if (count >= b) {
            count = b;
            return;
        }
        count++;
    }

    public void minus() {
        if (count <= a) {
            count = a;
            return;
        }
        count--;
    }

    public int getCount() {
        return count;
    }

}
