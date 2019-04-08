package ArrayRefDemo;

public class ArrayDefDemo04 {
    public static void main(String[] args) {
        int score[] = {67, 89, 87, 69, 90, 100, 75, 90};
        int age[] = {31, 30, 18, 17, 8, 9, 1, 39};
        java.util.Arrays.sort(score);                     // 使用Java提供的排序操作
        print(score);                                      // 输出数组
        System.out.println("\n-------------------------------");
        java.util.Arrays.sort(age);
        print(age);
    }
    public static void print(int x[]){
        for (int i = 0; i<x.length; i++){
            System.out.print(x[i] + "\t");
        }
    }
}
