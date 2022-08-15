public class Main {

    public static void main(String[] args) {
        Company company = new Company("TelRan");

        Department department = new Department("IT", company);

//        Employee employee = new Employee();

        ContractEmployee ce1 = new ContractEmployee("John", "post1", 123.1, department);
        ContractEmployee ce2 = new ContractEmployee("Ann", "post2", 1234.1, department);
        RegularEmployee re1 = new RegularEmployee("Victor", "post3", 456.7, department);
        RegularEmployee re2 = new RegularEmployee("Helen", "post4", 4567.7, department);

        System.out.println(department.getEmployeesCount());

        re1.setBonus(1000);
        re2.setBonus(1000);

        Employee[] employees = {ce1, ce2, re1, re2};
        for (Employee e : employees) {
            System.out.println("name: " + e.getFio() + ", salary: " + e.calculateSalary());
        }
    }

}
