abstract class Employee{
    abstract double amount(int x);
}
class WeeklyEmployee extends Employee{
    int weeks;
    WeeklyEmployee(int weeks){
        this.weeks = weeks;
    }
    double amount(int perweek){
        return weeks*perweek;
    }
}
class HourlyEmployee extends Employee{
    int hours;
    HourlyEmployee(int hours){
        this.hours = hours;
    }
    double amount(int perhour){
        return hours*perhour;
    }
}
public class P2 {
    public static void main(String args[]){
        WeeklyEmployee we = new WeeklyEmployee(6);
        HourlyEmployee he = new HourlyEmployee(6);
        System.out.println(we.amount(6));
        System.out.println(he.amount(6));

    }
}
