package CompanyStructure;

public class Director extends Employee {
    private double budget;

    public double getBudjet() {
        return budget;
    }

    public void setBudjet(double budget) {
        this.budget = budget;
    }

    public Director(String name, String department, double salary, double budget) {
        super(name, department, salary);
        this.budget = budget;
    }

    @Override
    public String toString() {
        return super.toString() + ", Budget: " + budget;
    }
}
