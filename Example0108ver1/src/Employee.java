public class Employee {

    String fullName;
    String post;    // должность
    String email;
    String phoneNumber;
    double salary;
    int age;

    Employee(String fullName, String post, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void printInfo() {
        System.out.println(fullName);
        System.out.println(post);
        System.out.println(email);
        System.out.println(phoneNumber);
        System.out.println(salary);
        System.out.println(age);
    }
}
