interface Vehicle{
    String getColor();
    int getNumber();
    double getConsume();
}
class TW implements Vehicle{

    int num;
    String color;
    double consumption;
    TW(int num,  String color, double consumtion){
        this.num = num;
        this.color = color;
        this.consumption= consumtion;
    }
    public String getColor(){
        return color;
    }
    public int getNumber(){
        return num;
    }
    public double getConsume(){
        return consumption;
    }

}
public class P4{
    public static void main(String args[]){
        TW test = new TW(6,"red", 6.6);
        System.out.println(test.getColor());
        System.out.println(test.getNumber());
        System.out.println(test.getConsume());
    }
}
