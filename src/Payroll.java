import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Payroll {
    public static void main(String[] args) {

        StaffMember staffMember = new Manager("James", "Francis", "Mng01", 49.2, 45000);
        staffMember.display();
        generatePaystub(staffMember);


        ArrayList<SalesRep> salesReps = new ArrayList<SalesRep>();
        salesReps.add(new SalesRep("Everton", "Richards", "Rep01",36.2,4000));
        salesReps.add(new SalesRep("Adrian", "Williams", "Rep02",40.2,8000));
        salesReps.add(new SalesRep("Asheka", "Quallo", "Rep03",48.0,15000));
        salesReps.add(new SalesRep("Andre", "Mcmillon", "Rep04",17.5,800));
        salesReps.add(new SalesRep("Kamar", "Gaynor", "Rep05",40.1,8500));

        //print all sales rep in list
        for (SalesRep rep : salesReps) {
            rep.display();
            generatePaystub(rep);
        }

        Manager manager = new Manager("Junior", "Brown", "Mng02", 80.2, 75000);
        System.out.println("Manager Salary: "+ manager.calculateSalary());
        generatePaystub(manager);
        SalesRep salesRep = new SalesRep("Shana", "Campbell", "Rep01",36.5,4000);
        System.out.println("SalesRep Salary: "+ salesRep.calculateSalary());
        generatePaystub(salesRep);
    }
    //Generate each paystub for all employees
    private static void generatePaystub(StaffMember member) {
        String filename = member.getFirstname() + "_" + member.getLastname() + "_Paystub.txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Paystub for: " + member.getFirstname() + " " + member.getLastname() + "\n");
            writer.write("Department: " + member.getDeptNumber() + "\n");
            writer.write("Hours Worked: " + member.getHoursWorked() + "\n");
            if (member instanceof Manager) {
                Manager manager = (Manager) member;
                writer.write("Bonus: $" + manager.getBonus() + "\n");
            } else if (member instanceof SalesRep) {
                SalesRep salesRep = (SalesRep) member;
                writer.write("Allowance: $" + salesRep.getAllowance() + "\n");
            }
            writer.write("Total Salary: $" + member.calculateSalary() + "\n");
            System.out.println("Generated paystub: " + filename);
        } catch (IOException e) {
            System.err.println("Error writing paystub for " + member.getFirstname());
        }
    }
}