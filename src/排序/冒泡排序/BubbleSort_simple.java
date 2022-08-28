package 排序.冒泡排序;

import java.util.Arrays;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-08-28 21:05
 * <p>
 * 冒泡排序（Bubble Sort），是一种计算机科学领域的较简单的排序算法。
 * 需求：
 * 排序前：{4,5,6,3,2,1}
 * 排序后：{1,2,3,4,5,6}
 * 排序原理：
 * 1.比较相邻的元素。如果前一个元素比后一个元素大，就交换这两个元素的位置。
 * 2.对每一对相邻元素做同样的工作，从开始第一对元素到结尾的最后一对元素。最终最后位置的元素就是最大值。
 */
public class BubbleSort_simple {
    // 定义数组
    public static final int[] array = {4, 5, 7, 3, 2, 6, 1};

    public static void main(String[] args) {

        // 控制每次的数组大小
        for (int j = array.length; j > 0; j--) {
            // 遍历数组,找到最大移到最右边
            for (int i = 0; i < j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                }
            }
        }
        // 输出数组
        System.out.println(Arrays.toString(array));
    }
}
