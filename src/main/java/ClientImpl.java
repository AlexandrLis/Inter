public class ClientImpl implements Client {

    private String string;
    private final Server server = new ServerImpl();

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Server getServer() {
        return server;
    }

    @Override
    public void sendMessage(String string){
        server.setMessage(string);
    }



}
