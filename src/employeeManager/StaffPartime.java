package employeeManager;

public class StaffPartime extends Staff {
    private double staffPartimeWorkHour;

    public StaffPartime(int staffID, String staffName, String staffBirthday, String staffPhoneNumber, String staffEmail, double staffPartimeWorkHour) {
        super(staffID, staffName, staffBirthday, staffPhoneNumber, staffEmail);
        this.staffPartimeWorkHour = staffPartimeWorkHour;
    }

    public double getStaffPartimeWorkHour() {
        return staffPartimeWorkHour;
    }

    public void setStaffPartimeWorkHour(double staffPartimeWorkHour) {
        this.staffPartimeWorkHour = staffPartimeWorkHour;
    }

    @Override
    public double getSalary() {
        double salary;
        salary = staffPartimeWorkHour*1000;
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
        return "StaffPartime{" +
                "staffPartimeWorkHour=" + staffPartimeWorkHour +
                "} " + super.toString();
    }
}
