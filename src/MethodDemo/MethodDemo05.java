package MethodDemo;

public class MethodDemo05 {
    public static void main(String[] args) {
        System.out.println("计算结果：" + sum(100));   // 调用操作
    }
    public static int sum(int num){
        if (num == 1){
            return 1;
        }
        else {
            return num + sum(num - 1);     // 递归调用
        }
    }
}
