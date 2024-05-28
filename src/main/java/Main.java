public class Main {
    public static void main(String[] args) {



        ClientImpl client = new ClientImpl();

        ServerImpl server = new ServerImpl();

        client.sendMessage("Stroka");
        System.out.println(server.message(""));


    }
}
