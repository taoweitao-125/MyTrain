package day0112;

/**
 * @author xiaogege
 * @描述：计算输入整数各位数之和及该整数平方数各位数之和
 * @date 2021/1/12
 * @time 17:01
 */
import java.util.Scanner;
public class Main1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int m = n * n;
            System.out.print(func(n) + " ");
            System.out.println(func(m));
        }
    }
    public static int func(int x) {
        String[] str = String.valueOf(x).split("");
        int n = 0;
        for(int i = 0; i < str.length ; i++) {
            n += Integer.parseInt(str[i]);
        }
        return n;
    }
}
