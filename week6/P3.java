class Parent{
    void sayHi(){
        System.out.println("Hi, I'm a method from Parent class");
    }
}
class Child extends Parent{
    void sayHi(){
        super.sayHi();
        System.out.println("Hi, I'm a method from Child class");
    }
}
public class P3 {
    public static void main(String args[]){
        Child test = new Child();
        test.sayHi();
    }
}
