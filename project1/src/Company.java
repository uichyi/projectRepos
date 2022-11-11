import java.util.Arrays;

public class Company {
    private String title;
    private Programs[] programs;
    private String ministry;

    public static class Programs{
        private String programs;

        public Programs(String program){
            this.programs = program;
        }

        public String getProgram() {
            return programs;
        }

        public void setProgram(String program) {
            this.programs = program;
        }
    }

    public Company(String title, Programs[] programs, String ministry){
        this.title = title;
        this.programs = programs;
        this.ministry = ministry;
    }

    public String getTitle() {
        return title;
    }
    public Programs[] getPrograms() {
        return programs;
    }
    public String getMinistry() {
        return ministry;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrograms(Programs[] programs) {
        this.programs = programs;
    }
    public void setMinistry(String ministry) {
        this.ministry = ministry;
    }

    @Override
    public String toString() {
        return "Company{" +
                "title='" + title + '\'' +
                ", programs=" + Arrays.toString(programs) +
                ", ministry='" + ministry + '\'' +
                '}';
    }
}
