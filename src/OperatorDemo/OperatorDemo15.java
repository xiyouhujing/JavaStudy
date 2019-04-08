package OperatorDemo;

public class OperatorDemo15 {
    public static void main(String[] args) {
        int x = 3;                  // 3的二进制数据：00000000 00000000 00000000 00000011
        int y = 6;                  // 6的二进制数据：00000000 00000000 00000000 00000110
        System.out.println(x & y);  // 与操作的结果： 00000000 00000000 00000000 00000010
        System.out.println(x | y);  // 或操作的结果： 00000000 00000000 00000000 00000111
        System.out.println(x ^ y);  // 异或操作结果： 00000000 00000000 00000000 00000101
    }
}
