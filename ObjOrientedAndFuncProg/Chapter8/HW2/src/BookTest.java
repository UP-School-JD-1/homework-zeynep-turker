import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter and The Sorcerers Stone", "JK", "Rowling", 411);
        Book book2 = new Book("Miss Peregrine's Home for Peculiar Children", "Ranson", "Riggs", 382);
        Book book3 = new Book("Java Tutorial", "Mark", "Randall", 717);
        Book book4 = new Book("Java Lambdas", "John", "Maguire", 182);

        Comparator<Book> comparatorByPageNumber = (b1, b2) -> b1.getPages() - b2.getPages();

        BinaryOperator<Book> maxPageNumberOperator = BinaryOperator.maxBy(comparatorByPageNumber);

        System.out.println("\n--- Comparing " + book1.getPages() + " and " + book2.getPages() + " ---");
        System.out.println("Max page number -> " + maxPageNumberOperator.apply(book1, book2).getPages());
        System.out.println("\n--- Comparing " + book3.getPages() + " and " + book4.getPages() + " ---");
        System.out.println("Max page number -> " + maxPageNumberOperator.apply(book3, book4).getPages());
    }
}