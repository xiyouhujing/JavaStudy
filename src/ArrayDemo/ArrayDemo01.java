package ArrayDemo;

public class ArrayDemo01 {
    public static void main(String[] args) {
        int score[] = null;                            // 声明数组，但未开辟堆内存空间
        score = new int[3];                            // 为数组开辟堆内存空间
        System.out.println("score[0] = " + score[0]);  // 分别输出每个元素
        System.out.println("score[1] = " + score[1]);  // 分别输出每个元素
        System.out.println("score[2] = " + score[2]);  // 分别输出每个元素
        for (int x = 0; x < 3; x++){                   // 使用循环依此输出数组中的全部内容
            System.out.println("score["+x+"] = " + score[x]);
        }
    }
}
