package MethodDemo;

public class MethodDemo02 {
    public static void main(String[] args) {
        int one = addOne(10, 20);            // 调用整数的加法操作
        float two = addTwo(10.3f, 13.3f);          // 调用浮点数的加法操作
        System.out.println("addOne的计算结果：" + one);
        System.out.println("addTwo的计算结果：" + two);
    }
    // 定义方法，完成两个整数的加法操作，方法返回一个int型数据
    public static int addOne(int x, int y){
        int temp = 0;                             // temp为局部变量，只在此方法中有效
        temp = x + y;                             // 执行加法计算
        return temp;                              // 返回计算结果
    }
    // 定义方法，完成两个浮点数的加法操作，方法返回一个float型数据
    public static float addTwo(float x, float y){
        float temp = 0;                           // temp为局部变量，只在此方法中有效
        temp = x + y;                             // 执行加法计算
        return temp;                              // 返回计算结果
    }
}
