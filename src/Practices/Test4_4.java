package Practices;

public class Test4_4 {
    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 3, 8};
        print(arr);
    }
    public static void print(int temp[]){
        int sum = 0;
        int max = temp[0];
        int min = temp[0];
        for (int i = 0; i < temp.length; i++){
            sum = sum + temp[i];
            if (max < temp[i]){
                max = temp[i];
            }
            if (min > temp[i]){
                min = temp[i];
            }
        }
        System.out.println("数组元素之和为：" + sum);
        System.out.println("数组中的最大值为：" + max);
        System.out.println("数组中的最小值为：" + min);
    }
}
