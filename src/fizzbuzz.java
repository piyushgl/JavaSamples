import java.util.*;

public class Exercise {
    public String[] fizzBuzz(int n) {
        // write your code here
        String[] strArray = new String[n];
        // call if else logic method
        compute(n,1,strArray);
         System.out.println(Arrays.asList(strArray));
        return strArray;
    }
    
    // write if else logic method
    String[] compute(int nbr,int counter, String[] strArray){
        boolean divby3 = false;
        boolean divby5 = false;
        System.out.println(nbr);
        System.out.println(counter);
        strArray[counter-1] = String.valueOf(counter);
        if(counter%3 == 0){
            divby3 = true;
            strArray[counter-1] = "Fizz";
            System.out.println("divby3");
        }
        if(counter%5 == 0){
            divby5 = true;
            strArray[counter-1] = "Buzz";
            System.out.println("divby5");
        }
        if(divby3 && divby5){
            strArray[counter-1] = "FizzBuzz";
        }
        
        if(nbr==counter)
        return strArray;
        else
        compute(nbr,counter+1,strArray);
        return strArray;
    }
}