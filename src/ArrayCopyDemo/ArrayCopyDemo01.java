package ArrayCopyDemo;

public class ArrayCopyDemo01 {
    public static void main(String[] args) {
        int i1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};             // 源数组
        int i2[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};    // 目标数组
        copy(i1, 3, i2, 1, 3);                // 调用复制方法
        print(i2);                                          // 输出数组
    }
    // 参数含义：源数组名称、源数组开始点、目标数组名称、目标数组开始点、复制长度
    public static void copy(int s[], int s1, int o[], int s2, int len){
        for (int i = 0; i < len; i++){
            o[s2+i] = s[s1+i];                             // 修改目标数组内容
        }
    }
    public static void print(int x[]){
        for (int i = 0; i<x.length; i++){
            System.out.print(x[i] + "\t");
        }
    }
}
