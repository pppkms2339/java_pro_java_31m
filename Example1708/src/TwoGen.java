public class TwoGen<T, V> {

    T obj1;
    V obj2;

    public TwoGen(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    void showTypes() {
        System.out.println("Type T: " + obj1.getClass().getName());
        System.out.println("Type V: " + obj2.getClass().getName());
    }

}
