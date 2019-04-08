package Practices;

public class Test3_1 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++){
            int m = i % 10;            // 取个位数
            int n = (i / 10) % 10;     // 取十位数
            int h = i / 100;           // 取百位数
            if (i == m * m * m + n * n * n + h * h * h){    // 验证是否为水仙花数
                System.out.println(i + "是水仙花数");
            }
        }
    }
}
