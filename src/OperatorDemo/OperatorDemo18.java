package OperatorDemo;

public class OperatorDemo18 {
    public static void main(String[] args) {
        int x = 3;    // 3的二进制数据：00000000 00000000 00000000 00000011
        int y = -3;   // -3的二进制数： 11111111 11111111 11111111 11111101
        System.out.println(x + "右移2位之后的内容：" + (x >> 2));
        System.out.println(y + "右移2位之后的内容：" + (y >> 2));
    }
}
