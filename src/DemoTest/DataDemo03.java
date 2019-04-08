package DemoTest;

public class DataDemo03 {
    public static void main(String[] args){
        int max = Integer.MAX_VALUE;
        System.out.println("整型的最大值：" + max);
        System.out.println("整型最大值+1：" + (max+1));
        System.out.println("整型最大值+2：" + (max+2L));
        System.out.println("整型最大值+2：" + ((long)max+2));
    }
}
