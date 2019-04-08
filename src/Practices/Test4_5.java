package Practices;

public class Test4_5 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int num1 = 3;
        int num2 = 7;
        print(num1, arr);
        print(num2, arr);
    }
    public static void print(int x, int temp[]){
        int count = 0;
        for (int i = 0; i<temp.length; i++){
            if (x == temp[i]){
                count++;
            }
        }
        if (count>0){
            System.out.println(x + "在这十个数中");
        }else {
            System.out.println(x + "不在这十个数中");
        }
    }
}
