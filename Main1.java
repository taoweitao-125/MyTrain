package day1207;

/**
 * @author xiaogege
 * @描述：
 * @date 2020/12/8
 * @time 19:20
 */
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int b = in.nextInt();
            if(b == 1) {
                System.out.println(1);
            }else {
                int[] array = new int[b];
                if(b % 2 == 1) {
                    int temp = b*b;
                    for(int i = b/2; i >= 0 ; i--) {
                        array[i] = temp;
                        temp -= 2;
                    }
                    int tem = b*b + 2;
                    for(int i = b/2 + 1; i < b ; i++) {
                        array[i] = tem;
                        tem += 2;
                    }
                }else{
                    int c = b*b + 1;
                    for(int i = b/2; i >= 0 ; i--) {
                        array[i] = c;
                        c -= 2;
                    }
                    int tem1 = b*b + 3;
                    for(int i = b/2 + 1; i < b ; i++) {
                        array[i] = tem1;
                        tem1 += 2;
                    }
                }

                for (int i = 0; i < array.length - 1; i++) {
                    System.out.print(array[i] + "+");
                }
                System.out.println(array[array.length - 1]);
            }

        }
    }
}
