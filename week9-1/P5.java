public class P5 {
    public static void main(String args[]){
        try{
            int a = Integer.parseInt(args[0]);
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException is occured.");
        }
    }
}
