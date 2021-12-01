class Employee{
    String firstName;
    String lastName;

    void getFirstName(){
        System.out.println(firstName);    
    }
    void getLastName(){
        System.out.println(lastName);
    }
    void setFirstName(String firstName){
        this.firstName = firstName;
    }
    void setLastName(String lastName){
        this.lastName = lastName;
    }
    

}
class ContractEmployee extends Employee{
    String department;
    String designation;
    double salary;
    void setDepartment(String department){
        this.department = department;
    }
    void setDesignation(String designation){
        this.designation = designation;
    }
    void setSalary(double salary){
        this.salary = salary;
    }
    void getDepartment(){
        System.out.println(department);
    }
    void getDesignation(){
        System.out.println(designation);
    }
    void getSalary(){
        System.out.println(salary);
    }
    void displayFullName(){
        System.out.println(firstName+lastName);
    }
    
    
    
}
public class P4 {
    public static void main(String args[]){
        ContractEmployee e1 = new ContractEmployee();
        e1.setFirstName("Chaitanya");
        e1.setLastName("Sadhan");
        e1.setDepartment("true to the core");
        e1.setDesignation("highly intellectual");
        e1.setSalary(100000000);
        e1.getFirstName();
        e1.getLastName();
        e1.displayFullName();
        e1.getDesignation();
        e1.getSalary();
        
    }
}
