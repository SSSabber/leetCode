package level2.day01;

/**
 * @ClassName LeetCode202
 * @Description TODO
 * @Author ZengRj
 * @Date 2022/7/18 01:28
 * @Version 1.0
 */
public class LeetCode202 {
    public static boolean isHappy(int n) {
        if(n==0) return false;
        if (n==1) return true;
        int a = getHappy(n);
        while(a!=4){
            if(a == 1){
                return true;
            }
            a = getHappy(a);
        }
        return false;
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
