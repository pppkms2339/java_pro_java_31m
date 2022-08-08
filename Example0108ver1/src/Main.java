public class Main {

    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 30, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.075);
        double volume;

        volume = myBox1.volume();
        System.out.println("volume of box1 = " + volume);

        volume = myBox2.volume();
        System.out.println("volume of box2 = " + volume);

        //---------------------
        Box box;
        // переменная из суперкласса может ссылаться на объект подкласса
        box = myBox1;
        volume = box.volume();  // верно, так как метод volume определен
        // в классе Box
        // Следующий оператор ошибочен, так как weight не определен в Box
//        System.out.println("weight = " + box.weight);

        // Правило!!!
        // Доступные члены класса определяются типом ссылочной
        // переменной, а не типом объекта, на который она ссылается

    }

}
