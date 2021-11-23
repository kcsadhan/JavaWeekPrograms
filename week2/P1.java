
public class P1 {
    
    public static void main(String args[]){
        int arr[] = new int[args.length], temp =0;
        for(int i=0; i<args.length; i++)
            arr[i]=Integer.parseInt(args[i]);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                     P1.swap(arr[i], arr[j]);
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i:arr)
            System.out.println(i);
    }

    public static int swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        return 0;
    }
}
