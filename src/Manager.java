public class Manager extends StaffMember {
    private double bonus;

    Manager(String firstname, String lastname, String deptNumber, double hoursWorked, double bonus) {
        super(firstname, lastname, deptNumber, hoursWorked);
        this.bonus = bonus;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
    }

    @Override
    public double calculateSalary() {

        return (getHoursWorked() * 2500) + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
