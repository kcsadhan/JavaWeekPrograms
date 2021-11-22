public class P2 {
    public static void main(String args[]){
        double a,b,c;
        a=Integer.parseInt(args[0]);
        b= Integer.parseInt(args[1]);
        c=Integer.parseInt(args[2]);
        double det;
        det = b*b-4*a*c;
        if(det <0){
            det = Math.sqrt(-det);
            System.out.println("The roots are imaginary");
            System.out.println((-b/2*a)+"+j("+det/(2*a)+")"  +" and "+ (-b/2*a)+"+j("+(-det/(2*a))+")" );
        }
        else
            System.out.println("the roots are: "+((-b+Math.sqrt(det))/2*a)+"   "+((-b-Math.sqrt(det))/2*a));
    }
}
