Company HR System
Overview

This Java project simulates a dynamic HR management system where an HR employee can manage different types of employees in a company. The system demonstrates Object-Oriented Programming (OOP) concepts such as abstraction, inheritance, and polymorphism.

## Features

**Add Employee: Dynamically add Manager, Developer, or another HR employee.

**Show All Employees: List all employees with details including name, ID, and calculated salary.

**Dynamic Interaction: The program runs in a loop, allowing the HR employee to continuously perform actions until they choose to exit.

**Salary Calculation: Each employee type has its own salary calculation logic.

**Manager: baseSalary + bonus

**Developer: baseSalary + overtime

**HR: baseSalary

##Project Structure

**Employee (Abstract Class)
Base class for all employee types. Includes common attributes like name, id, and baseSalary, and an abstract method calculateSalary().

**Manager (Subclass of Employee)
Represents a manager with an additional bonus attribute.

**Developer (Subclass of Employee)
Represents a developer with an additional overtime attribute.

**HR (Subclass of Employee)
Represents an HR employee who can manage other employees.
Methods include:

-addEmployee(Employee e): Add a new employee to the list.

-showAllEmployees(): Display all employees.

-addEmployeeFromInput(Scanner sc): Add an employee interactively using user input.

**CompanyHRSystem (Main Class)
Entry point of the program. Displays a menu with options for the HR employee and executes the selected actions in a loop until exit.

## How to Run

Clone the repository or download the project.

Compile the Java files:

javac CompanyHRSystem.java


Run the program:

java CompanyHRSystem


## Follow the on-screen menu to:

Add new employees

Show all employees

Exit the program


## OOP Concepts Used

-Abstraction: Employee class defines a common template for all employee types.

-Inheritance: Manager, Developer, and HR classes extend Employee.

-Polymorphism: The calculateSalary() method is overridden in each subclass.

-Encapsulation: Employee details are private or protected with getters/setters.

## Future Improvements

-Add edit or delete employee functionality.

-Store employee data in a database instead of memory.

-Implement search by ID or name.

-Add GUI interface for more user-friendly interaction.

## Authorize
Ibrahem Magdy Sakr
GitHub: Sakr-lab