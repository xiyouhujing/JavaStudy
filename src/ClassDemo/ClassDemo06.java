package ClassDemo;

class Person5{
    String name;
    int age;
    public void tell(){
        System.out.println("姓名：" + name + "，年龄：" + age);
    }
}
public class ClassDemo06 {
    public static void main(String[] args) {
        Person5 per1 = null;
        Person5 per2 = null;
        per1 = new Person5();
        per2 = new Person5();
        per1.name = "张三";
        per1.age = 30;
        per2.name = "李四";
        per2.age = 33;
        per2 = per1;
        System.out.print("per1对象中的内容 -->");
        per1.tell();
        System.out.print("per2对象中的内容 -->");
        per2.tell();
    }
}
