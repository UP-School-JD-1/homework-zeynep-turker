public class Reader {
    String name;
    int age;
    char sex;

    public Reader(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("Reader is created.");
    }

    void read(Book book) {
        if (book.currentPage == 0) System.out.println(name + " started to read the " + book.title + " book.");
        else if (book.currentPage == book.page)
            System.out.println(name + " read the " + book.currentPage + "th page of the " + book.title + " and finished reading the book.");
        else
            System.out.println(name + " continues to read from the " + book.currentPage + "th page of the " + book.title + " book.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void getInfo() {
        System.out.println("Reader Information : name=" + name + ", age=" + age + ", sex=" + sex);
    }
}