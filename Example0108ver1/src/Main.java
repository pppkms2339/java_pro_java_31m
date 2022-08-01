public class Main {

    public static void main(String[] args) {
        Box myBox1 = new Box();  // создать первый объект myBox класса Box
        Box myBox2 = new Box();  // создать второй объект myBox класса Box
        double volume;

        // Присвоить значения переменным экземпляра (полям) myBox1
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        // Присвоить значения переменным экземпляра (полям) myBox2
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // Рассчитать объем первого параллелепипеда
        volume = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println("Volume = " + volume);

        // Рассчитать объем второго параллелепипеда
        volume = myBox2.width * myBox2.height * myBox2.depth;
        System.out.println("Volume = " + volume);
    }

}
