public class P4 {
    public static void main(String args[]){
        String str = args[0], rev="";
        for(int i=str.length()-1;i>=0;i--)
            rev+=(str.charAt(i));
        System.out.println(rev);
        //String c ="abc"+'a';

    }
}
