public class A {
    int i, j;

    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    // Перегруженный конструктор
    public A() {
        this.i = 0;
        this.j = 0;
    }

    void show() {
        System.out.println("i = " + i + ", j = " + j);
    }

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}
