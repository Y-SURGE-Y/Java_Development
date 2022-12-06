import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = fact(a);
        System.out.println(b);
    }
        static int fact(int a){
            int sum = 1;
            for(int i = a ; i>1 ; i--){
                sum*=i;
            }
            return sum;
        }
    }