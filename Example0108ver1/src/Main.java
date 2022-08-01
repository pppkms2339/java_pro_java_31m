public class Main {

    public static void main(String[] args) {
        Box myBox = new Box();  // создать объект myBox класса Box
        double volume;

        // Присвоить значения переменным экземпляра (полям) myBox
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        // Рассчитать объем параллелепипеда
        volume = myBox.width * myBox.height * myBox.depth;

        System.out.println("Volume = " + volume);
    }

}
