package ArrayDemo;

public class ArrayDemo08 {
    public static void main(String[] args) {
        int score[][] = new int[4][3];         // 声明并实例化二维数组
        score[0][1] = 30;
        score[1][0] = 31;
        score[2][2] = 32;
        score[3][1] = 33;
        score[1][1] = 30;
        for (int i = 0; i < score.length; i++){
            for (int j = 0; j < score[i].length; j++){
                System.out.print(score[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
