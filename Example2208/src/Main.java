public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        Stack<Employee> stack1 = new Stack<>();
        stack1.push(new Employee());

        // Level2
        System.out.println(Calculator.sum(12, 3.14));
        System.out.println(Calculator.sum((short)1, (long)2));
        System.out.println(Calculator.multiply(1, 2));
    }

}
