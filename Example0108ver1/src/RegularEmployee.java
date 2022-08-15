public class RegularEmployee extends Employee {

    private double bonus;

    public RegularEmployee(String fio, String post, double salary, Department department) {
        super(fio, post, salary, department);
    }

    @Override
    public double calculateSalary() {
        return super.getSalary() + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
