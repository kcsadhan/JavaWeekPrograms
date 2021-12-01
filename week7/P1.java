abstract class Shapes {
    public abstract double area();
    public abstract double volume();
    
}
class Circle extends Shapes{
    int r;
    Circle(int r){
        this.r = r;
    }
    public double area(){
        return 3.14*r*r;
    }
    public double volume(){
        return 0.0;
    }
}
class Sphere extends Shapes{
    int r;
    Sphere(int r){
        this.r =r;
    }
    public double area(){
        return 4*3.14*r*r;
    }
    public double volume(){
        return (4/3)*3.14*r*r*r;
    }
}
class Cube extends Shapes{
    int side;
    Cube(int side){
        this.side = side;
    }
    public double area(){
        return 6*Math.pow(side,2);
    }
    public double volume(){
        return Math.pow(side,3);
    }
}
public class P1{
    public static void main(String args[]){
        Circle circle = new Circle(6);
        Sphere sphere = new Sphere(6);
        Cube cube = new Cube(6);
        System.out.println("circle: ");
        System.out.println("area: "+circle.area());
        System.out.println("volume: "+circle.volume());
        System.out.println("Sphere: ");
        System.out.println("area: "+sphere.area());
        System.out.println("volume: "+sphere.volume());

        System.out.println("Cube: ");
        System.out.println("area: "+cube.area());
        System.out.println("volume: "+cube.volume());
    }
}
