import java.io.*;
import java.util.*;

/*
 * To print fibbonaci series
 */

class Fibbonaci {
    static int[] printSeries(int len) {
        int[] arr = new int[len];
        arr[0] = 0;
        if (len == 1)
            return (arr);
        arr[1] = 1;
        if (len == 2)
            return (arr);
        int end = 2;

        while (end < len) {
            arr[end] = arr[end - 2] + arr[end - 1];
            end++;
        }

        return (arr);
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        int x = 4;
        System.out.println(Arrays.toString(printSeries(x)));
        x = 1;
        System.out.println(Arrays.toString(printSeries(x)));
        x = 2;
        System.out.println(Arrays.toString(printSeries(x)));

    }
}
