package ss6.ticket;

public class Ticket {
    private double ticketID;
    private String passengerName;
    private String origin;
    private String destination;
    private int departureTime;

    public Ticket(double ticketID, String passengerName, String origin, String destination, int departureTime) {
        this.ticketID = ticketID;
        this.passengerName = passengerName;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public double getTicketID() {
        return ticketID;
    }

    public void setTicketID(double ticketID) {
        this.ticketID = ticketID;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public void InfoTicket() {
        System.out.println("Ticket ID: " + getTicketID());
        System.out.println("Passenger Name: " + getPassengerName());
        System.out.println("Origin: " + getOrigin());
        System.out.println("Destination: " + getDestination());
        System.out.println("Departure Time: " + getDepartureTime());
    }

    public void PriceTicket(){
        return;
    }
    public void ChosePayment(){
        System.out.println("Chon hinh thuc thanh toan:" +
                  "1: Thanh toan tien mat"
                + "2: Thanh toan the tin dung"
                + "3: Thanh toan chuyen khoan");
    }
}
