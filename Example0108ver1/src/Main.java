public class Main {

    public static void main(String[] args) {
        // Объявить, выделить память и инициализировать объекты класса Box
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);

        // Создание массива объектов класса Box и вывод объема каждого из
        // параллелепипедов в цикле
        Box[] boxes = {myBox1, myBox2};
        for (int i = 0; i < boxes.length; i++) {
            System.out.println("Volume = " + boxes[i].volume());
        }
    }

}
