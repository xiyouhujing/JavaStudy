package ClassDemo;

public class ClassDemo02 {
    public static void main(String[] args) {
        Person1 per = new Person1();
    }
}

class Person1{
    String name;
    int age;
    public void tell(){
        System.out.println("姓名：" + name + "，年龄：" + age);
    }
}
