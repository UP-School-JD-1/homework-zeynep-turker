import java.util.Date;
import java.util.Scanner;

public class RegistrationOffice {
    private static int no = 1; // öğrenci id si, her kayıt sonrasında bir arttırılır

    public RegistrationOffice() {
    }

    /***
     * öğrenci tipine göre gerekli bilgiler kullanıcıdan alınarak Student nesnesi
     * oluşturulup return edilir
     * @return Student
     */
    public Student getAStudent() {
        Student student = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nSelect Student Type");
        System.out.println("1 -> VocationalStudent\n2 -> UndergraduateStudent\n3 -> MasterStudent\n4 -> PhdStudent");
        int studentType = sc.nextInt();
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter major: ");
        String major = sc.next();
        String advisor, thesis;
        switch (studentType) {
            case 1 -> student = new VocationalStudent(no, name, 2021, new Date(), major); //UpCasting
            case 2 -> {
                System.out.println("Enter minor: ");
                String minor = sc.next();
                student = new UndergraduateStudent(no, name, 2023, new Date(), major, minor); //UpCasting
            }
            case 3 -> {
                System.out.println("Enter advisor: ");
                advisor = sc.next();
                System.out.println("Enter thesis: ");
                thesis = sc.next();
                student = new MasterStudent(no, name, 2028, new Date(), major, advisor, thesis); //UpCasting
            }
            case 4 -> {
                System.out.println("Enter advisor: ");
                advisor = sc.next();
                System.out.println("Enter thesis: ");
                thesis = sc.next();
                System.out.println("Enter qualifying exam taken (t or f): ");
                String qualifyingExamTakenTmp = sc.next();
                boolean qualifyingExamTaken = qualifyingExamTakenTmp.equals("t");
                student = new PhdStudent(no, name, 2027, new Date(), major, advisor, thesis, qualifyingExamTaken); //UpCasting
            }
            default -> System.out.println("Please valid value!");
        }
        no++;
        return student;
    }

    /**
     * gelen öğrenci nesnesinin tipine göre gerekli methodlar kullanılır
     *
     * @param student Student
     */
    public void registerStudent(Student student) {
        if (student instanceof VocationalStudent) {
            VocationalStudent vocationalStudent = (VocationalStudent) student; //DownCasting
            System.out.println(vocationalStudent);
            vocationalStudent.register();
            vocationalStudent.study();

        } else if (student instanceof UndergraduateStudent) {
            UndergraduateStudent undergraduateStudent = (UndergraduateStudent) student; //DownCasting
            System.out.println(undergraduateStudent);
            undergraduateStudent.register();
            undergraduateStudent.study();
        } else if (student instanceof MasterStudent) {
            MasterStudent masterStudent = (MasterStudent) student; //DownCasting
            System.out.println(masterStudent);
            masterStudent.register();
            masterStudent.meetWithAdvisor();
            masterStudent.study();
            masterStudent.writeThesis();
        } else if (student instanceof PhdStudent) {
            PhdStudent phdStudent = (PhdStudent) student; //DownCasting
            System.out.println(phdStudent);
            phdStudent.register();
            phdStudent.meetWithAdvisor();
            phdStudent.study();
            phdStudent.writeThesis();
            if (phdStudent.isQualifyingExamTaken()) phdStudent.writePaper();
        } else {
            student.register();
            student.study();
        }
    }
}
