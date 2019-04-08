package NewDemo;

public class NewDemo01 {
    public static void main(String[] args) {
        System.out.print("不传递参数 （fun()）：");
        fun();                                      // 不传递参数
        System.out.print("\n传递1个参数 （fun(1)）：");
        fun(1);                                     // 传递一个参数
        System.out.print("\n传递5个参数 （fun(1, 2, 3, 4, 5)）：");
        fun(1, 2, 3, 4, 5);                         // 传递五个参数
    }
    public static void fun(int...arg){              // 可变参数，可以接收任意多个参数
        for (int i = 0; i<arg.length; i++){
            System.out.print(arg[i] + "、");
        }
    }
}
