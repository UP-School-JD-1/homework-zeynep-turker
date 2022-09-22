import java.util.ArrayList;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private ArrayList<String> addresses;
    private ArrayList<String> phones;

    public Person(String name, String surname, ArrayList<String> addresses, ArrayList<String> phones) {
        this.name = name;
        this.surname = surname;
        this.addresses = addresses;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ArrayList<String> getAddresses() {
        return addresses;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    @Override
    public int hashCode() {
        return getName().hashCode() + getSurname().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Person person = (Person) obj;
        if (getSurname().equals(person.getSurname())) {
            return getName().equals(person.getName());
        }
        return false;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + addresses.toString() + " " + phones.toString();
    }

    @Override
    public int compareTo(Person o) {
        if (getSurname().equals(o.getSurname()) && getName().equals(o.getName())) return 0;
        else if (getSurname().equals(o.getSurname())) return getName().compareTo(o.getName());
        return getSurname().compareTo(o.getSurname());
    }
}
