public class Main {

	public static void main(String[] args) {
		drawRectangle1(5,5);
        System.out.println();
		drawRectangle2(5,5);
        System.out.println();
		drawRectangle3(5);
        System.out.println();
		drawRectangle4(5);
        System.out.println();
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
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
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
		for (int i = 0; i < row; ++i) {
			if (i == 0 || i == row - 1) {
				for (int j = 0; j < col; ++j) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 0; j < col; ++j) {
					if (j == 0 || j == col - 1) {
						System.out.print("*");
					} else System.out.print(" ");
				}
				System.out.println();
			}
		}
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
		int col = 1;
		for (int i = 0; i < row; ++i) {
			for (int j = 0; j < col; ++j) {
				System.out.print("*");
			}
			System.out.println();
			col += 2;
		}
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
		int col = 1;
		int space = row - 1;

		for (int i = 0; i < row; ++i) {
			for (int j = 0; j < space; ++j) {
				System.out.print(" ");
			}
			for (int j = 0; j < col; ++j) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			col += 2;
		}
	}
}
