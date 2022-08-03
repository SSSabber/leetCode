package level2.day01;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode54
 * @Description TODO
 * @Author ZengRj
 * @Date 2022/7/18 22:18
 * @Version 1.0
 */
public class LeetCode54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return null;
        int m = matrix.length - 1, n = matrix[0].length - 1, x = 0, y = 0;
        List<Integer> res = new LinkedList<>();
        while (x <= m && y <= n) {
            for (int j = y; j <= n; j++) {
                if (x > m || y > n) break;
                res.add(matrix[x][j]);
                if (j == n) x++;
            }
            for (int i = x; i <= m; i++) {
                if (x > m || y > n) break;
                res.add(matrix[i][n]);
                if (i == m) n--;
            }
            for (int j = n; j >= y; j--) {
                if (x > m || y > n) break;
                res.add(matrix[m][j]);
                if (j == y) m--;
            }
            for (int i = m; i >= x; i--) {
                if (x > m || y > n) break;
                res.add(matrix[i][y]);
                if (i == x) y++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{23, 18, 20, 26, 25}, {24, 22, 3, 4, 4}, {15, 22, 2, 24, 29}, {18, 15, 23, 28, 28}};
        List<Integer> spiralList = spiralOrder(matrix);
        spiralList.forEach(System.out::println);
        /**
         * 23,18,20,26,25
         * 24,22, 3, 4,4
         * 15,22, 2, 24,29
         * 18,15,23,28,28
         */
    }
}
