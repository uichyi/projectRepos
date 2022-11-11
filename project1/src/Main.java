public class Main {
    public static void main(String[] args) {
        Client client = new Client(ClientType.Employer, "Victor Barinov", "Avito", "88005553535");
        System.out.println(client.toString());
    }
}
