
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class MoveZerosInFront {
    static void allZeroInFront(int arr[], int len) {
        int count = len - 1;
        for (int i = len - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                arr[count--] = arr[i];
                System.out.println(Arrays.toString(arr));
            }

        }
        while (count >= 0)
            arr[count--] = 0;
        System.out.print(Arrays.toString(arr));

    }


    // Driver program to test above functions
    public static void main(String[] args) {
        int arr1[] = {1, 0, 45, 0, 10, 19};
        allZeroInFront(arr1, arr1.length);


    }
}
