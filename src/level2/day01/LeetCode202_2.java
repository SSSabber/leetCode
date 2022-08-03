package level2.day01;

import java.util.HashSet;

/**
 * @ClassName LeetCode202_2
 * @Description TODO
 * @Author ZengRj
 * @Date 2022/7/18 01:59
 * @Version 1.0
 */
public class LeetCode202_2 {
    public static boolean isHappy(int n) {
        if(n==0) return false;
        if (n==1) return true;
        HashSet<Integer> set = new HashSet<>();
        int a = getHappy(n);
        while(a != 1){
            if(set.contains(a)){
                return false;
            }
            set.add(a);
            a = getHappy(a);
        }
        return true;
    }

    public static int getHappy(int n){
        int res = 0;
        while(n>0){
            res += (int) Math.pow(n%10,2);
            n = n/10;
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(9));
    }
}
