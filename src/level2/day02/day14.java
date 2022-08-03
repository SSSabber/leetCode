package level2.day02;

/**
 * @ClassName day14
 * @Description TODO
 * @Author ZengRj
 * @Date 2022/7/22 22:35
 * @Version 1.0
 */
public class day14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length<=1) return strs[0];
        if(strs[0].length()==0) return "";
        String res = null;
        int i = 0;
        while (i <= strs[0].length()) {
            String s = strs[0].substring(0, i);
            for (String str : strs) {
                if (i > str.length() || !s.equals(str.substring(0, i))) {
                    return res;
                }
            }
            res = s;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix(strs));
    }
}
