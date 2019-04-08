package Practices;

public class Test3_6 {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
        int x = 13;
        while (x <= 1003){
            if (count % 2 == 1){
                sum += x;
            }else {
                sum -= x;
            }
            x += 10;
            count++;
        }
        System.out.println("3-23+33-43+···+973-983+993-1003 = " + sum);

    }
}
