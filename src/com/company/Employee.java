package com.company;

public class Employee {
    private String name;
    private String surname;
    private int birthYear;
    private String role;
    private double salary;
    private int workedYears;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setWorkedYears(int workedYears) {
        this.workedYears = workedYears;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    public int getWorkedYears() {
        return workedYears;
    }

    public Employee(String name, String surname, int birthYear, String role, double salary, int workedYears) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.role = role;
        this.salary = salary;
        this.workedYears = workedYears;
    }
}
