package functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class MaxSalaryAvgSalary {

    /**
     *
     * .stream() creates a stream of employees.
     * .mapToDouble(Employee::getSalary) converts the stream to a DoubleStream of salaries.
     * .max() and .average() are terminal operations to get the results.
     * .orElse(0.0) handles the case when the list is empty.
     *
     */
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("John", 70000),
                new Employee("Jane", 85000),
                new Employee("David", 55000),
                new Employee("Emma", 92000)
        );

        // ✅ Maximum Salary
        double maxSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .max()
                .orElse(0.0); // default if list is empty

        // ✅ Average Salary
        double avgSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0); // default if list is empty

        System.out.println("Maximum Salary: " + maxSalary);
        System.out.println("Average Salary: " + avgSalary);

    }
}

class Employee {
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
