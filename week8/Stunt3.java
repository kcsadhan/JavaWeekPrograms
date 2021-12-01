import pack2.*;
public class Stunt3 implements pack2.printable{
    public void m1(){
        System.out.println("Hi bro");
    }
    public static void main(String args[]){
        pack2.P5 p5 = new pack2.P5();
        p5.m1();
        Stunt3 stunt = new Stunt3();
        stunt.m1();
        
    }
}
