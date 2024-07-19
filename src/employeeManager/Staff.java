package employeeManager;

public abstract class Staff extends AbstractStaff{
    private int staffID;
    private String staffName;
    private String staffBirthday;
    private String staffPhoneNumber;
    private String staffEmail;

    public Staff(int staffID, String staffName, String staffBirthday, String staffPhoneNumber, String staffEmail) {
        this.staffID = staffID;
        this.staffName = staffName;
        this.staffBirthday = staffBirthday;
        this.staffPhoneNumber = staffPhoneNumber;
        this.staffEmail = staffEmail;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffBirthday() {
        return staffBirthday;
    }

    public void setStaffBirthday(String staffBirthday) {
        this.staffBirthday = staffBirthday;
    }

    public String getStaffPhoneNumber() {
        return staffPhoneNumber;
    }

    public void setStaffPhoneNumber(String staffPhoneNumber) {
        this.staffPhoneNumber = staffPhoneNumber;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    @Override
    public void SalaryMedium() {
        double salaryMedium;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffID=" + staffID +
                ", staffName='" + staffName + '\'' +
                ", staffBirthday='" + staffBirthday + '\'' +
                ", staffPhoneNumber='" + staffPhoneNumber + '\'' +
                ", staffEmail='" + staffEmail + '\'' +
                "} " + super.toString();
    }
}
