package ArrayRefDemo;

public class ArrayDefDemo01 {
    public static void main(String[] args) {
        int temp[] = {1, 3, 5};                  // 使用静态初始化定义数组
        fun(temp);                               // 传递数组引用
        for (int i = 0; i < temp.length; i++){   // 循环输出
            System.out.print(temp[i] + "、");
        }
    }
    public static void fun(int x[]){             // 接收整型数组引用
        x[0] = 6;                                //修改第1个元素的内容
    }
}
