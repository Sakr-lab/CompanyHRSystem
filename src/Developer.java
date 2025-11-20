class Developer extends Employee {
    private double overtime;

    public Developer(String name, double baseSalary, double overtime) {
        super(name, baseSalary);
        this.overtime = overtime;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtime;
    }
}