public class Box {

    double width;
    double height;
    double depth;

    // Это конструктор класса Box
    Box(double w, double h, double d) {
        System.out.println("Constructor of class Box");
        width = w;
        height = h;
        depth = d;
    }

    // Вычислить и вернуть объем параллелепипеда
    double volume() {
        return width * height * depth;
    }

}
