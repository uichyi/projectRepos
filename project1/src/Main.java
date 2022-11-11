import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alexey", "Orlov", "9162600749", UserType.Entrant);
        System.out.println(user.toString());

        Company.Programs[] program = new Company.Programs[2];
        /*
        program[0] = new Company.Programs("programma 1");
        program[1] = new Company.Programs("programma 2");

        Company company = new Company("Company", program, "??");
        System.out.println(company.toString());

         */
    }
}
