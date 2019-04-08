package MethodDemo;

public class MethodDemo03 {
    public static void main(String[] args) {
        int one = add(10, 20);              // 调用有两个参数的整型加法
        int two = add(10, 20, 30);          // 调用有三个参数的整型加法
        float three = add(10.3f, 13.3f);    // 调用有两个参数的浮点型加法
        System.out.println("add(int x, int y)的计算结果：" + one);
        System.out.println("add(int x, int y, int z)的计算结果：" + two);
        System.out.println("add(float x, float y)的计算结果：" + three);
    }
    public static int add(int x, int y){
        int temp = 0;
        temp = x + y;
        return temp;
    }
    public static int add(int x, int y, int z){
        int temp = 0;
        temp = x + y + z;
        return temp;
    }
    public static float add(float x, float y){
        float temp = 0;
        temp = x + y;
        return temp;
    }
}
