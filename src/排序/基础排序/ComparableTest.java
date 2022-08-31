package 排序.基础排序;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-08-28 20:40
 */
class Student implements Comparable<Student> {

    // 封装属性
    private int age;
    private String username;

    /**
     * 重写compareTo
     */
    @Override
    public int compareTo(Student object) {
        return this.age - object.getAge();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 重写toString
     */
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", username='" + username + '\'' +
                '}';
    }
}

public class ComparableTest {

    /**
     * 测试方法，获取两个元素中的较大值
     */
    public static Comparable<Student> getMax(Comparable<Student> c1, Comparable<Student> c2) {
        int cmp = c1.compareTo((Student) c2);
        return cmp >= 0 ? c1 : c2;
    }

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setUsername("zhangsan");
        stu1.setAge(17);
        Student stu2 = new Student();
        stu2.setUsername("lisi");
        stu2.setAge(19);
        Comparable<Student> max = getMax(stu1, stu2);
        System.out.println(max);
    }
}
