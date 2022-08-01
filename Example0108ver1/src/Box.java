public class Box {

    double width;
    double height;
    double depth;

    // Это конструктор класса Box
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Вычислить и вернуть объем параллелепипеда
    double volume() {
        return width * height * depth;
    }

}
