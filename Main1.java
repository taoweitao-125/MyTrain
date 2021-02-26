package day0103;

import java.util.Arrays;

/**
 * @author xiaogege
 * @描述：
 * @date 2021/1/5
 * @time 14:15
 */
public class Main1 {
    public static boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] ans = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (s.contains(p[i])) {
                ans[i] = true;
            }else {
                 ans[i] = false;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] arr = {"ab","b","c","d"};
        int n = 4;
        String str = "abc";
        boolean[] booleans = chkSubStr(arr, 4, str);
        for (boolean aBoolean : booleans) {
            System.out.print(aBoolean+" ");
        }

    }
}
