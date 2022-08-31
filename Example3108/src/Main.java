import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Ferrari", 300);
        Car car2 = new Car("Ferrari", 300);
        System.out.println(car1 == car2);
        // == сравнивает не свойства объектов, а их ссылки
        Man man1 = new Man(1111222233);
        Man man2 = new Man(222233);
        Man man3 = new Man(1111222233);
        ArrayList<Man> mans = new ArrayList<>();
        mans.add(man1);
        mans.add(man2);
        if(mans.contains(man3)) {
            System.out.println("Contains");
        } else {
            System.out.println("Not contains");
        }
        // Сравнение строк
        String s1 = "Tel Ran";
        String s2 = "Tel Ran";
        System.out.println(s1 == s2);
        String s3 = new String("Tel Ran");
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }

}
