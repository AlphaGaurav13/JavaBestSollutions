package java319;

public  abstract class Employee {
  String name;
  int employeeId;
  public void calculateSalary() {
    
  }

  public void 

};

public class twelve {
  public static void main(String[] args) {
    System.out.println("Twelve");
  }
}


// Employee Management System
// You are tasked with building an Employee Management System for a company that has different types of employees, such as Full-Time Employees and Contract Employees. Each type of employee has different compensation structures and job responsibilities, but they share some common properties, such as their name and employee ID.

// Requirements:
// Employee Class (Abstract):

// Create an abstract class Employee with common properties: name, employeeId, and an abstract method calculateSalary() to calculate the salary.
// The abstract class should also have a concrete method displayDetails() to show the employee’s name and employee ID.
// FullTimeEmployee Class:

// This class should extend the Employee class.
// Full-time employees have a fixed monthly salary. Implement the calculateSalary() method to return this salary.
// ContractEmployee Class:

// This class should also extend the Employee class.
// Contract employees are paid based on the number of hours worked and an hourly rate. Implement the calculateSalary() method to return the total salary based on hours worked.
// Goal: Write a program that calculates and displays the salary of both types of employees. Each employee should be able to display their basic details (name, ID) along with their salary, and the salary should be calculated differently for full-time and contract employees.

