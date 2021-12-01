interface Payable{
    public double getAmount();
}
class Employee implements Payable{
    int days;
    double rate;
    Employee(int days, double rate){
        this.days = days;
        this.rate = rate;
    }
    public double getAmount(){
        return (days*rate);
    }
}
public class P3 {
    public static void main(String args[]){
        Employee emp = new Employee(6, 6);
        System.out.println(emp.getAmount());
    }
    
}
