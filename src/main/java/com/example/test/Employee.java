package com.example.test;

import java.util.List;
import java.util.Objects;

public class Employee {

    private String eName;
    private Double eSal;
    private String role;
    private int eAge;
    private String eDept;
    private List<String> skills;

    public Employee() {
    }

    public static List<Employee> getEmployeeDefaultData() {
        Employee emp1 = new Employee("Akhil", 1000.0, "Developer", 29, "IT", List.of("java", "springboot", "AWS", "kafka"));
        Employee emp2 = new Employee("Somesh", 900.0, "Developer", 29, "IT", List.of("javascript", "spring", "junit", "tesing"));
        Employee emp3 = new Employee("Hari", 1100.0, "Tester", 29, "Testing", List.of("medical", "phone", "money", "java"));
        return List.of(emp1, emp2, emp3);
    }


    public Employee(String eName, Double eSal, String role, int eAge, String eDept, List<String> skills) {
        super();
        this.eName = eName;
        this.eSal = eSal;
        this.role = role;
        this.eAge = eAge;
        this.eDept = eDept;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eName='" + eName + '\'' +
                ", eSal=" + eSal +
                ", role='" + role + '\'' +
                ", eAge=" + eAge +
                ", eDept='" + eDept + '\'' +
                ", skills=" + skills +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return eAge == employee.eAge && Objects.equals(eName, employee.eName) && Objects.equals(eSal, employee.eSal) && Objects.equals(role, employee.role) && Objects.equals(eDept, employee.eDept) && Objects.equals(skills, employee.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eName, eSal, role, eAge, eDept, skills);
    }


    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Double geteSal() {
        return eSal;
    }

    public void seteSal(Double eSal) {
        this.eSal = eSal;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int geteAge() {
        return eAge;
    }

    public void seteAge(int eAge) {
        this.eAge = eAge;
    }

    public String geteDept() {
        return eDept;
    }

    public void seteDept(String eDept) {
        this.eDept = eDept;
    }
    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }


}
