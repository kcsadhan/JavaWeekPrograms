public class P3 {
    public static void main(String [] args){
        String operator=args[1];
        
        switch(operator){
            case("+"):
                System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[2]));
                break;
            case("-"):
                System.out.println(Integer.parseInt(args[0])-Integer.parseInt(args[2]));
                break;
            case("*"):
                System.out.println(Integer.parseInt(args[0])*Integer.parseInt(args[2]));
                break;
            case("/"):
                System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[0]));
                break;
            default:
                System.out.println("invalid operator");
            
        }
    }
}
