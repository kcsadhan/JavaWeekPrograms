//package week2;
import utilities.Arrinput;
public class P4 {
    public static void main(String args[]){
         int a[][], b[][];
         a=Arrinput.arrInput();
         b=Arrinput.arrInput();
         if(a.length==b.length){
             if(a[0].length==b[0].length){
                 for(int i=0;i<a.length;i++){
                     for(int j=0;j<a[0].length;j++){
                         System.out.print((a[i][j]+b[i][j])+"\t");

                     }
                     System.out.println("\n");
                 }
             }
             else
                System.out.println("matrices are not matched");
        
         }
         else
            System.out.println("matrices are not matched");
    }
}
