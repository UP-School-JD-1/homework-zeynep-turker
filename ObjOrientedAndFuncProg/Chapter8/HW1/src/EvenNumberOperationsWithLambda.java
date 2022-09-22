import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

public class EvenNumberOperationsWithLambda {

    private static int total;
    private static int product = 1;
    private static int[] squares = new int[5];

    public static void main(String[] args) {
        IntConsumer printer = (i) -> System.out.print(i + " ");
        pickEvenNumber(10, printer);

        System.out.println();

        IntConsumer addOperator = i -> total += i;
        pickEvenNumber(10, addOperator);

        System.out.println("Sum: " + total);

        IntConsumer multiplyOperator = i -> product *= i;
        pickEvenNumber(10, multiplyOperator);
        System.out.println("Product: " + product);

        IntConsumer squareOperator = i -> squares[i / 2 - 1] = i * i;
        pickEvenNumber(10, squareOperator);

        System.out.print("Squares: ");
        for (int i : squares)
            printer.accept(i); //printer kullanıldı
    }

    public static void pickEvenNumber(int n, IntConsumer operation) {
        for (int i = 2; i <= n; i += 2)
            operation.accept(i);
    }
}
