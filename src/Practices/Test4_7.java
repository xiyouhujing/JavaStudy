package Practices;

public class Test4_7 {
    public static void main(String[] args) {
        int score[] = {67, 88, 78, 69, 100, 57, 81, 89, 94, 91};
        int max = 0;
        for (int i = 0; i<score.length; i++){
            if (max<score[i]){
                max = score[i];
            }
        }
        System.out.println("10个老师打分中最高分为：" + max);
    }
}
