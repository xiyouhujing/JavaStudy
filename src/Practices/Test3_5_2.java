package Practices;

public class Test3_5_2 {
    public static void main(String[] args) {
        int i = 100;
        int sum = 0;
        do {
            sum += i;
            i++;
        }while (i <= 200);
        System.out.println("100~200的累加和为：" + sum);
    }
}
