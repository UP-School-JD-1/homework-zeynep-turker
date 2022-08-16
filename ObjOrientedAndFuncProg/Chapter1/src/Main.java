import java.util.Scanner;

public class Main {
    /***
     * kullanıcıdan kayıt sayısı alınır
     * registrationOffice ile kullanıcıdan gerekli bilgiler alınır
     * ve öğrenci oluşturulur.
     * @param args args
     */
    public static void main(String[] args) {
        RegistrationOffice registrationOffice = new RegistrationOffice();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter register count: ");
        int registerCount = sc.nextInt();

        for (int i = 0; i < registerCount; ++i) {
            Student student = registrationOffice.getAStudent();
            registrationOffice.registerStudent(student);
        }
    }
}
