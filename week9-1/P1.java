public class P1 {
    public static void main(String args[]) throws Exception{
        try{
            throw new Exception("Exception is thrown");
        }
        catch(Exception e){
            System.out.println("Exception is handled.");
        }
        finally{
            System.out.println("this is the statement in the finally block.");
        }
    }
}
