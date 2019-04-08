package Practices;

public class Test4_8 {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,1,3,2,5,3,8,9,1,4,2,0,5,7,3,5,3,7,9,0,2,3,5,7,8,9,2};
        for (int i = 0; i<10; i++){
            int num = count(i, arr);
            System.out.println(i + "在数组中出现的次数为：" + num);
        }
    }
    public static int count(int x, int temp[]){
        int num = 0;
        for (int i = 0; i<temp.length; i++){
            if (x==temp[i]){
                num++;
            }
        }
        return num;
    }
}
