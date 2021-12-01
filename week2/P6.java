public class P6{
    public static void main(String args[]){
        String arr[]=new String[args.length];
        String temp;
        for(int i =0;i<args.length;i++){
            arr[i]=args[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].compareTo(arr[j])>0){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        for(String i : arr){
            System.out.print(i+" ");
        }
    }
}