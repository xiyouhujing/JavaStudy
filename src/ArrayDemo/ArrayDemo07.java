package ArrayDemo;

public class ArrayDemo07 {
    public static void main(String[] args) {
        int score[] = {67, 89, 87, 69, 90, 100, 75, 90};     // 声明数组
        for (int i = 1; i < score.length; i++){
            for (int j = 0; j < score.length; j++){
                if (score[i] < score[j]){
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
            System.out.print("第"+i+"次排序的结果：\t");
            for (int j = 0; j < score.length; j++){          // 循环输出
                System.out.print(score[j] + "\t");
            }
            System.out.println("");                         // 换行
        }
        System.out.print("最终的排序结果为：\t");
        for (int i = 0; i < score.length; i++){
            System.out.print(score[i] + "\t");
        }
    }
}
