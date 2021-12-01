import javax.lang.model.util.ElementScanner6;

interface Fare{
    double getFare();
    double getAmount();
}
class Bus implements Fare{
    double dis;
    String type;
    double lux;
    Bus(double a, String b){
        dis = a;
        type = b;
        if(type.equals("sleeper"))
            lux =1;
        else if (type.equals("ac"))
            lux =2;
        else if (type.equals("nonac"))
            lux =1.5;
        else 
            lux =0.0;
    }
    
    public double getFare(){
        return 2000+(dis*lux/10);

    }
    public double getAmount(){
        return 500+(dis*lux/15);
    }
}
public class P5 {
    public static void main(String args[]){
        Bus bus = new Bus(6, "nonac");
        System.out.println(bus.getFare());
        System.out.println(bus.getAmount());
    }
}
