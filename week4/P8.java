public class P8 {
    public static void main(String args[]){
        String str = "This is Chaitanya Sadhan reporting sir.";
        if(str.startsWith("This"))
            System.out.println("String is starting with This");
        if(str.startsWith("is",5))
            System.out.println("String is starting with \"is\" from index: 5 ");
        if(str.endsWith("sir."))
            System.out.println("String ending with sir.");
        System.out.println(str.substring(6));
        System.out.println(str.substring(6,10));
        System.out.println(str.charAt(9));

    }
}
