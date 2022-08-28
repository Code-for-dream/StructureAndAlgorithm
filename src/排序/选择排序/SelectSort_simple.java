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
public class SelectSort_simple {

    public static final int[] array = {4, 6, 8, 7, 9, 2, 10, 1, 0};

    public static void main(String[] args) {

        // 控制每次比较的起点
        for (int j = 1; j < array.length; j++) {
            // 遍历数组,比较找到最小移到最右边
            for (int i = 0; i < array.length; i++) {
                if (array[i] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        // 输出数组
        System.out.println(Arrays.toString(array));
    }

}
