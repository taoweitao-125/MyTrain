import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * @author xiaogege
 * @描述：
 * @date 2021/3/2
 * @time 20:23
 */
public class Solution {
//    最小的k个数
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<k;i++) {
           list.add(i,input[i]);
        }
        return list;
    }

    public static void main1(String[] args) {
        int[] arr = {4,5,1,6,2,7,3,8};
        Solution solution = new Solution();
        System.out.println(solution.GetLeastNumbers_Solution(arr, 4));

    }

    public static void main(String[] args) {
//        输出字符串中最长连续数字串
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] split = str.split("[abcdefghijklmnopqrstuvwxyz]");
            int n = 0;
            String string = null;
            for (String s : split) {
                if (s.length()>n) {
                    n = s.length();
                    string = s;
                }
            }
            System.out.println(string);
        }

    }
}
