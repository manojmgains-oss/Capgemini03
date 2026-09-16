package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class Test8 {

    public static void main(String[] args) {

        List<Employee> s = Arrays.asList(
            new Employee(101, "Manu", "IT", 10000),
            new Employee(102, "Anu", "Hr", 60000),
            new Employee(103, "Raju", "IT", 40000),
            new Employee(104, "Shaiob", "Log", 1000),
            new Employee(105, "Dilip", "Manger", 101000)
        );

        List<String> r = s.stream()
            .filter(employee -> employee.getDepartment().equals("IT"))
            .filter(employee -> employee.getSalary() >= 10000)
            .map(employee -> employee.getName())
            .sorted()
            .toList();

        System.out.println(r);
    }
}
