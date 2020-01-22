

/*
 * Program to check whether a number is a power of 2 or not
 *
 */

class PowerOfTwo {
    static void checkIfPowerOfTwo(int nbr) {

        while (nbr % 2 == 0) {
            nbr = nbr / 2;
            if (nbr == 1) {
                System.out.println("Power of 2");
                System.exit(0);
            }
        }
        System.out.println("Not a Power of 2");
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        int x = 16;
        checkIfPowerOfTwo(x);
    }
}
