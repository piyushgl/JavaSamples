import java.util.*;

/*
one of the string characters are rotated and compared 
*/
class SkewStringComapartor{
    public static void main(String args[]){
        System.out.println("enter str");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("enter str2");
        String str2 = sc.next();
        System.out.println(skewAndCompare(str,str2));
        sc.close();

    }

    static boolean skewAndCompare(String str, String str2){

        String temp = str2;
        if(str.equalsIgnoreCase(temp))
            return true;
        char first;    
        for(int i=0; i<str2.length()-1; i++){
            
            first = temp.charAt(0);
            temp = temp.substring(1) + first;
            if(str.equalsIgnoreCase(temp))
                return true;
        }
        return false;
    }
}

/* testcases
//str= abcd
//str2= cdab rotate
      //dabc
      //abcd
      //bcda      

//wer
//fdr
*/