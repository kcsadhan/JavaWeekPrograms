import java.util.*;
public class P3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = "how much would a wood chuck chuck if a wood chuck could chuck could chuck wood";
        System.out.println("Enter any character of the entered string: ");
        char key = in.next().charAt(0);
        int count =0;
        for(int i=0;i<s.length();i++){
            if(key == s.charAt(i))
                count++;
        }
        System.out.printf("The entered character %c is occured %d times.\n",key,count);

    }
}
