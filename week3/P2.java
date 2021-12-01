import java.util.*;
class Products {
    //String Id;
    String name;
    double price;
    int quantity;
    Products(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    void show(){
        System.out.println("Name of the product: "+name);
        System.out.println("Price of the product: "+price);
        System.out.println("Quantity of the product: "+ quantity);
    }
    double getPrice(){
        return price*quantity;
    }

}
public class P2{
    public static void main(String args[]){
        Products p1, p2, p3, p4,p5;
        p1 = new Products("product1", 99.90, 2);
        p2 = new Products("product2", 20.20, 1);
        p3 = new Products("product3",6.87,4);
        p4 = new Products("product4", 45.50, 5);
        p5 = new Products("product5", 40.49,3);
        int choice;
        System.out.println("Enter your choice: ");
        System.out.println("1 to show product1 stats");
        System.out.println("2 to show product2 stats");
        System.out.println("3 to show product3 stats");
        System.out.println("4 to show product4 stats");
        System.out.println("5 to show product5 stats");
        System.out.println("6 to show total quantities sold");
        System.out.println("7 to exit");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        choice = in.nextInt();
        switch(choice){
            case 1: 
                p1.show();
                break;
            case 2:
                p2.show();
                break;
            case 3:
                p3.show();
                break;
            case 4:
                p4.show();
                break;
            case 5:
                p5.show();
                break;
            case 6:
                System.out.println(p1.getPrice()+p2.getPrice()+p3.getPrice()+p4.getPrice()+p5.getPrice());
                break;
            case 7:
                break;
        }
    }
    
}
