import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        HR hr = new HR();
        int n = 10;
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++)
            employees[i] = hr.getAnEmployee();

        Arrays.sort(employees);

        for (Employee e : employees) {
            try {
                System.out.println(e);
                double salary = e.calculateSalary();
                System.out.print("Your salary: " + salary + " ");
                if (salary >= 7000) //employee maası 7000 tl ve üzeri ise exception fırlatılır
                    throw new SalaryPaidOnBankException("Salary paid on bank exception");
                else System.out.println();
            } catch (SalaryPaidOnBankException salaryPaidOnBankException) {
                System.out.println("\n" + salaryPaidOnBankException.getMessage());
            } finally {
                System.out.println("**********************************************");
            }
        }
    }
}
