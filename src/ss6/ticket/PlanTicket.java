package ss6.ticket;

public class PlanTicket extends Ticket {
    private double surcharge = 1;
    private String typeChairs;

    public PlanTicket(double ticketID, String passengerName, String origin, String destination, int departureTime, double surcharge, String typeChairs) {
        super(ticketID, passengerName, origin, destination, departureTime);
        this.surcharge = surcharge;
        this.typeChairs = typeChairs;
    }

    public double getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(double surcharge) {
        this.surcharge = surcharge;
    }

    public String getTypeChairs() {
        return typeChairs;
    }

    public void setTypeChairs(String typeChairs) {
        this.typeChairs = typeChairs;
    }
}
