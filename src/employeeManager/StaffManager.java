package employeeManager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StaffManager {
    public static void main(String[] args) {
        Staff[] staffFT = new StaffFulltime[3];
        Staff[] staffPT = new StaffPartime[3];
        staffFT[0] = new StaffFulltime(01,"Duy","30/09/2000","0843092000","Duy@gmail.com",200,100,5000);
        staffFT[1] = new StaffFulltime(02,"Ky","03/07/2000","0981714444","Ky@gmail.com",300,400,6000);
        staffFT[2] = new StaffFulltime(03,"Long","06/01/2000","0888365555","Long@gmail.com",100,200,8000);
        staffPT[0] = new StaffPartime(04,"Tuan","02/02/2000","0989333888","Tuan@gmail.com",40);
        staffPT[1] = new StaffPartime(05,"Chuyen","07/02/2000","0989333999","Chuyen@gmail.com",20);
        staffPT[2] = new StaffPartime(06,"Hao","09/02/2000","0989333333","Hao@gmail.com",30);
        ArrayList<Staff> listStaff = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listStaff.add(staffFT[i]);
        }
        for (int i = 0; i < 3; i++) {
            listStaff.add(staffPT[i]);
        }
//        for (Staff staff : listStaff) {
//            System.out.println(staff);
//        }
        double sumSalaru = 0;
        for (Staff staff : listStaff) {
            sumSalaru+=staff.getSalary();
        }
        double salaryMedium;
        salaryMedium = sumSalaru/listStaff.size();
        System.out.println("Luong trung binh cua toan bo nhan vien la: "+salaryMedium);

        ArrayList<Double> listSalaryStaff = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listSalaryStaff.add(staffFT[i].getSalary());
        }

        for (int i = 0; i < 3; i++) {
            listSalaryStaff.add(staffPT[i].getSalary());
        }
        System.out.println("Danh sach luong toan bo nhan vien la: "+listSalaryStaff);

        System.out.println("Danh sach nhan vien co luong thap hon muc luong trung binh la: ");
        for (int i = 0; i < 3; i++){
            if (listStaff.get(i).getSalary()<salaryMedium){
                System.out.println(listStaff.get(i).getStaffName());
            }
        }

        double sumSalaryPT = 0;
        for (int i = 3; i < 6; i++) {
            sumSalaryPT+=listStaff.get(i).getSalary();
        }
        System.out.println("Tong so luong phai tra cho nhan vien partime la:"+sumSalaryPT);

        Set <Double> setSalaryFT = new HashSet<>();
        ArrayList<String> listSalaryPT = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            setSalaryFT.add(listStaff.get(i).getSalary());
            listSalaryPT.add(listStaff.get(i).getStaffName());
        }
        System.out.println("Danh sach nhan vien theo so luong tang dan la: "+listSalaryPT);
    }
}
