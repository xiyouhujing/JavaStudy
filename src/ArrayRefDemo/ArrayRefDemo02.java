package ArrayRefDemo;

public class ArrayRefDemo02 {
    public static void main(String[] args) {
        int temp[] = fun();                   // 通过方法实例化数组
        print(temp);                          // 向print()方法中传递数组
    }
    public static void print(int x[]){        // 接收数组
        for (int i = 0; i < x.length; i++){   // 循环输出
            System.out.print(x[i] + "、");
        }
    }
    public static int[] fun(){
        int ss[] = {1, 3, 5, 7, 9};          // 定义一个数组
        return ss;                           // 返回数组
    }
}
