import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", "HR", 60000),
            new Employee("Bob", "Engineering", 120000),
            new Employee("Charlie", "HR", 70000),
            new Employee("Dave", "Engineering", 130000),
            new Employee("Eve", "Marketing", 90000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));

        System.out.println(avgSalaryByDept);
        
    }
}