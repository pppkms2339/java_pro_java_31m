public class Dog extends Animal {

    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name) {
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
        if (distance > MAX_SWIM_DISTANCE) {
            System.out.println(getName() + " not swim " + distance);
        } else {
            System.out.println(getName() + " swim " + distance);
        }
    }

}
