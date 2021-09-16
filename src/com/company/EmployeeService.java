package com.company;

public class EmployeeService {
    public String calculateSalary(Employee employee) {
        if (employee.getWorkedYears() > 4) {
            employee.setSalary(employee.getSalary() + 500);
            return employee.getName() + " " + employee.getSurname() + " lucreaza de " +
                    employee.getWorkedYears() + " ani si are un salariu de: " + employee.getSalary() + " lei";
        }
        return "";
    }
}
