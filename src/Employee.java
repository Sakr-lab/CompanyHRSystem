public abstract class Employee {
    private static int ID=0;
    private String name;
    private int id;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.id = ID+1;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Abstract method for salary calculation
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + calculateSalary() +
                '}';
    }
}
