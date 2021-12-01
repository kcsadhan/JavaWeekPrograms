public class P3 extends Thread{
    public void wait(int n){
        try{
            Thread.sleep(n);
        }
        catch(Exception e){}
    }
    public void run(){
        while(true){
            System.out.println("Red");
            wait(1000);
            System.out.println("Red off");
            System.out.println("Orange ");
            wait(1000);
            System.out.println("Orange off");
            System.out.println("Green");
            wait(1000);
        }

    }
    public static void main(String args[]){
        P3 p3 = new P3();
        p3.start();
    }
}