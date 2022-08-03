public class Main {
    
    public static void main(String[] args) {
        Test obj = new Test();

        // Эти операторы правильны, поэтому члены a и b
        // данного класса доступны непосредственно
        obj.a = 10;
        obj.b = -20;

        // Этот оператор неверен и может вызывать ошибку
//        obj.c = 100;  // попытка установить значение - ошибка
//        System.out.println(obj.c);  // попытка получить значение и вывести - ошибка

        obj.setC(-100);
        System.out.println(obj.getC());

        double r = 12.0;
        final double pi = 3.14;
        double s = pi * r * r;
        //pi = 45;  // Ошибка
        double s2 = pi * r * r;
    }

}
