package baitaptrenlop.bai2_2;

public class Student {
    private String id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void printInfor(){
        System.out.println("Student id: " + id);
        System.out.println("Student name: " + name);
    }
}
