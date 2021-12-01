package utilities;
import java.util.*;
public class Arrinput{
    public static int[][] arrInput(){
        Scanner ip = new Scanner(System.in);
        int len1,len2, arr[][];
        
        System.out.println("Enter rows:");
        len1 = ip.nextInt();

        System.out.println("Enter coloums:");
        len2 = ip.nextInt();
        arr=new int[len1][len2];
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                arr[i][j]=ip.nextInt();
            }
        }
        return arr;
    }
}