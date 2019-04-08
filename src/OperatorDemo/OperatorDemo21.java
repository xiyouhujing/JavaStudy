package OperatorDemo;

public class OperatorDemo21 {
    public static void main(String[] args) {
        int a = 10, b= 6;
        System.out.println("改变之前的数：a = " + a + "，b = " + b);
        a -= b++;
        System.out.println("改变之后的数：a = " + a + "，b = " + b);
    }
}
