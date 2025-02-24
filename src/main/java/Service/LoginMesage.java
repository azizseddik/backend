package Service;

public class LoginMesage {
    private String message;
    private boolean status;

    public LoginMesage(String message, boolean status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() { return message; }
    public boolean getStatus() { return status; }
}
