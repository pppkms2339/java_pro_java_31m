public class Box {

    double width;
    double height;
    double depth;

    // Это конструктор класса Box
    Box() {
        System.out.println("Constructor of class Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // Вычислить и вернуть объем параллелепипеда
    double volume() {
        return width * height * depth;
    }

}
