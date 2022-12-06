import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean b = arnums(a);
        System.out.println(b);

    }
    static boolean arnums(int a){
        int sum=0;
        int temp = a;
        while (a>0) {
            int rem = 0;
            rem = a % 10;
            int c = rem * rem * rem;
            sum+=c;
            a = a / 10;
        }
        if (sum == temp){
            return true;
        }
        else
            return false;
    }
}