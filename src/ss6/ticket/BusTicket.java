package ss6.ticket;

public class BusTicket extends Ticket {
    private String typeBus;
    private double distance = 1;

    public BusTicket(double ticketID, String passengerName, String origin, String destination, int departureTime, String typeBus, double distance) {
        super(ticketID, passengerName, origin, destination, departureTime);
        this.typeBus = typeBus;
        this.distance = distance;
    }

    public String getTypeBus() {
        return typeBus;
    }

    public void setTypeBus(String typeBus) {
        this.typeBus = typeBus;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
