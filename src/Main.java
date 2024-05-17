package src;

import src.company.models.Manager;
import src.company.models.Worker;
import src.company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tworzenie instancji klasy Worker (dwie z tych samym id)
        Worker worker1 = new Worker("John Doe", 3000, 1, "2021-01-01", "Developer");
        Worker worker2 = new Worker("Jane Smith", 3200, 1, "2020-02-01", "Tester");
        Worker worker3 = new Worker("Alice Johnson", 3500, 2, "2019-03-01", "Designer");

        // Tworzenie instancji klasy Manager
        Manager manager = new Manager("Emma Wilson", 5000, 3, "2018-05-01", "Manager");

        // Wyświetlanie hashCode dla wszystkich obiektów
        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());
        System.out.println();

        // Dodawanie obiektów do listy
        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);

        // Iterowanie po liście i porównywanie metodą equals
        for (Employee employee : employees) {
            System.out.println("worker2.equals(" + employee.getName() + "): " + worker2.equals(employee));
        }
    }
}
    