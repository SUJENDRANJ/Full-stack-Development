package SUJE;
//7. Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). 
//Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() 
//method to include the employee's job title.
class Persons1 {
    String firstName;
    String lastName;

    Persons1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employees2 extends Persons1 {
    String jobTitle;
    int employeeId;

    Employees2(String firstName, String lastName, String jobTitle, int employeeId) {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
        this.employeeId = employeeId;
    }

    String getLastName() {
        return lastName + " (" + jobTitle + ")";
    }

    int getEmployeeId() {
        return employeeId;
    }
}

public class Person1 {
    public static void main(String[] args) {
        Employees2 employee = new Employees2("John", "Doe", "Engineer", 12345);
        System.out.println("Employee Full Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        // Outputs:
        // Employee Full Name: John Doe (Engineer)
        // Employee ID: 12345
    }
}