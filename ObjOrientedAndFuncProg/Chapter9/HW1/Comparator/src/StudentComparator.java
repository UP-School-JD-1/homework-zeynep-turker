import java.util.Comparator;

public class StudentComparator implements Comparator<AbstractStudent> {
    @Override
    public int compare(AbstractStudent student1, AbstractStudent student2) {
        return student1.getName().compareTo(student2.getName());
    }
}
