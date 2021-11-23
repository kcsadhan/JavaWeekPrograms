import java.util.*;
public class P2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len, ele, i,count=-1,flag=0;
        len=input.nextInt();
        int arr[]=new int[len];
        System.out.println("enter the values in the array:");
        for(i=0;i<len;i++)
            arr[i]=input.nextInt();
        System.out.println("Enter the key to search: ");
        ele = input.nextInt();
        for(int j:arr){
            count++;
            if(j==ele){
                System.out.println("the key you entered is found at index: "+count);
                flag =1;
            }

            
        }
        if(flag==0)
            System.out.println("The key you entered is not found");
        
        
    }
}
