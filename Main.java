package day1207;

/**
 * @author xiaogege
 * @描述：
 * @date 2020/12/8
 * @time 18:19
 */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] st = str.split(" ");
            int[] arr = new int[10];
//            b为数字长度
            int b = 0;
            for(int i = 0; i < 10 ; i++) {
                arr[i] = Integer.parseInt(st[i]);
                b += arr[i];
            }
            if(b > 50) {
                System.out.println(-1);
            }
            int[] array = new int[b];
            int c = -1;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < arr[i]; j++) {
                    array[++c] = i;
                }
            }


//            将数组中的数按正确顺序排好
            Arrays.sort(array);
            int a = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0) {
                    a = i;
                    break;
                }

            }
            array[0] = array[a];
            array[a] = 0;
            StringBuilder sb = new StringBuilder();
            for (int i : array) {
                sb.append(i);
            }
            System.out.println(sb);
        }
    }
}
