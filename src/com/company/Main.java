package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee employee = new Employee("Artur", "Causnean", 1989, "Manager", 5300, 5);
        Employee employee2 = new Employee("Ion", "Marin", 1989, "Manager", 5300, 9);
        Employee employee3 = new Employee("Artur", "Causnean", 1989, "Manager", 5300, 4);
        Employee employee4 = new Employee("Artur", "Causnean", 1989, "Manager", 5300, 4);

        EmployeeService employeeService = new EmployeeService();
        System.out.println(employeeService.calculateSalary(employee));
        System.out.println(employeeService.calculateSalary(employee2));
        System.out.println(employeeService.calculateSalary(employee3));
        System.out.println(employeeService.calculateSalary(employee4));
    }
}
