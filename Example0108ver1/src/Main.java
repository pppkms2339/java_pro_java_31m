public class Main {

    public static void main(String[] args) {
        ColorPoint pt = new ColorPoint();
        System.out.println(pt);

        ColorPoint pt2 = new ColorPoint(1.0, 2.4, -12, 260, 45);
        System.out.println(pt2);

        pt2.setR(123);
        pt2.setG(56);
        pt2.setB(200);
        System.out.println(pt2);
    }

}
