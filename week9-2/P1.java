public class P1 extends Thread {
    public void run(){
        System.out.println("thread is running.");
    }
    public static void main(String args[]){
        P1 test = new P1();
        test.start();
    }

}
