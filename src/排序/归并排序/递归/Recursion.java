package 排序.归并排序.递归;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-09-01 19:52
 * <p>
 *  定义方法时，在方法内部调用方法本身，称之为递归.
 * <p>
 *   public void show(){
 *      System.out.println("aaaa");
 *      show();
 *  }
 * <p>
 *  作用：
 *      它通常把一个大型复杂的问题，层层转换为一个与原问题相似的，规模较小的问题来求解。递归策略只需要少量的
 *      程序就可以描述出解题过程所需要的多次重复计算，大大地减少了程序的代码量。
 * <p>
 *  注意：
 *      在递归中，不能无限制的调用自己，必须要有边界条件，能够让递归结束，因为每一次递归调用都会在栈内存开辟
 *      新的空间，重新执行方法，如果递归的层级太深，很容易造成栈内存溢出。
 */
public class Recursion {

    /**
     * 递归：请定义一个方法，使用递归完成求 N 的阶乘
     *
     * @param num 数
     */
    public static int recurring(int num) {
        if (num == 1 || num == 0) return 1;
        return num * recurring(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(Recursion.recurring(4));
    }
}
