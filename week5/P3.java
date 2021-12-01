class CallByValue{
    int age = 23;
    void change(int age){
        age+=10;
        System.out.println("Age in local: "+age);
    }
}
class CallByObject{
    int age = 23;
    void change(CallByObject x){
        age+=10;
        System.out.println("Age in local: "+age);
    }
}
public class P3 {
    public static void main(String args[]){
        CallByValue test = new CallByValue();
        System.out.println(test.age);
        test.change(100);
        System.out.println(test.age);
        CallByObject test2 = new CallByObject();
        System.out.println(test2.age);
        test2.change(test2);
        System.out.println(test2.age);
        
    }
}
