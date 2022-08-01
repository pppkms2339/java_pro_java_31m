public class Main {

    public static void main(String[] args) {
        Box myBox1 = new Box();  // создать первый объект myBox класса Box
        Box myBox2 = new Box();  // создать второй объект myBox класса Box
        double volume;

        // Инициализировать каждый экземпляр класса Box
        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        // Получить объем первого параллелепипеда
        volume = myBox1.volume();
        System.out.println("Volume = " + volume);

        // Получить объем второго параллелепипеда
        volume = myBox2.volume();
        System.out.println("Volume = " + volume);
    }

}
