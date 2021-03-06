package day0103;

import java.util.*;

/**
 * @author xiaogege
 * @描述：
 * @date 2021/1/5
 * @time 15:51
 */
public class Main2 {
    public static void sortMap(int m , int n ,Map<String,Integer> inMap){
        LinkedHashMap<String,Integer> returnMap = new LinkedHashMap<>();
        //这里将map.entrySet()转换成list
        List<Map.Entry<String,Integer>> list = new ArrayList<>(inMap.entrySet());
        if (n == 1) {
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                //升序排序
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return  (o1.getValue() - o2.getValue());
                }

            });
        }else if (n == 0){
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                //降序排序
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return  (o2.getValue() - o1.getValue());
                }

            });
        }
        for (Map.Entry<String, Integer> mapping : list) {
            String key = mapping.getKey();
            Integer value = mapping.getValue();
            returnMap.put(key,value);
        }
        for (String s : returnMap.keySet()) {
            System.out.println(s +" " +returnMap.get(s));
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            Map<String,Integer> map = new HashMap<>();
            int n = sc.nextInt();
            for (int i = 0; i < m; i++) {
                map.put(sc.next(),sc.nextInt());
            }
            sortMap(m,n,map);
        }

    }
}
