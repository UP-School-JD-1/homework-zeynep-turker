import java.util.Date;

public class PhdStudent extends GraduateStudent {
    private boolean qualifyingExamTaken;

    public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, Boolean qualifyingExamTaken) {
        super(no, name, year, dob, major, advisor, thesis);
        this.qualifyingExamTaken = qualifyingExamTaken;
    }

    public boolean isQualifyingExamTaken() {
        return qualifyingExamTaken;
    }

    public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
        this.qualifyingExamTaken = qualifyingExamTaken;
    }

    @Override
    public void study() {
        System.out.println("Phd Student " + getName() + " is studying..");
    }

    @Override
    public void register() {
        System.out.println("Phd Student " + getName() + " is registering..");
    }

    @Override
    public void writeThesis() {
        System.out.println("Phd Student " + getName() + " is writing thesis " + getThesis() + "..");
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("Phd Student " + getName() + " is meeting with advisor " + getAdvisor() + "..");
    }

    public void writePaper() {
        System.out.println("Phd Student " + getName() + " writing paper..");
    }
}
