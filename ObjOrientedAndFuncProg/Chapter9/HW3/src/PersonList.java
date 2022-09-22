import java.util.*;

public class PersonList {
    private TreeSet<Person> people;

    /**
     * TreeSet e eklenen elemanları soyisimlere göre sıraladım.
     * Tekillik isim ve soyisime göre belirlendi.
     */
    PersonList() {
        Comparator<Person> comparatorByNameSurname = (p1, p2) -> {
            if (p1.getSurname().equals(p2.getSurname())) {
                return p1.getName().compareTo(p2.getName());
            }
            return p1.getSurname().compareTo(p2.getSurname());
        };
        people = new TreeSet<>(comparatorByNameSurname);
    }

    public boolean add(Person person) {
        return people.add(person);
    }

    public void listPerson() {
        Iterator iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = (Person) iterator.next();
            System.out.println(person.toString());
        }
    }

    /**
     * @param value aranacak değer
     * @return değere sahip olan People listesi
     */
    public TreeSet<Person> search(String value) {
        TreeSet<Person> result = new TreeSet<>();
        Iterator iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = (Person) iterator.next();
            boolean foundInAddresses = person.getAddresses().stream().anyMatch(s -> s.contains(value));
            boolean foundInPhones = person.getPhones().stream().anyMatch(s -> s.contains(value));

            if ((person.getName().contains(value)) || person.getSurname().contains(value) || foundInAddresses || foundInPhones) {
                result.add(person);
            }
        }
        return result;
    }

    /**
     * isme göre sort edilen yeni TreeSet oluşturuldu
     *
     * @return yeni TreeSet
     */
    public TreeSet<Person> sortByName() {
        Comparator<Person> comparatorByName = (p1, p2) -> p1.getName().compareTo(p2.getName());
        TreeSet<Person> newTreeSet = new TreeSet<>(comparatorByName);
        newTreeSet.addAll(people);
        return newTreeSet;
    }

    /**
     * soyisime göre sort edilen yeni TreeSet oluşturuldu
     *
     * @return yeni TreeSet
     */
    public TreeSet<Person> sortBySurname() {
        Comparator<Person> comparatorBySurname = (p1, p2) -> p1.getSurname().compareTo(p2.getSurname());
        TreeSet<Person> newTreeSet = new TreeSet<>(comparatorBySurname);
        newTreeSet.addAll(people);
        return newTreeSet;
    }
}