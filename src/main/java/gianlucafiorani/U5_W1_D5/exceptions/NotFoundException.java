package gianlucafiorani.U5_W1_D5.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String id) {
        super("Item with id " + id + " not found");
    }
}
