public class Exercise {
    public int findSingleNumber(int[] nums) {
        // write your code here
        int nn = 0;
        for(int num: nums){
            nn = nn ^ num;
        }
        return nn;
    }
}