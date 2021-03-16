package DataStructer.Conllection.List;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author xiaogege
 * @描述：  数组
 * @date 2021/3/15
 * @time 15:48
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(null);
        array.add(2);
        array.add(3);
        System.out.println(array);
        System.out.println(array.toString());
        Collections.synchronizedList(new ArrayList<>());
    }
}
