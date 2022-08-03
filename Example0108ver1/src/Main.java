public class Main {

    public static void main(String[] args) {
        Test obj1 = new Test(1, 2);
        Test obj2 = new Test(1, 2);
        Test obj3 = new Test(2, 3);

        System.out.println(obj1.equalTo(obj2));
        System.out.println(obj1.equalTo(obj3));
        //System.out.println(obj1 == obj2);

        // Клонируем объект obj1. obj4 - клон obj1
        Test obj4 = obj1.copy();
    }

}
