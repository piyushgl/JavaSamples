import java.util.*;

class StringWithUniqueCharacters {


    // Driver program to test above functions
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String input= sc.next();
        sc.close();
        checkIfUnique(input);
    }

    static void checkIfUnique(String testString){
        Set<Character> uniqueHashSet = new HashSet<Character>();
        for(char ch : testString.toCharArray()){
            if(!uniqueHashSet.add(ch)){
                System.out.println("not all unique characters");
                break;
            }
        }
    }
}
