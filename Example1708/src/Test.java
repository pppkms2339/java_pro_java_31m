public class Test<T extends Number> {

    // Параметр Т может быть заменен только указанным суперклассом (Number)
    // или его подклассами

    private T[] nums;

    public Test(T[] nums) {
        this.nums = nums;
    }

    // Среднее значение чисел массива nums
    public double avg() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i].doubleValue();
        }
        return sum / nums.length;
    }
}
