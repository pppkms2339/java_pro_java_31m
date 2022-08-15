public abstract class Employee {

    private String fio;

    private String post;

    private double salary;

    private Department department;

    public Employee(String fio, String post, double salary, Department department) {
        this.fio = fio;
        this.post = post;
        this.salary = salary;
        this.department = department;
        this.department.setEmployeesCount(this.department.getEmployeesCount() + 1);
    }

    public abstract double calculateSalary();

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
