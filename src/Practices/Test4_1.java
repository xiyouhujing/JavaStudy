package Practices;

//public class Test4_1 {
//    public static void main(String[] args) {
//        float sum = 0;
//        for (int i = 1; i<31; i++){
//            sum = sum + Factorial(i);
//        }
//        System.out.println("1!+2!+...+30! = " + sum);
//    }
//    public static float Factorial(int x){
//        float temp = 1;
//        for (int i = 1; i<=x; i++){
//            temp = temp*i;
//        }
//        return temp;
//    }
//}

public class Test4_1 {
    public static void main(String[] args) {
        float sum = 0;
        for (int i = 1; i<31; i++){
            sum = sum + Factorial(i);
        }
        System.out.println("1!+2!+...+30! = " + sum);
    }
    public static float Factorial(int x){
        if (x==1){
            return 1;
        } else {
            return x * Factorial(x-1);
        }
    }
}