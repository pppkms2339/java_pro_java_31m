public class Box {

    double width;
    double height;
    double depth;

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Конструктор, который "делает" куб
    Box(double len) {
        width = len;
        height = len;
        depth = len;
    }
}
