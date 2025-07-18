package gianlucafiorani.U5_W1_D5.exceptions;

public class ExistingReservation extends RuntimeException {
    public ExistingReservation() {
        super("Postazione già prenotata in questa data");
    }
}
