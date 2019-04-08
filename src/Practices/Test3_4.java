package Practices;

public class Test3_4 {
    public static void main(String[] args) {
        int num = 105;
        if (num%3==0 && num%5==0 && num%7==0) {
            System.out.println(num + "能被3、5、7同时整除");
        }else {
            System.out.println(num + "不能被3、5、7同时整除");
        }
    }
}
