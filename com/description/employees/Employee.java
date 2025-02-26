package com.description.employees;

import com.description.Description;

public class Employee {

    private int employeeId;
    @Description(info = "This is the employees number")
    private String employeeNumber;
    @Description(info = "This is the employees name")
    private String name;
    private String department;

    public Employee() {
    }

    public Employee(int employeeId, String employeeNumber, String name, String department) {
        this.employeeId = employeeId;
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.department = department;
    }

    public Employee(int employeeId, String employeeNumber) {
        this.employeeId = employeeId;
        this.employeeNumber = employeeNumber;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    private void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    private void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    private void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
