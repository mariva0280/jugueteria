public class EinvalidPropertyException extends Exception {
    private String message;

    public EinvalidPropertyException(String message) {
        super(message);
    }
}
