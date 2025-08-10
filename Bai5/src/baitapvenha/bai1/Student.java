package baitapvenha.bai1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Student {
    private String name;
    private String Class;
    private double score;
    private Faculty faculty;

    public Student() {
    }

    public Student(String name, String aClass, double score, Faculty faculty) {
        this.name = name;
        Class = aClass;
        this.score = score;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getClass1() {
        return Class;
    }

    public void setClass(String aClass) {
        Class = aClass;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Ten sinh vien:" +name +
                ", Lop:'" + Class +
                ", Diem" + score +
                ", " + faculty ;
    }
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien");
        name = sc.nextLine();
        System.out.println("Nhap lop:");
        Class = sc.nextLine();
        System.out.println("Nhap diem so: ");
        score = sc.nextDouble();
        sc.nextLine();
        faculty = new Faculty();
        faculty.Input();


    }
    public void Output(){
        System.out.println(toString());
    }
}
