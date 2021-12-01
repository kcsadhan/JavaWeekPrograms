class Test{
    int x,y;
    Test(){
        this(10,20);
    }
    Test(int a, int b){
        x=a;
        y=b;
    }
    void show(){
        System.out.printf(" x: %d and y: %d\n",x,y);
    }
}
class Static{
    static int x=5,y=10;
    static{
        System.out.println("This is the statement from static block.");
    }
    static void sayHi(){
        System.out.println("hi this is the statement from static method ");
    }

}
public class P4 {
    public static void main(String args[]){
        Test a = new Test();
        a.show();
        Test b = new Test(50, 60);
        b.show();
        Static.sayHi();
        System.out.print(Static.x+Static.y);


    }
}
