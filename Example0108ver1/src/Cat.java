public class Cat extends Animal {

    private static final int MAX_RUN_DISTANCE = 200;

    public Cat(String name) {
        super(name);
    }

    public void run(int distance) {
        if (distance > MAX_RUN_DISTANCE) {
            System.out.println(getName() + " not run " + distance);
        } else {
            System.out.println(getName() + " run " + distance);
        }
    }

    public void swim(int distance) {
        System.out.println(getName() + " not swim");
    }
}
