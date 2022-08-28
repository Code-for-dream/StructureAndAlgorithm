package 排序.选择排序;

import java.util.Arrays;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-08-28 22:25
 * 选择排序是一种更加简单直观的排序方法。
 * 需求：
 * 排序前：{4,6,8,7,9,2,10,1}
 * 排序后：{1,2,4,5,7,8,9,10}
 * 排序原理：
 * 1.每一次遍历的过程中，都假定第一个索引处的元素是最小值，和其他索引处的值依次进行比较，如果当前索引处
 * 的值大于其他某个索引处的值，则假定其他某个索引出的值为最小值，最后可以找到最小值所在的索引
 * 2.交换第一个索引处和最小值所在的索引处的值
 */
public class SelectSort {

    /**
     * 对数组a中的元素进行排序
     */
    public static void sort(Comparable<Integer>[] a) {
        for (int i = 0; i <= a.length - 2; i++) {
            // 假定本次遍历，最小值所在的索引是i
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (greater(a[minIndex], a[j])) {
                    // 跟换最小值所在的索引
                    minIndex = j;
                }
            }
            // 交换i索引处和minIndex索引处的值
            exch(a, i, minIndex);
        }
    }

    /**
     * 比较v元素是否大于w元素
     */
    private static boolean greater(Comparable<Integer> v, Comparable<Integer> w) {
        return v.compareTo((Integer) w) > 0;
    }

    /**
     * 数组元素i和j交换位置
     */
    private static void exch(Comparable<Integer>[] a, int i, int j) {
        Comparable<Integer> t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Integer[] a = {4, 6, 8, 7, 9, 2, 10, 1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }


}
