package DataStructer.Conllection.List;

import java.util.LinkedList;

/**
 * @author xiaogege
 * @描述：  链表
 * @date 2021/3/15
 * @time 15:51
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Object> link = new LinkedList<>();
        link.add(null);
        link.add(1);
        link.add(3);
        link.add(9);
        for (Object o : link) {
            System.out.println(o);
        }
    }
}
