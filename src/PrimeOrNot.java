/*
 * to check whether a nbr is prime or not
 */

class PrimeOrNot {
    static boolean checkPrimeOrNot(int nbr) {
        int i = 2;
        if (nbr == 2)
            return true;
        while (i <= (nbr / 2)) {
            if (nbr % i == 0)
                return false;
            i++;
        }
        return true;
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        int x = 15;
        System.out.println(checkPrimeOrNot(x));
        x = 2;
        System.out.println(checkPrimeOrNot(x));
        x = 3;
        System.out.println(checkPrimeOrNot(x));
        x = 4;
        System.out.println(checkPrimeOrNot(x));
        x = 5;
        System.out.println(checkPrimeOrNot(x));

    }
}
