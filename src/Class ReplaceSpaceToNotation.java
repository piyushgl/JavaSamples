import java.util.*;

/*
converts a statement to show %20 instead of spaces
*/
class ReplaceSpaceToNotation{
    public static void main(String args[]){
        System.out.println("Enter a statement");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chArray = str.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for(int a: chArray){
            System.out.println(a);
            if(a == 32)
            buffer.append("%20");
            else
            buffer.append((char)a);
        }
        System.out.println("%20 added:"+buffer);
    }
}