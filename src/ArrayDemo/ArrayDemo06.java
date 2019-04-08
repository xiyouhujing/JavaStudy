package ArrayDemo;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int score[] = {67, 89, 87, 69, 90, 100, 75, 90};   // 声明数组
        for (int i = 1; i < score.length; i++){            // 循环判断
            for (int j = 0; j < score.length; j++){
                if (score[i] < score[j]){                  // 交换位置
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }
        for (int i = 0; i < score.length; i++){
            System.out.print(score[i] + "\t");
        }
    }
}
