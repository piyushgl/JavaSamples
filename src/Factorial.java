


/*
 * To find factorial
 */

class Factorial {
    static int factorial(int nbr) {
        if (nbr == 1)
            return 1;
        else
            return nbr * factorial(nbr - 1);
    }


    // Driver program to test above functions
    public static void main(String[] args) {
        int x = 4;
        System.out.println(factorial(x));
    }
}
