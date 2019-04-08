package Practices;

public class Test3_2 {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("交换之前的内容：" + "a = " + a + "，b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("交换之后的内容：" + "a = " + a + "，b = " + b);
    }
}
