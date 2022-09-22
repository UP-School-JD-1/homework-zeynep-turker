import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class PersonTest {
    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Person p1 = new Person("Zeynep", "Turker", new ArrayList<>(Arrays.asList("xel", "abc")), new ArrayList<>(Arrays.asList("xyz", "abc")));
        Person p2 = new Person("Nazire", "Yuksel", new ArrayList<>(Arrays.asList("xyz", "abc")), new ArrayList<>(Arrays.asList("xyz", "abc")));
        Person p3 = new Person("Demir", "Mervan", new ArrayList<>(Arrays.asList("xyz", "abc")), new ArrayList<>(Arrays.asList("xyz", "abc")));
        Person p4 = new Person("Meltem", "Ansal", new ArrayList<>(Arrays.asList("xyz", "abc")), new ArrayList<>(Arrays.asList("xyz", "abc")));
        Person p5 = new Person("Zeynep", "Turker", new ArrayList<>(Arrays.asList("xel", "abc")), new ArrayList<>(Arrays.asList("xyz", "abc")));
        Person p6 = new Person("Zeynep", "Turkerel", new ArrayList<>(Arrays.asList("xel", "abc")), new ArrayList<>(Arrays.asList("xyz", "abc")));

        //Kişiler tekildir (isim ve soyisimlerine göre karşılaştırıldı)
        personList.add(p4);
        personList.add(p2);
        personList.add(p3);
        personList.add(p2);
        personList.add(p5);
        personList.add(p3);
        personList.add(p5);
        personList.add(p1);
        personList.add(p1);
        personList.add(p6);
        personList.add(p1);
        personList.add(p1);
        personList.add(p5);
        personList.add(p5);
        personList.add(p5);

        System.out.println("\n --- List People --- \n");
        personList.listPerson();
        System.out.println("\n --- Sort By Name --- \n");
        printTreeSet(personList.sortByName());
        System.out.println("\n --- Sort By Surname --- \n");
        printTreeSet(personList.sortBySurname());
        System.out.println("\n --- Search 'el' --- \n");
        printTreeSet(personList.search("el"));
    }

    private static void printTreeSet(TreeSet<Person> people) {
        Iterator iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = (Person) iterator.next();
            System.out.println(person.toString());
        }
    }
}