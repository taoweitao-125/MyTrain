
package day0117;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            float a = 1.0f / n * 100;
            String[] split = String.valueOf(a).split("");
            StringBuilder sb = new StringBuilder();
            if (split.length < 5) {
                for (String s : split) {
                    sb.append(s);
                }
                sb.append("0");
                System.out.println(sb + "%");
            }else {
                for (int i = 0; i < 4; i++) {
                    sb.append(split[i]);
                }
                if (Integer.parseInt(split[4]) > 5) {
                    sb.append(Integer.parseInt(split[4]) +1);
                }else {
                    sb.append(split[4]);
                }
                System.out.println(sb + "%");
            }
        }
    }
}
