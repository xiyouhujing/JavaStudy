package MethodDemo;

public class MethodDemo01 {
    public static void main(String[] args) {
        printInfo();                   // 调用printInfo方法
        printInfo();                   // 调用printInfo方法
        printInfo();                   // 调用printInfo方法
        System.out.println("Hello World!");
    }
    // 此处由于此方法是由main()方法直接调用的，所以一定要加上public static
    public static void printInfo(){     // 此处方法没有返回值
        char c[] = {'H', 'e', 'l', 'l', 'o', ',', 'L', 'X', 'H'};
        for (int i =0; i < c.length; i++){
            System.out.print(c[i]);     // 循环输出
        }
        System.out.println("");         // 换行
    }
}
