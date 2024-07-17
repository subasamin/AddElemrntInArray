package ss6.ticket;

public class TrainTicket extends Ticket {
    private String typeTrain;
    private String typeChairs;

    public TrainTicket(double ticketID, String passengerName, String origin, String destination, int departureTime, String typeTrain, String typeChairs) {
        super(ticketID, passengerName, origin, destination, departureTime);
        this.typeTrain = typeTrain;
        this.typeChairs = typeChairs;
    }

    public String getTypeTrain() {
        return typeTrain;
    }

    public void setTypeTrain(String typeTrain) {
        this.typeTrain = typeTrain;
    }

    public String getTypeChairs() {
        return typeChairs;
    }

    public void setTypeChairs(String typeChairs) {
        this.typeChairs = typeChairs;
    }
}
