public class Reader {
    String name;
    int age;
    char sex;

    public Reader(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    void read(Book book) {
        if (book.currentPage == 0) System.out.println(name + ", " + book.title + " kitabını okumaya başladı.");
        else if (book.currentPage == book.page)
            System.out.println(name + ", " + book.title + " kitabınının " +book.currentPage + ". sayfasını okudu ve kitabı okumayı bitirdi.");
        else
            System.out.println(name + ", " + book.title + " kitabının " + book.currentPage + ". sayfasından okumaya devam ediyor.");
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
        System.out.println("Reader oluşturuldu. Bilgileri: name='" + name + '\'' + ", age=" + age + ", sex=" + sex + '}');
    }
}
