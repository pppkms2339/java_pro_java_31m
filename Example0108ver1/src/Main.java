public class Main {

    public static void main(String[] args) {
        // Перегрузка методов - это одна из реализаций полиморфизма
        Overload obj = new Overload();
        obj.test();
        obj.test(1);
        obj.test(1, 2);
        obj.test(3.14);
    }

}
