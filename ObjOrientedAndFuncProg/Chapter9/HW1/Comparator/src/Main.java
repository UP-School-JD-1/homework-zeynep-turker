import java.util.*;

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

        System.out.println("***************************************************");
        Comparator<AbstractStudent> comparator = new StudentComparator();
        if (students.size() >= 2)
            System.out.println("Compare result between student 1 and student 2 -> " + comparator.compare(students.get(0), students.get(1)) + "\n");

        System.out.println("\n--- Before Sort ---\n");
        printEmployees(students);

        System.out.println("\n--- After Sort By Year ---\n");
        Comparator<AbstractStudent> comparator1 = (e1, e2) -> e1.getYear() - e2.getYear();
        Collections.sort(students, comparator1);
        printEmployees(students);
        System.out.println("***************************************************");
    }

    private static void printEmployees(ArrayList<AbstractStudent> students) {
        students.forEach(System.out::println);
    }
}

