import java.util.*;

class UniqueFromTwoList{
    public static void main(String[] args){
        List<Integer> ls1 = Arrays.asList(2,3);
        List<Integer> ls2 = Arrays.asList(1,2,3);

        Set<Integer> unique = new HashSet<Integer>();
        for(int a: ls1)
        unique.add(a);

        for(int b:ls2)
        unique.add(b);

        System.out.println(unique);

    }
}
