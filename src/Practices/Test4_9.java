package Practices;

public class Test4_9 {
    public static void main(String[] args) {
        int arr[] = {9, 45, 11, 22, 33, 44, 51, 65, 21, 200};
        int max = arr[0];
        int num = 0;
        System.out.println("原数组为：");
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        for (int j = 0; j<arr.length; j++){
            if (max<arr[j]){
                max = arr[j];
                num = j;
            }
        }
        int temp = arr[0];
        arr[0] = max;
        arr[num] = temp;
        System.out.println(" ");
        System.out.println("最大值保存在数组中的第一个元素后:");
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
