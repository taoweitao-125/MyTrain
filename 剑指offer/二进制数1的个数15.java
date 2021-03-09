package 剑指offer;

/**
 * @author xiaogege
 * @描述：
 * 请实现一个函数，输入一个整数（以二进制串形式），输出该数二进制表示中 1 的个数。
 * 例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
 *
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/3/9
 * @time 12:56
 */
public class 二进制数1的个数15 {
    public int hammingWeight(int n) {
        String string = Integer.toBinaryString(n);
        String[] split = string.split("");
        int num = 0;
        for (String s : split) {
            if ("1".equals(s)) {
                num++;
            }
        }
        return num;
    }
}
