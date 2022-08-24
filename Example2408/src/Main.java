import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik"),
                new Cat("Murzik"),
                new Cat("Qwerty"),
                new Cat("Asdf")};
        System.out.println(Arrays.toString(cats));
        cats[1] = null;
        System.out.println(Arrays.toString(cats));
        for (int i = 2; i < cats.length; i++) {
            cats[i - 1] = cats[i];
            cats[i] = null;
        }
        System.out.println(Arrays.toString(cats));
    }

    private void deleteCat(Cat[] cats, int deleteIndex) {
        
    }
}
