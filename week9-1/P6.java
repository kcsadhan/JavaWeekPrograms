class TestException extends Exception {
    public TestException(String str){
        super(str);
    }
}
public class P6{
    public static void main(String args[]){
        try{
            throw new TestException("test message from test exception.");
        }
        catch(TestException e){
            System.out.println(e.getMessage());
        }
    }
}
