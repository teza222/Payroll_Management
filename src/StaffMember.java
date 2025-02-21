public abstract class StaffMember{
    private String firstname;
    private String lastname;
    private String deptNumber;
    private double hoursWorked;

    StaffMember(String firstname, String lastname, String deptNumber, double hoursWorked) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.deptNumber = deptNumber;
        this.hoursWorked = hoursWorked;
    }


    public void display(){
        System.out.println("---------------------------------------------");
        System.out.println("Name: "+getFirstname() + " " + getLastname() );
        System.out.println("deptNumber: "+getDeptNumber());
        System.out.println("hoursWorked: "+getHoursWorked());
    }

    public abstract double calculateSalary();

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
