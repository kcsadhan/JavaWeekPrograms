import shapes.*;
public class P2 {
    public static void main(String args[]){
        shapes.Rectangle rect = new shapes.Rectangle();
        rect.area(5.0, 6.0);
        rect.perimeter(6,7);
        shapes.Circle circle = new shapes.Circle();
        circle.area(6.0);
        circle.perimeter(6.0);
    }
}
