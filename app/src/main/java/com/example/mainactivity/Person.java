package com.example.mainactivity;

public class Person {

    private String firstName;
    private String lastName;
    private String department;
    private String gender;
    private double salary;

    public Person(String firstName, String lastName, String department, String gender, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.gender = gender;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
