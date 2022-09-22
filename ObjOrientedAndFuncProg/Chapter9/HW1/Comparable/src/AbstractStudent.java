import java.util.Comparator;
import java.util.Date;

public abstract class AbstractStudent implements Student, Comparable {
    protected int no;
    protected String name;
    protected int year;
    protected Date dob;
    protected String major;

    public AbstractStudent(int no, String name, int year, Date dob, String major) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student -> no: " + getNo() + ", name: " + getName() + ", year: " + getYear() + " , dob: " + getDob().toString() + ", major: " + getMajor();
    }

    @Override
    public int compareTo(Object o) {
        AbstractStudent student = (AbstractStudent) o;
        return name.compareTo(student.getName());
    }
}