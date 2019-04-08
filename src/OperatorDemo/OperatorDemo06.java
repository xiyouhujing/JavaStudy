package OperatorDemo;

public class OperatorDemo06 {
    public static void main(String[] args) {
        int a = 3, b = 3;
        int x = 6, y = 6;
        System.out.println("a = " + a);                            // 输出变量a的值
        System.out.println("\t a++ = " + (a++) + ", a = " + a);    // 先执行后自增
        System.out.println("b = " + b);                            // 输出变量b的值
        System.out.println("\t ++b = " + (++b) + ", b = " + b);    // 先自增后执行
        System.out.println("x = " + x);                            // 输出变量x的值
        System.out.println("\t x-- = " + (x--) + ", x = " + x);    // 先执行后自减
        System.out.println("y = " + y);                            // 输出变量y的值
        System.out.println("\t --y = " + (--y) + ", y = " + y);    // 先自减后执行
    }
}
