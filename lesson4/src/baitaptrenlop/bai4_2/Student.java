package baitaptrenlop.bai4_2;

public class Student {

    public static final String NAME = "0";
    public static final int AGE = 0;

    private String name;
    private int age;

    public Student(){
    }

//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void sayHello() {
        System.out.println("Xin chao, toi ten la " + name + ", nam nay " + age + " tuoi");
    }

    @Override
    public String toString() {
        return "Ten: " + name  + ", tuoi: " + age ;
    }
}
