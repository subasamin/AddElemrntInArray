package employeeManager;

public class StaffFulltime extends Staff{
    private double staffFTBonus;
    private double staffFTFine;
    private double staffFTHardSalary;

    public StaffFulltime(int staffID, String staffName, String staffBirthday, String staffPhoneNumber, String staffEmail, double staffFTBonus, double staffFTFine, double staffFTHardSalary) {
        super(staffID, staffName, staffBirthday, staffPhoneNumber, staffEmail);
        this.staffFTBonus = staffFTBonus;
        this.staffFTFine = staffFTFine;
        this.staffFTHardSalary = staffFTHardSalary;
    }

    public double getStaffFTBonus() {
        return staffFTBonus;
    }

    public void setStaffFTBonus(double staffFTBonus) {
        this.staffFTBonus = staffFTBonus;
    }

    public double getStaffFTFine() {
        return staffFTFine;
    }

    public void setStaffFTFine(double staffFTFine) {
        this.staffFTFine = staffFTFine;
    }

    public double getStaffFTHardSalary() {
        return staffFTHardSalary;
    }

    public void setStaffFTHardSalary(double staffFTHardSalary) {
        this.staffFTHardSalary = staffFTHardSalary;
    }

    @Override
    public double getSalary() {
        double salary;
        salary = staffFTHardSalary + (staffFTBonus * staffFTFine);
        return salary;
    }

    @Override
    public void ListStaffFTBelowSalaryMedium() {

    }

    @Override
    public void SumSalaryStaffPartime() {

    }

    @Override
    public void ListStaffFTSalaryAscending() {

    }

    @Override
    public String toString() {
        return "StaffFulltime{" +
                "staffFTBonus=" + staffFTBonus +
                ", staffFTFine=" + staffFTFine +
                ", staffFTHardSalary=" + staffFTHardSalary +
                "} " + super.toString();
    }
}

