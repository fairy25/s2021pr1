package tut7;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee e = new Employee("Harry Jones", 1800);
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        e.raiseSalary(8); // raise salary by 8%
        System.out.println(e.getSalary());
    }
}
