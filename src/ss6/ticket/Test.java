package ss6.ticket;

public class Test {
    public static void main(String[] args) {
        BusTicket busTicket = new BusTicket(01, "Duy", "HaNoi", "NamDinh", 13, "xedien", 1);
        PlanTicket planTicket = new PlanTicket(02, "Ky", "HaNoi", "HCM", 11, 10, "Thuong gia");
        TrainTicket trainTicket = new TrainTicket(03, "Tuan", "NamDinh", "Laocai", 11, "Tau dien", "Giuong nam");
        busTicket.InfoTicket();
//        planTicket.InfoTicket();
//        trainTicket.InfoTicket();
    }
}
