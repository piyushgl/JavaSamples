
/*
 * Program to check whether two strings are permuations
 *
 */

import static java.util.Arrays.sort;

class StringPermutationChecker {
    static boolean compareString(String one, String two) {
        //if size needs to be same

        if (one.length() != two.length())
            return false;
        //sort
        char[] oneArray = one.toCharArray();
        sort(oneArray);
        char[] twoArray = two.toCharArray();
        sort(twoArray);
        return (new String(oneArray).equals(new String(twoArray)));
    }


    // Driver program to test above functions
    public static void main(String[] args) {
        System.out.println(compareString("road", "doar"));
        System.out.println(compareString("road", "door"));
    }
}
