public class Main {

    public static void main(String[] args) {
        drawRectangle1(10, 10);
        System.out.println();
        drawRectangle2(10, 10);
        System.out.println();
        drawRectangle3(10);
        System.out.println();
        drawRectangle4(5);
        System.out.println();
    }

    public static void print(char[][] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                System.out.print(array[i][j]);
            }
        }
    }

    /**
     * ********
     * ********
     * ********
     * ********
     * ********
     *
     * @param col column
     * @param row row
     */
    public static void drawRectangle1(int col, int row) {
        char[][] array = new char[row][col + 1];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col + 1; ++j) {
                array[i][j] = '*';

                if (j == col)
                    array[i][j] = '\n';
            }
        }
        print(array);
    }

    /**
     * ********
     * *      *
     * *      *
     * *      *
     * *      *
     * *      *
     * ********
     *
     * @param col column
     * @param row row
     */
    public static void drawRectangle2(int col, int row) {
        char[][] array = new char[row][col + 1];
        for (int i = 0; i < row; ++i) {
            if (i == 0 || i == row - 1) {
                for (int j = 0; j < col + 1; ++j) {
                    array[i][j] = '*';

                    if (j == col)
                        array[i][j] = '\n';
                }
            } else {
                for (int j = 0; j < col + 1; ++j) {
                    if (j == 0 || j == col - 1) {
                        array[i][j] = '*';
                    } else array[i][j] = ' ';

                    if (j == col)
                        array[i][j] = '\n';
                }

            }
        }
        print(array);
    }

    /**
     * *
     * ***
     * *****
     * *******
     * *********
     * ***********
     * *************
     * ***************
     *
     * @param row row
     */
    public static void drawRectangle3(int row) {
        char[][] array = new char[row][];

        int col = 1;
        for (int i = 0; i < row; ++i) {
            array[i] = new char[col + 1];
            for (int j = 0; j < col + 1; ++j) {
                array[i][j] = '*';
                if (j == col) array[i][j] = '\n';
            }
            col += 2;
        }
        print(array);
    }

    /**
     *     *
     *    ***
     *   *****
     *  *******
     * *********
     *
     * @param row row
     */
    public static void drawRectangle4(int row) {
        char[][] array = new char[row][];

        int col = 1;
        int space = row - 1;
        int k;

        for (int i = 0; i < row; ++i) {
            k = 0;
            array[i] = new char[space + col + 1];
            for (int j = 0; j < space; ++j) {
                array[i][k] = ' ';
                k++;
            }
            for (int j = 0; j < col + 1; ++j) {
                if (j == col) {
                    array[i][k] = '\n';
                    break;
                }
                array[i][k] = '*';
                k++;
            }
            space--;
            col += 2;
        }
        print(array);
    }
}
