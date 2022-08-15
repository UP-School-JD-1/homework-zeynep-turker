public class ReaderTest {
    public static void main(String[] args) {
        ReaderTest readerTest = new ReaderTest();
        readerTest.printBookTypes();
        readerTest.changeBookTypes();
        readerTest.printBookTypes();
        System.out.println();

        Reader reader1 = new Reader("Zeynep", 24, 'K');
        reader1.getInfo();
        Reader reader2 = new Reader("Lütfullah", 26, 'E');
        reader2.getInfo();

        System.out.println();

        Author author1 = new Author("Sefa Güzel");
        author1.getInfo();
        Author author2 = new Author("Kübra Kibar");
        author2.getInfo();

        System.out.println();

        Book book1 = new Book(author1, "Güneşin Ardında", 256, BookType.FICTION, false, 0);
        book1.getInfo();
        Book book2 = new Book(author2, "Tablonun Ardında", 500, BookType.HORROR, true, 0);
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

    private void changeBookTypes() {
        System.out.println("Book Types is changing..");
        BookType.ACTION.setDescription("ACTION");
        BookType.FICTION.setDescription("FICTION");
        BookType.NON_FICTION.setDescription("NON_FICTION");
        BookType.SCINTIFIC.setDescription("SCINTIFIC");
        BookType.HORROR.setDescription("HORROR");
    }

    public void printBookTypes() {
        System.out.print("Book Types : ");

        for (BookType bookType : BookType.values()) {
            System.out.print(bookType.getDescription() + ", ");
        }
        System.out.println();
    }

}