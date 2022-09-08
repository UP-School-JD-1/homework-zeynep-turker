import java.util.Random;

public class HR {

    public Employee getAnEmployee() {
        Employee e = null;

        int i = (int) (5 * Math.random());
        int no = new Random().nextInt(1000);

        switch (i) {
            case 0:
                e = new Employee(no, "Ali", 5, "Production");
                break;
            case 1:
                e = new Secretary(no, "Sevim", 8, "Sales", new Manager(3, "Kamil", 10, "Sales", "Sales"));
                break;
            case 2:
                e = new Engineer(no, "Burhan", 9, "Production", "Improving production.");
                break;
            case 3:
                e = new Manager(no, "İsmail", 10, "Production", "Production");
                break;
            case 4:
                e = new Director(no, "Salih", 11, "Management", "Management", 4500);
                break;
        }
        return e;
    }
}
