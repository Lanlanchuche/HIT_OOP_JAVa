package btmang;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private double gpa;

    public static final String NAME = "No Name";
    public static final int AGE = 0;
    public static final double GPA = 0.0;

    public Student() {
        this(Student.NAME, Student.AGE, Student.GPA);
    }
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
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
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "Ten: " + name + ", tuoi: " + age + ", gpa: " + gpa + " ";
    }

    public static Student[] inputArray(int n){
        Student[] students = new Student[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Sinh vien thu " + (i + 1) + ":");
            System.out.print("Ten: ");
            String name = sc.nextLine();
            students[i].setName(name);
            System.out.print("Tuoi: ");
            int age = sc.nextInt();
            students[i].setAge(age);
            System.out.print("Gpa: ");
            double gpa = sc.nextDouble();
            students[i].setGpa(gpa);
            sc.nextLine();
        }
        return students;
    }
    public static void printArray(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
    public static double average(Student[] students){
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getGpa();
        }
        return sum / students.length;
    }
    public static double maxGPA(Student[] students){
        double max = students[0].getGpa();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGpa() > max) {
                max = students[i].getGpa();
            }
        }
        return max;
    }
}
