import java.util.*;
import java.io.*;
class P4{
    public static void main(String args[]){
        int num;
        Scanner sc =new Scanner(System.in);
        int a[]= new int[5];
        int i=0, flag=0;
        while( i < 5){
            System.out.printf("Enter number %d/5: ",i+1 );
            num = sc.nextInt();
            if(num<10 || num>100)
                continue;
            a[i++]=num;
            System.out.printf("Unique values are: %d ",a[0]);
            for(int j=1; j<a.length;j++){
                flag = 0;
                for(int k=j-1;k>=0;k--){
                    if(a[j]==a[k]){
                        flag =1;
                        break;
                    }


                }
                if(flag==0&&a[j]>0)
                    System.out.print(a[j]+" ");
            }
            System.out.println();
        }

    }
}
