package Practices;

public class Test3_5_1 {
    public static void main(String[] args) {
        int i = 100;
        int sum = 0;
        while (i <= 200){
            sum += i;
            i++;
        }
        System.out.println("100~200的累加和为：" + sum);
    }
}
