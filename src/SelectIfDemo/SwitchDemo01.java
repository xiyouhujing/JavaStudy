package SelectIfDemo;

public class SwitchDemo01 {
    public static void main(String[] args) {
        int x = 3;
        int y = 6;
        char oper = '+';
        switch (oper){
            case '+':{
                System.out.println("x + y =" + (x + y));
                break;
            }
            case '-':{
                System.out.println("x - y = " + (x - y));
                break;
            }
            case '*':{
                System.out.println("x * y = " + (x * y));
                break;
            }
            case '/':{
                System.out.println("x / y = " + (x / y));
                break;
            }
            default:{
                System.out.println("未知操作！");
                break;
            }
        }
    }
}
