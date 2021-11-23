//5. Write a java program to find whether given number is Palindrome or not

public class P5 {
    public static void main(String args[]){
        int num = Integer.parseInt(args[0]);
        int sum=0, temp=num, rem=0;
        while(num>0){
            rem=num%10;
            sum= sum*10 + rem;
            num/=10;

        }
        //System.out.println(sum);
        if(sum==temp)
            System.out.println("the entered number is palindrome!");
        else
            System.out.println("the entered number is not a palindrome!");
    }
}
