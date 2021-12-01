class TestError {
    void one() throws Exception{
        try{
            two();
        }
        catch(Exception e){
            throw new Exception("exception raised in method 1");
        }

    }
    void two() throws Exception{
        throw new Exception("exception raised in method 2");

    }
    
}
public class P3{
    public static void main(String args[]){
        TestError test = new TestError();
        try{
            test.one();
        }
        catch(Exception e){
            System.out.println("Exception is handled.");
        }
    }
}
