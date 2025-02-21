class SalesRep extends StaffMember {
    private double allowance;

    SalesRep(String firstname, String lastname, String deptNumber, double hoursWorked, double allowance) {
        super(firstname, lastname, deptNumber, hoursWorked);
        this.allowance = allowance;
    }

    @Override
    public void display() {
        super.display();

        System.out.println("allowance: "+allowance);


    }

    @Override
    public double calculateSalary() {
        return (getHoursWorked() * 1500) + allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
}
