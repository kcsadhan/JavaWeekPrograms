//6. Write an application that declares 5 integers, determines and prints the largest and 
//smallest in the group
public class P6 {
    public static void main(String args[]){
        int max = Integer.parseInt(args[0]);
        for(int i =0; i< args.length; i++){
            if(max<Integer.parseInt(args[i]))
                max=Integer.parseInt(args[i]);
            
        }
        System.out.println(max);
    }
}
