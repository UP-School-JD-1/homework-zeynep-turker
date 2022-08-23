import java.util.Date;

public class UndergraduateStudent extends AbstractStudent {
    protected String minor;

    public UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
        super(no, name, year, dob, major);
        this.minor = minor;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    @Override
    public void study() {
        System.out.println("Undergraduate Student " + getName() + " is studying..");
    }

    @Override
    public void register() {
        System.out.println("Undergraduate Student " + getName() + " is registering..");
    }

    @Override
    public String toString() {
        return "Undergraduate Student -> no: " + getNo() + ", name: " + getName() + ", year: " + getYear() + " , dob: " + getDob().toString() + ", major: " + getMajor() + ", minor: " + getMinor();
    }
}
