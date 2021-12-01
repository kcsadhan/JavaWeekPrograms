import utilities.Arrinput;
public class P5 {
    public static void main(String args[]){
        int a[][], b[][], i=0,j=0,sum,k=0;
        a= Arrinput.arrInput();
        b=Arrinput.arrInput();
        if(a[0].length==b.length){
            while(i<a.length){
                sum=0;j=0;
                while(j<a[0].length){
                    sum+=a[i][j]*b[j][k];
                    j++;
                }
                System.out.print(sum+"\t");
                k++;
                if(k==b[0].length){
                    System.out.println();
                    k=0;i++;
                }

            }

        }
    }
}
