import entities.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, inform me the quantity of employees that you would like to register: ");
        int quant = input.nextInt();
        List<employee> employees = new ArrayList<>();
        for (int i = 0; i < quant; i++){
            System.out.print("Employee's ID: ");
            int id = input.nextInt();
            System.out.print("Employee's name: ");
            String name = input.next();
            System.out.print("Employee's salary: ");
            double salary = input.nextDouble();
            employee p = new employee(id, name, salary);
            employees.add(p);
        }
        System.out.print("Please, type the employee's ID who will gain a salary increase: ");
        int getUserById = input.nextInt();
        int searchId = -1;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == getUserById) {
                searchId = i;
                break;
            }
        }
        if (searchId == -1) {
            System.out.println("Id inválido!");
        }
        else {
            System.out.print("Type the percent value that you would to like to increase the salary: ");
            double salaryIncremental = input.nextDouble();
            employees.get(searchId).salaryIncrease(salaryIncremental);
        }
        System.out.println("Updated list: ");
        for (int i = 0; i < employees.stream().count(); i++ ){
            System.out.println(employees.get(i));
        }
    }
}