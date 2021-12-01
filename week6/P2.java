class OverLoading{
    void say(int a, int b){
        System.out.println("the sum is: "+ (a+b)+"\n");
    }
    void say(int a, char b){
        System.out.printf("you entered a char:%c, a int: %d\n",b,a);
    }
    void say(int a){
        System.out.printf("you entered an integer only: %d\n", a);
    }
}
class P2{
    public static void main(String args[]){
        OverLoading test = new OverLoading();
        test.say(5);
        test.say(5,'x');
        test.say(5,6);
    }
}