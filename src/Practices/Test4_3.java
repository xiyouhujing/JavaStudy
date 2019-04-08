package Practices;

public class Test4_3 {
    public static void main(String[] args) {
        int oldArr[] = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int newArr[]= new int[oldArr.length];
        int j = 0;
        for (int i = 0; i<oldArr.length; i++){
            if (oldArr[i] != 0){
                newArr[j] = oldArr[i];
                j++;
            }
        }
        for (int i = 0; i<j; i++){
            System.out.print(newArr[i] + "\t");
        }
    }
}
