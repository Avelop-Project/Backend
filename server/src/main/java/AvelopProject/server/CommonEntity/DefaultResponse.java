package AvelopProject.server.CommonEntity;

public class DefaultResponse {
    private boolean success;
    private Object data;

    public DefaultResponse(boolean success, Object data) {
        this.success = success;
        this.data = data;
    }

    public boolean getSuccess() {
        return success;
    }

    public Object getData() {
        return data;
    }
}
