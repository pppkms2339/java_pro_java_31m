public class Main {

    public static void main(String[] args) {
        // Объявить, выделить память и инициализировать объекты класса Box
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double volume;

        // Получить объем первого параллелепипеда
        volume = myBox1.volume();
        System.out.println("Volume = " + volume);

        // Получить объем второго параллелепипеда
        volume = myBox2.volume();
        System.out.println("Volume = " + volume);
    }

}
