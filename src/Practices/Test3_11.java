package Practices;

public class Test3_11 {
    public static void main(String[] args) {
        long sum = 0;
        long pro = 1;
        for (int i = 1; i <= 20; i++){
            pro *= i;     // 计算每项的阶乘
            sum += pro;   // 计算每项阶乘的累加和
        }
        System.out.println("1!+2!+3!+...+20! = " + sum);
    }
}
