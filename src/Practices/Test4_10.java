package Practices;

public class Test4_10 {
    public static void main(String[] args) {
        int num = 10;
        int arr[] = {2, 5, 9, 11, 13};
        insert(num, arr);
    }
    public static void insert(int x, int arr[]){
        int newArr[] = new int[arr.length+1];
        int temp = 0;
        for (int i = 0; i<arr.length; i++){
            if (x<arr[i]){
                temp = i;
                newArr[temp] = x;
                break;
            }else {
                temp = arr.length;
                newArr[temp] = x;
            }
        }
        for (int j = 0; j<temp; j++){
            newArr[j] = arr[j];
        }
        for (int j = temp+1; j<newArr.length; j++){
            newArr[j] = arr[j-1];
        }
        for (int i = 0; i<newArr.length; i++){
            System.out.print(newArr[i] + "\t");
        }
    }
}
