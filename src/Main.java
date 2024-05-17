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
        Worker worker4 = new Worker("Michael Brown", 3400, 2, "2022-04-01", "Analyst");
        Worker worker5 = new Worker("Linda Green", 3600, 4, "2023-06-01", "Support");


        // Tworzenie instancji klasy Manager
        Manager manager1 = new Manager("Emma Wilson", 5000, 3, "2018-05-01", "Manager");
        Manager manager2 = new Manager("David Black", 5200, 3, "2017-07-01", "Project Manager");


        // Tworzenie listy pracowników
        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager1);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager2);


        // Zliczanie całkowitej sumy pensji wszystkich pracowników
        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }


        // Wyświetlanie wyników
        System.out.println("Total salary of all employees: " + totalSalary);
        System.out.println("Total salary of all Managers: " + totalManagerSalary);
        System.out.println("Total salary of all Workers: " + totalWorkerSalary);

        // Wyszukiwanie instancji o tym samym id
        System.out.println("\nEmployees with duplicate IDs:");
        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                    if (employees.get(i).equals(employees.get(j))) {
                    System.out.println("Duplicate ID found: " + employees.get(i).getName() + " and " + employees.get(j).getName());
                }
            }
        }
    }
}
    