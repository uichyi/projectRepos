import java.util.Arrays;

public class Company {
    private String title;
    private Programs[] programs;
    private Client client;

    public static class Programs{
        private String programTitle;
        private String programDesc;
        private String date;
        private int prevScores;
        private FormatType formatType;

        public Programs(String programTitle, String programDesc, String date, int prevScores,
                        FormatType formatType){
            this.programTitle = programTitle;
            this.programDesc = programDesc;
            this.date = date;
            this.prevScores = prevScores;
            this.formatType = formatType;
        }
    }

    public Company(String title, Programs[] programs, Client client){
        this.title = title;
        this.programs = programs;
        this.client = client;
    }

    public String getTitle() {
        return title;
    }
    public Programs[] getPrograms() {
        return programs;
    }
    public Client getClient() {
        return client;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrograms(Programs[] programs) {
        this.programs = programs;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Company{" +
                "title='" + title + '\'' +
                ", programs=" + Arrays.toString(programs) +
                ", client='" + client + '\'' +
                '}';
    }
}
