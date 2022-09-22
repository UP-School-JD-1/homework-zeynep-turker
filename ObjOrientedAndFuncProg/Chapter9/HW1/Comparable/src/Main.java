import java.util.ArrayList;
import java.util.Collections;
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

        ArrayList<AbstractStudent> students = new ArrayList<>();

        for (int i = 0; i < registerCount; ++i) {
            Student student = registrationOffice.getAStudent();
            students.add((AbstractStudent) student);
            registrationOffice.registerStudent(student);
        }

        System.out.println("**************************************************");
        System.out.println("\n--- Before Sort ---");
        printStudents(students);

        Collections.sort(students); //Comparable ile öğrenciler isme göre sıralanır

        System.out.println("\n--- After Sort By Name ---");
        printStudents(students);
        System.out.println("**************************************************");
    }

    private static void printStudents(ArrayList<AbstractStudent> students) {
        for (int i = 0; i < students.size(); ++i)
            System.out.println(students.get(i).toString());
    }
}