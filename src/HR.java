import java.util.*;
class HR extends Employee {
    private List<Employee> employees;

    public HR(String name, double baseSalary) {
        super(name,baseSalary);
        employees = new ArrayList<>();
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("Added: " + e.getName());
    }

    public void showAllEmployees() {
        System.out.println("\n--- Employee List ---");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public void addEmployeeFromInput(Scanner sc) {
        sc = new Scanner(System.in);
        System.out.print("Enter employee type (Manager/Developer/HR): ");
        String type = sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter base salary: ");
        double base = sc.nextDouble();

        Employee e = null;
        if (type.equalsIgnoreCase("Manager")) {
            System.out.print("Enter bonus: ");
            double bonus = sc.nextDouble();
            e = new Manager(name, base, bonus);
        } else if (type.equalsIgnoreCase("Developer")) {
            System.out.print("Enter overtime: ");
            double overtime = sc.nextDouble();
            e = new Developer(name, base, overtime);
        } else if (type.equalsIgnoreCase("HR")) {
            e = new HR(name, base);
        } else {
            System.out.println("Invalid type!");
            return;
        }

        addEmployee(e);
    }
}