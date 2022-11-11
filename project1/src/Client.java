public class Client {
    private ClientType type;
    private String name;
    private String company;
    private String number;

    public Client(ClientType type, String name, String company, String number){
        this.type = type;
        this.name = name;
        this.company = company;
        this.number = number;
    }

    // тут короче надо заставлять вводить пользователя номер заново, но это опционно
    private void checkNumber(){
        if (number.indexOf('8') != 0){
            System.err.println("Incorrect number, try again");
            //setNumber();
        }
        if (number.length() != 11){
            System.err.println("Incorrect number, try again");
            //setNumber();
        }
    }

    public ClientType getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }
    public String getNumber() {
        return number;
    }

    public void setType(ClientType type) {
        this.type = type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Client{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
