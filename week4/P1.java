import java.util.*;
public class P1 {
    public static void main(String args[]){
        String s1,s2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        s1=in.next();
        System.out.println("Enter string 2: ");
        s2=in.next();
        System.out.println(s1.compareTo(s2));
        if(s1.compareTo(s2)>0)
            System.out.println("First string is greater than Second string.");
        else if(s1.compareTo(s2)<0)
            System.out.println("First string is smaller than Second string.");
        else
            System.out.println("Both strings are equal.");
        System.out.println(s1.concat(s2));
    }
}
