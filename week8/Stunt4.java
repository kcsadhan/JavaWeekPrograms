import com.apple.*;
public class Stunt4 implements com.apple.runnable {
    public void m1(){
        System.out.println("this is the method from runnable interface.");
    }
    public static void main(String args[]){
        Stunt4 stunt = new Stunt4();
        com.apple.P4 p4 = new com.apple.P4();
        p4.hi();
        stunt.m1();

    }
}
