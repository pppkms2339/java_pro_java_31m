public class ContractEmployee extends Employee {

    public ContractEmployee(String fio, String post, double salary, Department department) {
        super(fio, post, salary, department);
    }

    @Override
    public double calculateSalary() {
        return super.getSalary();
    }
}
