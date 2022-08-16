import java.util.Date;

public class Student {
    protected int no;
    protected String name;
    protected int year;
    protected Date dob;
    protected String major;

    public Student(int no, String name, int year, Date dob, String major) {
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

    public void study() {
        System.out.println("Student is studying..");
    }

    public void register() {
        System.out.println("Student is registering..");
    }

    @Override
    public String toString() {
        return "Student -> no: " + getNo() + ", name: " + getName() + ", year: " + getYear() + " , dob: " + getDob().toString() + ", major: " + getMajor();
    }
}
