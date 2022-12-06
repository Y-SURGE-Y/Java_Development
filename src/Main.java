import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter Choice -> 1 for Maximum Number  -> 2 for Minimum Number ");
        int x = sc.nextInt();
        switch (x){
            case 1:
                int t = max(a,b,c);
                System.out.println(t);
                break;
            case 2:
                int y = min(a,b,c);
                System.out.println(y);
                break;
        }
    }
    static int max(int a , int b , int c){
        if(a>b && a>c){
            return a;
        }else if(c>b && c>a){
            return c;
        }else {
            return b;
        }
    }
    static int min(int a , int b , int c){
        if(c<a && c<b){
            return c;
        }else if(b<a && b<c){
            return b;
        }else {
            return a;
        }
    }
}