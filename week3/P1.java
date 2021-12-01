import java.util.*;
class Employee {
    String empName;
    int empAge;
    char empGender;
    String empDesig;
    int empSalary;
    String empAddress;
    Employee(int a, int b, char c, String d, String e, String f){
        empSalary = a;
        empAge = b;
        empGender = c;
        empName = d;
        empDesig = e;
        empAddress = f;
    }
    void display(){
        System.out.println("name: "+empName);
        System.out.println("gender: "+empGender);
        System.out.println("desig: "+ empDesig);
        System.out.println("salary: "+ empSalary);
        System.out.println("Address: "+ empAddress);
    }

}
public class P1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        String name, desig, address;
        char gender;
        int age, salary;
        System.out.println("name");
        name = in.next();
        System.out.println("desig");
        desig = in.next();
        System.out.println("gender");
        gender=in.next().charAt(0);
        System.out.println("address");
        address = in.next();
        System.out.println("age");
        age = in.nextInt();
        System.out.println("salary");  
        salary = in.nextInt();  
        Employee emp = new Employee(salary, age, gender, name, desig, address);
        emp.display();

    }
}
