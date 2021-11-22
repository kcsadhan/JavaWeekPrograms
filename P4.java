public class P4 {
    public static int prime(int x){
        int count =0;
        for(int i=1;i<=x;i++){
            if(x%i==0)
                count++;
            
        }
        return count;
    }
    public static void main(String args[]){
        int num = Integer.parseInt(args[0]);
        for(int i=1;i<=num;i++){
            if(num%i==0){
                if(P4.prime(i)==2)
                    System.out.println(i);
            }
        }
        //System.out.println(P4.prime(4));
    }
}
