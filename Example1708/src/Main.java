public class Main {

    public static void main(String[] args) {
        TwoGen<Integer, String> a = new TwoGen<>(12, "qwerty");
        a.showTypes();
    }

}
