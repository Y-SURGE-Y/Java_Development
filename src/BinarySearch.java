import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 6, 8, 12, 29, 56, 76, 87, 88, 98 };
        int target = 2;
        int ans = ceiling(arr,target);
        System.out.print(ans);
    }
    static int ceiling(int[] ans, int target){
        int s = 0;
        int l = ans.length-1;
        while(s <=  l){
            int m = s + ( l - s ) / 2;
            if( target > ans[m] ){
                s = m + 1 ;
            }
            else if ( target < ans[m] ){
                l = m - 1;
            }
            else {
                return m;
            }
        }
        return -1;

    }
}
