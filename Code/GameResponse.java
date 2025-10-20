import java.io.Serializable;

public class GameResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private String message;
    private boolean success;

    public GameResponse(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }
}
