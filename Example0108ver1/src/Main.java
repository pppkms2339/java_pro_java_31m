public class Main {

    public static void main(String[] args) {
        // В иерархии классов закрытые члены
        // остаются закрытыми в пределах своего класса.
        B subB = new B();
        subB.setij(10, 12);

        subB.sum();
        System.out.println("Sum = " + subB.total);
    }

}
