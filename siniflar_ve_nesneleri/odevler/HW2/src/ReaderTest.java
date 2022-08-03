public class ReaderTest {
    public static void main(String[] args) {

        Reader reader1 = new Reader("Zeynep", 24, 'K');
        Reader reader2 = new Reader("Lütfullah", 26, 'E');

        reader1.getInfo();
        reader2.getInfo();
        System.out.println();

        Author author1 = new Author("Sefa Güzel");
        Author author2 = new Author("Kübra Kibar");

        author1.getInfo();
        author2.getInfo();
        System.out.println();

        Book book1 = new Book(author1, "Güneşin Ardında", 256, "Roman", false, 0);
        Book book2 = new Book(author2, "Yaprak Dökümü", 500, "Roman", true, 0);

        book1.getInfo();
        book2.getInfo();
        System.out.println();

        reader1.read(book1);
        book1.setCurrentPage(100);
        reader1.read(book1);
        book1.setCurrentPage(256);
        reader1.read(book1);

        System.out.println();

        reader2.read(book2);
        book2.setCurrentPage(50);
        reader2.read(book2);
        book2.setCurrentPage(150);
        reader2.read(book2);
        book2.setCurrentPage(256);
        reader2.read(book2);
        book2.setCurrentPage(400);
        reader2.read(book2);
        book2.setCurrentPage(500);
        reader2.read(book2);
    }
}
