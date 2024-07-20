class LongestPrefix {
    static String comp(String[] strns) {
        String pf = strns[0];
        for(int start =1; start < strns.length; start++){
            while(strns[start].indexOf(pf)!=0){
                pf = pf.substring(0,pf.length()-1);
                if(pf.isEmpty())
                return "";
            }
        }

        return pf;
    }


    // Driver program to test above functions
    public static void main(String[] args) {
        String[] strns = {"flower","flow","flight"};
        System.out.println(comp(strns));
    }
}