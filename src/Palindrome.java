

/*
 * to check whether its a palindrome or not
 */

class Palindrome {
    static boolean checkPalindrome(int nbr) {

        int rev = 0, temp = 0;
        int orig = nbr;
        while (nbr > 0) {
            temp = nbr % 10;
            rev = rev * 10 + temp;
            nbr = nbr / 10;
        }
        if (orig == rev)
            return true;
        else
            return false;
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        int x = 9219;
        System.out.println(checkPalindrome(x));
        x = 1;
        System.out.println(checkPalindrome(x));
        x = 313;
        System.out.println(checkPalindrome(x));
    }
}
