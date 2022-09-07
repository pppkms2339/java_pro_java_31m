public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 10.0;
        p1.y = 11.5;
        System.out.println(p1.hashCode());
        Point p2 = new Point();
        p2.x = 10.0;
        p2.y = 11.5;
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        double x = 4.0;
        double y = 4.00000000000001;
        if (x == y) {
            System.out.println("x = y");
        } else {
            System.out.println("x != y");
        }
        // 3.14  3.1415926
        if (Math.abs(x - y) <= 0.0001) {
            System.out.println("x = y");
        } else {
            System.out.println("x != y");
        }

    }
}
