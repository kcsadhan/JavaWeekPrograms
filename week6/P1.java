class Shape{
    void area(float x){
        System.out.println("the area of square: "+ Math.pow(x,2)+"sq.units");
    }
    void area(float x, float y){
        System.out.println("The area of the Rectangle is : "+ x*y + "Sq units");

    }
    void area(double x){
        System.out.println("The area of the circle is : "+ 3.14*x*x);
    }

}
public class P1 {
    public static void main(String args[]){
        Shape s = new Shape();
        s.area(10.0);
        s.area(10.0f);
        s.area(12.3f, 12.4f);
    
    }
}
