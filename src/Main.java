import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean b = palin(a);
        System.out.println(b);
    }
        static boolean palin(int a){
            String str = String.valueOf(a);
            boolean res = true;
            int n = str.length();
            for (int i = 0 ; i< n/2 ; i++ ){
                if (str.charAt(i) == str.charAt(n-i-1)){
                     res = true;
                }else{
                    res = false;
                    break;
                }
            }
        return res;
        }
    }