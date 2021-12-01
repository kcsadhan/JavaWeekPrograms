public class P2 {
    public static void main(String args[]){
        try{
            int a = 10/0;
        }
        catch(Exception e){
            System.out.println("parent exception.");
        }
        catch(ArithmeticException e){
            System.out.println("Child exception.");
        }
    }
}
