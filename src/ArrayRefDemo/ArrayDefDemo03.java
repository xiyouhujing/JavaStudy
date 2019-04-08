package ArrayRefDemo;

public class ArrayDefDemo03 {
    public static void main(String[] args) {
        int score[] = {67, 89, 87, 69, 90, 100, 75, 90};
        int age[] = {31, 30, 18, 17, 8, 9, 1, 39};
        sort(score);                                      // 数组排序
        print(score);                                     // 数组打印
        System.out.println("\n----------------------------------------");
        sort(age);                                      // 数组排序
        print(age);                                     // 数组打印
    }
    public static void sort(int temp[]){
        for (int i = 1; i < temp.length; i++){            // 使用冒泡排序算法
            for (int j = 0; j < temp.length; j++){
                if (temp[i]<temp[j]){
                    int x = temp[i];
                    temp[i] = temp[j];
                    temp[j] = x;
                }
            }
        }
    }
    public static void print(int x[]){
        for (int i = 0; i<x.length; i++){
            System.out.print(x[i] + "\t");
        }
    }
}
