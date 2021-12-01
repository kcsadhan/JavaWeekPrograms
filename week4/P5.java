import java.io.*;
public class P5 {
    public static void main(String args[])throws IOException{
        String str;
        char ch;
        int vowels=0,consonants=0, digits=0,spaces=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string: ");
        str = br.readLine();
        str.toLowerCase();
        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                vowels++;
            else if(ch>'a' && ch<'z')
                consonants++;
            else if(ch>'0'&&ch<'9')
                digits++;
            else if (ch==' ')
                spaces++;

        }
        System.out.printf("vowels: %d\n consonants: %d \n digits: %d\n whiteSpaces: %d",vowels,consonants,digits,spaces);
    }
}
