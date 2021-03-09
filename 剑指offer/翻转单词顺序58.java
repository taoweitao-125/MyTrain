package 剑指offer;

import java.util.Stack;

/**
 * @author xiaogege
 * @描述：
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
 * 为简单起见，标点符号和普通字母一样处理。
 * 例如输入字符串"I am a student. "，则输出"student. a am I"。
 *
 * @date 2021/3/9
 * @time 8:58
 */
public class 翻转单词顺序58 {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (String s1 : split) {
            if ((!" ".equals(s1))){
                stack.push(s1);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek().startsWith(" ") ||
                    stack.peek().equals("")
            ) {
                stack.pop();
            }else {
                sb.append(stack.pop());
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {

    }

}
