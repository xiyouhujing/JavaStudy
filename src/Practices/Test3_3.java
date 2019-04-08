package Practices;

public class Test3_3 {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 4;
        int max = 0;
        max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("最大值为：" + max);
    }
}
