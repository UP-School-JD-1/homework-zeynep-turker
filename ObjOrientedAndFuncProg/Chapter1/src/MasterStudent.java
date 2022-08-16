import java.util.Date;

public class MasterStudent extends GraduateStudent {
    public MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major, advisor, thesis);
    }

    @Override
    public void study() {
        System.out.println("Master Student " + getName() + " is studying..");
    }

    @Override
    public void register() {
        System.out.println("Master Student " + getName() + " is registering..");
    }

    @Override
    public void writeThesis() {
        System.out.println("Master Student " + getName() + " is writing thesis " + getThesis() + "..");
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("Master Student " + getName() + " is meeting with advisor " + getAdvisor() + "..");
    }
}
