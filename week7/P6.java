interface StudentFare{
    void getAmount();
    void fname();
    void lname();
    void addr();
    void cont();
    void payable(double amt);

}
class Hostler implements StudentFare{
    double amt;
    String finame, laname, address, contact;
    Hostler(double amt, String finame, String laname, String address, String contact){
        this.amt = amt;
        this.finame = finame;
        this.laname = laname;
        this.address = address;
        this.contact = contact;

    }
    public void payable(double amount){
        this.amt = this.amt - amount;
    }
    public void fname(){
        System.out.println(finame);
    }
    public void lname(){
        System.out.println(laname);
    }
    public void addr(){
        System.out.println(address);
    }
    public void cont(){
        System.out.println(contact);
    }
    public void getAmount(){
        System.out.println(amt);
    }
}
public class P6 {
    public static void main(String args[]){
        Hostler hos = new Hostler(5000.0, "chaitanya", "sadhan","hyderabad", "8500904633");
        hos.payable(2000.0);
        hos.getAmount();
        hos.fname();
        hos.lname();
        hos.addr();
        hos.cont();
    }
}
