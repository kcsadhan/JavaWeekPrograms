import java.util.*;
public class P3 {
    public static void main(String args[]){
        int arr[],key,low,high,len,mid;
        low=0;
        Scanner ip = new Scanner(System.in);
        len=ip.nextInt();
        high = len-1;
        arr=new int[len];
        for(int i=0;i<len;i++)
            arr[i]=ip.nextInt();
        System.out.println("Enter key: ");
        key = ip.nextInt();
        mid = (low+high)/2;
        while(low<=mid){
            //mid=(low+high)/2;
            if(arr[mid]==key){
                System.out.println("key is found at index "+mid);
                break;
            }
            else if(arr[mid]<key)
                low=mid+1;
            else
                high = mid-1;
            mid=(low+high)/2;

        }

    }
}
