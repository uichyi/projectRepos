public class User {
    private String name;
    private String surname;
    private String number;
    private UserType type;

    public User(String name, String surname, String number, UserType type){
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", number='" + number + '\'' +
                ", type=" + type +
                '}';
    }
}
