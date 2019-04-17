package ClassDemo;

class Person4{
    String name;
    int age;
    public void tell(){
        System.out.println("姓名：" + name + "，年龄：" + age);
    }
}
public class ClassDemo05 {
    public static void main(String[] args) {
        Person4 per1 = null;
        Person4 per2 = null;
        per1 = new Person4();
        per2 = per1;                 // 把per1的堆内存空间使用权给per2
        per1.name = "张三";
        per1.age = 30;
        // 设置per2对象的内容，实际上就是设置per1对象的内容
        per2.age = 33;
        System.out.print("per1对象中的内容 -->");
        per1.tell();
        System.out.print("per2对象中的内容 -->");
        per2.tell();
    }
}
