class A{
    public void a(){
        System.out.println("HI");
    }
}
public class P4 {
    public static void main(String args[]){
        try{
            A a = new A();
        }
        catch(Exception e){
            System.out.println("Class is not found or moved from the classpath.");
        }
    }
}
