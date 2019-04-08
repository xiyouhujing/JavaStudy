package OperatorDemo;

public class OperatorDemo13 {
    public static void main(String[] args) {
        if (10 == 10 || 10 / 0 ==0) {          // 短路或
            System.out.println("条件满足");
        }
    }
}
