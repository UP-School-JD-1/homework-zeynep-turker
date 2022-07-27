import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("İlk matrix in satır sayısını giriniz: ");
        int row1 = in.nextInt();
        System.out.println("İlk matrix in sütun sayısını giriniz: ");
        int column1 = in.nextInt();
        System.out.println("İkinci matrix in satır sayısını giriniz: ");
        int row2 = in.nextInt();
        System.out.println("İkinci matrix in sütun sayısını giriniz: ");
        int column2 = in.nextInt();

        int[][] matrix1 = new int[row1][column1];
        int[][] matrix2 = new int[row2][column2];

        System.out.println("Lütfen ilk matrix i doldurunuz");
        for (int i = 0; i < row1; ++i) {
            for (int j = 0; j < column1; ++j) {
                matrix1[i][j] = in.nextInt();
            }
        }
        printArray(matrix1);
        System.out.println("Lütfen ikinci matrix i doldurunuz");
        for (int i = 0; i < row2; ++i) {
            for (int j = 0; j < column2; ++j) {
                matrix2[i][j] = in.nextInt();
            }
        }
        printArray(matrix2);

        calculateMatrixMultiplication(matrix1, matrix2);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                System.out.print(array[i][j]);
                if (j != array[i].length - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void calculateMatrixMultiplication(int[][] matrix1, int[][] matrix2) {
        int[][] matrix = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                matrix[i][j] = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    matrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("\nMatrixlerin çarpımı: ");
        printArray(matrix);
    }
}
