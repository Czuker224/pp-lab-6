package src.company.abstracts;

import src.company.interfaces.Employable;

public abstract class Employee implements Employable {
    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }
}
