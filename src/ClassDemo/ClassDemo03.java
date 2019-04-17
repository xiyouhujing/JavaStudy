package ClassDemo;

class Person2{
    String name;                // 声明姓名属性
    int age;                    // 声明年龄属性
    public void tell(){
        System.out.println("姓名：" + name + "，年龄：" + age);
    }
}

public class ClassDemo03 {
    public static void main(String[] args) {
        Person2 per = null;            // 声明对象
        per = new Person2();           // 实例化对象
        per.name = "张三";            // 为name属性赋值
        per.age = 30;                 // 为age属性赋值
        per.tell();                   // 调用类中的方法
    }
}
