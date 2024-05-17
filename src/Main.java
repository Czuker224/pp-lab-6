package src;

import src.company.models.Manager;
import src.company.models.Worker;
import src.company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tworzenie instancji klasy Worker
        Worker worker1 = new Worker("John Doe", 3000, 1, "2021-01-01", "Developer");
        Worker worker2 = new Worker("Jane Smith", 3200, 2, "2020-02-01", "Tester");
        Worker worker3 = new Worker("Alice Johnson", 3500, 3, "2019-03-01", "Designer");
        Worker worker4 = new Worker("Bob Brown", 3300, 4, "2021-04-01", "Developer");

        // Tworzenie instancji klasy Manager
        Manager manager = new Manager("Emma Wilson", 5000, 5, "2018-05-01", "Manager");

        // Tworzenie listy typu Employee
        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        // Wyświetlanie danych i wywoływanie metody work dla każdego pracownika
        for (Employee employee : employees) {
            employee.work();
            System.out.println("-" + employee.getName() + " (ID: " + employee.hashCode() + ", Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary() + ")");
        }
    }
}
    