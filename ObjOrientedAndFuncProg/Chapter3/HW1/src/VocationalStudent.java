import java.util.Date;

public class VocationalStudent extends AbstractStudent {

    public VocationalStudent(int no, String name, int year, Date dob, String major) {
        super(no, name, year, dob, major);
    }

    @Override
    public void study() {
        System.out.println("Vocational Student " + getName() + " is studying..");
    }

    @Override
    public void register() {
        System.out.println("Vocational Student " + getName() + " is registering..");
    }

    @Override
    public String toString() {
        return "Vocational Student -> no: " + getNo() + ", name: " + getName() + ", year: " + getYear() + " , dob: " + getDob().toString() + ", major: " + getMajor();
    }
}
