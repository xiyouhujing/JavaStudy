package ArrayDemo;

public class ArrayDemo05 {
    public static void main(String[] args) {
        int score[] = {67, 89, 87, 69, 90, 100, 75, 90};      // 静态初始化数组
        int max = 0;                                          // 定义变量保存最大值
        int min = 0;                                          // 定义变量保存最小值
        max = min = score[0];                                 // 把第一个元素的内容赋值给max和min
        for (int x = 0; x < score.length; x++){
            if (score[x] > max){                              // 依此判断后续元素是否比max大
                max = score[x];                               // 如果大，则修改max内容
            }
            if (score[x] < min){                              // 依此判断后续的元素是否比min小
                min = score[x];                               // 如果小，则修改min内容
            }
        }
        System.out.println("最高成绩：" + max);               // 输出最大值
        System.out.println("最低成绩：" + min);               // 输出最小值
    }
}
