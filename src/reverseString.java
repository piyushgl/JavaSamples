public class ReverseString {
    public void reverseString(char[] s) {
        // write your code here
        int right = s.length-1; //4
        int left=0;
        
        while(left < right){
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
            
        }
        System.out.println(s);
    }
}
