package employees;

import java.util.List;

public class Employee {
    String name;
    String department;
    String role;
    double salary;
    List<String> skills;

    public Employee() {
    }

    public Employee(String name, String department, String role, double salary, List<String> skills) {
        this.name = name;
        this.department = department;
        this.role = role;
        this.salary = salary;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
