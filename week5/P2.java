class Circle{
    double radius;
    void circleArea(){
        System.out.println("the area of the circle is: "+(3.14*radius*radius));
    }
    void circlePerimeter(){
        System.out.println("The circumference of the circle is: "+ 6.28*radius);
    }
}
public class P2 {
    public static void main(String args[]){
        Circle circle = new Circle();
        circle.radius = Double.parseDouble(args[0]);
        circle.circleArea();
        circle.circlePerimeter();
    }
}
