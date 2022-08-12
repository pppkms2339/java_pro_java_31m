public class Main {

    public static void main(String[] args) {
        Apple ap = Apple.Winesap;

        for (Apple apple : Apple.values()) {
            System.out.println(apple.name());
        }

        ErrorCode errorCode = ErrorCode.Error1;
        System.out.println(errorCode.getEngDesc());
        
    }

}
