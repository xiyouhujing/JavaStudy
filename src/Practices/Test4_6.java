package Practices;

public class Test4_6 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i<arr.length; i++){
            arr[i] = i;
        }
        for (int j = arr.length-1; j>=0; j--){
            System.out.print(arr[j] + "\t");
        }
    }
}
