package OperatorDemo;

public class OperatorDemo10 {
    public static void main(String[] args) {
        if (10 != 10 & 10 /0 == 0) {             // 非短路与
            System.out.println("条件满足");
        }
    }
}
