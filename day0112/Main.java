package day0112;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author xiaogege
 * @描述：
 * @date 2021/1/12
 * @time 17:30
 */

public class Main{
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            Map<String,Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(sc.next(),0) ;
            }
            int b = 0;
            Set<Map.Entry<String, Integer>> entries = map.entrySet();
            int m = sc.nextInt();
            String[] str1 = new String[m];
            for (int i = 0; i < m; i++) {
                str1[i] = sc.next();
            }
            for (String s : str1) {
                for (Map.Entry<String, Integer> entry : entries) {
                    if (entry.getKey().equals(s)) {
                        entry.setValue(entry.getValue() + 1);
                        b++;
                    }
                }
            }

            for (Map.Entry<String, Integer> entry : entries) {
                System.out.println(entry.getKey()+" " +":" +" "+entry.getValue());
            }
            if (m != b) {
                System.out.println("Invalid" +" " +":"+ " "+(m-b));
            }
        }
    }
}
