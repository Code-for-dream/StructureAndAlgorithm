package 排序.冒泡排序;

import java.util.Arrays;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-08-28 21:25
 */
public class BubbleSort {

    /**
     * 对数组a中的元素进行排序
     */
    public static void sort(Comparable<Integer>[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (greater(a[j], a[j + 1])) {
                    exch(a, j, j + 1);
                }
            }
        }
    }

    /**
     * 比较v元素是否大于w元素
     */
    private static void exch(Comparable<Integer>[] a, int j, int i) {
        Comparable<Integer> t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 数组元素i和j交换位置
     */
    private static boolean greater(Comparable<Integer> v, Comparable<Integer> w) {
        return v.compareTo((Integer) w) > 0;
    }

    public static void main(String[] args) {
        Integer[] a = {4, 5, 6, 3, 2, 1};
        BubbleSort.sort(a);
        System.out.println(Arrays.toString(a));
    }

}
