package baitapvenha.bai1;

import java.util.Scanner;

public class Faculty {
    private String name;
    private String date;
    private School school;

    public Faculty() {
    }

    public Faculty(String name, String date, School school) {
        this.name = name;
        this.date = date;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Ten khoa:" + name + ", ngay: " + date + school ;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten khoa: ");
        name = sc.nextLine();
        System.out.println("Nhap ngay: ");
        date = sc.nextLine();
        System.out.println("Nhap truong: ");
        school = new School();
        System.out.println("Nhap ten truong:");
        school.setName(sc.nextLine());
        System.out.println("Nhap ngay:");
        school.setDate(sc.nextLine());

    }
    public void Output(){
        System.out.println(toString());
    }
}
