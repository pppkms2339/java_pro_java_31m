public class Test {

    int a, b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Возвратить логическое значение true, если в качестве параметра
    // передан метод со значениями полей, равными текущему объекту
    boolean equalTo(Test obj) {
        return obj.a == a && obj.b == b;
    }
}
