package src;

import src.company.models.Manager;
import src.company.models.Worker;

public class Main {
    public static void main(String[] args) {
        // Tworzenie instancji klasy Worker
        Worker worker1 = new Worker("John Doe", 3000, 1);
        Worker worker2 = new Worker("Jane Smith", 3200, 2);
        Worker worker3 = new Worker("Alice Johnson", 3500, 3);
        Worker worker4 = new Worker("Bob Brown", 3300, 4);
    
        // Tworzenie instancji klasy Manager
        Manager manager = new Manager("Emma Wilson", 5000, 5);
    
        // Wyświetlanie salary i wywoływanie metody work dla każdego obiektu
        Worker[] workers = {worker1, worker2, worker3, worker4};
        for (Worker worker : workers) {
            //salary
            System.out.println("Salary of " + worker.getName() + ": " + worker.getSalary());
            //work
            worker.work();
        }
    
        System.out.println("Salary of " + manager.getName() + ": " + manager.getSalary());
        manager.work();
    }
}
    