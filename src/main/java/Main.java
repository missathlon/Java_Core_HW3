import employees.Employee;
import employees.Manager;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Dmitrii", 28000);
        employees[1] = new Manager("Regina", 36000);
        employees[2] = new Employee("Viktor", 26500);

        double salaryIncrease = 1500;
        Employee.increaseSalary(employees, salaryIncrease);

        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }
    }
}