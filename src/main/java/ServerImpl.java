public class ServerImpl implements Server{

    private String message;

    public String message(String str){
        return str;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
