public class B extends A {

    int i;  //этот член скрывает член i из класса А

    B(int a, int b) {
        super.i = a;    // член i из класса А инициализирован переменной a
        i = b;  // член i из класса B инициализирован переменной b
    }

    void show() {
        System.out.println("i from superclass " + super.i);
        System.out.println("i from subclass " + i);
    }

}
