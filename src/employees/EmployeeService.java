package employees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class EmployeeService {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp = new Employee("Zkp","IT", "Software Engineer",1300000, Arrays.asList("Java", "AWS"));
        Employee emp2 = new Employee("Ashish","IT", "Software Engineer",1500000, Arrays.asList("GCP", "Spring Boot"));
        Employee emp3 = new Employee("Ash","IT", "Senior Engineer",1700000, Arrays.asList("Azure", "Microservices", "Java"));
        employees.add(emp);
        employees.add(emp2);
        employees.add(emp3);
        findAverageSalary(employees);
        findEmployeesStartswith(employees);
        findListofAllskills(employees);
        sortBySalary(employees);
    }

    private static void sortBySalary(List<Employee> employees) {
        List<Employee> result = employees.stream()
                .sorted(Comparator.comparing(Employee :: getSalary).reversed())
                .toList();
        System.out.println(result);
    }

    private static void findListofAllskills(List<Employee> employees) {
        List<String> skills = employees.stream().map(e -> e.getSkills())
                .flatMap(list -> list.stream())
                .distinct()
                .collect(Collectors.toList());
    }

    private static void findEmployeesStartswith(List<Employee> employees) {
        List<Employee> result = employees.stream().filter(e -> e.getName().startsWith("A")).toList();
        System.out.println(result);
    }

    private static void findAverageSalary(List<Employee> employees) {
        double averageSalary = employees.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .filter(e -> e.getRole().equals("Senior Engineer"))
                .mapToDouble(Employee::getSalary)
                .average().orElse(0.0);

        System.out.println(averageSalary);
    }


}
