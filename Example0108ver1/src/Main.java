public class Main {

    public static void main(String[] args) {
        Calculation c = new Calculation();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1, 2, 3));
    }

}

class Calculation implements Calculatable { }
