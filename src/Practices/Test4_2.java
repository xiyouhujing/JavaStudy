package Practices;

public class Test4_2 {
    public static void main(String[] args) {
        int arr[] = {45, 32, 66, 77, 98};
        oddEven(arr);
    }
    public static void oddEven(int temp[]){
        int odd = 0;
        int even = 0;
        for (int i = 0; i<temp.length; i++){
            int n = temp[i] % 2;
            if (n==0){
                even = even + 1;
            }else {
                odd = odd +1;
            }
        }
        System.out.println("奇数个数为：" + odd);
        System.out.println("偶数个数为：" + even);
    }
}
