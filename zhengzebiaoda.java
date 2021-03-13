package meituan.tenth2;

/**
 * @author xiaogege
 * @描述：
 * @date 2021/3/13
 * @time 22:27
 */
    import java.util.Scanner;
import java.util.Arrays;
public class zhengzebiaoda {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] array = new int[n];
            for(int i = 0; i < n ; i++) {
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            int ans = 0;
            for(int i = 0; i < array.length ; i++) {
                while(array[i]<i+1) {
                    array[i]++;
                    ans++;
                }
                while(array[i] > i+1) {
                    array[i]--;
                    ans++;
                }
            }
            System.out.println(ans);
        }


}
