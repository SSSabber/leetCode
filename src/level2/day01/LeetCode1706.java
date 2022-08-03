package level2.day01;

import java.util.Arrays;

/**
 * @ClassName LeetCode1706
 * @Description TODO
 * @Author ZengRj
 * @Date 2022/7/19 00:44
 * @Version 1.0
 */
public class LeetCode1706 {
    public static int[] findBall(int[][] grid) {
        if (grid == null || grid.length < 1) return null;
        int[] res = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            int col = i;
            int row = 0;
            while (row < grid.length) {
                if (grid[row][col] == 1) {
                    if (col >= grid[0].length - 1 || grid[row][col + 1] == -1) {
                        res[i] = -1;
                        break;
                    } else {
                        col++;
                        row++;
                    }
                } else if (grid[row][col] == -1) {
                    if (col <= 0 || grid[row][col - 1] == 1) {
                        res[i] = -1;
                        break;
                    } else {
                        col--;
                        row++;
                    }
                }
                if (row == grid.length) {
                    res[i] = col;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}, {1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}};
        int[] res = findBall(grid);
        System.out.println(Arrays.toString(res));
    }
}
