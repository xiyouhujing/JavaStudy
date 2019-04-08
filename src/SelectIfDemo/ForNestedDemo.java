package SelectIfDemo;

public class ForNestedDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                System.out.println(j + "*" + i + "=" + (i * j) + "\t");   // “\t”制表
            }
            System.out.println("\n");      // 换行
        }
    }
}
