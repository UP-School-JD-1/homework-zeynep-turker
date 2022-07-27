import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 3, 87, 56, 1, 87, 3, 2};
        createUniqueElement(array);

    }

    private static void createUniqueElement(int[] array) {
        for(int i=0; i<array.length-1; ++i){
            int element = array[i];
            for (int j=i+1; j<array.length; ++j){
                if (element == array[j]){
                    System.out.println(array[j] + " siliniyor..");
                    array = removeElement(array, j);
                    System.out.println("Yeni Array : " + Arrays.toString(array));
                }
            }
        }
    }
    private static int[] removeElement(int[] array, int index) {
        int[] copyArray = new int[array.length-1];
        for (int i=0; i<index; ++i)
            copyArray[i] = array[i];
        for(int i=index; i<array.length - 1; ++i) {
            copyArray[i] = array[i+1];
        }
        return copyArray;
    }
}
