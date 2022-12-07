import java.util.*;
public class Main {
        public static void main (String args[]) {
            Scanner sc =new Scanner(System.in);
            String s = sc.nextLine();
            if(s == null){
                System.out.println("Is Palindrome");;
            }
            int n = s.length();
            int b = 0;
            StringBuilder str = new StringBuilder();
            int k = 0;
            for(int i = 0 ; i<n ; i++){
                if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)) ){
                    str.append(s.charAt(i));
                }
            }
            int a = str.length();
            while(k<a){
                str.setCharAt(k,Character.toLowerCase(str.charAt(k)));
                k++;
            }
            if(a==1){
                System.out.println("Is Palindrome");;
            }
            for(int i = 0 ; i<a/2 ; i++){
                if(str.charAt(i) == str.charAt(a-i-1)){
                    b++;
                }
            }
            if(b == a/2){
                System.out.println("Is Palindrome");
            }else
                System.out.println("Not Palindrome");
        }
}