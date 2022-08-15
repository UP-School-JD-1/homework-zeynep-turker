public class Author {
    String name;

    public Author(String name) {
        this.name = name;
        System.out.println("Author is created.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println("Author Information : name=" + name);
    }
}