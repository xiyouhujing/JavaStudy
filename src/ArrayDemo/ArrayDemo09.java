package ArrayDemo;

public class ArrayDemo09 {
    public static void main(String[] args) {
        // 静态初始化一个二维数组，每行的数组元素个数都不一样
        int score[][] = {{67, 61}, {78, 89, 83}, {99, 100, 98, 66, 95}};
        for (int i = 0; i < score.length; i++){
            for (int j = 0; j < score[i].length; j++){
                System.out.print(score[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
