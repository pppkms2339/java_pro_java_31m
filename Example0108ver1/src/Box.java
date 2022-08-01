public class Box {

    double width;
    double height;
    double depth;

    // Вычислить и вернуть объем параллелепипеда
    double volume() {
        return width * height * depth;
    }

    // Установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

}
